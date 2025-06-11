// package com.zatpat.catrerlist;

// import javafx.application.Application;
// import javafx.scene.Scene;
// import javafx.scene.image.Image;
// import javafx.scene.image.ImageView;
// import javafx.scene.layout.Background;
// import javafx.scene.layout.BackgroundFill;
// import javafx.scene.layout.Pane;
// import javafx.scene.layout.StackPane;
// import javafx.scene.paint.Color;
// import javafx.scene.paint.CycleMethod;
// import javafx.scene.paint.LinearGradient;
// import javafx.scene.paint.Stop;
// import javafx.stage.Stage;

// public class demo extends Application {

//     @Override
//     public void start(Stage primaryStage) {
//         Pane pane = new Pane();
//         pane.setPrefSize(600, 400);

//         // Create a gradient for the left half
//         LinearGradient gradient = new LinearGradient(0, 0, 1, 1, true, CycleMethod.NO_CYCLE,
//                 new Stop(0, Color.RED),
//                 new Stop(1, Color.BLUE));
//         pane.setBackground(new Background(new BackgroundFill(gradient, null, null)));

//         // Create an image for the right half
//         Image image = new Image("catererlist/cat2.png");
//         ImageView imageView = new ImageView(image);
//         imageView.setFitWidth(300);
//         imageView.setFitHeight(400);

//         // Create a StackPane to layer the gradient and image
//         StackPane stackPane = new StackPane();
//         stackPane.getChildren().addAll(pane, imageView);
//         stackPane.setLayoutX(300); // Move the image to the right half

//         // Create a scene and add the StackPane to it
//         Scene scene = new Scene(stackPane, 600, 400);
//         primaryStage.setScene(scene);
//         primaryStage.show();
//     }

// } 
    


// pane.setBackground(new Background(
//     new BackgroundFill(Color.LIGHTGRAY, null, null),
//     new BackgroundImage(backgroundImage, null, null, null, null)
// ));