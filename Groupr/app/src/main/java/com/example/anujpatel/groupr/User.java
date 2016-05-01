package com.example.anujpatel.groupr;

/**
 * Created by anujpatel on 4/30/16.
 */
public class User {
    private String first_Name;
    private String last_Name;
    private String email_address;
    private String password;

    public User(String first_Name, String last_Name, String email_address, String password) {
        this.first_Name = first_Name;
        this.last_Name = last_Name;
        this.email_address = email_address;
        this.password = password;
    }

    public String getFirst_Name() {
        return first_Name;
    }

    public void setFirst_Name(String first_Name) {
        this.first_Name = first_Name;
    }

    public String getLast_Name() {
        return last_Name;
    }

    public void setLast_Name(String last_Name) {
        this.last_Name = last_Name;
    }

    public String getEmail_address() {
        return email_address;
    }

    public void setEmail_address(String email_address) {
        this.email_address = email_address;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
