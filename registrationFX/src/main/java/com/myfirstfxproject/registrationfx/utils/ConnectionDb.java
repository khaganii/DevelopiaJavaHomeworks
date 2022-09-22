package com.myfirstfxproject.registrationfx.utils;

import lombok.Data;

@Data
public class ConnectionDb {
    private String dbUser;
    private String password;

    ConnectionDb(String dbUser, String password){
        this.dbUser = dbUser;
        this.password = password;
    }

    private final String connectionString = "";

}
