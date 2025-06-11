package com.zatpat.maidlist;

public class madeInfoModel {
    private String name;
    private String mobile;
    private String age;
    private String location;
    private String experiance;
    private String language;
    private String type;
    private String password;
    private String img;
    private String img1;
    private String img2;
    private String img3;
    private String aboutme;

    // No-argument constructor
    public madeInfoModel() {
        
    }

    public madeInfoModel(String name, String mobile, String age, String location, String experiance, String language, String type, String password, String img, String img1, String img2, String img3, String aboutme) {
        this.name = name;
        this.mobile = mobile;
        this.age = age;
        this.location = location;
        this.experiance = experiance;
        this.language = language;
        this.type = type;
        this.password = password;
        this.img = img;
        this.img1 = img1;
        this.img2 = img2;
        this.img3 = img3;
        this.aboutme = aboutme;
    }

    public String getName() {
        return name;
    }

    public String getMobile() {
        return mobile;
    }

    public String getAge() {
        return age;
    }

    public String getLocation() {
        return location;
    }

    public String getExperiance() {
        return experiance;
    }

    public String getLanguage() {
        return language;
    }

    public String getType() {
        return type;
    }

    public String getPassword() {
        return password;
    }

    public String getImg() {
        return img;
    }

    public String getImg1() {
        return img1;
    }

    public String getImg2() {
        return img2;
    }

    public String getImg3() {
        return img3;
    }

    public String getAbout() {
        return aboutme;
    }
}
