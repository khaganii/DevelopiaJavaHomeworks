package com.khagani.homework.service;

import com.khagani.homework.entity.Instructor;
import com.khagani.homework.repo.InstructorRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InstructorService {

    @Autowired
    InstructorRepo instructorRepo;

    public List<Instructor> getAllInstructor() {
        return instructorRepo.findAll();
    }
}
