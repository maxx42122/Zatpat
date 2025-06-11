package com.zatpat.logincontroller;



import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Frontpage {
    //private Fromnavigation App;
    Stage stage;
    // private VBox Vbox;

    //getter
    /*public Fromnavigation getApp() {
        return App;
    // }*/
    // public VBox getVbox() {
    //     return Vbox;
    // }

    //setter
    /*public void setApp(Fromnavigation app) {
        App = app;
    // }*/
    // public void setVbox(VBox vbox) {
    //     this.Vbox = vbox;
    // }

    // Create consrtuctor
    public Frontpage(Stage stage){
        this.stage=stage;
       initialize();
    }

    public  void initialize(){

        Image ig=new Image("loginpages/My first design 13.png");
        ImageView iv=new ImageView(ig);
        iv.setFitHeight(400);
        iv.setFitWidth(400);
        iv.setPreserveRatio(true);
        iv.setStyle("-fx-background-color:tansparent");
        
       // VBox vb=new VBox(iv);
        //vb.setAlignment(Pos.CENTER);
        //vb.setLayoutY(40);

        Button login=new Button("Login");
        login.setAlignment(Pos.CENTER);
        login.setPrefWidth(300);
        login.setStyle("-fx-background-color:#3897f0; -fx-text-fill:white; -fx-background-radius:3600; -fx-border-radius:880; -fx-padding:15");

        login.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                login obj1=new login(stage);
                obj1.initialize1();
            }
            
        });

        Button reg=new Button("Register");
       reg.setAlignment(Pos.CENTER);
        reg.setPrefWidth(300);
        reg.setStyle("-fx-background-color:#3897f0; -fx-text-fill:white; -fx-background-radius:3600; -fx-border-radius:880; -fx-padding:15");
        reg.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                Register obj2=new Register(stage);
                obj2.initialize2();
            }
            
        });

        Image ig1=new Image("loginpages/back.png",45,45,false,false);
        ImageView iv1=new ImageView(ig1);

        Button backButton=new Button("",iv1);
        backButton.setStyle("-fx-background-color:transparent;-fx-background-radius :50; -fx-border-radius :50; -fx-padding:10");
        
        backButton.setOnAction(new EventHandler<ActionEvent>() {

         @Override
         public void handle(ActionEvent event) {
            
            // page1 obj6=new page1(stage);
            // obj6.initializepage();
            page1 obj10=new page1(stage);
            obj10.initializepage();
         }
         
        });
       // VBox vb6=new VBox(backButton);
        //vb6.setLayoutY(2);
        //vb6.setStyle("-fx-background-color:transparent");
        

        

        
       // VBox vb1=new VBox(50,login,reg);
        //vb1.setAlignment(Pos.CENTER);

       //VBox Vbox=new VBox(50,iv,vb1);
      // Vbox.setStyle("-fx-background-color:'transparent'");
       //Vbox.setLayoutX(400);
        VBox main=new VBox(20,login,reg);
        main.setLayoutX(800);
        main.setLayoutY(500);
       Pane pane=new Pane();
       pane.getChildren().addAll(backButton);
       pane.getChildren().add(main);
       pane.getChildren().add(iv);

       iv.setLayoutX(740);
       iv.setLayoutY(100);
       
       pane.setStyle(" -fx-background-color: linear-gradient(from 50% 50% to 0% 0%, #F5D419,#ffffff);");

       Scene scene1 = new Scene(pane,2000,1000);
        

       stage.setScene(scene1);
       stage.show();
    }
    
}