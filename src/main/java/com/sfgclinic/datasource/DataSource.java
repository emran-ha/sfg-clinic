package com.sfgclinic.datasource;

public class DataSource {
    private String userName;
    private String password;

    public DataSource(String name, String password) {
        this.userName = name;
        this.password = password;
    }

    public String getName() {
        return userName;
    }

    public void setName(String name) {
        this.userName = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
