
package com.zatpat.controller;

public class modeluserlogin {
    public String username;
    public String password;
    public String email;
    public String img4;

    public modeluserlogin(String username, String password, String email,String img4) {

        this.username = username;
        this.password = password;
        this.email = email;
        this.img4 =img4;

    }

    public modeluserlogin() {

    }

    public String getusername() {

        return username;
    }

    public String getImg4() {
        return img4;
    }

    public String getpassword() {

        return password;
    }

    public String getemail() {

        return email;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setImg4(String img4) {
        this.img4 = img4;
    }

}