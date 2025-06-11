package com.zatpat.explore;

import java.awt.Desktop;

import java.net.URI;

import com.zatpat.Home.Homepage;

import javafx.animation.ScaleTransition;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonBase;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import javafx.util.Duration;

public class expoler  {
    Stage stage;

    public expoler(Stage stage){
        this.stage=stage;
    }


   public void exploler(){
        Label explore = new Label("Expoler :");
        explore.setStyle("-fx-font-weight:bold");
        explore.setFont(new Font(35));

        Image ig1 = new Image("exploler/mpickel.png", 200, 160, true, true);
        ImageView iv1 = new ImageView(ig1);
        // iv1.setFitHeight(100);
        // iv1.setFitWidth(100);
        // iv1.setStyle("-fx-border-color: red; -fx-border-width: 10px;
        // -fx-background-radius:40; -fx-background-padding:10");
        iv1.setStyle(
                "-fx-effect: dropshadow(gaussian, rgba(0,0,0,0.75), 10, 0, 0, 1);"
                        + "-fx-background-color: yellow;"
                        + "-fx-padding: 20;"
                        + "-fx-border-radius: 20;"
                        + "-fx-background-radius: 10;");

        Button shop1 = new Button("Shop-Now");
        shop1.setTextFill(Color.BLACK);
        shop1.setStyle("-fx-background-color:");

        shop1.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                try {
                    Desktop.getDesktop()
                            .browse(new URI("https://blinkit.com/prn/the-little-farm-co.-mango-pickle/prid/483123"));
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });

        VBox vb1 = new VBox(15, iv1, shop1);
        vb1.setAlignment(Pos.CENTER);
        vb1.setStyle("-fx-background-radius:30; -fx-border-radius:30; -fx-padding:15");
        vb1.setOnMouseEntered(event -> {

            {
                ScaleTransition scaleTransition = new ScaleTransition(Duration.millis(200), vb1);
                scaleTransition.setToX(1.1);
                scaleTransition.setToY(1.1);
                scaleTransition.play();
            }

        });

        vb1.setOnMouseExited(event -> {

            {
                ScaleTransition scaleTransition = new ScaleTransition(Duration.millis(200), vb1);
                scaleTransition.setToX(1.0);
                scaleTransition.setToY(1.0);
                scaleTransition.play();
            }

        });

        Image ig2 = new Image("exploler/Lemonpickle.png", 200, 160, true, true);
        ImageView iv2 = new ImageView(ig2);

        iv2.setStyle(
                "-fx-effect: dropshadow(gaussian, rgba(0,0,0,0.75), 10, 0, 0, 1);"
                        + "-fx-background-color: black;"
                        + "-fx-padding: 10;"
                        + "-fx-border-radius: 10;"
                        + "-fx-background-radius: 10;");

        Button shop2 = new Button("Shop-Now");
        shop2.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                try {
                    Desktop.getDesktop().browse(new URI(
                            "https://blinkit.com/prn/the-little-farm-co.-lemon-khatta-meetha-pickle/prid/483125"));
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
        VBox vb2 = new VBox(15, iv2, shop2);
        vb2.setAlignment(Pos.CENTER);

        vb2.setOnMouseEntered(event -> {

            {
                ScaleTransition scaleTransition = new ScaleTransition(Duration.millis(200), vb2);
                scaleTransition.setToX(1.1);
                scaleTransition.setToY(1.1);
                scaleTransition.play();
            }

        });

        vb2.setOnMouseExited(event -> {

            {
                ScaleTransition scaleTransition = new ScaleTransition(Duration.millis(200), vb2);
                scaleTransition.setToX(1.0);
                scaleTransition.setToY(1.0);
                scaleTransition.play();
            }

        });

        Image ig3 = new Image("exploler/gpickel.jpg  ", 200, 160, true, true);
        ImageView iv3 = new ImageView(ig3);
        iv3.setStyle(
                "-fx-effect: dropshadow(gaussian, rgba(0,0,0,0.75), 10, 0, 0, 1);"
                        + "-fx-background-color: black;"
                        + "-fx-padding: 10;"
                        + "-fx-border-radius: 10;"
                        + "-fx-background-radius: 10;");

        Button shop3 = new Button("Shop-Now");
        shop3.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                try {
                    Desktop.getDesktop().browse(new URI("https://blinkit.com/s/?q=nagali%20papd"));
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
        VBox vb3 = new VBox(15, iv3, shop3);
        vb3.setAlignment(Pos.CENTER);
        vb3.setOnMouseEntered(event -> {

            {
                ScaleTransition scaleTransition = new ScaleTransition(Duration.millis(200), vb3);
                scaleTransition.setToX(1.1);
                scaleTransition.setToY(1.1);
                scaleTransition.play();
            }

        });

        vb3.setOnMouseExited(event -> {

            {
                ScaleTransition scaleTransition = new ScaleTransition(Duration.millis(200), vb3);
                scaleTransition.setToX(1.0);
                scaleTransition.setToY(1.0);
                scaleTransition.play();
            }

        });

        Image ig10 = new Image("exploler/ipickel.jpg  ", 200, 160, true, true);
        ImageView iv10 = new ImageView(ig10);
        iv10.setStyle(
                "-fx-effect: dropshadow(gaussian, rgba(0,0,0,0.75), 10, 0, 0, 1);"
                        + "-fx-background-color: black;"
                        + "-fx-padding: 10;"
                        + "-fx-border-radius: 10;"
                        + "-fx-background-radius: 10;");

        Button shop10 = new Button("Shop-Now");
        shop10.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                try {
                    Desktop.getDesktop().browse(new URI("https://blinkit.com/s/?q=nagali%20papd"));
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
        VBox vb10 = new VBox(15, iv10, shop10);
        vb10.setAlignment(Pos.CENTER);
        vb10.setOnMouseEntered(event -> {

            {
                ScaleTransition scaleTransition = new ScaleTransition(Duration.millis(200), vb10);
                scaleTransition.setToX(1.1);
                scaleTransition.setToY(1.1);
                scaleTransition.play();
            }

        });

        vb10.setOnMouseExited(event -> {

            {
                ScaleTransition scaleTransition = new ScaleTransition(Duration.millis(200), vb10);
                scaleTransition.setToX(1.0);
                scaleTransition.setToY(1.0);
                scaleTransition.play();
            }

        });

        HBox hb1 = new HBox(70, vb1, vb2, vb3, vb10);
        hb1.setStyle("-fx-background-color:#F9E79F");

        Image ig4 = new Image("exploler/1P.png", 200, 160, true, true);
        ImageView iv4 = new ImageView(ig4);
      //  iv4.setLayoutX(50);
        iv4.setStyle(
                "-fx-effect: dropshadow(gaussian, rgba(0,0,0,0.75), 10, 0, 0, 1);"
                        + "-fx-background-color: black;"
                        + "-fx-padding: 10;"
                        + "-fx-border-radius: 10;"
                        + "-fx-background-radius: 10;");

        Button shop4 = new Button("ShopNow");
        shop4.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                try {
                    Desktop.getDesktop().browse(new URI("https://blinkit.com/"));
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });

        VBox vb4 = new VBox(15, iv4, shop4);
        vb4.setAlignment(Pos.CENTER);
        vb4.setOnMouseEntered(event -> {

            {
                ScaleTransition scaleTransition = new ScaleTransition(Duration.millis(200), vb4);
                scaleTransition.setToX(1.1);
                scaleTransition.setToY(1.1);
                scaleTransition.play();
            }

        });

        vb4.setOnMouseExited(event -> {

            {
                ScaleTransition scaleTransition = new ScaleTransition(Duration.millis(200), vb4);
                scaleTransition.setToX(1.0);
                scaleTransition.setToY(1.0);
                scaleTransition.play();
            }

        });

        Image ig5 = new Image("exploler\\2P.png", 200, 160, true, true);
        ImageView iv5 = new ImageView(ig5);
        iv5.setStyle(
                "-fx-effect: dropshadow(gaussian, rgba(0,0,0,0.75), 10, 0, 0, 1);"
                        + "-fx-background-color: black;"
                        + "-fx-padding: 10;"
                        + "-fx-border-radius: 10;"
                        + "-fx-background-radius: 10;");

        Button shop5 = new Button("ShopNow");
        shop5.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                try {
                    Desktop.getDesktop().browse(new URI("https://blinkit.com/"));
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });

        VBox vb5 = new VBox(15, iv5, shop5);
        vb5.setAlignment(Pos.CENTER);
        vb5.setOnMouseEntered(event -> {

            {
                ScaleTransition scaleTransition = new ScaleTransition(Duration.millis(200), vb5);
                scaleTransition.setToX(1.1);
                scaleTransition.setToY(1.1);
                scaleTransition.play();
            }

        });

        vb5.setOnMouseExited(event -> {

            {
                ScaleTransition scaleTransition = new ScaleTransition(Duration.millis(200), vb5);
                scaleTransition.setToX(1.0);
                scaleTransition.setToY(1.0);
                scaleTransition.play();
            }

        });

        Image ig6 = new Image("exploler/3P.png ", 200, 160, true, true);
        ImageView iv6 = new ImageView(ig6);
        iv6.setStyle(
                "-fx-effect: dropshadow(gaussian, rgba(0,0,0,0.75), 10, 0, 0, 1);"
                        + "-fx-background-color: black;"
                        + "-fx-padding: 10;"
                        + "-fx-border-radius: 10;"
                        + "-fx-background-radius: 10;");

        Button shop6 = new Button("ShopNow");
        shop6.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                try {
                    Desktop.getDesktop().browse(new URI(
                            "https://blinkit.com/prn/bikaji-dil-khush-moong-dal-and-urad-dal-papad/prid/60433"));
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });

        VBox vb6 = new VBox(15, iv6, shop6);
        vb6.setAlignment(Pos.CENTER);
        vb6.setOnMouseEntered(event -> {

            {
                ScaleTransition scaleTransition = new ScaleTransition(Duration.millis(200), vb6);
                scaleTransition.setToX(1.1);
                scaleTransition.setToY(1.1);
                scaleTransition.play();
            }

        });

        vb6.setOnMouseExited(event -> {

            {
                ScaleTransition scaleTransition = new ScaleTransition(Duration.millis(200), vb6);
                scaleTransition.setToX(1.0);
                scaleTransition.setToY(1.0);
                scaleTransition.play();
            }

        });

        Image ig11 = new Image("exploler/mixpapad.png ", 200, 160, true, true);
        ImageView iv11 = new ImageView(ig11);
        iv11.setStyle(
                "-fx-effect: dropshadow(gaussian, rgba(0,0,0,0.75), 10, 0, 0, 1);"
                        + "-fx-background-color: black;"
                        + "-fx-padding: 10;"
                        + "-fx-border-radius: 10;"
                        + "-fx-background-radius: 10;");

        Button shop11 = new Button("ShopNow");
        shop11.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                try {
                    Desktop.getDesktop().browse(new URI(
                            "https://blinkit.com/prn/bikaji-dil-khush-moong-dal-and-urad-dal-papad/prid/60433"));
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });

        VBox vb11 = new VBox(15, iv11, shop11);
        vb11.setAlignment(Pos.CENTER);
        vb11.setOnMouseEntered(event -> {

            {
                ScaleTransition scaleTransition = new ScaleTransition(Duration.millis(200), vb11);
                scaleTransition.setToX(1.1);
                scaleTransition.setToY(1.1);
                scaleTransition.play();
            }

        });

        vb11.setOnMouseExited(event -> {

            {
                ScaleTransition scaleTransition = new ScaleTransition(Duration.millis(200), vb11);
                scaleTransition.setToX(1.0);
                scaleTransition.setToY(1.0);
                scaleTransition.play();
            }

        });

        HBox hb2 = new HBox(70, vb4, vb5, vb6, vb11);
        hb2.setStyle("-fx-background-color:#F9E79F");

        Image ig7 = new Image("exploler\\chips.png", 200, 160, true, true);
        ImageView iv7 = new ImageView(ig7);
        iv7.setStyle(
                "-fx-effect: dropshadow(gaussian, rgba(0,0,0,0.75), 10, 0, 0, 1);"
                        + "-fx-background-color: black;"
                        + "-fx-padding: 10;"
                        + "-fx-border-radius: 10;"
                        + "-fx-background-radius: 10;");

        Button shop7 = new Button("ShopNow");
        shop7.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                try {
                    Desktop.getDesktop().browse(new URI("https://blinkit.com/"));
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });

        VBox vb7 = new VBox(15, iv7, shop7);
        vb7.setAlignment(Pos.CENTER);
        vb7.setOnMouseEntered(event -> {

            {
                ScaleTransition scaleTransition = new ScaleTransition(Duration.millis(200), vb7);
                scaleTransition.setToX(1.1);
                scaleTransition.setToY(1.1);
                scaleTransition.play();
            }

        });

        vb7.setOnMouseExited(event -> {

            {
                ScaleTransition scaleTransition = new ScaleTransition(Duration.millis(200), vb7);
                scaleTransition.setToX(1.0);
                scaleTransition.setToY(1.0);
                scaleTransition.play();
            }

        });

        Image ig8 = new Image("exploler\\chips1.png", 200, 160, true, true);
        ImageView iv8 = new ImageView(ig8);
        iv8.setStyle(
                "-fx-effect: dropshadow(gaussian, rgba(0,0,0,0.75), 10, 0, 0, 1);"
                        + "-fx-background-color: black;"
                        + "-fx-padding: 10;"
                        + "-fx-border-radius: 10;"
                        + "-fx-background-radius: 10;");

        Button shop8 = new Button("ShopNow");
        shop8.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                try {
                    Desktop.getDesktop().browse(new URI("https://blinkit.com/"));
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });

        VBox vb8 = new VBox(15, iv8, shop8);
        vb8.setAlignment(Pos.CENTER);
        vb8.setOnMouseEntered(event -> {

            {
                ScaleTransition scaleTransition = new ScaleTransition(Duration.millis(200), vb8);
                scaleTransition.setToX(1.1);
                scaleTransition.setToY(1.1);
                scaleTransition.play();
            }

        });

        vb8.setOnMouseExited(event -> {

            {
                ScaleTransition scaleTransition = new ScaleTransition(Duration.millis(200), vb8);
                scaleTransition.setToX(1.0);
                scaleTransition.setToY(1.0);
                scaleTransition.play();
            }

        });

        Image ig9 = new Image("exploler\\1.png", 200, 160, true, true);
        ImageView iv9 = new ImageView(ig9);
        iv9.setStyle(
                "-fx-effect: dropshadow(gaussian, rgba(0,0,0,0.75), 10, 0, 0, 1);"
                        + "-fx-background-color: black;"
                        + "-fx-padding: 10;"
                        + "-fx-border-radius: 10;"
                        + "-fx-background-radius: 10;");

        Button shop9 = new Button("ShopNow");
        shop9.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                try {
                    Desktop.getDesktop().browse(new URI("https://blinkit.com/"));
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });

        VBox vb9 = new VBox(15, iv9, shop9);
        vb9.setAlignment(Pos.CENTER);
        vb9.setOnMouseEntered(event -> {

            {
                ScaleTransition scaleTransition = new ScaleTransition(Duration.millis(200), vb9);
                scaleTransition.setToX(1.1);
                scaleTransition.setToY(1.1);
                scaleTransition.play();
            }

        });

        vb9.setOnMouseExited(event -> {

            {
                ScaleTransition scaleTransition = new ScaleTransition(Duration.millis(200), vb9);
                scaleTransition.setToX(1.0);
                scaleTransition.setToY(1.0);
                scaleTransition.play();
            }

        });

        Image ig12 = new Image("exploler\\fries.png", 200, 160, true, true);
        ImageView iv12 = new ImageView(ig12);
        iv12.setStyle(
                "-fx-effect: dropshadow(gaussian, rgba(0,0,0,0.75), 10, 0, 0, 1);"
                        + "-fx-background-color: black;"
                        + "-fx-padding: 10;"
                        + "-fx-border-radius: 10;"
                        + "-fx-background-radius: 10;");

        Button shop12 = new Button("ShopNow");
        shop12.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                try {
                    Desktop.getDesktop().browse(new URI("https://blinkit.com/"));
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });

        VBox vb12 = new VBox(15, iv12, shop12);
        vb12.setAlignment(Pos.CENTER);
        vb12.setOnMouseEntered(event -> {

            {
                ScaleTransition scaleTransition = new ScaleTransition(Duration.millis(200), vb12);
                scaleTransition.setToX(1.1);
                scaleTransition.setToY(1.1);
                scaleTransition.play();
            }

        });

        vb12.setOnMouseExited(event -> {

            {
                ScaleTransition scaleTransition = new ScaleTransition(Duration.millis(200), vb12);
                scaleTransition.setToX(1.0);
                scaleTransition.setToY(1.0);
                scaleTransition.play();
            }

        });

        Image ig13 = new Image("exploler\\gmasala.png", 200, 160, true, true);
        ImageView iv13 = new ImageView(ig13);
        iv13.setStyle(
                "-fx-effect: dropshadow(gaussian, rgba(0,0,0,0.75), 10, 0, 0, 1);"
                        + "-fx-background-color: black;"
                        + "-fx-padding: 10;"
                        + "-fx-border-radius: 10;"
                        + "-fx-background-radius: 10;");

        Button shop13 = new Button("ShopNow");
        shop13.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                try {
                    Desktop.getDesktop().browse(new URI("https://blinkit.com/"));
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });

        VBox vb13 = new VBox(15, iv13, shop13);
        vb13.setAlignment(Pos.CENTER);
        vb13.setOnMouseEntered(event -> {

            {
                ScaleTransition scaleTransition = new ScaleTransition(Duration.millis(200), vb13);
                scaleTransition.setToX(1.1);
                scaleTransition.setToY(1.1);
                scaleTransition.play();
            }

        });

        vb13.setOnMouseExited(event -> {

            {
                ScaleTransition scaleTransition = new ScaleTransition(Duration.millis(200), vb12);
                scaleTransition.setToX(1.0);
                scaleTransition.setToY(1.0);
                scaleTransition.play();
            }

        });



        HBox hb3 = new HBox(100, vb7, vb8, vb9,vb12,vb13);
        hb3.setStyle("-fx-background-color:#F9E79F");

        Image exploreimg = new Image("exploler/exploreimage.png", 1000, 1000, false, false);
        ImageView ivmain = new ImageView(exploreimg);

        ScrollPane scrollPane = new ScrollPane();
        scrollPane.setPrefSize(1000, 270);
        scrollPane.setContent(hb1);
        scrollPane.setLayoutX(20);
        scrollPane.setLayoutY(80);
        scrollPane.setStyle("-fx-scrollbar-thumb: transparent");
        scrollPane.setVbarPolicy(ScrollPane.ScrollBarPolicy.NEVER);
        scrollPane.setHbarPolicy(ScrollPane.ScrollBarPolicy.NEVER);
        scrollPane.setStyle("-fx-background-color:#F9E79F");
        scrollPane.setStyle("-fx-background-radius:10; -fx-border-radius:10; -fx-padding:15");

        ScrollPane scrollPane1 = new ScrollPane();
        scrollPane1.setPrefSize(1000, 270);
        scrollPane1.setContent(hb2);
        scrollPane1.setLayoutX(20);
        scrollPane1.setLayoutY(420);
        scrollPane1.setStyle("-fx-scrollbar-thumb: transparent");
        scrollPane1.setVbarPolicy(ScrollPane.ScrollBarPolicy.NEVER);
        scrollPane1.setHbarPolicy(ScrollPane.ScrollBarPolicy.NEVER);
        scrollPane1.setStyle("-fx-background-color:blue");
        scrollPane1.setStyle("-fx-background-radius:10; -fx-border-radius:10; -fx-padding:15");

        ScrollPane scrollPane2 = new ScrollPane();
        scrollPane2.setPrefSize(1000, 270);
        scrollPane2.setContent(hb3);
        scrollPane2.setLayoutX(20);
        scrollPane2.setLayoutY(720);
        scrollPane2.setStyle("-fx-scrollbar-thumb: transparent");
        scrollPane2.setVbarPolicy(ScrollPane.ScrollBarPolicy.NEVER);
        scrollPane2.setHbarPolicy(ScrollPane.ScrollBarPolicy.NEVER);
        scrollPane2.setStyle("-fx-background-color:blue");
        scrollPane2.setStyle("-fx-background-radius:10; -fx-border-radius:10; -fx-padding:15");



        
                Image igbImage = new Image("loginpages/back.png", 45, 45, false, false);
                ImageView ivbImageView = new ImageView(igbImage);

                Button backButton = new Button("", ivbImageView);
                backButton.setStyle("-fx-background-radius :50; -fx-border-radius :50; -fx-padding:10");
                backButton.setStyle("-fx-background-color:transparent");
                backButton.setOnAction(new EventHandler<ActionEvent>() {

                @Override
                public void handle(ActionEvent event) {

                Homepage obj16 = new Homepage(stage);
                obj16.initializehome();
      }

    });
        Pane pane = new Pane();
        pane.setStyle(" -fx-background-color: linear-gradient(from 20% 20% to 20% 20%, #F9E79F,#FFFFFF);");
        pane.getChildren().add(backButton);
        pane.getChildren().add(ivmain);
        pane.getChildren().add(hb1);
        pane.getChildren().add(hb2);
        pane.getChildren().add(hb3);
        pane.getChildren().add(scrollPane);
        pane.getChildren().add(scrollPane1);
        pane.getChildren().add(scrollPane2);

        pane.getChildren().add(explore);
        explore.setLayoutX(45);
        explore.setLayoutY(25);
        hb1.setLayoutX(50);
        hb1.setLayoutY(80);
        hb2.setLayoutX(50);
        hb2.setLayoutY(300);
        hb3.setLayoutX(50);
        hb3.setLayoutY(520);
        ivmain.setLayoutX(920);
        ivmain.setLayoutY(5);
        Scene scene = new Scene(pane, 2000, 1000);
        stage.setScene(scene);
        stage.show();
    }

}
