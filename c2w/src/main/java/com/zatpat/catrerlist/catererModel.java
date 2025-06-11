package com.zatpat.catrerlist;




public class catererModel {
   
   private String name;

   private String location;
   private String experiance;
   private String Mobile;
   private String img;
   private String img1;
   private String img2;
   private String img3;
//    private String language;
    private String menu;
   

  public  catererModel(
      String name,
      
      String location,
      String experiance,
      String Mobile,
    
      String img,
      String img1,String img2,String img3,String menu) {
     
      this.name = name;
    
    
      this.location=location;
      this.experiance=experiance;
      this.Mobile= Mobile;
     
      this.img = img;
      this.img1=img1;
      this.img2=img2;
      this.img3=img3;
      this.menu=menu;
  
    
    }

  
    public String getName(){
        return name;
    }
    // public String getAge(){
    //   return age;
    // } 
    
    public String getLocation(){
      return location;
    }
    public  String getExperiance(){
      return experiance;
    } 
    
    public  String getMobile(){
        return Mobile;
    }
//     public  String getLanguage(){
//       return language;
//  
    public  String getImg(){
        return img;
    }
    
    public  String getImg1(){
      return img1;
    }
  
     public  String getImg2(){
       return img2;
    }
     public  String getImg3(){
       return img3; 
    }
    public  String getmenu(){
      return menu;
    } 
    

    
}