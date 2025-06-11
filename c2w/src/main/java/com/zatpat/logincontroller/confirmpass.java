package com.zatpat.logincontroller;


import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

public class confirmpass {
    Stage stage;

    public confirmpass(Stage stage){

        this.stage=stage;
    }

    public void initialize7(){
        PasswordField tx=new PasswordField();
        tx.setMaxWidth(260);
        tx.setPromptText("New PassWord");
        tx.setStyle("-fx-background-radius: 10; -fx-border-radius: 10; -fx-padding:15");

        PasswordField ps=new PasswordField();
        ps.setStyle("-fx-background-radius: 10; -fx-border-radius: 10; -fx-padding:15");
        ps.setMaxWidth(260);
        ps.setPromptText("Confirm PassWord");

        Button Confirm=new Button("SetPassWord");
        Confirm.setStyle("-fx-text-fill : white;-fx-background-color :#3897f0; -fx-background-radius :10; -fx-border-radius :10; -fx-padding:10");
        Confirm.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
               login obj5=new login(stage);
               obj5.initialize1();

            }
            
        });
        //BaackButton
        Image ig1=new Image("loginpages/back.png",45,45,false,false);
        ImageView iv1=new ImageView(ig1);

        

        Button backButton=new Button("",iv1);
        backButton.setStyle("-fx-background-color:transparent;-fx-background-radius :50; -fx-border-radius :50; -fx-padding:10");
        backButton.setOnAction(new EventHandler<ActionEvent>() {

         @Override
         public void handle(ActionEvent event) {
            
            Forgotpage obj7=new Forgotpage(stage);
            obj7.initialize4();
         }
         
        });
        // VBox vb6=new VBox(backButton);
        // vb6.setLayoutY(100);
        // vb6.setMaxHeight(100);
        
        VBox vbox=new VBox(20,tx,ps,Confirm);
        //vbox.setAlignment(Pos.TOP_CENTER);
        vbox.setAlignment(Pos.CENTER);
        //vbox.setMaxHeight(250);

        // Image ig=new Image("Assets/images/bai.png");
        // ImageView iv=new ImageView(ig);
        // iv.setFitWidth(400);
        // iv.setFitHeight(300);
        // iv.setPreserveRatio(false);

        

        // VBox vb2=new VBox(iv);
        // vb2.setAlignment(Pos.BOTTOM_CENTER);
        // vb2.setMaxHeight(250);
        // vb2.setLayoutY(400);
        
    //     VBox vb=new VBox(50,vbox);
    //    // vb.setStyle("-fx-background-color:white");
    //     vb.setMaxHeight(700);
    //     vb.setMaxWidth(400);
    //     vb.setAlignment(Pos.CENTER);
        
     Label lb=new Label("New PassWord");
   
     lb.setFont(Font.font("Times New Roman", FontWeight.BOLD, 40));

        Pane pane=new Pane();
        pane.getChildren().add(vbox);
        pane.getChildren().add(backButton);
        pane.setStyle(" -fx-background-color: linear-gradient(from 50% 50% to 0% 0%, #F5D419,#ffffff);");
        pane.getChildren().add(lb);

        vbox.setLayoutX(850);
        vbox.setLayoutY(300);

        lb.setLayoutX(820);
        lb.setLayoutY(10);

        Scene scene4=new Scene(pane,2000,1000);
        stage.setScene(scene4);
        stage.show();
    }

    }