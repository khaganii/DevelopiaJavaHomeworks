package khan.WebServices.service;

import khan.WebServices.entity.Student;
import khan.WebServices.repository.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {
    @Autowired
    StudentRepo studentRepo;

    public Student findById(Integer id) {
        return studentRepo.findById(id).get();
    }

    public List<Student> findAll() {
        return studentRepo.findAll();
    }

    public Student save(Student student) {
        return studentRepo.save(student);
    }

    public Student updateById(Student student, Integer id) {
        Student s = studentRepo.findById(id).get();
        s.setName(student.getName());
        s.setSurname(student.getSurname());
        s.setPhone(student.getPhone());
        return studentRepo.save(s);
    }

    public void deleteById(Integer id) {
        studentRepo.deleteById(id);
    }
}
