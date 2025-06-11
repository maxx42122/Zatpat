package com.zatpat.Home;

import java.awt.Desktop;
import java.net.URI;

import com.zatpat.catrerlist.homepagecaters;
import com.zatpat.cleanerlist.clean;
import com.zatpat.cleanerlist.cleanerinfo;
import com.zatpat.explore.expoler;
import com.zatpat.logincontroller.Frontpage;
import com.zatpat.logincontroller.login;
import com.zatpat.maidlist.MaidSelectionInfo;
import com.zatpat.maidlist.maidinfo;

import javafx.animation.ScaleTransition;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.Label;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextField;
import javafx.scene.effect.Light;
import javafx.scene.effect.Lighting;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.util.Duration;

public class Homepage {
   public  Stage stage;
    public Homepage(Stage stage){
       this.stage=stage;

    }

    public void initializehome(){


        Image I1 = new Image("homepage/menuicon/spoon.png", 40, 40, false, false);
        Image I3 = new Image("homepage/menuicon/cart.png", 40, 40, false, false);
        Image I2 = new Image("homepage/menuicon/cleaner1.png", 40, 40, true, true);
        Image I4 = new Image("homepage/menuicon/cook3.png", 40, 40, false, false);
        Image I5 = new Image("homepage/menuicon/profile.png", 40, 40, false, false);
        Image I6 = new Image("homepage/menuicon/menu.png", 30, 30, false, false);
        Image I7 = new Image("homepage/menuicon/about.png", 45, 45, false, false);
        Image I8 = new Image("homepage/menuicon/contact.png", 40, 40, false, false);
        Image I21 = new Image("homepage/menuicon/profile.png", 40, 40, false, false);

        ImageView iv1 = new ImageView(I1);
        ImageView iv2 = new ImageView(I2);
        ImageView iv3 = new ImageView(I3);
        ImageView iv4 = new ImageView(I4);
        ImageView iv5 = new ImageView(I5);
        ImageView iv6 = new ImageView(I6);
        ImageView iv7 = new ImageView(I7);
        ImageView iv8 = new ImageView(I8);
        ImageView iv21 = new ImageView(I21);

        Label lb1 = new Label("maid  ");
        Label lb2 = new Label("cleaner");
        Label lb3 = new Label("explore");
        Label lb4 = new Label("caterer");
        Label lb5 = new Label("profile");
        Label lb7 = new Label("About");
        Label lb8 = new Label("Contact");

        lb1.setTextFill(Color.BLACK);
        lb2.setTextFill(Color.BLACK);
        lb3.setTextFill(Color.BLACK);
        lb4.setTextFill(Color.BLACK);
        lb5.setTextFill(Color.BLACK);
        lb7.setTextFill(Color.BLACK);
        lb8.setTextFill(Color.BLACK);

        VBox vb1 = new VBox(iv1, lb1);
        VBox vb2 = new VBox(iv2, lb2);
        VBox vb3 = new VBox(iv3, lb3);
        VBox vb4 = new VBox(iv4, lb4);
        VBox vb5 = new VBox(iv5, lb5);
        VBox vb6 = new VBox(iv7, lb7);
        VBox vb7 = new VBox(iv8, lb8);
        VBox vb8 = new VBox(iv21);
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////menu buttons
        Button maid = new Button("", vb1);
        maid.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                MaidSelectionInfo obj1=new MaidSelectionInfo(stage);
                obj1.initializemaid1();
            }
        });
            
        Button cleaner = new Button("", vb2);
        cleaner.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                clean obj1=new clean(stage);
                obj1.initializeclean();
            }
        });

        Button explore = new Button("", vb3);
        explore.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                expoler obj12=new expoler(stage);
                obj12.exploler();
            }
            
        });
        Button caterer = new Button("", vb4);
        caterer.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                homepagecaters obj1=new homepagecaters(stage);
                obj1.initializecaterer();
            }
        });
            
        Button profile = new Button("", vb5);
        profile.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                profilepage obj1=new profilepage(stage);
                obj1.profileinfo();
            }
        });

        Button about = new Button("", vb6);
        about.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                    aboutus aobj = new aboutus(stage);
                    aobj.about();
            }

    });

        Button contact = new Button("", vb7);
        Button icon = new Button("", vb8);
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        maid.setStyle("-fx-background-color:SALMON;-fx-background-radius :100; -fx-border-radius :100; -fx-padding:10");
        cleaner.setStyle(
                "-fx-background-color :SALMON;-fx-background-radius :50; -fx-border-radius :50; -fx-padding:10");
        explore.setStyle(
                "-fx-background-color:SALMON;-fx-background-radius :1000; -fx-border-radius :500; -fx-padding:10");
        caterer.setStyle(
                "-fx-background-color:SALMON;-fx-background-radius :50; -fx-border-radius :50; -fx-padding:10");
        profile.setStyle(
                "-fx-background-color:SALMON;-fx-background-radius :50; -fx-border-radius :50; -fx-padding:10");
        about.setStyle("-fx-background-color:SALMON;-fx-background-radius :50; -fx-border-radius :50; -fx-padding:10");
        contact.setStyle(
                "-fx-background-color:SALMON;-fx-background-radius :50; -fx-border-radius :50; -fx-padding:10");
        icon.setStyle(
                "-fx-background-color :transparent;-fx-text-fill : white; -fx-background-radius :50; -fx-border-radius :50; -fx-padding:7");

        ///////////////////////////////////////////////////////////

        Light.Point light = new Light.Point();

        light.setX(50);
        light.setY(10);
        light.setZ(30);

        Lighting lighting = new Lighting();

        lighting.setLight(light);

        maid.setEffect(lighting);
        cleaner.setEffect(lighting);
        caterer.setEffect(lighting);
        explore.setEffect(lighting);
        profile.setEffect(lighting);
        about.setEffect(lighting);
        contact.setEffect(lighting);

        //////////////////////////////////////////////////////////////////

        Menu m = new Menu("", iv6);

        MenuItem m1 = new MenuItem("", maid);
        MenuItem m2 = new MenuItem("", cleaner);
        MenuItem m3 = new MenuItem("", explore);
        MenuItem m4 = new MenuItem("", caterer);
        MenuItem m5 = new MenuItem("", profile);
        MenuItem m6 = new MenuItem("", about);
        MenuItem m7 = new MenuItem("", contact);

        // add menu items to menu
        m.getItems().add(m1);
        m.getItems().add(m2);
        m.getItems().add(m3);
        m.getItems().add(m4);
        m.getItems().add(m5);
        m.getItems().add(m6);
        m.getItems().add(m7);

        MenuBar mb = new MenuBar();
        mb.getMenus().add(m);
        mb.setStyle("-fx-background-color :transparent");
        VBox vb = new VBox(mb);

        ///////////////////////////////////////////////////

        Image I9 = new Image("homepage/servicemenu/maidh.png", 250, 250, false, false);
        Image I11 = new Image("homepage/servicemenu/exploreh.png", 250, 250, false, false);
        Image I10 = new Image("homepage/servicemenu/cleanerh.png", 250, 250, true, true);
        Image I12 = new Image("homepage/servicemenu/catererh.png", 250, 250, false, false);

        ImageView iv9 = new ImageView(I9);
        ImageView iv10 = new ImageView(I10);
        ImageView iv11 = new ImageView(I11);
        ImageView iv12 = new ImageView(I12);

        Button b1 = new Button("", iv9);
        b1.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                System.out.println("click her");
                MaidSelectionInfo maidobj1=new MaidSelectionInfo(stage);
                
                maidobj1.initializemaid1();
            }
            
        });
        Button b2 = new Button("", iv10);
        b2.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                clean obj1=new clean(stage);
                

                obj1.initializeclean();
            }
            
        });

        


        Button b3 = new Button("", iv11);
        b3.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                expoler obj11=new expoler(stage);
                obj11.exploler();
            }
            
        });


       



        Button b4 = new Button("", iv12);
        b4.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                homepagecaters obj1=new homepagecaters(stage);
                obj1.initializecaterer();
            }
            
        });

        // b1.setOnAction(event->{
        //     new maidinfo(
        // });

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

        /////////////////////////// footer button
        Button f1 = new Button("maid");
        f1.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                System.out.println("click her");
                MaidSelectionInfo maidobj1=new MaidSelectionInfo(stage);
                
                maidobj1.initializemaid1();
            }
            
        });


    ///////////////////////////////////////////////////////////////
        Button f2 = new Button("cleaner");
        f2.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                clean obj1=new clean(stage);
                obj1.initializeclean();
            }
            
        });
    ///////////////////////////////////////////////////////
        Button f3 = new Button("explore");
        f3.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                expoler obj12=new expoler(stage);
                obj12.exploler();
            }
            
        });






        ///////////////////////////////////

        Button f4 = new Button("caterer");
        f4.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                homepagecaters obj1=new homepagecaters(stage);
                obj1.initializecaterer();
            }
        });
////////////////////////////////////////////////////
        Button f5 = new Button("about");
        f5.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                    aboutus aobj = new aboutus(stage);
                    aobj.about();
            }

    });
    /////////////////////////////

        Button f6 = new Button("contact");
///////////////////////////////////////////////////////////        
        // Button f7 = new Button("profile");
        icon.setOnAction(new EventHandler<ActionEvent>() {

                        @Override
                        public void handle(ActionEvent event) {
                                profilepage pobj = new profilepage(stage);
                                pobj.profileinfo();
                        }

                });
////////////////////////////////////////////////////
        Button f8 = new Button("log out");

        f8.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
               //System.out.println("loggggggggggggg outttttttttttttttttttttt  butttttoooooooooooooooonnnnnnnnnnnnn");
               Frontpage obj8=new Frontpage(stage);
               obj8.initialize();
            }
            
           });
        f1.setFont(Font.font("Times New Roman", FontWeight.BOLD, 20));
        f2.setFont(Font.font("Times New Roman", FontWeight.BOLD, 20));
        f3.setFont(Font.font("Times New Roman", FontWeight.BOLD, 20));
        f4.setFont(Font.font("Times New Roman", FontWeight.BOLD, 20));
        f5.setFont(Font.font("Times New Roman", FontWeight.BOLD, 20));
        f6.setFont(Font.font("Times New Roman", FontWeight.BOLD, 20));
       // f7.setFont(Font.font("Times New Roman", FontWeight.BOLD, 20));
        f8.setFont(Font.font("Times New Roman", FontWeight.BOLD, 20));

       

        //f8.setStyle("-fx-text-fill : white;-fx-background-color :#3897f0; -fx-background-radius :10; -fx-border-radius :10; -fx-padding:10");
           

        Label label1 = new Label("Services :");
        label1.setFont(Font.font("Impact", 30));

        //////////////////////////// search bar
        Label searchLabel = new Label("Search:");
        searchLabel.setFont(Font.font("Times New Roman", FontWeight.BOLD, 25));

        TextField searchField = new TextField();
        searchField.setPromptText("search");
        searchField.setMaxWidth(500);

        /////// tx.setStyle("-fx-background-color: white");
        searchField.setStyle("-fx-background-radius :20; -fx-border-radius :10; -fx-padding:10");

        Image I13 = new Image("homepage/homeui/Design 4 (2).png", 800, 1000, false, false);
        ImageView iv13 = new ImageView(I13);

        HBox homeimgvb = new HBox(iv13);


        ///////////////////////////////////////// zatapat
        Label zatpatLabel = new Label("ZAT");
        zatpatLabel.setFont(Font.font("Times New Roman", FontWeight.BOLD, 250));
      
        Label patLabel = new Label("पट");
        patLabel.setFont(Font.font("Times New Roman", FontWeight.BOLD, 245));
        

        /////////////////////////////////////// window image
        Image I14 = new Image("homepage/homeui/home.png", 280, 280, false, false);
        ImageView iv15 = new ImageView(I14);

        HBox windowimghb = new HBox(iv15);


        //////////////////////////////insta whatsapp
         Image insta =new Image("cookpage/insta2.png",30,30, false, false);
        ImageView instImageView =new ImageView(insta);
         
        Hyperlink link = new Hyperlink("",instImageView);
        link.setFont(Font.font("Times New Roman", FontWeight.BOLD, 16)); 
        link.setLayoutX(1180);
        link.setLayoutY(790);

        // Set an action event to open the link in a web browser
        link.setOnAction(event -> {
            try {
                // Make sure to handle exceptions
                Desktop.getDesktop().browse(new URI("https://www.instagram.com/mayur42122/?hl=en"));
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
/////////////////////////////////whatsappp
        Image whats =new Image("cookpage/whats.png",30,30, false, false);
        ImageView wtImageView =new ImageView(whats);

        Hyperlink link1 = new Hyperlink("",wtImageView);
        link1.setFont(Font.font("Times New Roman", FontWeight.BOLD, 16)); 
        link1.setLayoutX(1180);
        link1.setLayoutY(830);

        // Set an action event to open the link in a web browser
       
        link1.setOnAction(event -> {
            try {
                // Make sure to handle exceptions
                Desktop.getDesktop().browse(new URI("https://wa.me/919325834312"));
            } catch (Exception e) {
                e.printStackTrace();
            }
        });

        Hyperlink callLink = new Hyperlink("Call Us: +919325834312");
        callLink.setFont(Font.font("Times New Roman", FontWeight.BOLD,20)); 
        

        // Set the action when the Hyperlink is clicked
        callLink.setOnAction(event -> {
            try {
                // Create the URI with the phone number
                URI uri = new URI("tel:+919325834312");

                // Check if Desktop API is supported
                if (Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Desktop.Action.BROWSE)) {
                    // Open the default phone dialer
                    Desktop.getDesktop().browse(uri);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        });


        ///////////////////////////////////////////// description
        Text text = new Text(220, 515,
                "                               Looking for a perfect cook,cleaner,food affair to complement your special occasion?\r\n"
                        + //
                        "               Look no further! we are provide a sumptuous food itinerary to fulfill your each and every houskeeping need. Be it a large,\r\n"
                        +
                        " mid or small sized event, our full-range of outdoor and indoor catering services cover complete food preparation and presentation for formal and informal gatherings.");
        text.setFont(Font.font("Times New Roman", FontWeight.BOLD, 15));

        ////////////////////////////////////////// footer label
        Image I15 = new Image("homepage/homeui/foot.png", 1280, 380, false, false);
        ImageView iv16 = new ImageView(I15);
        Text text2 =new Text("@Bytecoder,2024 All rights reserved.");
        text2.setFont(Font.font("Times New Roman", FontWeight.BOLD, 25));
       



        HBox hb11 = new HBox(iv16);
        

        Pane pane = new Pane();
        pane.setStyle(" -fx-background-color: linear-gradient(from 50% 50% to 0% 0%, #F5D419, #ffffff);");

        ///////////////////////////// header button
        pane.getChildren().add(f1);
        pane.getChildren().add(f2);
        pane.getChildren().add(f3);
        pane.getChildren().add(f4);
        pane.getChildren().add(f5);
        pane.getChildren().add(f6);
       // pane.getChildren().add(f7);
        pane.getChildren().add(f8);


        f1.setLayoutX(1100);
        f2.setLayoutX(1200);
        f3.setLayoutX(1300);
        f4.setLayoutX(1400);
        f5.setLayoutX(1500);
        f6.setLayoutX(1600);
        //f7.setLayoutX(1600);
        f8.setLayoutX(1700);

        f1.setLayoutY(20);
        f2.setLayoutY(20);
        f3.setLayoutY(20);
        f4.setLayoutY(20);
        f5.setLayoutY(20);
        f6.setLayoutY(20);
      //  f7.setLayoutY(20);
        f8.setLayoutY(20);

        f1.setStyle("-fx-background-color :transparent");
        f2.setStyle("-fx-background-color :transparent");
        f3.setStyle("-fx-background-color :transparent");
        f4.setStyle("-fx-background-color :transparent");
        f5.setStyle("-fx-background-color :transparent");
        f6.setStyle("-fx-background-color :transparent");
      //  f7.setStyle("-fx-background-color :transparent");
        f8.setStyle("-fx-background-color :transparent");



        
        //////////////////////////////////////////////////////
        pane.getChildren().add(vb);
        pane.getChildren().add(icon);
        pane.getChildren().add(searchLabel);
        pane.getChildren().add(searchField);
        pane.getChildren().add(zatpatLabel);
        pane.getChildren().add(patLabel);
        pane.getChildren().add(text);

        //////////////////////////////////////////////
        pane.getChildren().add(b1);
        pane.getChildren().add(b2);
        pane.getChildren().add(b3);
        pane.getChildren().add(b4);
        pane.getChildren().add(label1);
        pane.getChildren().add(homeimgvb);
        pane.getChildren().add(windowimghb);

        ////////////////////////////////// footer
        pane.getChildren().add(hb11);
        hb11.setLayoutY(730);
        hb11.setLayoutX(000);

        /////////////////////////////////////////////////////// features
        b1.setLayoutX(100);
        b2.setLayoutX(400);
        b3.setLayoutX(700);
        b4.setLayoutX(1000);
        b1.setLayoutY(600);
        b2.setLayoutY(600);
        b3.setLayoutY(600);
        b4.setLayoutY(600);
        label1.setLayoutX(100);
        label1.setLayoutY(560);
        ///////////////////////////////////////////////////////////// background images
        homeimgvb.setLayoutX(1150);
        homeimgvb.setLayoutY(70);
        windowimghb.setLayoutX(480);
        windowimghb.setLayoutY(60);

        ///////////////////////////////////
        searchLabel.setLayoutX(400);
        searchField.setLayoutX(490);
        searchLabel.setLayoutY(20);
        searchField.setLayoutY(15);

        ///////////////////////////////////////////////////////////
        icon.setLayoutX(1850);
        icon.setLayoutY(8);
        /////////////////
        zatpatLabel.setLayoutX(300);
        zatpatLabel.setLayoutY(250);
        patLabel.setLayoutX(820);
        patLabel.setLayoutY(265);

        ////////////////////////////////////////// whatsup
        pane.getChildren().add(text2);
        text2.setLayoutX(100);
        text2.setLayoutY(930);
        pane.getChildren().add(link);
        pane.getChildren().add(link1);
        pane.getChildren().add(callLink);
        link.setLayoutX(1010);
        link.setLayoutY(910);
        link1.setLayoutX(960);
        link1.setLayoutY(910);
        callLink.setLayoutX(730);
        callLink.setLayoutY(910);



    
    
        

        Scene sc = new Scene(pane);
        stage.setScene(sc);
        stage.show();

    }

}
