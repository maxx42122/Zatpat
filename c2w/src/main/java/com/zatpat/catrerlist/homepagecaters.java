package com.zatpat.catrerlist;





import com.zatpat.Home.Homepage;
import com.zatpat.logincontroller.Frontpage;
import com.zatpat.logincontroller.login;

import javafx.animation.ScaleTransition;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.effect.GaussianBlur;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.util.Duration;

public class homepagecaters{
        public  Stage stage;
         public homepagecaters(Stage stage){
            this.stage=stage;
     
         }
     
         public void initializecaterer(){

      
        Image I9 = new Image("catererlist/c1.png", 250, 300, false,false);
        Image I11 = new Image("catererlist/c2.png", 250, 300, false,false);
        Image I10 = new Image("catererlist/c3.png", 250, 300, false,false);
        Image I12 = new Image("catererlist/c4.png", 250, 300, false,false);
        Image I13 = new Image("catererlist/c5.png", 250, 300, false,false);
        Image I14 = new Image("catererlist/c6.png", 250, 300, false,false);
        ImageView iv9 = new ImageView(I9);
        ImageView iv10 = new ImageView(I10);
        ImageView iv11 = new ImageView(I11);
        ImageView iv12 = new ImageView(I12);
        ImageView iv13 = new ImageView(I13);
        ImageView iv14 = new ImageView(I14);

        Button b1 = new Button("", iv9);
        Button b2 = new Button("", iv10);
        Button b3 = new Button("", iv11);
        Button b4 = new Button("", iv12);
        Button b5 = new Button("", iv13);
        Button b6 = new Button("", iv14);


        ////////////////////////////////////////////setonaction
        b1.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                caterslist obj12=new caterslist();
                obj12.conmaid(stage);
                obj12.initializemaidlist();

            }
            
        });

        b2.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                caterslist obj12=new caterslist();
                obj12.conmaid(stage);
                obj12.initializemaidlist();

            }
            
        });


        b3.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                caterslist obj12=new caterslist();
                obj12.conmaid(stage);
                obj12.initializemaidlist();

            }
            
        });


        b4.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                caterslist obj12=new caterslist();
                obj12.conmaid(stage);
                obj12.initializemaidlist();

            }
            
        });


        b5.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                caterslist obj12=new caterslist();
                obj12.conmaid(stage);
                obj12.initializemaidlist();

            }
            
        });


        b6.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                caterslist obj12=new caterslist();
                obj12.conmaid(stage);
                obj12.initializemaidlist();

            }
            
        });

/////////////////////////////////////////////////////////////
        b1.setOnMouseEntered(event -> {

            {
                ScaleTransition scaleTransition = new ScaleTransition(Duration.millis(200), b1);
                scaleTransition.setToX(1.1);
                scaleTransition.setToY(1.1);
                scaleTransition.play();
            }

        });

        b1.setOnMouseExited(event -> {

            {
                ScaleTransition scaleTransition = new ScaleTransition(Duration.millis(200), b1);
                scaleTransition.setToX(1.0);
                scaleTransition.setToY(1.0);
                scaleTransition.play();
            }

        });

        b2.setOnMouseEntered(event -> {

            {
                ScaleTransition scaleTransition = new ScaleTransition(Duration.millis(200), b2);
                scaleTransition.setToX(1.1);
                scaleTransition.setToY(1.1);
                scaleTransition.play();
            }

        });

        b2.setOnMouseExited(event -> {

            {
                ScaleTransition scaleTransition = new ScaleTransition(Duration.millis(200), b2);
                scaleTransition.setToX(1.0);
                scaleTransition.setToY(1.0);
                scaleTransition.play();
            }

        });

        b3.setOnMouseEntered(event -> {

            {
                ScaleTransition scaleTransition = new ScaleTransition(Duration.millis(200), b3);
                scaleTransition.setToX(1.1);
                scaleTransition.setToY(1.1);
                scaleTransition.play();
            }

        });

        b3.setOnMouseExited(event -> {

            {
                ScaleTransition scaleTransition = new ScaleTransition(Duration.millis(200), b3);
                scaleTransition.setToX(1.0);
                scaleTransition.setToY(1.0);
                scaleTransition.play();
            }

        });

        b4.setOnMouseEntered(event -> {

            {
                ScaleTransition scaleTransition = new ScaleTransition(Duration.millis(200), b4);
                scaleTransition.setToX(1.1);
                scaleTransition.setToY(1.1);
                scaleTransition.play();
            }

        });

        b4.setOnMouseExited(event -> {

            {
                ScaleTransition scaleTransition = new ScaleTransition(Duration.millis(200), b4);
                scaleTransition.setToX(1.0);
                scaleTransition.setToY(1.0);
                scaleTransition.play();
          }
        });
        
        b5.setOnMouseEntered(event -> {

            {
                ScaleTransition scaleTransition = new ScaleTransition(Duration.millis(200), b5);
                scaleTransition.setToX(1.1);
                scaleTransition.setToY(1.1);
                scaleTransition.play();
            }

        });

        b5.setOnMouseExited(event -> {

            {
                ScaleTransition scaleTransition = new ScaleTransition(Duration.millis(200), b5);
                scaleTransition.setToX(1.0);
                scaleTransition.setToY(1.0);
                scaleTransition.play();
          }
        });

        b6.setOnMouseEntered(event -> {

            {
                ScaleTransition scaleTransition = new ScaleTransition(Duration.millis(200), b6);
                scaleTransition.setToX(1.1);
                scaleTransition.setToY(1.1);
                scaleTransition.play();
            }

        });

        b6.setOnMouseExited(event -> {

            {
                ScaleTransition scaleTransition = new ScaleTransition(Duration.millis(200), b6);
                scaleTransition.setToX(1.0);
                scaleTransition.setToY(1.0);
                scaleTransition.play();
          }
        });
        // Create the images
        Label service=new Label("Services :");
        service.setFont(new Font(40));
        service.setStyle("-fx-font-weight:bold");

        //caters team images photo
        Image caterImage=new Image("catererlist/dus1.png",700,1000,false,false);
        ImageView caterImageView=new ImageView(caterImage);

        Image dis=new Image("catererlist/design.png",600,130,false,false);
        ImageView designImageView=new ImageView(dis);
        ////////////////////////////////chatpat
         Text chatpatLabel = new Text("चट");
        chatpatLabel.setFont(Font.font("Times New Roman", FontWeight.BOLD, 110));

        Text patLabel = new Text("PAT");
        patLabel.setFont(Font.font("Times New Roman", FontWeight.BOLD, 115));

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

        Homepage obj6 = new Homepage(stage);
        obj6.initializehome();
      }

    });


        Pane pane=new Pane();
        pane.getChildren().add(backButton);
        pane.getChildren().add(service);
        pane.getChildren().add(caterImageView);
        pane.getChildren().add(designImageView);
        pane.getChildren().addAll(b1,b2,b3,b4,b5,b6);
        pane.setStyle(" -fx-background-color: linear-gradient(from 50% 50% to 50% 50%, #7F5D50,#ffffff);");

        b1.setLayoutX(40);
        b1.setLayoutY(200);
        b2.setLayoutX(380);
        b2.setLayoutY(200);
        b3.setLayoutX(720);
        b3.setLayoutY(200);

        b4.setLayoutX(40);
        b4.setLayoutY(600);

        b5.setLayoutX(380);
        b5.setLayoutY(600);

        b6.setLayoutX(720);
        b6.setLayoutY(600);
         
        caterImageView.setLayoutX(1220);
        caterImageView.setLayoutY(0);

        designImageView.setLayoutX(1300);
        designImageView.setLayoutY(140);

        /////////////////name
        pane.getChildren().add(chatpatLabel);
        pane.getChildren().add(patLabel);

        chatpatLabel.setLayoutX(1375);
        chatpatLabel.setLayoutY(180);

        patLabel.setLayoutX(1565);
        patLabel.setLayoutY(180);
//////////////////////////////////

        service.setLayoutX(40);
        service.setLayoutY(130);
        ///////////////////////////////
        
        backButton.setLayoutX(10);
        backButton.setLayoutY(20);

         
       
        

        Scene scene = new Scene(pane, 2000, 1000);
        stage.setScene(scene);
        stage.show();

}
         
         }