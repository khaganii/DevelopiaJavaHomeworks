package com.khagani.homework.controller;

import com.khagani.homework.entity.Instructor;
import com.khagani.homework.service.InstructorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class InstructorController {
    @Autowired
    InstructorService instructorService;

    @GetMapping("/list-of-instructors-eager")
    public List<Instructor> getInstructorsEager(){
        return instructorService.getAllInstructor();
    }
}
