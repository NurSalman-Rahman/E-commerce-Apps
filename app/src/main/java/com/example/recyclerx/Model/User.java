package com.example.recyclerx.Model;

public class User
{
    private String id;
    private String username;
    private String mail;
    private String address;

    private String phone;
    private String point;



    public User() {
      }

    public User(String id, String username, String mail, String address, String phone, String point) {
        this.id = id;
        this.username = username;
        this.mail = mail;
        this.address = address;
        this.phone = phone;
        this.point = point;
    }

    public User(String id, String username, String mail, String address) {
        this.id = id;
        this.username = username;
        this.mail = mail;
        this.address = address;
    }

    public User(String id, String point) {
        this.id = id;
        this.point = point;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPoint() {
        return point;
    }

    public void setPoint(String point) {
        this.point = point;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getAddress()
    {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

}
