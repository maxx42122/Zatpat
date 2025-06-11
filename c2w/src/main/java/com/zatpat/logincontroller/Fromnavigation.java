package com.zatpat.logincontroller;


import javafx.application.Application;

import javafx.stage.Stage;

public class Fromnavigation extends Application {
    
  public Stage primaryStage;
    // private Scene frontpage;

    // private Frontpage page1;

    @Override
    public void start(Stage primaryStage) {
      
      
      primaryStage.setY(0);
      primaryStage.setX(0);
      //primaryStage.setHeight(700);
      //primaryStage.setWidth(400);
        // Initialize page
        //page1=new Frontpage(this);

       // frontpage=new Scene(page1.getVbox(),400,700);

       // primaryStage.setScene(frontpage);
        //primaryStage.setTitle("Login");
        //primaryStage.show();

        page1 obj=new page1(primaryStage);
      
        obj.initializepage();
    }
     
    
}