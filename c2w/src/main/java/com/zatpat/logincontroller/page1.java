package com.zatpat.logincontroller;

import com.zatpat.maidlist.MaidSelectionInfo;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;

import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

public class page1 {
    public Stage stage ;

    public page1(Stage stage){

        this.stage=stage;

    }

    public void initializepage(){

        Label lb1=new Label("Welcome !");
        lb1.setFont(Font.font("Times New Roman", FontWeight.BOLD, 70));
        lb1.setAlignment(Pos.CENTER);
        lb1.setStyle("-fx-font-weight:bold");
        lb1.setLayoutX(1170);
        lb1.setLayoutY(300);

        Label lb2=new Label("I need Maid");
        lb2.setFont(Font.font("Times New Roman", FontWeight.BOLD, 35));
        lb2.setTextFill(Color.BLACK);

        Image ig=new Image("loginpages/man.png",60,60,false,false);
        ImageView iv=new ImageView(ig);

        HBox hb1=new HBox(50,iv,lb2);
        hb1.setAlignment(Pos.CENTER);
       // hb1.setStyle("-fx-background-color:Golden");
        
        Button b1=new Button("", hb1);
        b1.setAlignment(Pos.CENTER);
        b1.setPrefWidth(350);
         b1.setOnAction(new EventHandler<ActionEvent>() {

             @Override
             public void handle(ActionEvent event) {
                
                 Frontpage fro=new Frontpage(stage);
                 fro.initialize();
             }
            
         });
        // b1.setOnAction(new EventHandler<ActionEvent>() {

        //     @Override
        //     public void handle(ActionEvent event) {
        //         MaidSelectionInfo obj1=new MaidSelectionInfo(stage);
        //         obj1.initializemaid1();
        //     }
        // });
        

        Label lb3=new Label("I need a Job");
        lb3.setFont(Font.font("Times New Roman", FontWeight.BOLD,35));
        lb3.setTextFill(Color.BLACK);

        Image ig1=new Image("loginpages/women.jpeg",60,60,false,false);
        ImageView iv1=new ImageView(ig1);

        HBox hb2=new HBox(60,iv1,lb3);
        hb2.setAlignment(Pos.CENTER);
        //hb2.setStyle("-fx-background-color:Golden");

        Button b2=new Button("", hb2);
        b2.setPrefWidth(350);
        b2.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
              registermaid reg=new registermaid(stage);
              reg.initializemaid();
            }
            
        });

        VBox vb=new VBox(40,b1,b2);
      //  vb.setAlignment(Pos.CENTER);
        vb.setLayoutY(470);
        vb.setLayoutX(1150);
       // vb.setMaxWidth(600);
        //vb.setMaxHeight(400);
        //vb.setStyle("-fx-background-color:'transparent'");
        //vb.setStyle("-fx-background-color:black");

       Image image =new Image("loginpages/housewife.png",600,800,false,false);
       ImageView iView=new ImageView(image);
        iView.setLayoutX(200);
        iView.setLayoutY(180);

        


       Pane pane=new Pane();
       pane.getChildren().add(iView);
       pane.getChildren().add(vb);
       pane.getChildren().add(lb1);
       pane.setStyle(" -fx-background-color: linear-gradient(from 0% 50% to 150% 150%, #F5D419,#ffffff);");
       // pane.getChildren().add(st);

       
       
       


        Scene scene=new Scene(pane,2000,1000);
        stage.setScene(scene);
        stage.show();
        
    }
}