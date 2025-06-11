package com.zatpat.maidlist;


import com.zatpat.Home.Homepage;
import com.zatpat.logincontroller.Frontpage;

import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.effect.GaussianBlur;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.BackgroundPosition;
import javafx.scene.layout.BackgroundRepeat;
import javafx.scene.layout.BackgroundSize;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

public class MaidSelectionInfo  {

    

    private ComboBox<Integer> numberComboBox;
    private ComboBox<Integer> numberComboBox1;

    private ComboBox<String> Durationbox;
    // private Label rateTextField;
    public TextField rateTextField;
        public Stage stage;
    
        public MaidSelectionInfo(Stage stage) {
        this.stage = stage;
        }
    
         
    
        public void initializemaid1(){

     
                Label label = new Label("Number Of Peoples In the House :");
                label.setFont(Font.font("Times New Roman", FontWeight.BOLD, 30));

                numberComboBox = new ComboBox<>();
                numberComboBox.setItems(FXCollections.observableArrayList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)); // Add
                                                                                                           // numbers as
                                                                                                           // options
                numberComboBox.setValue(1); // Default selection
                numberComboBox.setPrefWidth(70);
                numberComboBox.setOnAction(e -> calculateRateAndUpdate());
                System.out.println(numberComboBox);

                numberComboBox.setStyle("-fx-font-size: 14px; " +
                                "-fx-background-color: white; " +
                                "-fx-border-color: #ccc; " +
                                "-fx-border-width: 1px; " +
                                "-fx-border-radius: 5px;");

                Label label1 = new Label("Number Of Adults In the House :");
                label1.setFont(Font.font("Times New Roman", FontWeight.BOLD, 30));

                numberComboBox1 = new ComboBox<>();
                numberComboBox1.setItems(FXCollections.observableArrayList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)); // Add
                                                                                                            // numbers
                                                                                                            // as
                                                                                                            // options
                numberComboBox1.setValue(1); // Default selection
                numberComboBox1.setPrefWidth(70);
                numberComboBox1.setOnAction(e -> calculateRateAndUpdate());

                // ComboBox<Integer>
                numberComboBox1.setStyle("-fx-font-size: 14px; " +
                                "-fx-background-color: white; " +
                                "-fx-border-color: #ccc; " +
                                "-fx-border-width: 1px; " +
                                "-fx-border-radius: 5px;");

                Label label2 = new Label("Number Of Childrens In the House :");
                label2.setFont(Font.font("Times New Roman", FontWeight.BOLD, 30));

                ComboBox<Integer> numberComboBox2 = new ComboBox<>();
                numberComboBox2.setItems(FXCollections.observableArrayList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)); // Add
                                                                                                            // numbers
                                                                                                            // as
                                                                                                            // options
                numberComboBox2.setValue(1); // Default selection
                numberComboBox2.setPrefWidth(70);

                numberComboBox2.setStyle("-fx-font-size: 14px; " +
                                "-fx-background-color: white; " +
                                "-fx-border-color: #ccc; " +
                                "-fx-border-width: 1px; " +
                                "-fx-border-radius: 5px;");

                Label label3 = new Label("Time Slots :");
                label3.setFont(Font.font("Times New Roman", FontWeight.BOLD, 30));
                ComboBox<String> startComboBox = new ComboBox<>();



                startComboBox.setItems(FXCollections.observableArrayList(
                                "6 Am ", "7 Am ", " 8 Am", "9 Am", " 10 Am", "11 Am", "12 Pm", "1 Pm", "2 Pm", "3 Pm",
                                "4 Pm", "5 Pm",
                                "6 Pm", "7 Pm", "8 Pm", "9 PM", "10 Pm"));
                startComboBox.setValue("None"); // Default selection
                startComboBox.setPrefWidth(150);
                startComboBox.setStyle("-fx-font-size: 14px; " +
                                "-fx-background-color: #f0f0f0; " +
                                "-fx-border-color: #ccc; " +
                                "-fx-border-width: 1px; " +
                                "-fx-border-radius: 5px;");

                startComboBox.setLayoutX(1600);
                startComboBox.setLayoutY(280);

                ComboBox<String> endComboBox = new ComboBox<>();
                endComboBox.setItems(FXCollections.observableArrayList(
                                "6 Am ", "7 Am ", " 8 Am", "9 Am", " 10 Am", "11 Am", "12 Pm", "1 Pm", "2 Pm", "3 Pm",
                                "4 Pm", "5 Pm",
                                "6 Pm", "7 Pm", "8 Pm", "9 PM", "10 Pm"));
                endComboBox.setValue("None"); // Default selection
                endComboBox.setPrefWidth(150);
                endComboBox.setStyle("-fx-font-size: 14px; " +
                                "-fx-background-color: #f0f0f0; " +
                                "-fx-border-color: #ccc; " +
                                "-fx-border-width: 1px; " +
                                "-fx-border-radius: 5px;");

                endComboBox.setLayoutX(1800);
                endComboBox.setLayoutY(280);

                Label label4 = new Label("to");
                label4.setFont(Font.font("Times New Roman", FontWeight.BOLD, 30));

                HBox hbox = new HBox(30); // HBox to hold label and combobox
                hbox.getChildren().addAll(label, numberComboBox, label1, numberComboBox1, label2, numberComboBox2,
                                label3,
                                startComboBox, label4, endComboBox);


                hbox.setLayoutX(50);
                hbox.setLayoutY(260);

                HBox timehbox = new HBox(30); // HBox to hold label and combobox
                timehbox.getChildren().addAll(label3,startComboBox, label4, endComboBox);
                
                timehbox.setLayoutX(600);
                timehbox.setLayoutY(330);

                Label label5 = new Label("Select your needs for cook");
                label5.setFont(Font.font("Times New Roman", FontWeight.BOLD, 70));
                label5.setLayoutX(600);
                label5.setLayoutY(50);

                Image image = new Image("catererlist/om.png");

                ImageView imageView = new ImageView(image);
                imageView.setFitWidth(30); // Adjust size as needed
                imageView.setFitHeight(30);

                HBox hBox2 = new HBox(30);
                hBox2.getChildren().addAll(imageView);
                
                hBox2.setLayoutX(550);
                hBox2.setLayoutY(400);
                // hBox2.setStyle("fx-background-color: Pink;");

                Label label6 = new Label("Food Type");
                label6.setFont(Font.font("Times New Roman", FontWeight.BOLD, 30));
               
                label6.setLayoutX(600);
                label6.setLayoutY(400);

                ToggleGroup foodTypeToggleGroup = new ToggleGroup();

                RadioButton vegRadioButton = new RadioButton("Veg");
                vegRadioButton.setToggleGroup(foodTypeToggleGroup);
                vegRadioButton.setSelected(true); // Default selection

                RadioButton nonVegRadioButton = new RadioButton("Non-Veg");
                nonVegRadioButton.setToggleGroup(foodTypeToggleGroup);

                RadioButton bothRadioButton = new RadioButton("Both");
                bothRadioButton.setToggleGroup(foodTypeToggleGroup);

                HBox foodTypeBox = new HBox(10);
                foodTypeBox.getChildren().addAll(vegRadioButton, nonVegRadioButton, bothRadioButton);
                foodTypeBox.setLayoutX(600);
                foodTypeBox.setLayoutY(450);

                Label label7 = new Label("Meal Type");
                label7.setFont(Font.font("Times New Roman", FontWeight.BOLD, 30));
                label7.setLayoutX(1100);
                label7.setLayoutY(400);

                ToggleGroup foodTypeToggleGroup1 = new ToggleGroup();

                RadioButton breakfastbutton = new RadioButton("Breakfast");
                breakfastbutton.setToggleGroup(foodTypeToggleGroup1);
                breakfastbutton.setSelected(true); // Default selection

                RadioButton Lunchbutton = new RadioButton("Lunch");
                Lunchbutton.setToggleGroup(foodTypeToggleGroup1);

                RadioButton dinnerbutton = new RadioButton("Dinner");
                dinnerbutton.setToggleGroup(foodTypeToggleGroup1);

                HBox foodtypeBox1 = new HBox(10);
                foodtypeBox1.getChildren().addAll(breakfastbutton, Lunchbutton, dinnerbutton);
                foodtypeBox1.setLayoutX(1100);
                foodtypeBox1.setLayoutY(450);

                Label label8 = new Label(" Region Slot :");
                label8.setFont(Font.font("Times New Roman", FontWeight.BOLD, 30));
                label8.setLayoutX(900);
                label8.setLayoutY(500);

                ComboBox<String> religionComboBox = new ComboBox<>();
                religionComboBox.setItems(FXCollections.observableArrayList(
                                "None", "Hindu", "Christian", "Islam", "Buddhist", "muslim", "Sikh", "Other"));
                religionComboBox.setValue("None"); // Default selection
                religionComboBox.setPrefWidth(150);
                religionComboBox.setStyle("-fx-font-size: 14px; " +
                                "-fx-background-color: #f0f0f0; " +
                                "-fx-border-color: #ccc; " +
                                "-fx-border-width: 1px; " +
                                "-fx-border-radius: 5px;");

                religionComboBox.setLayoutX(900);
                religionComboBox.setLayoutY(550);

                Label label10 = new Label("Working Duration : ");
                label10.setFont(Font.font("Times New Roman", FontWeight.BOLD, 30));
                label10.setLayoutX(900);
                label10.setLayoutY(650);

                rateTextField = new TextField();
                rateTextField.setStyle("-fx-background-radius:10; -fx-border-radius:10; -fx-padding:30");
               
                rateTextField.setEditable(false); // Make it non-editable
                rateTextField.setLayoutX(880);
                rateTextField.setLayoutY(800);
                rateTextField.setPrefWidth(200);
                //rateTextField.setStyle("-fx-background-radius: 5; -fx-border-radius: 5; -fx-padding: 5");

                // ComboBox<String>

                Durationbox = new ComboBox<>();
                Durationbox.setItems(FXCollections.observableArrayList(
                                "1 Day", "7 Days", "15 Days", "1 Month", "2 Months", "3 Months"));
                Durationbox.setValue("1 Day"); // Default selection
                Durationbox.setPrefWidth(150);
                Durationbox.setStyle("-fx-font-size: 14px; " +
                                "-fx-background-color: #f0f0f0; " +
                                "-fx-border-color: #ccc; " +
                                "-fx-border-width: 1px; " +
                                "-fx-border-radius: 5px;");

                // Durationbox.setOnAction(e -> {
                // String selectedDuration = Durationbox.getValue();
                // double rate = calculateRate(selectedDuration); // Replace with your logic to
                // calculate rate
                // rateTextField.setText(String.format(" %.2f", rate)); // Format rate as
                // currency or as needed
                // });

                Durationbox.setOnAction(e -> calculateRateAndUpdate());
                // Durationbox.setOnAction(event ->{

                // int people=numberComboBox.getValue();
                // int sadults=numberComboBox1.getValue();
                // });

                Durationbox.setLayoutX(900);
                Durationbox.setLayoutY(700);

                Label rate = new Label("Rate :");
                rate.setFont(Font.font("Times New Roman", FontWeight.BOLD, 30));
                rate.setLayoutX(900);
                rate.setLayoutY(800);

                // Create a proceed button
                Button proceed = new Button("Proceed");
                proceed.setFont(Font.font("Times New Roman", FontWeight.BOLD, 30));
                proceed.setLayoutX(900);
                proceed.setLayoutY(900);

                proceed.setOnAction(new EventHandler<ActionEvent>() {

                        @Override
                        public void handle(ActionEvent event) {
                                maidinfo obj = new maidinfo();
                                obj.conmaid(stage);
                                obj.totalrate(rateTextField.getText());
                                obj.initializemaidlist();
                             
                        }

                });


                Image ig1 = new Image("loginpages/back.png", 45, 45, false, false);
                ImageView iv1 = new ImageView(ig1);

                Button backButton = new Button("", iv1);
                backButton.setStyle("-fx-background-radius :50; -fx-border-radius :50; -fx-padding:10");
                backButton.setStyle("-fx-background-color:transparent");
                backButton.setOnAction(new EventHandler<ActionEvent>() {

                @Override
                public void handle(ActionEvent event) {

                Homepage obj6 = new Homepage(stage);
                obj6.initializehome();
      }

    });

                // Image image2 = new Image("assets\\phonepayqr.jpg");
                // ImageView imageView2 = new ImageView(image2);

                Pane pane = new Pane(label5,backButton,hbox,timehbox, hBox2, label6, foodTypeBox, label7, foodtypeBox1, label8, religionComboBox,
                                label10,
                                Durationbox, rate, rateTextField);
             //   pane.setStyle(" -fx-background-color: linear-gradient(from 50% 0% to 100% 50%, #F5D419, #ffffff);");
                // pane.setStyle("-fx-background-image : url('assets/made2.png');
                // -fx-background-size : ;");
                pane.getChildren().add(proceed);
               // Load the background image
        Image backgroundImage = new Image("catererlist/dus3.png", 2000, 1000, false, false);

        // Create an ImageView with the background image
        ImageView backgroundImageView = new ImageView(backgroundImage);

        // Apply GaussianBlur effect to the ImageView
        GaussianBlur blur = new GaussianBlur(30); // Adjust the radius as needed
        backgroundImageView.setEffect(blur);

        // Ensure the backgroundImageView is at the back
        pane.getChildren().add(0, backgroundImageView);

                Scene sc = new Scene(pane, 2000, 1000);

                stage.setScene(sc);
                stage.show();

                calculateRateAndUpdate();

        }

        private void calculateRateAndUpdate() {
                System.out.println(numberComboBox);
                int numberOfPeople = numberComboBox.getValue();
                int numberOfAdults = numberComboBox1.getValue();
                // Add more as needed for other ComboBoxes

                String selectedDuration = Durationbox.getValue();
                double ratePerPerson = calculateRate(selectedDuration);
                // double totalRate = ratePerPerson * (numberOfPeople + numberOfAdults); //
                // Modify as per your calculation logic
                double rate = ratePerPerson * (numberOfPeople + numberOfAdults);
                rateTextField.setText(String.format("₹%.2f", rate));
        }

        private double calculateRate(String selectedDuration) {
                switch (selectedDuration) {
                        case "1 Day":
                                return 200.00;
                        case "7 Days":
                                return 1200.00;
                        case "15 Days":
                                return 2300.00;
                        case "1 Month":
                                return 4500.00;
                        case "2 Months":
                                return 8000.00;
                        case "3 Months":
                                return 1200.00;
                        default:
                                return 0.00;
                }

        }

}