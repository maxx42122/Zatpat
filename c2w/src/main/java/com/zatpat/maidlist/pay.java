package com.zatpat.maidlist;


import com.zatpat.Home.Homepage;
import com.zatpat.logincontroller.Frontpage;

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
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;
 


 public class pay {



    public Stage stage;
    private String payrate;

    public pay(Stage stage ){
        this.stage=stage;
        //this.payrate = payrate ;
        System.out.println("2222222222222222"+stage);
       
        
        }

    // public void yrate(String payrate){
    //     this.payrate=payrate;
    //     System.out.println("in. pay"+payrate);
    // }


   public void rate(String payrate){
        this.payrate=payrate;
        Label lb = new Label("To shortlist this maid, kindly pay a refundable fees :");
        lb.setFont(new Font(25));

        Label lb2 = new Label("Next Steps");
        lb2.setFont(new Font(30));
        // lb2.setAlignment(Pos.CENTER);
        // lb2.setStyle("-fx-font-color: black");

        HBox hb = new HBox(lb);
        // hb.setStyle("-fx-background-color: red");
        hb.setAlignment(Pos.CENTER);
        hb.setStyle("-fx-background-color: red;-fx-background-radius :20;fx-border-radius :20; -fx-padding:15");
        // hb.setPrefSize(1200, 10);

        VBox vb1 = new VBox(lb2);
        vb1.setAlignment(Pos.CENTER);

        Text tx = new Text(100, 100,
                "1) Pay this refundable fees \n\n"

                        + //
                        "2) Once you have paid this amount, you can shortlist more maids for free\n\n"

                        + //
                        "3) After paying we will contact you within 1 working hour.\n\n"
                        + //
                        "4) Your requirement will be put on first priority.\n\n"
                        + //
                        "5) If we have just have one high quality maid available and we have two requirements,\n    you will get the maid and the other client will have to wait.\n\n"
                        + //
                        "6) If you select maid then she will start working for you from in next day\n\n"
                        + //
                        "7) If this maid is not available then we will send you other options of maids who are \n   similar to the one that you shortlisted. If we are unable to find you a maid, then we \n   will refund this amount of that you have paid in 24hr Only.\r\n\n"
                        + //
                          // "4) If you select maid then she will start working for you from in next
                          // day\n\n"
                          // + //
                          // "5) If we have just have one high quality maid available and we have two
                          // requirements,\n you will get the maid and the other client will have to
                          // wait.\n\n"
                          // + //
                          // "6) We will contact you within 1 working hour.\n\n"
                          // + //
                          // "7) Your requirement will be put on first priority.\n\n"
                          // + //
                        "8) This amount is completely adjustable against the maid hiring charges.\n\n"
                        + //
                        "Note: Most of the maid agencies are frauds. They will charge you a fee and maid will \n   never join or run  away after few days. Maid&Cook is a corporate company and for\n    us your satisfaction is highest priority. Trust us to give you the best quality maid and\n    service.\n");

        tx.setFont(new Font(20));
        
   
        // Label rateLabel = new Label(rate); 
        Button b1 = new Button(payrate);
        b1.setStyle("-fx-background-color: red;-fx-background-radius :10;fx-border-radius :10; -fx-padding:15");

        b1.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                payment payobj=new payment(stage);
                payobj.paymentlast();
            }

        });

        VBox vb2 = new VBox(b1);
        vb2.setAlignment(Pos.CENTER);

        VBox vb = new VBox(10, hb, vb1, tx, vb2);
        vb.setPrefSize(800, 900);
        // vb.setStyle("-fx-background-color: white");
        vb.setLayoutX(600);
        vb.setStyle("-fx-background-color: white;-fx-background-radius :10; -fx-border-radius :10; -fx-padding:15");
        Image ig1 = new Image("loginpages/back.png", 45, 45, true, true);
    ImageView iv1 = new ImageView(ig1);

    Button backButton = new Button("", iv1);
    backButton.setStyle("-fx-background-radius :50; -fx-border-radius :50; -fx-padding:10");
    backButton.setStyle("-fx-background-color:transparent");
    backButton.setOnAction(new EventHandler<ActionEvent>() {

      @Override
      public void handle(ActionEvent event) {

        Homepage obj6=new Homepage(stage);
        obj6.initializehome();
      }
      

       });

        Pane p = new Pane(vb);
        p.getChildren().add(backButton);
        backButton.setLayoutX(5);
        backButton.setLayoutY(0);

        Scene sc = new Scene(p, 2000, 1000);
        stage.setScene(sc);
        stage.show();

    }
}

