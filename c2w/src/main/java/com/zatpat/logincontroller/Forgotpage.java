package com.zatpat.logincontroller;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;

import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

public class Forgotpage {
    Stage stage;

    public Forgotpage(Stage stage) {
        this.stage = stage;
    }

    public void initialize4() {

        TextField tx = new TextField();
        tx.setMaxWidth(260);
        tx.setPromptText("Mobile no.");
        tx.setStyle("-fx-background-radius: 10; -fx-border-radius: 10; -fx-padding:15");

        PasswordField ps = new PasswordField();
        ps.setStyle("-fx-background-radius: 10; -fx-border-radius: 10; -fx-padding:15");
        ps.setMaxWidth(150);
        ps.setPromptText("OTP");

        Label lb3 = new Label("Forgot PassWord");
        lb3.setMaxWidth(300);
        lb3.setAlignment(Pos.CENTER);
        lb3.setFont(Font.font("Times New Roman", FontWeight.BOLD, 30));
        lb3.setStyle("-fx-background-radius :20; -fx-border-radius :10; -fx-padding:10");

        Label lb4 = new Label(" ");
        Label lb5 = new Label(" ");

        Button Sent_OTP = new Button("Sent OTP");
        Sent_OTP.setStyle(
                "-fx-text-fill : white;-fx-background-color :#3897f0; -fx-background-radius :10; -fx-border-radius :10; -fx-padding:10");

        Button Confirm = new Button("Confirm");
        Confirm.setStyle(
                "-fx-text-fill : white;-fx-background-color :#3897f0; -fx-background-radius :10; -fx-border-radius :10; -fx-padding:10");
        Confirm.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                confirmpass obj5 = new confirmpass(stage);
                obj5.initialize7();

            }

        });
        // BaackButton
        Image ig1 = new Image("loginpages/back.png", 45, 45, false, false);
        ImageView iv1 = new ImageView(ig1);

        Button backButton = new Button("", iv1);
        backButton.setStyle("-fx-background-color:transparent;-fx-background-radius :50; -fx-border-radius :50; -fx-padding:10");
        backButton.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {

                login obj7 = new login(stage);
                obj7.initialize1();
            }

        });
        // VBox vb6=new VBox(backButton);
        // vb6.setLayoutY(2);
        // vb6.setMaxHeight(100);

        VBox vbox = new VBox(25, lb3, tx, Sent_OTP, ps, Confirm, lb4, lb5);
        // vbox.setAlignment(Pos.TOP_CENTER);
        vbox.setAlignment(Pos.CENTER);
        vbox.setMaxHeight(250);

        // Image ig = new Image("Assets/images/WhatsApp Image 2024-06-28 at 14.31.44_915a3c30.jpg");
        // ImageView iv = new ImageView(ig);
        // iv.setFitWidth(400);
        // iv.setFitHeight(300);
        // iv.setPreserveRatio(false);

        // VBox vb2=new VBox(iv);
        // vb2.setAlignment(Pos.BOTTOM_CENTER);
        // vb2.setMaxHeight(250);
        // vb2.setLayoutY(300);

        VBox vb = new VBox(10, vbox);
        // vb.setStyle("-fx-background-color:white");
        vb.setMaxHeight(700);
        vb.setMaxWidth(400);
        vb.setAlignment(Pos.CENTER);

        Pane pane = new Pane();
        pane.getChildren().add(vb);
        vb.setLayoutX(830);
        vb.setLayoutY(230);
        pane.getChildren().add(backButton);
        //backButton.setLayoutY(7);
        pane.setStyle(" -fx-background-color: linear-gradient(from 50% 50% to 0% 0%, #F5D419,#ffffff);");

        Scene scene4 = new Scene(pane,2000,1000);
        stage.setScene(scene4);
        stage.show();
    }
}