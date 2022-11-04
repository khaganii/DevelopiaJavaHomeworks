var _student_id;
var _student_name;
var _student_surname;
var _student_phone;


function register(){
    window.location.href = "register.html";
}

function students(){
    window.location.href = "index.html";
}

function updateStudent(event, id){  
    event.preventDefault();
    var studentName = document.getElementById("name").value;
    var studentSurname = document.getElementById("surname").value;
    var studentPhone = document.getElementById("phone").value;
    var studentObject = {};
    studentObject.id = id;
    studentObject.name = studentName;
    studentObject.surname = studentSurname;
    studentObject.phone = studentPhone;
    var http = new XMLHttpRequest();
    http.onload = function(){
        window.location.href = "index.html";
    }
    http.open('PUT', 'http://localhost:8080/student/update/'+id, true);
    http.setRequestHeader('Content-Type', 'application/json');
    http.send(JSON.stringify(studentObject)); 
}

function page_load(){
    var tbody = document.getElementById('students-tbody');
    var http = new XMLHttpRequest();
    http.onload = function(){
        var response = this.responseText;
        var students = JSON.parse(response);
        var studentsText = "";
            
        for (let i = 0; i < students.length; i++) {
            studentsText += `<tr>`;
            studentsText +=`<td>${i+1}</td>`;
            studentsText +=`<td>${students[i].name}</td>`;
            studentsText +=`<td>${students[i].surname}</td>`;
            studentsText +=`<td>${students[i].phone}</td>`;
            studentsText +=`<td><span class="btn btn-danger" onclick="deleteStudent(${students[i].id})">Sil</span> 
            <span class="btn btn-warning">Redaktə et</span>`;
            studentsText += `</tr>`            
        }
        tbody.innerHTML = studentsText;
    }
    http.open('GET', 'http://localhost:8080/student/list', true);
    http.send();    
}

// function getUpdatePage(id){
//     var http = new XMLHttpRequest();
//     http.onload = function(){
//         var response = this.responseText;
//         var student = JSON.parse(response);
        
//     }
//     http.open('GET', 'http://localhost:8080/student/' + id, true);
//     http.send(); 
// }

function deleteStudent(id){
    var http = new XMLHttpRequest();
    http.onload = function(){
        page_load();
    }
    http.open('DELETE', 'http://localhost:8080/student/delete/' + id, true);
    http.send(); 
}

function saveStudent(event){
    event.preventDefault();

    var studentName = document.getElementById("name").value;
    var studentSurname = document.getElementById("surname").value;
    var studentPhone = document.getElementById("phone").value;
    var studentObject = {};
    studentObject.name = studentName;
    studentObject.surname = studentSurname;
    studentObject.phone = studentPhone;
    var http = new XMLHttpRequest();
    http.onload = function(){
        window.location.href = "index.html";
    }
    http.open('POST', 'http://localhost:8080/student/save', true);
    http.setRequestHeader('Content-Type', 'application/json');
    http.send(JSON.stringify(studentObject)); 
}