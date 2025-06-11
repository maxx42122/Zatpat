package com.zatpat.maidlist;


import java.awt.Desktop;
import java.net.URI;

import com.zatpat.Home.Homepage;
import com.zatpat.logincontroller.Frontpage;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class payment {
    public Stage stage;

    public payment(Stage stage){
        this.stage=stage;


    }

    public void paymentlast(){
     Image image = new Image("assets/google pay1.png",70,60,false,false);
        ImageView imageView = new ImageView(image);
       
        Image image2 = new Image("assets/phonepay.png",70,60,false,false);
        ImageView imageView2 = new ImageView(image2);
   
        Image image3 = new Image("assets/Paytm2.png",70,60,false,false);
        ImageView imageView3 = new ImageView(image3);
       
        Image image4 = new Image("assets/UPI.png",70,60,false,false);
        ImageView imageView4 = new ImageView(image4);
  
        Image image5 = new Image("assets/Mehods.png",400,300,false,false);
        ImageView imageView5 = new ImageView(image5);
        imageView5.setLayoutX(770);
        imageView5.setLayoutY(600);
   

        Label label1 = new Label(": Google Pay");
        label1.setFont(new Font(20));
        label1.setLayoutX(730);
        label1.setLayoutY(215);

        Label label2 = new Label(": Phone Pay");
        label2.setFont(new Font(20));
        label2.setLayoutX(730);
        label2.setLayoutY(315);

        Label label3 = new Label(": Paytm");
        label3.setFont(new Font(20));
        label3.setLayoutX(730);
        label3.setLayoutY(415);

        Label label4 = new Label(": UPI Pay");
        label4.setFont(new Font(20));
        label4.setLayoutX(730);
        label4.setLayoutY(515);
        

        Button button = new Button("", imageView);
        button.setPrefWidth(40);
        button.setPrefHeight(50);
        button.setLayoutX(620);
        button.setLayoutY(200);
        button.setStyle("-fx-font-size: 14px; " +
        "-fx-background-color:#f0f0f0 ; " +
        "-fx-border-color: #ccc; " +
        "-fx-border-width: 1px; " +
        "-fx-border-radius: 5px;");
       
        button.setOnAction(new EventHandler<ActionEvent>() {
          @Override
          public void handle(ActionEvent event) {
              try {
                  Desktop.getDesktop()
                          .browse(new URI("upi://pay?pa=7823827901@ybl&pn=Omkar%20Gade&mc=0000&"));
              } catch (Exception e) {
                  e.printStackTrace();
              }
          }
      });



        Button button2 = new Button("", imageView2);
        button2.setStyle("-fx-font-size: 14px; " +
        "-fx-background-color: #f0f0f0; " +
        "-fx-border-color: #ccc; " +
        "-fx-border-width: 1px; " +
        "-fx-border-radius: 5px;");
        button2.setPrefWidth(40);
        button2.setLayoutX(620);
        button2.setLayoutY(300);

        Button button3 = new Button("", imageView3);
        button3.setPrefWidth(40);
        button3.setLayoutX(620);
        button3.setLayoutY(400);
        button3.setStyle("-fx-font-size: 14px; " +
        "-fx-background-color: #f0f0f0; " +
        "-fx-border-color: #ccc; " +
        "-fx-border-width: 1px; " +
        "-fx-border-radius: 5px;");

        Button button4 = new Button("", imageView4);
        button4.setPrefWidth(40);
        button4.setLayoutX(620);
        button4.setLayoutY(500);
        button4.setStyle("-fx-font-size: 14px; " +
        "-fx-background-color: #f0f0f0; " +
        "-fx-border-color: #ccc; " +
        "-fx-border-width: 1px; " +
        "-fx-border-radius: 5px;");

        Label label = new Label("Payment Methods :");
        label.setLayoutX(570);
        label.setLayoutY(100);
        label.setFont(new Font(25));
        label.setStyle("-fx-background-color: pink;");
        label.setStyle("-fx-font-size : 30");
        

        VBox vBox = new VBox();
        vBox.setPrefHeight(930);
        vBox.setPrefWidth(1000);
        vBox.setLayoutX(500);
        vBox.setLayoutY(30);
        vBox.setStyle("-fx-background-color: white;-fx-background-radius :50; -fx-border-radius :10; -fx-padding:15");

      
        Image image6 = new Image("assets\\phonepayqr.jpg",450,370,false,false);
        ImageView imageView6 = new ImageView(image6);
        VBox vBox2 = new VBox(imageView6);
        vBox2.setLayoutX(950);
        vBox2.setLayoutY(200);

        //
        Image ig1 = new Image("loginpages/back.png", 45, 45, true, true);
        ImageView iv1 = new ImageView(ig1);
    
        Button backButton = new Button("", iv1);
        backButton.setStyle("-fx-background-radius :50; -fx-border-radius :50; -fx-padding:10");
        backButton.setStyle("-fx-background-color:transparent");
        backButton.setOnAction(new EventHandler<ActionEvent>() {
    
          @Override
          public void handle(ActionEvent event) {
    
            Homepage obj6=new Homepage(stage);
            obj6.initializehome();
          }
          
    
           });
      
        Pane pane = new Pane(backButton,vBox,label,button,label1,button2,label2,button3,label3,button4,label4,imageView5,vBox2);
        pane.setStyle(" -fx-background-color: linear-gradient(from 50% 50% to 0% 0%, #F5D419, #ffffff);");
        

        Scene sc = new Scene(pane,2000 , 1000);
        stage.setScene(sc);
        stage.show();
    }
}

