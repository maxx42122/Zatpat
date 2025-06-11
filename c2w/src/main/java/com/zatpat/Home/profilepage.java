package com.zatpat.Home;

import com.google.cloud.firestore.DocumentSnapshot;
import com.zatpat.firebase.FirebaseInitialize;
import com.zatpat.logincontroller.Frontpage;
import com.zatpat.logincontroller.Register;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;

import javafx.scene.text.Font;
import javafx.stage.Stage;


public class profilepage {
    private Label userpassword;
    private Label labelusername;
    private Label useremail;
    public Stage stage;
    String username;
    String passwordset;
    String Emailset;
    String img4;
    FirebaseInitialize firebase = new FirebaseInitialize();

    public profilepage(Stage stage) {

        this.stage = stage;
        // profileinfo();
    }

    public void profileinfo() {

        try {
            System.out.println(Register.str);
            DocumentSnapshot docsnap = firebase.getdata("users", Register.str);
            username = docsnap.getString("username");
            passwordset = docsnap.getString("password");
            Emailset = docsnap.getString("email");
            img4=docsnap.getString("img4");
            
            } catch (Exception e) {
            e.printStackTrace();

        }

        System.out.println("username = " + username);
        Label name = new Label("Name :");
        name.setStyle("-fx-font-weight: bold");
        name.setFont(new Font(35));

        labelusername = new Label(username);
        labelusername.setFont(new Font(35));

        // HBox hb1 = new HBox(25, name, labelusername);
        // hb1.setAlignment(Pos.CENTER);

        Label password = new Label("Password :");
        password.setStyle("-fx-font-weight: bold");
        password.setFont(new Font(35));

        userpassword = new Label(passwordset);
        userpassword.setFont(new Font(35));
        // HBox hb2 = new HBox(password, userpassword);
        // hb2.setAlignment(Pos.CENTER);

        Label email = new Label("Email :");
        email.setStyle("-fx-font-weight: bold");
        email.setFont(new Font(35));
        email.setLayoutX(500);

        useremail = new Label(Emailset);
        useremail.setFont(new Font(35));

        Image userimg =new Image(img4,300,300,true,true);
        ImageView usImageView=new ImageView(userimg);


        // HBox hb3 = new HBox(email, useremail);
        // hb3.setAlignment(Pos.CENTER);

        // VBox info = new VBox(30, hb1, hb2, hb3);
        // info.setPrefHeight(350);
        // info.setPrefWidth(400);
        // info.setAlignment(Pos.CENTER);

        // Image profile = new Image("homepage/homeui/profile.png", 200, 200, false, false);
        // ImageView ivprofile = new ImageView(profile);
        // ivprofile.setStyle("-fx-background-color:transparent");

        // HBox all = new HBox(200, ivprofile, info);
        // all.setStyle("-fx-background-color:white");
        // all.setLayoutX(500);
        // all.setLayoutY(300);

        // all.setAlignment(Pos.CENTER);
        Image ig1 = new Image("loginpages/back.png", 45, 45, false, false);
        ImageView iv1 = new ImageView(ig1);

        Button backButton = new Button("", iv1);
        backButton.setStyle("-fx-background-radius :50; -fx-border-radius :50; -fx-padding:10");
        backButton.setStyle("-fx-background-color:transparent");
        backButton.setOnAction(new EventHandler<ActionEvent>() {

        @Override
        public void handle(ActionEvent event) {

        Homepage obj6 = new Homepage(stage);
        obj6.initializehome();
      }

    });


        Pane pane = new Pane();
        pane.getChildren().addAll(backButton,usImageView, name, useremail, userpassword, labelusername, password, email);
        pane.setStyle(" -fx-background-color: linear-gradient(from 50% 50% to 0% 0%, #F5D419,#ffffff);");
        backButton.setLayoutX(0);
        backButton.setLayoutY(20);


        usImageView.setLayoutX(250);
        usImageView.setLayoutY(150);
        name.setLayoutX(600);
        name.setLayoutY(150);

        labelusername.setLayoutX(750);
        labelusername.setLayoutY(150);

        password.setLayoutX(550);
        password.setLayoutY(230);
        userpassword.setLayoutX(750);
        userpassword.setLayoutY(230);

        email.setLayoutX(615);
        email.setLayoutY(300);
        useremail.setLayoutX(750);
        useremail.setLayoutY(300);

        Scene scene = new Scene(pane, 2000, 1000);
        stage.setScene(scene);
        stage.show();

    }

}

