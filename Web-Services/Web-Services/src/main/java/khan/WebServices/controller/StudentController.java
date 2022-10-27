package khan.WebServices.controller;

import khan.WebServices.entity.Student;
import khan.WebServices.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/student")
public class StudentController {

    @Autowired
    StudentService studentService;

    //works
    @GetMapping("/{id}")
    public Student getStudent(@PathVariable Integer id){
        return studentService.findById(id);
    }

    //works
    @GetMapping("/list")
    public List<Student> getStudents(){
        return studentService.findAll();
    }

    //works
    @PostMapping("/save")
    public Student save(@RequestBody Student student){
        return studentService.save(student);
    }

    //works
    @PutMapping("/update/{id}")
    public Student updateById(@RequestBody Student student, @PathVariable Integer id){
        return studentService.updateById(student, id);
    }

    //works
    @DeleteMapping("/delete/{id}")
    public void deleteById(@PathVariable Integer id){
        studentService.deleteById(id);
    }

}
