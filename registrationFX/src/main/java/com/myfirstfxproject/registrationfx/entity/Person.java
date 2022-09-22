package com.myfirstfxproject.registrationfx.entity;

import com.myfirstfxproject.registrationfx.utils.Gender;
import lombok.Data;

import java.time.LocalDate;

@Data
public class Person {
    String name;
    String surname;
    LocalDate birthday;
    String highSchool;
    Gender gender;
    String username;
    String password;
}
