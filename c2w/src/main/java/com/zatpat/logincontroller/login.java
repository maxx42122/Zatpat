package com.zatpat.logincontroller;

import com.zatpat.Home.Homepage;
import com.zatpat.controller.modeluserlogin;
import com.zatpat.firebase.FirebaseInitialize;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;

import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

public class login {
  Stage stage;
  FirebaseInitialize obj = new FirebaseInitialize();

  public login(Stage stage) {
    this.stage = stage;
    System.out.println("Login succesfully");

  }

  public void initialize1() {
    // Image ig=new Image("Assets/images/WhatsApp Image 2024-06-28 at
    // 12.06.33_a1fd3721.jpg");
    // ImageView iv=new ImageView(ig);
    // iv.setFitWidth(200);
    // iv.setFitHeight(150);
    // iv.setPreserveRatio(true);
    // System.out.println("Login succesfully");

    TextField tx = new TextField();
    tx.setPromptText("Username");
    tx.setPrefWidth(250);
    tx.setStyle("-fx-background-radius:10; -fx-border-radius:10; -fx-padding:15");

    PasswordField ps = new PasswordField();
    ps.setPromptText("Password");
    ps.setPrefWidth(250);
    ps.setStyle("-fx-background-radius:10; -fx-border-radius:10; -fx-padding:15");

    Button loginbButton = new Button("Login");
    loginbButton.setFont(new Font(20));
    loginbButton.setMaxWidth(150);

    /////
    // modeluserlogin mobj = new modeluserlogin();

    //

    loginbButton.setStyle(
        "-fx-background-color:#3897f0; -fx-text-fill:white; -fx-background-radius:2000; -fx-border-radius:600; -fx-padding:5");
    loginbButton.setOnAction(new EventHandler<ActionEvent>() {

      @Override
      public void handle(ActionEvent event) {

        handlelogin(tx.getText(), ps.getText());

        // Homepage objhome = new Homepage(stage);
        // objhome.initializehome();
      }

    });

    Button forgotButton = new Button("Forgot Password");
    forgotButton.setOnAction(new EventHandler<ActionEvent>() {

      @Override
      public void handle(ActionEvent event) {
        Forgotpage obj4 = new Forgotpage(stage);
        obj4.initialize4();
      }

    });
    forgotButton.setStyle("-fx-text-fill:#000000; -fx-background-radius:30; -fx-border-radius:5; -fx-padding:5");

    Label labe2 = new Label("Login");
    labe2.setFont(Font.font("Times New Roman", FontWeight.BOLD, 45));
    // labe2.setTextFill(Color.web("#3897f0"));

    Image ig1 = new Image("loginpages/back.png", 45, 45, true, true);
    ImageView iv1 = new ImageView(ig1);

    Button backButton = new Button("", iv1);
    backButton.setStyle("-fx-background-radius :50; -fx-border-radius :50; -fx-padding:10");
    backButton.setStyle("-fx-background-color:transparent");
    backButton.setOnAction(new EventHandler<ActionEvent>() {

      @Override
      public void handle(ActionEvent event) {

        Frontpage obj6 = new Frontpage(stage);
        obj6.initialize();
      }

    });
    // VBox vb6=new VBox(backButton);
    // vb6.setLayoutY(2);

    // VBox vb=new VBox(labe2);
    // vb.setAlignment(Pos.CENTER);

    VBox vb1 = new VBox(20, tx, ps, loginbButton, forgotButton);
    vb1.setAlignment(Pos.CENTER);

    VBox vb2 = new VBox(30, vb1);
    vb2.setAlignment(Pos.CENTER);

    // VBox vb3=new VBox(iv);
    // vb3.setScaleY(1);
    // vb3.setScaleX(1);
    // //vb3.setStyle("-fx-background-color: #3897f0; -fx-background-radius: 700;
    // -fx-padding:80;");

    VBox vb4 = new VBox(20, vb2);
    vb4.setAlignment(Pos.CENTER);
    vb4.setLayoutY(300);
    vb4.setLayoutX(820);
    // vb4.setStyle("-fx-background-color:white");

    labe2.setLayoutX(880);
    labe2.setLayoutY(180);

    Pane pane = new Pane();
    pane.getChildren().add(vb4);
    pane.getChildren().add(labe2);
    pane.setStyle(" -fx-background-color: linear-gradient(from 50% 50% to 0% 0%, #F5D419,#ffffff);");

    pane.getChildren().add(backButton);
    backButton.setLayoutX(0);
    backButton.setLayoutY(0);
    // backButton.setLayoutY(7);

    // ///////////////////////////////////
    

    Scene scene2 = new Scene(pane, 2000, 1000);
    stage.setTitle("Maid&Cook");
    stage.setScene(scene2);
    stage.show();

  }

  private void handlelogin(String username, String password) {
    Register.str = username;
    try {
      if (obj.authenticateUser(username, password)) {
        System.out.println("Login Succesfull");
        Homepage objhome = new Homepage(stage);
        objhome.initializehome();
      } else {

        System.out.println("Invalid password");
      }
    } catch (Exception e) {
      e.printStackTrace();
    }

  }

}
