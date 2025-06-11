package com.zatpat.cleanerlist;



public class cleanerinfoModel {

  private String name;
  private String age;
  private String location;
  private String experiance;
  // private String type;
  private String img;
  private String img1;
  private String img2;
  private String img3;
  private String language;
  private String oldexperiance;

  public cleanerinfoModel(
      String name,
      String age,
      String location,
      String experiance,
      String type,
      String language,
      String img,
      String img1,
      String img2,
      String img3,
      String oldexperiance) {

    this.name = name;
    this.age = age;

    this.location = location;
    this.experiance = experiance;
    // this.type = type;
    this.language = language;
    this.img = img;
    this.img1 = img1;
    this.img2 = img2;
    this.img3 = img3;
    this.oldexperiance = oldexperiance;

  }

  public String getName() {
    return name;
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

  // public String getType() {
  // return type;
  // }

  public String getLanguage() {
    return language;
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

  public String getOldExperiance() {
    return oldexperiance;
  }

}