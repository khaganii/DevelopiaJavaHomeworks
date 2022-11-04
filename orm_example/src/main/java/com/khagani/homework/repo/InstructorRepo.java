package com.khagani.homework.repo;

import com.khagani.homework.entity.Instructor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InstructorRepo extends JpaRepository<Instructor, Integer> {
}
