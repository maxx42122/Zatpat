package com.zatpat.logincontroller;



import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.ExecutionException;

import com.zatpat.firebase.FirebaseInitializemaid;
import com.zatpat.maidlist.madeInfoModel;

public class registermaid {
    Stage stage;
    File selectedFile;
    public static String img;
    public static String img1;
    public static String img2;
    public static String img3;
    public registermaid(Stage stage) {
        this.stage = stage;
    }

    public void initializemaid() {
 Label lb = new Label("Cook Sign Up");
        lb.setFont(Font.font("Times New Roman", FontWeight.BOLD, 45));

        TextField tx1 = new TextField("");
        tx1.setPromptText("Name");
        tx1.setMaxWidth(450);
        tx1.setStyle("-fx-background-radius:10; -fx-border-radius:10; -fx-padding:15");

        TextField tx2 = new TextField("");
        tx2.setPromptText("Mobile No.");
        tx2.setMaxWidth(450);
        tx2.setStyle("-fx-background-radius:10; -fx-border-radius:10; -fx-padding:15");

        TextField tx3 = new TextField("");
        tx3.setPromptText("Age");
        tx3.setMaxWidth(450);
        tx3.setStyle("-fx-background-radius:10; -fx-border-radius:10; -fx-padding:15");

        TextField tx4 = new TextField("");
        tx4.setPromptText("Location");
        tx4.setMaxWidth(450);
        tx4.setStyle("-fx-background-radius:10; -fx-border-radius:10; -fx-padding:15");

        // TextField tx5 = new TextField("");
        // tx5.setPromptText("Experience");
        // tx5.setMaxWidth(450);
        // tx5.setStyle("-fx-background-radius:10; -fx-border-radius:10; -fx-padding:15");


        ComboBox<String> comboBox1 = new ComboBox<>();
        comboBox1.getItems().addAll("1 yrs", "2 yrs", "3 yrs","4 yrs", "5 yrs", "6 yrs","7 yrs", "8 yrs", "9 yrs","10 yrs", "more than 10 yrs");
        comboBox1.setPromptText("Work Exeperiance");
        comboBox1.setPrefWidth(400);
        comboBox1.setLayoutX(1400);
        comboBox1.setLayoutY(250);
        comboBox1.setStyle("-fx-background-radius: 10; -fx-border-radius: 10; -fx-padding: 15;");

        TextField tx6 = new TextField("");
        tx6.setPromptText("Language");
        tx6.setMaxWidth(450);
        tx6.setStyle("-fx-background-radius:10; -fx-border-radius:10; -fx-padding:15");

        PasswordField ps = new PasswordField();
        ps.setPromptText("Enter your password");
        ps.setMaxWidth(450);
        ps.setStyle("-fx-background-radius:10; -fx-border-radius:10; -fx-padding:15");

        ComboBox<String> comboBox = new ComboBox<>();
        comboBox.getItems().addAll("Veg", "Non-veg", "Both");
        comboBox.setPromptText("Type");
        comboBox.setPrefWidth(400);
        comboBox.setLayoutX(1400);
        comboBox.setLayoutY(250);
        comboBox.setStyle("-fx-background-radius: 10; -fx-border-radius: 10; -fx-padding: 15;");

        TextField tx5 = new TextField("");
        tx5.setPromptText("aboutme");
        tx5.setMaxWidth(450);
        tx5.setStyle("-fx-background-radius:10; -fx-border-radius:10; -fx-padding:40");


        Button b3 = new Button("SignUp");
        b3.setMaxWidth(150);
        b3.setStyle("-fx-background-color:#3897f0; -fx-text-fill:white; -fx-background-radius:3600; -fx-border-radius:880; -fx-padding:15");
       b3.setOnMouseClicked(e->{
             
        madeInfoModel obj = new madeInfoModel(tx1.getText(), tx2.getText(), tx3.getText(), tx4.getText(), comboBox1.getValue(), tx6.getText(), comboBox.getValue(), ps.getText(), img, img1, img2, img3, tx5.getText());
        System.out.println(img);
        System.out.println(img1);
        System.out.println(img2);
        System.out.println(img3);
               
        submit(obj);
            login lg = new login(stage);
            lg.initialize1();
        
       });
        Image ig1 = new Image("loginpages/back.png", 45, 45, false, false);
        ImageView iv1 = new ImageView(ig1);

        Button backButton = new Button("", iv1);
        backButton.setStyle("-fx-background-radius :50; -fx-border-radius :50; -fx-padding:10; -fx-background-color:transparent");
        backButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                page1 objreg = new page1(stage);
                objreg.initializepage();
            }
        });

        // // Image upload section
        // ImageView photoImageView = new ImageView();
        // photoImageView.setFitHeight(200);
        // photoImageView.setFitWidth(200);

        // Button uploadButton = new Button("Upload Photo");
        // uploadButton.setOnAction(new EventHandler<ActionEvent>() {
        //     @Override
        //     public void handle(ActionEvent event) {
        //         FileChooser fileChooser = new FileChooser();
        //         fileChooser.getExtensionFilters().add(new FileChooser.ExtensionFilter("Image Files","*.png","*.jpg","*.gif" ));
        //          selectedFile = fileChooser.showOpenDialog(stage);

        //         if (selectedFile != null) {
        //             Image image = new Image(selectedFile.toURI().toString());
        //             photoImageView.setImage(image);
        //         }
                 
        //         FirebaseInitialize obj = new FirebaseInitialize();
        //        imgLink= obj.uploadImg(selectedFile,tx1.getText());
        //     }
        // });
       
        // Image upload section

        
        Label label1 = new Label("Profile photo :");
        label1.setFont(Font.font("Impact", 30));

        ImageView photoImageView = new ImageView();
        photoImageView.setFitHeight(200);
        photoImageView.setFitWidth(200);

        Button uploadButton = new Button("img");
        uploadButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                FileChooser fileChooser = new FileChooser();
                fileChooser.getExtensionFilters()
                        .add(new FileChooser.ExtensionFilter("Image Files","*.png","*.jpg","*.gif" ));
                File selectedFile = fileChooser.showOpenDialog(stage);

                if (selectedFile != null) {
                    Image image = new Image(selectedFile.toURI().toString());
                    photoImageView.setImage(image);
                }
                FirebaseInitializemaid obj = new FirebaseInitializemaid();
                // img= obj.uploadImg(selectedFile,tx1.getText());
                img= FirebaseInitializemaid.uploadImg(selectedFile.getPath(),selectedFile.getName());
                System.out.println(img);
            }
        });

        
        Label label2 = new Label("Best dishes :");
        label2.setFont(Font.font("Impact", 30));
        ImageView photoImageView1 = new ImageView();
        photoImageView1.setFitHeight(200);
        photoImageView1.setFitWidth(200);

        Button uploadButton1 = new Button("img1");
        uploadButton1.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                FileChooser fileChooser = new FileChooser();
                fileChooser.getExtensionFilters()
                        .add(new FileChooser.ExtensionFilter("Image Files","*.png","*.jpg","*.gif" ));
                File selectedFile = fileChooser.showOpenDialog(stage);

                if (selectedFile != null) {
                    Image img1 = new Image(selectedFile.toURI().toString());
                    photoImageView1.setImage(img1);
                }
                FirebaseInitializemaid obj = new FirebaseInitializemaid();
                img1= FirebaseInitializemaid.uploadImg(selectedFile.getPath(),selectedFile.getName());
                System.out.println(img1);
            }
        });

        ImageView photoImageView2 = new ImageView();
        photoImageView2.setFitHeight(200);
        photoImageView2.setFitWidth(200);

        Button uploadButton2 = new Button("img2");
        uploadButton2.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                FileChooser fileChooser = new FileChooser();
                fileChooser.getExtensionFilters()
                        .add(new FileChooser.ExtensionFilter("Image Files","*.png","*.jpg","*.gif" ));
                File selectedFile = fileChooser.showOpenDialog(stage);

                if (selectedFile != null) {
                    Image img2 = new Image(selectedFile.toURI().toString());
                    photoImageView2.setImage(img2);
                }
                FirebaseInitializemaid obj = new FirebaseInitializemaid();
                img2= FirebaseInitializemaid.uploadImg(selectedFile.getPath(),selectedFile.getName());
                // img2= obj.uploadImg(selectedFile,tx1.getText());
                System.out.println(img2);
                
            }
        });

        ImageView photoImageView3= new ImageView();
        photoImageView3.setFitHeight(200);
        photoImageView3.setFitWidth(200);

        Button uploadButton3 = new Button("img3");
        uploadButton3.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                FileChooser fileChooser = new FileChooser();
                fileChooser.getExtensionFilters()
                        .add(new FileChooser.ExtensionFilter("Image Files","*.png","*.jpg","*.gif" ));
                File selectedFile = fileChooser.showOpenDialog(stage);

                if (selectedFile != null) {
                    Image img3 = new Image(selectedFile.toURI().toString());
                    photoImageView3.setImage(img3);
                }
                FirebaseInitializemaid obj = new FirebaseInitializemaid();
                img3= FirebaseInitializemaid.uploadImg(selectedFile.getPath(),selectedFile.getName());
                // img3= obj.uploadImg(selectedFile,tx1.getText());
                System.out.println(img3);
            }
        });

        VBox imageUploadBox1 = new VBox(10, photoImageView1, uploadButton1);
        VBox imageUploadBox2 = new VBox(10, photoImageView2, uploadButton2);
        VBox imageUploadBox3 = new VBox(10, photoImageView3, uploadButton3);

        HBox dishBox=new HBox(25,imageUploadBox1,imageUploadBox2,imageUploadBox3);
        dishBox.setAlignment(Pos.CENTER);
        

        VBox imageUploadBox = new VBox(10, photoImageView, uploadButton);
        imageUploadBox.setAlignment(Pos.CENTER);

        VBox vb1 = new VBox(20, lb, tx1, tx2, tx3, tx4, comboBox1, tx6, comboBox, ps,tx5);
        // VBox imageUploadBox = new VBox(10, photoImageView, uploadButton);
        // imageUploadBox.setAlignment(Pos.CENTER);
        // imageUploadBox.setLayoutX(100); // Adjust the position as needed
        // imageUploadBox.setLayoutY(200); // Adjust the position as needed

        // VBox vb1 = new VBox(20, lb, tx1, tx2, tx3, ps, vb, b3);
        // vb1.setAlignment(Pos.CENTER);
        // vb1.setLayoutX(520);
        // vb1.setLayoutY(120);

        Pane pane = new Pane();
        pane.getChildren().addAll(b3, vb1, backButton,label1,label2, imageUploadBox,dishBox);
        label1.setLayoutX(100);
        label1.setLayoutY(100);
        label2.setLayoutX(100);
        label2.setLayoutY(450);
        vb1.setLayoutX(1100);
        vb1.setLayoutY(100);
        b3.setLayoutX(1270);
        b3.setLayoutY(900);
        dishBox.setLayoutX(270); // Adjust the position as needed
        dishBox.setLayoutY(500); // Adjust the position as needed

        imageUploadBox.setLayoutX(400);
        imageUploadBox.setLayoutY(200);
        pane.setStyle(" -fx-background-color: linear-gradient(from 50% 50% to 0% 0%, #F5D419, #ffffff);");
        Scene scene = new Scene(pane, 2000,1000);
        stage.setScene(scene);
        stage.show();
    }


   
    public void submit(madeInfoModel obj) {
               FirebaseInitializemaid fir = new FirebaseInitializemaid();
               try {
                fir.createMaid(obj);
            } catch (ExecutionException e) {
                
                e.printStackTrace();
            } catch (InterruptedException e) {
              
                e.printStackTrace();
            }
    }
}