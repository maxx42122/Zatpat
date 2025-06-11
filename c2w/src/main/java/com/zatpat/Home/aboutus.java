package com.zatpat.Home;



import com.zatpat.logincontroller.Frontpage;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.BackgroundPosition;
import javafx.scene.layout.BackgroundRepeat;
import javafx.scene.layout.BackgroundSize;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class aboutus  {
    public Stage stage;
      public aboutus(Stage stage){
        this.stage=stage;
     }

public void about(){
        Text tx1 = new Text("Vision :");
        tx1.setFont(Font.font("Modern Love Grunge", FontWeight.BOLD, 25));
        tx1.setLayoutX(10);

        Text tx2 = new Text(
                "Welcome to ZATPAT, where we are committed to empowering women and making your life easier. Our mission is twofold:");
        tx2.setFont(Font.font("Modern Love Grunge", FontWeight.BOLD, 13));
        tx2.setLayoutX(40);
        Text tx3 = new Text("1.Providing jobs to women :");
        tx3.setFont(Font.font("Modern Love Grunge", FontWeight.BOLD, 15

        ));

        Text tx4 = new Text(
                "We believe in the power of women in the workforce. By creating job opportunities for women, we aim to foster economic independence and support\r\n"
                        + "the growth of communities. Whether it’s providing a platform for housemaids,cleaners, or caterers, we ensure that women have access to dignified and\r\n"
                        + " rewarding employment.");
        tx4.setFont(Font.font("Modern Love Grunge", FontWeight.BOLD, 13

        ));

        Text tx5 = new Text("2.Making life easy for you :");
        tx5.setFont(Font.font("Modern Love Grunge", FontWeight.BOLD, 15

        ));

        Text tx6 = new Text(
                "We understand the challenges of managing a household or organizing an event.That’s why we offer a simple and efficient way to find reliable maids,\r\n"
                        + " cleaners, and caterers. Our services are designed to save you time and effort, allowing you to focus on what truly matters.");
        tx6.setFont(Font.font("Modern Love Grunge", FontWeight.BOLD, 13

        ));

        VBox visionvb = new VBox(6

                , tx1, tx2, tx3, tx4, tx5, tx6);
        // /////////////////////////////////////////
        Text tx7 = new Text("Our Service :");
        tx7.setFont(Font.font("Modern Love Grunge", FontWeight.BOLD, 25));

        Text tx8 = new Text("Find Maid :");
        tx8.setFont(Font.font("Modern Love Grunge", FontWeight.BOLD, 15));

        Text tx9 = new Text(
                "Whether you need help with daily chores or occasional cleaning, we connect you with experienced and trustworthy maids.");
        tx9.setFont(Font.font("Times New Roman", FontWeight.BOLD, 13

        ));

        Text tx10 = new Text("Hire a Cleaner :");
        tx10.setFont(Font.font("Modern Love Grunge", FontWeight.BOLD, 15

        ));

        Text tx11 = new Text(
                "Our professional cleaners are available for one-time deep cleans, regular upkeep, and everything in between.");
        tx11.setFont(Font.font("Times New Roman", FontWeight.BOLD, 13));

        Text tx12 = new Text("Book a catrer :");
        tx12.setFont(Font.font("Modern Love Grunge", FontWeight.BOLD, 15));

        Text tx13 = new Text(
                " From small gatherings to large events, our skilled caterers will ensure your guests are well-fed and satisfied.");
        tx13.setFont(Font.font("Times New Roman", FontWeight.BOLD, 13));

        Text tx14 = new Text("Quality product :");
        tx14.setFont(Font.font("Modern Love Grunge", FontWeight.BOLD, 15));

        Text tx15 = new Text(
                " Explore our range of quick and tasty products like papad and pickles, made with love and the finest ingredients\r\n"
                        + " to bring the authentic flavors to your table.");
        tx15.setFont(Font.font("Times New Roman", FontWeight.BOLD, 13));

        VBox ourserBox = new VBox(6, tx7, tx8, tx9, tx10, tx11, tx12, tx13, tx14, tx15);
        //////////////////////////////////////////////////////

        Text tx16 = new Text("Why choose us?");
        tx16.setFont(Font.font("Modern Love Grunge", FontWeight.BOLD, 25));

        Text tx17 = new Text("Trustworthy Professionals:");
        tx17.setFont(Font.font("Modern Love Grunge", FontWeight.BOLD, 13));

        Text tx18 = new Text(
                "We thoroughly vet all our service providers to ensure they meet our high standards of reliability and professionalism.");
        tx18.setFont(Font.font("Times New Roman", FontWeight.BOLD, 13));

        Text tx19 = new Text("Easy Booking :");
        tx19.setFont(Font.font("Modern Love Grunge", FontWeight.BOLD, 13));

        Text tx20 = new Text(
                "Our user-friendly platform makes it simple to book the services you need with just a few clicks.");
        tx20.setFont(Font.font("Times New Roman", FontWeight.BOLD, 13));
        Text tx21 = new Text("Empowerment and Support:");
        tx21.setFont(Font.font("Modern Love Grunge", FontWeight.BOLD, 13));

        Text tx22 = new Text(
                "By choosing our services, you are directly supporting the empowerment of  women in the workforce.");
        tx22.setFont(Font.font("Times New Roman", FontWeight.BOLD, 13));

        Text tx23 = new Text(
                "At Zatpat, we are more than just a service provider. We are a community  dedicated to improving lives, one job at a time.");
        tx23.setFont(Font.font("Times New Roman", FontWeight.BOLD, 13));

        VBox whyusBox = new VBox(6, tx16, tx17, tx18, tx19, tx20, tx21, tx22, tx23);

         Image ig1 = new Image("loginpages/back.png", 45, 45, false, false);
        ImageView iv1 = new ImageView(ig1);

    Button backButton = new Button("", iv1);
    backButton.setStyle("-fx-background-color:transparent");
    backButton.setOnAction(new EventHandler<ActionEvent>() {
      @Override
      public void handle(ActionEvent event) {
        Homepage obj6 = new Homepage(stage);
        obj6.initializehome();
          }
    });


        Pane pane = new Pane();
        pane.getChildren().add(backButton);
        pane.getChildren().add(visionvb);
        pane.getChildren().add(ourserBox);
        pane.getChildren().add(whyusBox);

        backButton.setLayoutX(1850);
        backButton.setLayoutY(20);
        visionvb.setLayoutX(700);
        visionvb.setLayoutY(270);

        ourserBox.setLayoutX(700);
        ourserBox.setLayoutY(500);

        whyusBox.setLayoutX(700);
        whyusBox.setLayoutY(770);

        Image backgroundImage = new Image("homepage/aboutus.png", 2000, 1000, false, false);
        BackgroundImage bgImage = new BackgroundImage(backgroundImage, BackgroundRepeat.NO_REPEAT,
                BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER,
                new BackgroundSize(BackgroundSize.AUTO, BackgroundSize.AUTO, false, false, true, false));
        pane.setBackground(new Background(bgImage));

        Scene scene2 = new Scene(pane, 2000, 1000);
        stage.setTitle("Maid&Cook");
        stage.setScene(scene2);
        stage.show();
    }

}