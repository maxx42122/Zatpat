package main;





/* 
import javafx.application.Application;
import javafx.geometry.Pos;

import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import javafx.scene.layout.HBox;

import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class slide extends Application{

    @Override
    public void start(Stage primaryStage){
        //panner-chicken> iv1,lb1,iv8,lb9
        Image ig1=new Image("assets/image/paneer.png");
        ImageView iv1=new ImageView(ig1);
        iv1.setFitWidth(100);
        iv1.setFitHeight(50);

        Label lb1=new Label("Panner");
        lb1.setFont(new Font(15));
        lb1.setAlignment(Pos.CENTER);

       // VBox vb1=new VBox(iv1,lb1);
        //vb1.setAlignment(Pos.CENTER);

        // Butter panner
        Image ig=new Image("assets/image/shev.png");
        ImageView iv=new ImageView(ig);
        iv.setFitWidth(100);
        iv.setFitHeight(50);

        Label lb=new Label("Panner");
        lb.setFont(new Font(15));
        lb.setAlignment(Pos.CENTER);

        VBox vb=new VBox(iv1,lb1);
        vb.setAlignment(Pos.CENTER);


        // shev baji-mutton
        Image ig2=new Image("assets/image/shev.png");
        ImageView iv2=new ImageView(ig2);
        iv2.setFitWidth(100);
        iv2.setFitHeight(50);

        Label lb2=new Label("Shev Baji");
        lb2.setFont(new Font(15));
        lb2.setAlignment(Pos.CENTER);

      //  VBox vb2=new VBox(iv2,lb2);
        //vb2.setAlignment(Pos.CENTER);

        //brinjal-Egg
        Image ig3=new Image("assets/image/dal.png");
        ImageView iv3=new ImageView(ig3);
        iv3.setFitWidth(100);
        iv3.setFitHeight(50);

        Label lb3=new Label("Brinjal Baji");
        lb3.setFont(new Font(15));
        lb3.setAlignment(Pos.CENTER);

       // VBox vb3=new VBox(iv3,lb3);
        //vb3.setAlignment(Pos.CENTER);

        // Dal-rice-fish
        Image ig4=new Image("assets/image/dal.png");
        ImageView iv4=new ImageView(ig4);
        iv4.setFitWidth(100);
        iv4.setFitHeight(50);

        Label lb4=new Label("Dal-Rice");
        lb4.setFont(new Font(15));
        lb4.setAlignment(Pos.CENTER);

       // VBox vb4=new VBox(iv4,lb4);
        //vb4.setAlignment(Pos.CENTER);

        //bhindi masala
        Image ig5=new Image("assets/image/bhindi.png");
        ImageView iv5=new ImageView(ig5);
        iv5.setFitWidth(100);
        iv5.setFitHeight(50);

        Label lb5=new Label("Bhindi Masala");
        lb5.setFont(new Font(15));
        lb5.setAlignment(Pos.CENTER);

        //VBox vb5=new VBox(iv5,lb5);
        //vb5.setAlignment(Pos.CENTER);

        // masala bhat

        Image ig6=new Image("assets/image/rice.png");
        ImageView iv6=new ImageView(ig6);
        iv6.setFitWidth(100);
        iv6.setFitHeight(50);

        Label lb6=new Label("Masala Rice");
        lb6.setFont(new Font(15));
        lb6.setAlignment(Pos.CENTER);

       // VBox vb6=new VBox(iv6,lb6);
        //vb6.setAlignment(Pos.CENTER);

        // bhakar
        Image ig7=new Image("assets/image/bhakar.png");
        ImageView iv7=new ImageView(ig7);
        iv7.setFitWidth(100);
        iv7.setFitHeight(50);

        Label lb7=new Label("Bhakari");
        lb7.setFont(new Font(15));
        lb7.setAlignment(Pos.CENTER);

        VBox vb7=new VBox(15,iv6,lb6,iv7,lb7);
        vb7.setAlignment(Pos.CENTER);

        //HBox hb1=new HBox(15,vb1,vb2,vb3,vb4,vb5,vb6,vb7);
        //hb1.setAlignment(Pos.CENTER);

        // Non-Veg
        // chicken

        Image ig8=new Image("assets/image/chicken.png");
        ImageView iv8=new ImageView(ig8);
        iv8.setFitWidth(100);
        iv8.setFitHeight(50);

        Label lb8=new Label("Chicken");
        lb8.setFont(new Font(15));
        lb8.setAlignment(Pos.CENTER);

        VBox vb8=new VBox(15,iv1,lb1,iv8,lb8);
        vb8.setAlignment(Pos.CENTER);

        // Matan
        Image ig9=new Image("assets/image/fish.png");
        ImageView iv9=new ImageView(ig9);
        iv9.setFitWidth(100);
        iv9.setFitHeight(50);

        Label lb9=new Label("Mutton");
        lb9.setFont(new Font(15));
        lb9.setAlignment(Pos.CENTER);

        VBox vb9=new VBox(15,iv2,lb2,iv9,lb9);
        vb9.setAlignment(Pos.CENTER);

        //Egg
        Image ig10=new Image("assets/image/egg.png");
        ImageView iv10=new ImageView(ig10);
        iv10.setFitWidth(100);
        iv10.setFitHeight(50);

        Label lb10=new Label("Matan");
        lb10.setFont(new Font(15));
        lb10.setAlignment(Pos.CENTER);

        VBox vb10=new VBox(15,iv3,lb3,iv10,lb10);
        vb10.setAlignment(Pos.CENTER);

        //Fish-dal
        Image ig11=new Image("assets/image/egg.png");
        ImageView iv11=new ImageView(ig11);
        iv11.setFitWidth(100);
        iv11.setFitHeight(50);

        Label lb11=new Label("Fish");
        lb11.setFont(new Font(15));
        lb11.setAlignment(Pos.CENTER);

        VBox vb11=new VBox(15,iv4,lb4,iv11,lb11);
        vb11.setAlignment(Pos.CENTER);

        //Briyani
        Image ig12=new Image("assets/image/egg.png");
        ImageView iv12=new ImageView(ig12);
        iv12.setFitWidth(100);
        iv12.setFitHeight(50);

        Label lb12=new Label("Briyani");
        lb12.setFont(new Font(15));
        lb12.setAlignment(Pos.CENTER);

        VBox vb12=new VBox(15,iv5,lb5,iv12,lb12);
        vb12.setAlignment(Pos.CENTER);

        HBox hb2=new HBox(15,vb8,vb9,vb10,vb11,vb12,vb7);
        hb2.setAlignment(Pos.CENTER);
        hb2.setLayoutY(400);



        ///////////vertical scroll pane
        VBox vbox=new VBox();
        vbox.getChildren().add(hb2);
      

        ScrollPane scrollPane = new ScrollPane();
        scrollPane.setContent(vbox);

        scrollPane.setVbarPolicy(ScrollPane.ScrollBarPolicy.ALWAYS);

        // Enable horizontal scrolling
        scrollPane.setHbarPolicy(ScrollPane.ScrollBarPolicy.ALWAYS);

        //////////// vertical scroll pane 
        
        
      
       // StackPane stackPane=new StackPane(scrollPane);
        //stackPane.setAlignment(Pos.CENTER);

        

        





        Scene scene=new Scene(scrollPane,400,700);
        primaryStage.setScene(scene);
        primaryStage.show();
        

    }
    
}
/////////////////////////////////////////////////////////////////////////////////////////////////////////

Image I9=new Image("assets/image/maidh.png", 200, 200, false, false);
Image I10=new Image("assets/image/cleanerh.png", 200, 200, true, true);
Image I11=new Image("assets/image/exploreh.png", 200, 200, false, false);
Image I12=new Image("assets/image/catererh.png", 200, 200, false, false);


ImageView iv9 =new ImageView(I9);
ImageView iv10 =new ImageView(I10);
ImageView iv11 =new ImageView(I11);
ImageView iv12 =new ImageView(I12);


Button b1 =new Button("",iv9);
Button b2 =new Button("",iv10);
Button b3 =new Button("",iv11);
Button b4 =new Button("",iv12);


b1.setOnMouseEntered(event -> {

    {
    ScaleTransition scaleTransition=new ScaleTransition(Duration.millis(200),b1);
    scaleTransition.setToX(1.1);
    scaleTransition.setToY(1.1);
    scaleTransition.play();  
    }

});


b1.setOnMouseExited(event -> {

     {
    ScaleTransition scaleTransition=new ScaleTransition(Duration.millis(200),b1);
    scaleTransition.setToX(1.0);
    scaleTransition.setToY(1.0);
    scaleTransition.play();  
    }

});



HBox hb2=new HBox(22,b1,b2,b3,b4);
ScrollPane scrollPane = new ScrollPane();
scrollPane.setContent(hb2);


// scrollPane.setPrefViewportHeight(200);
scrollPane.setPrefViewportWidth(400);


////////////////////////////////////////////////////////////second row

Image I21=new Image("assets/image/paneer.png", 200, 200, false, false);
Image I22=new Image("assets/image/bhindi.png", 200, 200, false, false);
Image I23=new Image("assets/image/dal.png", 200, 200, true, true);
Image I24=new Image("assets/image/shev.png", 200, 200, false, false);
Image I25=new Image("assets/image/rice.png", 200, 200, false, false);
Image I26=new Image("assets/image/roti.png", 200, 200, false, false);
Image I27=new Image("assets/image/bhakar.png", 200, 200, false, false);
Image I28=new Image("assets/image/chicken.png", 200, 200, true, true);
Image I29=new Image("assets/image/egg.png", 200, 200, false, false);
Image I30=new Image("assets/image/fish.png", 200, 200, false, false);
//Image I=new Image("assets/image/profile.png", 40, 40, false, false);
//Image I27=new Image("assets/image/menu.png", 30, 30, false, false);

ImageView iv21 =new ImageView(I21);
ImageView iv22 =new ImageView(I22);
ImageView iv23=new ImageView(I23);
ImageView iv24=new ImageView(I24);
ImageView iv25 =new ImageView(I25);
ImageView iv26 =new ImageView(I26);
ImageView iv27 =new ImageView(I27);
ImageView iv28 =new ImageView(I28);
ImageView iv29=new ImageView(I29);
ImageView iv30=new ImageView(I30);



Button b21 =new Button("",iv21);
Button b22 =new Button("",iv22);
Button b23 =new Button("",iv23);
Button b24 =new Button("",iv24);
Button b25 =new Button("",iv25);
Button b26 =new Button("",iv26);
Button b27 =new Button("",iv27);
Button b28 =new Button("",iv28);
Button b29 =new Button("",iv29);
Button b30 =new Button("",iv30);

Label label2=new Label("Food");

*/

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import java.util.ArrayList;
import java.util.List;

public class slide extends Application {

    @Override
    public void start(Stage primaryStage) {
        // Create a list of labels
        List<Label> labels = createLabelList();

        // Create a GridPane
        GridPane gridPane = new GridPane();

        // Add labels to the GridPane
        addLabelsToGridPane(labels, gridPane);

        // Create a scene with the GridPane
        Scene scene = new Scene(gridPane, 300, 200);

        // Set up the stage
        primaryStage.setTitle("List in GridPane Example");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    // Method to create a list of labels
    private List<Label> createLabelList() {
        List<Label> labels = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            labels.add(new Label("Label " + i));
        }
        return labels;
    }

    // Method to add labels to the GridPane
    private void addLabelsToGridPane(List<Label> labels, GridPane gridPane) {
        int row = 0;
        int col = 0;
        for (Label label : labels) {
            gridPane.add(label, col, row);
            row++;
            // If you want to arrange labels in multiple columns, use the following logic
            // col++;
            // if (col == 3) { // Suppose you want 3 columns
            //     col = 0;
            //     row++;
            // }
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}