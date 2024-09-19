window.onload(getStds());

let uu;
getStds();

function getStds() {
  let tableBody = document.getElementById("tbl-body");
  fetch("http://localhost:8080/student/get-all-students")
    .then((response) => response.json())
    .then((data) => {
      data.forEach((element) => {
        const imglink = "data/jpeg;base64," + element.image;

        console.log(imglink);
        // uu = element.image;
        console.log(typeof element.image);
        let rowData = document.createElement("tr");
        rowData.className = "table-success";
        rowData.innerHTML = `
          <td>${element.name}</td>
                  <td>${element.age}</td>
                  <td>${element.contact}</td>
                  <td>${element.password}</td>
                  <td><img src="data:image/jpeg;base64,${element.image}" style="width:30px; height:30px" alt=""></td>
          
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
      });
    });
}
document.getElementById("btnM").addEventListener("click", () => {
  getStds();
  document.getElementById("imageStd").src = uu;
});

document.getElementById("");
