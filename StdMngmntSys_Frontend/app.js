document.getElementById("btnSubmit").addEventListener("click", registerStudent);

function registerStudent() {
  console.log("hi");

  let image = document.getElementById("student-image");
  let name = document.getElementById("student-name");
  let age = document.getElementById("student-age");
  let contact = document.getElementById("student-contact");
  let password = document.getElementById("student-password");
  console.log(image.value);
  console.log(name.value);
  console.log(age.value);
  console.log(contact.value);
  console.log(password.value);

  let imgLink = URL.createObjectURL(image.files[0]);
  const encodeImage = btoa(imgLink);
  console.log(encodeImage);
  console.log(atob(encodeImage));

  let imag;
  const input = document.getElementById("student-image");

  input.addEventListener("change", (event) => {
    const file = imgLink;

    const reader = new FileReader();
    reader.onload = (readerEvent) => {
      const dataURL = readerEvent.target.result;

      const base64Data = dataURL.split(",")[1];

      const encodedData = btoa(base64Data);

      console.log(encodedData + "jiiii");
      imag = encodedData;
    };
    reader.readAsDataURL(file);
    console.log(reader.readAsDataURL(file));
  });

  let requestBody = {
    name: name.value,
    age: age.value,
    contact: contact.value,
    password: password.value,
    image: encodeImage,
  };

  let formData = new FormData();
  formData.append("name", name.value);
  formData.append("age", age.value);
  formData.append("contact", contact.value);
  formData.append("password", password.value);
  formData.append("image", image.files[0]);

  fetch("http://localhost:8080/student/save-student", {
    method: "POST",
    body: JSON.stringify(requestBody),
    headers: new Headers({ "Content-type": "application/json" }),
  })
    .then((response) => response.json())
    .then(console.log("ko"));
}

document.getElementById("btnImg").addEventListener("click", () => {
  document.getElementById("setImg").src = URL.createObjectURL(
    document.getElementById("student-image").files[0]
  );
});

//display notification after successfully save

function displayNotifi() {
  const toastLiveExample = document.getElementById("liveToast");

  const toastBootstrap = bootstrap.Toast.getOrCreateInstance(toastLiveExample);
  toastBootstrap.show();
}
