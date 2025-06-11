package com.zatpat.logincontroller;

import java.io.File;
import java.util.concurrent.ExecutionException;

import com.zatpat.controller.modeluserlogin;
import com.zatpat.firebase.FirebaseInitialize;
import com.zatpat.firebase.FirebaseInitializemaid;

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
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.shape.Box;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

public class Register {
    public static TextField tx1;
    public PasswordField ps;
    public TextField tx2;
    public static modeluserlogin model;
    public static String str;
    private String img4;
    Stage stage;

    public Register(Stage stage) {

        this.stage = stage;
    }

    public void initialize2() {

        Label lb = new Label("Register");
        lb.setFont(Font.font("Times New Roman", FontWeight.BOLD, 45));
        lb.setLayoutY(200);

        VBox vb4 = new VBox(lb);
        vb4.setAlignment(Pos.TOP_CENTER);

        tx1 = new TextField();
        tx1.setPromptText("Username");
        tx1.setPrefWidth(300);
        tx1.setAlignment(Pos.CENTER);
        tx1.setStyle("-fx-background-radius :10; -fx-border-radius :10; -fx-padding:15");

        ps = new PasswordField();
        ps.setPromptText("PassWord");
        ps.setMaxWidth(400);
        ps.setAlignment(Pos.CENTER);
        ps.setStyle("-fx-background-radius :10; -fx-border-radius :10; -fx-padding:15");

        tx2 = new TextField();
        tx2.setPromptText("EmailId");
        tx2.setMaxWidth(400);
        tx2.setAlignment(Pos.CENTER);
        tx2.setStyle("-fx-background-radius :10; -fx-border-radius :10; -fx-padding:15");

        Button regsButton = new Button("Register");
        regsButton.setPrefWidth(200);
        // regsButton.setStyle("-fx-background-color:#3897f0");
        regsButton.setAlignment(Pos.CENTER);
        regsButton.setStyle(
                "-fx-background-color:#3897f0; -fx-background-radius :15; -fx-border-radius :15; -fx-padding:20");

        // object of the model class
        // model = new modeluserlogin();
        model = new modeluserlogin(tx1.getText(), ps.getText(), tx2.getText(),img4);

        // setStr(tx1.getText());
        System.out.println(tx1.getText());
        // Register.str = tx1.getText();

        regsButton.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                // System.out.println(model.getusername() + model.getpassword() +
                // model.getemail());
                // model.setEmail(tx1.getText());
                // model.setPassword(ps.getText());
                // model.setUsername(tx2.getText());
                model.setUsername(tx1.getText());
                model.setPassword(ps.getText());
                model.setEmail(tx2.getText());
                model.setImg4(img4);

                FirebaseInitialize fobj = new FirebaseInitialize();
                try {
                    fobj.createuserlogin(model);
                } catch (ExecutionException e) {

                    e.printStackTrace();
                } catch (InterruptedException e) {

                    e.printStackTrace();
                }

                login obj3 = new login(stage);
                obj3.initialize1();

            }

        });
        Image ig1 = new Image("loginpages/back.png", 45, 45, false, false);
        ImageView iv1 = new ImageView(ig1);

        Button backButton = new Button("", iv1);
        backButton.setStyle("-fx-background-radius :50; -fx-border-radius :50; -fx-padding:10");
        backButton.setStyle("-fx-background-color:transparent");
        backButton.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {

                Frontpage obj7 = new Frontpage(stage);
                obj7.initialize();
            }

        });

        // VBox vb6=new VBox(backButton);
        // vb6.setLayoutY(2);

        HBox hb = new HBox(regsButton);
        hb.setAlignment(Pos.CENTER);

        VBox vb1 = new VBox(20, tx1, ps, tx2, hb);
        vb1.setAlignment(Pos.CENTER);

        VBox vb2 = new VBox(60, vb4, vb1);
        // vb2.setMaxHeight(500);
        // vb2.setMaxWidth(400);
        vb2.setAlignment(Pos.CENTER);
        // vb2.setStyle("-fx-background-color:white");

        VBox vb7 = new VBox(30, vb2);
        vb7.setLayoutX(800);
        vb7.setLayoutY(200);
        backButton.setLayoutX(0);
        backButton.setLayoutY(0);

        
        ImageView photoImageView4= new ImageView();
        photoImageView4.setFitHeight(200);
        photoImageView4.setFitWidth(200);

        Button uploadButton4 = new Button("img3");
        uploadButton4.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                FileChooser fileChooser = new FileChooser();
                fileChooser.getExtensionFilters()
                        .add(new FileChooser.ExtensionFilter("Image Files","*.png","*.jpg","*.gif" ));
                File selectedFile = fileChooser.showOpenDialog(stage);

                if (selectedFile != null) {
                    Image img3 = new Image(selectedFile.toURI().toString());
                    photoImageView4.setImage(img3);
                }
                FirebaseInitializemaid obj = new FirebaseInitializemaid();
                img4= FirebaseInitializemaid.uploadImg(selectedFile.getPath(),selectedFile.getName());
                // img3= obj.uploadImg(selectedFile,tx1.getText());
                System.out.println(img4);
            }
        });

        VBox imageUploadBox = new VBox(10, photoImageView4, uploadButton4);
        imageUploadBox.setAlignment(Pos.CENTER);

        Box box =new Box(200, 220, 0);
        box.setLayoutX(400);
        box.setLayoutY(400);

        Pane pane = new Pane();
        pane.getChildren().add(box);
        pane.getChildren().add(imageUploadBox);
        imageUploadBox.setLayoutX(300);
        imageUploadBox.setLayoutY(300);
        pane.getChildren().add(vb7);
        pane.getChildren().add(backButton);
        pane.setStyle(" -fx-background-color: linear-gradient(from 50% 50% to 0% 0%, #F5D419,#ffffff);");

        Scene scene = new Scene(pane, 2000, 1000);

        stage.setScene(scene);
        // stage.setHeight(700);
        // stage.setWidth(400);
        stage.show();

    }

    public static void setStr(String str) {
        Register.str = str;
    }

    public String getStr() {
        return str;
    }
}

// package com.zatpat.logincontroller;

// import javafx.event.ActionEvent;
// import javafx.event.EventHandler;
// import javafx.geometry.Pos;
// import javafx.scene.Scene;
// import javafx.scene.control.Button;
// import javafx.scene.control.Label;
// import javafx.scene.control.PasswordField;
// import javafx.scene.control.TextField;
// import javafx.scene.image.Image;
// import javafx.scene.image.ImageView;
// import javafx.scene.layout.HBox;
// import javafx.scene.layout.Pane;
// import javafx.scene.layout.VBox;
// import javafx.scene.text.Font;
// import javafx.scene.text.FontWeight;
// import javafx.stage.Stage;
                                                                                   
// public class Register {

//     Stage stage;
//     public Register(Stage stage){

//         this.stage=stage;
//     }
    
//     public void initialize2(){

//         Label lb=new Label("Register");
//         lb.setFont(Font.font("Times New Roman", FontWeight.BOLD,45));
//         lb.setLayoutY(200);

//         VBox vb4=new VBox(lb);
//         vb4.setAlignment(Pos.TOP_CENTER);

//         TextField tx1=new TextField();
//         tx1.setPromptText("Username");
//         tx1.setPrefWidth(300);
//         tx1.setAlignment(Pos.CENTER);
//         tx1.setStyle("-fx-background-radius :10; -fx-border-radius :10; -fx-padding:15");
          
//         PasswordField ps=new PasswordField();
//         ps.setPromptText("PassWord");
//         ps.setMaxWidth(400);
//         ps.setAlignment(Pos.CENTER);
//         ps.setStyle("-fx-background-radius :10; -fx-border-radius :10; -fx-padding:15");


//         TextField tx2=new TextField();
//         tx2.setPromptText("EmailId");
//         tx2.setMaxWidth(400);
//         tx2.setAlignment(Pos.CENTER);
//         tx2.setStyle("-fx-background-radius :10; -fx-border-radius :10; -fx-padding:15");

//         Button regsButton=new Button("Register");
//         regsButton.setPrefWidth(200);
//        // regsButton.setStyle("-fx-background-color:#3897f0");
//         regsButton.setAlignment(Pos.CENTER);
//         regsButton.setStyle("-fx-background-color:#3897f0; -fx-background-radius :15; -fx-border-radius :15; -fx-padding:20");

//         regsButton.setOnAction(new EventHandler<ActionEvent>() {

//             @Override
//             public void handle(ActionEvent event) {
//                 login obj3=new login(stage);
//                 obj3.initialize1();
//             }
            
//         });
//         Image ig1=new Image("loginpages/back.png",45,45,false,false);
//         ImageView iv1=new ImageView(ig1);

//         Button backButton=new Button("",iv1);
//         backButton.setStyle("-fx-background-radius :50; -fx-border-radius :50; -fx-padding:10");
//         backButton.setStyle("-fx-background-color:transparent");
//         backButton.setOnAction(new EventHandler<ActionEvent>() {

//          @Override
//          public void handle(ActionEvent event) {
            
//             Frontpage obj7=new Frontpage(stage);
//             obj7.initialize();
//          }
         
//         });
//        // VBox vb6=new VBox(backButton);
//         //vb6.setLayoutY(2);



//         HBox hb=new HBox(regsButton);
//         hb.setAlignment(Pos.CENTER);

//         VBox vb1=new VBox(20,tx1,ps,tx2,hb);
//         vb1.setAlignment(Pos.CENTER);

//         VBox vb2=new VBox(60,vb4,vb1);
//         //vb2.setMaxHeight(500);
//        // vb2.setMaxWidth(400);
//         vb2.setAlignment(Pos.CENTER);
//        // vb2.setStyle("-fx-background-color:white");

//         VBox vb7=new VBox(30,vb2);
//         vb7.setLayoutX(800);
//         vb7.setLayoutY(200);
//         backButton.setLayoutX(0);
//         backButton.setLayoutY(0);

//         Pane pane=new Pane();
//         pane.getChildren().add(vb7);
//         pane.getChildren().add(backButton);
//         pane.setStyle(" -fx-background-color: linear-gradient(from 50% 50% to 0% 0%, #F5D419,#ffffff);");

//         Scene scene=new Scene(pane,2000,1000);
        
//         stage.setScene(scene);
//         //stage.setHeight(700);
//         //stage.setWidth(400);
//         stage.show();
    





//     }
// }