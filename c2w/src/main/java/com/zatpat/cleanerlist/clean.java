package com.zatpat.cleanerlist;

import com.zatpat.Home.Homepage;
import com.zatpat.logincontroller.Frontpage;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class clean {
    public Stage stage;

    public clean(Stage stage) {
    this.stage = stage;
    }

     
         public void initializeclean(){
    

  
        Image ig = new Image("cleanerpage/vishal.png");
        ImageView iv = new ImageView(ig);

        Label lb = new Label("Home Cleaning");
        lb.setLayoutX(300);
        lb.setLayoutY(50);
        lb.setTextFill(Color.RED);
        lb.setFont(Font.font("Times New Roman", FontWeight.BOLD, 35));

        Label lb1 = new Label("Services");
        lb1.setTextFill(Color.BLUE);
        lb1.setLayoutX(550);
        lb1.setLayoutY(50);
        lb1.setFont(Font.font("Times New Roman", FontWeight.BOLD, 35));

        VBox vb = new VBox(iv);
        vb.setLayoutX(200);
        vb.setLayoutY(200);
        iv.setScaleX(1.2);
        iv.setScaleY(1.2);

        Label lb2 = new Label("ENQUIRY");
        lb2.setLayoutX(1250);
        lb2.setLayoutY(50);
        lb2.setTextFill(Color.RED);
        lb2.setFont(Font.font("Times New Roman", FontWeight.BOLD, 35));

        Label lb3 = new Label("FORM");
        lb3.setTextFill(Color.BLUE);
        lb3.setLayoutX(1430);
        lb3.setLayoutY(50);
        lb3.setFont(Font.font("Times New Roman", FontWeight.BOLD, 35));

        TextField tx = new TextField("");
        tx.setPromptText("Name");
        tx.setPrefWidth(400);
        tx.setLayoutX(900);
        tx.setLayoutY(150);
        tx.setStyle("-fx-background-radius: 10; -fx-border-radius: 10; -fx-padding: 15");

        TextField tx1 = new TextField("");
        tx1.setPromptText("Email ID");
        tx1.setPrefWidth(400);
        tx1.setLayoutX(1400);
        tx1.setLayoutY(150);
        tx1.setStyle("-fx-background-radius: 10; -fx-border-radius: 10; -fx-padding: 15");

        TextField tx2 = new TextField("");
        tx2.setPromptText("Phone No");
        tx2.setPrefWidth(400);
        tx2.setLayoutX(900);
        tx2.setLayoutY(250);
        tx2.setStyle("-fx-background-radius: 10; -fx-border-radius: 10; -fx-padding: 15");

        ComboBox<String> comboBox = new ComboBox<>();
        comboBox.getItems().addAll("Residential Deep Cleaning", "Commercial Deep Cleaning");
        comboBox.setPromptText("Subject");
        comboBox.setPrefWidth(400);
        comboBox.setPrefHeight(10);
        comboBox.setLayoutX(1400);
        comboBox.setLayoutY(250);
        comboBox.setStyle(
                "-fx-background-radius: 10; -fx-border-radius: 10; -fx-padding: 15;");

        TextField tx4 = new TextField("");
        tx4.setPromptText("Address");
        tx4.setPrefWidth(900);
        tx4.setLayoutX(900);
        tx4.setLayoutY(350);
        tx4.setStyle("-fx-background-radius: 10; -fx-border-radius: 10; -fx-padding: 15");

        TextField tx5 = new TextField("");
        tx5.setPromptText("Requirement");
        tx5.setPrefHeight(100);
        tx5.setPrefWidth(900);
        tx5.setLayoutX(900);
        tx5.setLayoutY(450);
        tx5.setStyle("-fx-background-radius: 10; -fx-border-radius: 10; -fx-padding: 15");

        Label lb4 = new Label("NAME:");
        lb4.setLayoutX(900);
        lb4.setLayoutY(120);
        lb4.setTextFill(Color.RED);
        lb4.setFont(new Font(20));

        Label lb5 = new Label("EMAIL:");
        lb5.setLayoutX(1400);
        lb5.setLayoutY(120);
        lb5.setTextFill(Color.RED);
        lb5.setFont(new Font(20));

        Label lb6 = new Label("PHONE NO:");
        lb6.setLayoutX(900);
        lb6.setLayoutY(220);
        lb6.setTextFill(Color.RED);
        lb6.setFont(new Font(20));

        Label lb7 = new Label("SUBJECT:");
        lb7.setLayoutX(1400);
        lb7.setLayoutY(220);
        lb7.setTextFill(Color.RED);
        lb7.setFont(new Font(20));

        Label lb8 = new Label("ADDRESS:");
        lb8.setLayoutX(900);
        lb8.setLayoutY(320);
        lb8.setTextFill(Color.RED);
        lb8.setFont(new Font(20));

        Label lb9 = new Label("REQUIREMENT:");
        lb9.setLayoutX(900);
        lb9.setLayoutY(420);
        lb9.setTextFill(Color.RED);
        lb9.setFont(new Font(20));

        Button b1 = new Button("SUBMIT");
        b1.setOnAction(new EventHandler<ActionEvent>() {

                @Override
                public void handle(ActionEvent event) {
                    cleanerinfo obj1=new cleanerinfo();
                    obj1.conmaid(stage);
    
                    obj1.initializecleanlist();
                }
                
            });

        b1.setLayoutX(1300);
        b1.setLayoutY(580);
        b1.setMaxWidth(150);
        b1.setStyle(
                "-fx-background-radius: 10; -fx-border-radius: 10; -fx-padding: 15; -fx-background-color: #3897f0; -fx-text-fill: white;");

        Label lb10 = new Label("Residential Deep Cleaning\n");
        lb10.setFont(new Font(30));
        lb10.setTextFill(Color.RED);
        lb10.setLayoutX(900);
        lb10.setLayoutY(600);

        Text tx6 = new Text(100, 100,
                "1) Floor Scrubbing and Buffing\n"
                        + "2) Wall Shampooing\n"
                        + "3) Window Cleaning\n"
                        + "4) Kitchen Cleaning\n"
                        + "5) Bathroom Sanitisation\n"
                        + "6) Furniture Cleaning\n"
                        + "7) Sofa & Carpet Shampooing\n"
                        + "8) Wipe & organise all exterior shelves");
        tx6.setLayoutX(800);
        tx6.setLayoutY(570);
        tx6.setFont(new Font(20));

        Label lb11 = new Label("Commercial Deep Cleaning");
        lb11.setFont(new Font(30));
        lb11.setTextFill(Color.RED);
        lb11.setLayoutX(1410);
        lb11.setLayoutY(600);

        Text tx7 = new Text(100, 100,
                "1) Office Cleaning\n"
                        + "2) Society Cleaning\n"
                        + "3) Sofa & Carpet Shampooing\n"
                        + "4) Chair Cleaning\n"
                        + "5) Staircase Cleaning\n"
                        + "6) Temple Cleaning\n"
                        + "7) Glass Cleaning\n"
                        + "8) Floor Polishing");
        tx7.setLayoutX(1320);
        tx7.setLayoutY(570);
        tx7.setFont(new Font(20));

        Image ig1 = new Image("loginpages/back.png", 45, 45, false, false);
        ImageView iv1 = new ImageView(ig1);

        Button backButton = new Button("", iv1);
        backButton.setLayoutX(10);
        backButton.setLayoutY(20);
        backButton.setStyle("-fx-background-radius :50; -fx-border-radius :50; -fx-padding:10");
        backButton.setStyle("-fx-background-color:transparent");
        backButton.setOnAction(new EventHandler<ActionEvent>() {

      @Override
      public void handle(ActionEvent event) {

        Homepage obj16 = new Homepage(stage);
        obj16.initializehome();
      }

    });

        Pane pn = new Pane(backButton,lb, lb1, lb2, lb3, lb4, tx, lb5, tx1, lb6, tx2, lb7, comboBox, lb8, tx4, lb9, tx5, b1, lb10,lb11,tx6, tx7, vb);

        Scene sc = new Scene(pn, 2000, 1000);
        stage.setScene(sc);
        stage.show();

       
    }

}