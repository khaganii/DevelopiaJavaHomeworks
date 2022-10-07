package az.khan.spring_mvc_practice1.controller;

import az.khan.spring_mvc_practice1.entity.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.ArrayList;
import java.util.List;

@Controller
public class StudentController {

    @GetMapping(path = "/students")
    public  String showStudents(Model model){
        List<Student> students = new ArrayList<>();
        students.add(new Student(1, "Adil", "Aliyev"));
        students.add(new Student(2, "Orphan", "Eliyev"));
        students.add(new Student(3, "Husen", "Memmedzade"));
        students.add(new Student(4, "Rufet", "Qedirov"));

        model.addAttribute("studentList", students);
        return "students";
    }

    @GetMapping(path = "/students2")
    public  String showStudents2(){
        return "students2";
    }

}
