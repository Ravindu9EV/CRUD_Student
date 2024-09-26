window.onload(getStds(), displayCard());

let uu;
getStds();

function getStds() {
  let tableBody = document.getElementById("tbl-body");
  fetch("http://localhost:8080/student/get-all-students")
    .then((response) => response.json())
    .then((data) => {
      data.forEach((element) => {
        const imglink = "data/jpeg;base64," + element.image;

        let imgFile = document.createElement("input");
        imgFile.setAttribute("type", "file");
        imgFile.src =
          "http://127.0.0.1:5500/849f8e3c-15af-4ebb-b14e-75b578fd4a9b";

        console.log(imglink);
        // uu = element.image;
        console.log(typeof element.image);
        let rowData = document.createElement("tr");
        rowData.className = "table-success";
        rowData.setAttribute("data-name", element.name);
        rowData.setAttribute("data-age", element.age);
        rowData.setAttribute("data-contact", element.contact);
        rowData.setAttribute("data-password", element.password);
        rowData.setAttribute("data-image", element.image);
        rowData.innerHTML = `
          <td  id="std-name">${element.name}</td>
                  <td id="std-age">${element.age}</td>
                  <td id="std-contact">${element.contact}</td>
                  <td id="std-passowrd">${element.password}</td>
                  <td><img id="std-img"src="data:image/jpeg;base64,${element.image}" style="width:30px; height:30px" alt=""></td>
          
          `;

        // const ph = document.createElement("img");

        // ph.src = "data:image/jpeg;base64," + element.image;
        // ph.style.width = "140px";
        // ph.style.height = "150px";
        // rowData.appendChild(ph);

        tableBody.appendChild(rowData);
        console.log(element.name);
        console.log(element.age);
        console.log(element.contact);
        console.log(element.password);
        console.log(element.image);

        console.log(element.image.slice(5) + "lppp");

        let linkImg = element.image;
        console.log(+" suusssss");

        // document.getElementById("imageStd").src =
        //   "data:image/jpeg;base64," + element.image;

        // console.log("----->   data:image/jpeg;base64," + element.image);
      });
    });
}
document.getElementById("btnM").addEventListener("click", () => {
  getStds();
  document.getElementById("imageStd").src = uu;
});

async function displayCard() {
  const table = document.getElementById("students-table");
  const card = document.getElementById("student-card");
  const title = document.getElementById("student-name");
  const age = document.getElementById("student-age");
  const contact = document.getElementById("student-contact");
  const password = document.getElementById("student-password");
  const image = document.getElementById("student-photo");

  table.addEventListener("mouseover", (event) => {
    const target = event.target.closest("tr");

    if (target) {
      title.textContent = target.getAttribute("data-name");
      age.textContent = "Age:  " + target.getAttribute("data-age");
      contact.textContent = "Contact: " + target.getAttribute("data-contact");
      password.textContent =
        "Password: " + target.getAttribute("data-password");
      image.src = "data:image/jpeg;base64," + target.getAttribute("data-image");

      // const rect = target.getBoundingClientRect();
      // card.style.top = rect.top + window.scrollY + "400px";
      // card.style.left = rect.left + window.scrollX + "600px";

      card.style.display = "block";
    }
  });

  table.addEventListener("click", (event) => {
    const target = event.target.closest("tr");

    console.log("hi");
  });

  table.addEventListener("mouseout", (event) => {
    const target = event.target.closest("tr");

    if (target) {
      card.style.display = "none";
    }
  });
  console.log("hi");
}
