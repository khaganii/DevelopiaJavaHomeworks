package com.myfirstfxproject.registrationfx.utils;

import com.myfirstfxproject.registrationfx.entity.Person;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;


public class CrudOperations {
    ConnectionDb conDd = new ConnectionDb();
    Connection con = conDd.getConnection();

    public void save(Person person){
        try {
            PreparedStatement preparedStatement = con.prepareStatement("Insert into person_data (name, surname, birthday, high_school, gender, " +
                    "username, password) values (?, ?, ?, ?, ?, ?, ?);");
            preparedStatement.setString(1, person.getName());
            preparedStatement.setString(2, person.getSurname());
            preparedStatement.setDate(3, Date.valueOf(person.getBirthday()));
            preparedStatement.setString(4, person.getHighSchool());
            preparedStatement.setString(5, String.valueOf(person.getGender()));
            preparedStatement.setString(6, person.getUsername());
            preparedStatement.setString(7, person.getPassword());
            preparedStatement.executeUpdate();
            con.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public List<String> getAllHighSchools(){
        List<String> schools = new ArrayList<>();
        try {
            PreparedStatement preparedStatement  = con.prepareStatement("select * from high_school;");
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()){
                schools.add(resultSet.getString("name"));
            }
            con.close();
        }catch (SQLException e){
            e.printStackTrace();
        }
        System.out.println(schools);
        return schools;
    }

    public static List<Person> selectAll() {
        return null;
    }

    public static Person selectById(int id){
        return null;
    }

    public static void delete(int id){

    }

    public static void update(int id){

    }
}
