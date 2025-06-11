package com.zatpat.catrerlist;


import java.util.ArrayList;
import java.util.List;

import com.zatpat.Home.Homepage;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Popup;
import javafx.stage.Stage;

// import javafx.application.Application;
// import javafx.stage.Stage;

public class caterslist {
    Popup popup;
    public Stage stage;

    // public caterslist(Stage stage){

    //     this.stage=stage;
    // }
    public void conmaid(Stage stage){
        this.stage=stage;
    }


 HBox card(catererModel obj) {
        HBox card = new HBox(30);
        Image ig1 = new Image(obj.getImg(), 130, 130, false, false);
        ImageView iv1 = new ImageView(ig1);

        card.setPrefWidth(400); // Set preferred width

        //////////////////////name hb
        Label nameLabel = new Label("Name:");
        nameLabel.setFont(Font.font("Times New Roman", FontWeight.BOLD, 40));
        Label namLabel = new Label(obj.getName());
        namLabel.setFont(Font.font("Times New Roman", FontWeight.BOLD, 40));
        HBox namehb = new HBox(10, nameLabel, namLabel);

        // Label ageLabel = new Label("Age:");
        // ageLabel.setFont(Font.font("Times New Roman", FontWeight.BOLD, 35));
        // Label agLabel = new Label(obj.getAge());
        // agLabel.setFont(Font.font("Times New Roman", FontWeight.BOLD, 35));
        // HBox agehb = new HBox(10, ageLabel,agLabel);
        
        HBox hb1= new HBox(40,nameLabel, namehb);


        //////////////////////////////location hb

        Label locatioLabel = new Label("Location:");
        locatioLabel.setFont(Font.font("Times New Roman", FontWeight.BOLD, 30));
        Label locLabel = new Label(obj.getLocation());
        locLabel.setFont(Font.font("Times New Roman", FontWeight.BOLD, 30));
        HBox lochb2 = new HBox(40, locatioLabel,locLabel);

        
        // Label experiancLabel = new Label("Exeperiance:");
        // experiancLabel.setFont(Font.font("Times New Roman", FontWeight.BOLD, 30));
        // Label exLabel = new Label(obj.getExperiance());
        // exLabel.setFont(Font.font("Times New Roman", FontWeight.BOLD, 30));
        // HBox experiancehb = new HBox(10, experiancLabel, exLabel);

        HBox hb2 = new HBox(70,lochb2 );



        Label mobile=new Label("Mobile No:");
        mobile.setFont(Font.font("Times New Roman", FontWeight.BOLD, 23));
        Label vegLabel = new Label(obj.getMobile());
        vegLabel.setFont(Font.font("Times New Roman", FontWeight.BOLD, 23));

        // Label timeLabel = new Label("Time:");
        // timeLabel.setFont(Font.font("Times New Roman", FontWeight.BOLD, 25));
        HBox hb3 = new HBox(10,mobile,vegLabel);

      
        VBox vb1 = new VBox(7, hb1, hb2, hb3);

        card.getChildren().addAll(iv1, vb1);

        card.setStyle(
                " -fx-background-color:  linear-gradient(from 50% 0% to 300% 0%, #FFCC33, #ffffff);" + //   Light grey background color
                        "-fx-padding: 10; " + // Padding inside the HBox
                        "-fx-border-color: #333; " + // Dark grey border color
                        "-fx-border-width: 2; " + // Border width
                        "-fx-border-radius: 5; " + // Rounded corners for border
                        "-fx-background-radius: 5;"
                         // Rounded corners for background
        );

         Popup popup = new Popup();
    

    // card.setOnMouseClicked(event -> {
    // popup.getContent().clear();
    // VBox popupContent = new VBox(new maidinfo().card2(obj)); // Assuming card2() returns Node(s) to display
    // popup.getContent().addAll(popupContent);
    // popup.show(card, event.getScreenX(), event.getScreenY());
    
    // });
    Image ig2 = new Image("CatersImages/cross.png",30,30, false, false);
    ImageView iv2 = new ImageView(ig2);
    Button closeButton = new Button("",iv2);
    closeButton.setStyle("-fx-background-color: transparent");
    closeButton.setLayoutX(560);
        
    card.addEventFilter(MouseEvent.MOUSE_CLICKED, event -> {
        // Show the popup
        popup.getContent().clear();
        VBox popupContent = new VBox(new caterslist().card2(obj)); // Assuming card2() returns Node(s) to display
        popupContent.setPrefHeight(600);
        popupContent.setPrefWidth(600);
        popup.getContent().addAll(popupContent,closeButton);
        popup.show(card, event.getScreenX(), event.getScreenY());
    });

    // Create a close button (you can use an ImageView with a close icon)
   
    closeButton.setOnMouseClicked(event -> {
        // Hide the popup when the close button is clicked
        popup.hide();
        // Perform any other cleanup or data-saving actions
    });



    return card;
}
public VBox card2(catererModel obj1) {

        

        VBox card2 = new VBox(30);
        card2.setPrefWidth(800);
        card2.setPrefHeight(800);

        Image ig1 = new Image(obj1.getImg(), 150, 200, false, false);
        ImageView iv1 = new ImageView(ig1);

        Label dishLabel = new Label("OverView:");
        dishLabel.setFont(Font.font("Times New Roman", FontWeight.BOLD, 28));
        
        
        Image dishImage1 = new Image(obj1.getImg1(), 160, 160, false, false);
        ImageView dish1 = new ImageView(dishImage1);

        Image dishImage2 = new Image(obj1.getImg2(), 160, 160, false, false);
        ImageView dish2 = new ImageView(dishImage2);

        Image dishImage3 = new Image(obj1.getImg3(), 160, 160, false, false);
        ImageView dish3 = new ImageView(dishImage3);
        HBox dishhb = new HBox(30, dish1, dish2,dish3);

        VBox besthb = new VBox(30, dishLabel,dishhb);
        

        

       // Set preferred width
        Label nameLabel = new Label("Name:");
        nameLabel.setFont(Font.font("Times New Roman", FontWeight.BOLD, 35));
        Label namLabel = new Label(obj1.getName());
        namLabel.setFont(Font.font("Times New Roman", FontWeight.BOLD, 35));
        HBox namehb = new HBox(10, nameLabel, namLabel);
        
        // Label ageLabel = new Label("Age:");
        // ageLabel.setFont(Font.font("Times New Roman", FontWeight.BOLD, 23));
        // Label agLabel = new Label(obj1.getAge());
        // agLabel.setFont(Font.font("Times New Roman", FontWeight.BOLD, 23));
        // HBox agehb = new HBox(10, ageLabel,agLabel);
        
        //HBox hb1= new HBox(90, namehb, agehb);
        
        
        //////////////////////////////location hb
        
        Label locatioLabel = new Label("Location:");
        locatioLabel.setFont(Font.font("Times New Roman", FontWeight.BOLD, 23));
        Label locLabel = new Label(obj1.getLocation());
        locLabel.setFont(Font.font("Times New Roman", FontWeight.BOLD, 23));
        HBox lochb2 = new HBox(10, locatioLabel,locLabel);
        
        
        Label experiancLabel = new Label("Exeperiance:");
        experiancLabel.setFont(Font.font("Times New Roman", FontWeight.BOLD, 23));
        Label exLabel = new Label(obj1.getExperiance());
        exLabel.setFont(Font.font("Times New Roman", FontWeight.BOLD, 23));
        HBox experiancehb = new HBox(10, experiancLabel, exLabel);
        
       // HBox hb2 = new HBox(70,lochb2,experiancehb );
        
        
        
       Label mobile1=new Label("Mobile No:");
       mobile1.setFont(Font.font("Times New Roman", FontWeight.BOLD, 23));
        Label vegLabel = new Label(obj1.getMobile());
        vegLabel.setFont(Font.font("Times New Roman", FontWeight.BOLD, 23));  
        HBox hbox=new HBox(mobile1,vegLabel);
        
        // Label languageLabel = new Label("Language:");
        // languageLabel.setFont(Font.font("Times New Roman", FontWeight.BOLD, 23));
         
        // Label langLabel = new Label(obj1.getLanguage());
        // langLabel.setFont(Font.font("Times New Roman", FontWeight.BOLD, 23));
        
        
      //  HBox langhb3 = new HBox(10,languageLabel,langLabel);
        
        
        VBox vb1 = new VBox(7, namehb,lochb2,experiancehb,hbox);
        HBox hb1Box = new HBox(10,iv1,vb1);

        Label oldexLabel = new Label("Menu:");
        oldexLabel.setFont(Font.font("Times New Roman", FontWeight.BOLD, 23));
         
        Text st= new Text(obj1.getmenu());
        st.setFont(Font.font("Times New Roman", FontWeight.BOLD, 18));

        VBox vb3Box = new VBox(10,oldexLabel,st);


        VBox maidprofile = new VBox(7, hb1Box,besthb,vb3Box);        
        Button select_maid = new Button("Select");
        select_maid.setLayoutY(400);
        select_maid.setMaxWidth(550);
        select_maid.setStyle("-fx-background-color : #C8D3E1;-fx-background-radius :20; -fx-border-radius :10; -fx-padding:10");

       
        
        card2.getChildren().addAll(maidprofile, select_maid);
        
        //////////////////////name hb
        card2.setStyle(
                        "-fx-background-color:  linear-gradient(from 50% 0% to 200% 50%, #FFCC33, #ffffff);;" +
                        "-fx-padding: 10; " + // Padding inside the HBox
                        "-fx-border-color: #333; " + // Dark grey border color
                        "-fx-border-width: 2; " + // Border width
                        "-fx-border-radius: 5; " + // Rounded corners for border
                        "-fx-background-radius: 5;" // Rounded corners for background
        );
     
        
        return card2;
    }


  public void initializemaidlist(){
       
        List<catererModel> maid = new ArrayList<>();
        maid.add(new catererModel("Abhijet caters ","MUMBAI","3 yrs", "7218754372","CatersImages/caters1.jpeg","CatersImages/overview1.jpeg","CatersImages/overview2.jpeg","CatersImages/overview3.jpeg","WELCOME DRINK : \tLemon mint (or) Lemon ginger (or)\n"
                         +  //
                         // "Fruit punch (or) Soft drink (Fruti/Mirinda/Pepsi/Coke)\r\n" + //
                        "STARTERS: \t+Mini Samosa (or) Gobi manchurian (or) Baby corn\n manchurian\r\n" + //
                        "ROLL :\tVeg Roll (or) Schezwan Roll\r\n" + //
                        "SNACKS :\tFrench fries (or) Potato Chips\r\n" + //
                        "PASTA:\tWhite sause (or) Red sause\r\n" + //
                        "NOODLES:\tVeg noodles (or) Schzewan noodles\r\n" + //
                        "CHATS : \tPani puri (or) Masala puri (or) Sev puri (or) Papdi chat\n (or) Corn chat\r\n" + //
                        "ICE CREAM:\tVenilla (or) Chocolate (or) Butterscotch\r\n" + //
                        "SWEET : \tGulab jamoon (or) Gazar Halwa (or) Ladoo\r\n" + //
                        "COUNT:       PRICE :\n"+//
                        "30 People:   RS.12600\n" + //
                        "50 People:   RS.16500\n" + //
                        "70 People:   RS.21500\n" + //
                        "100 People:  RS.29000" + //
                        // "Rs. 12,600/-\r\n" + //
                        // "Rs. 16,500/-\r\n" + //
                        // "Rs. 21,500/-\r\n" + //
                        ""));
        maid.add(new catererModel("Sameer caters","VAGHOLI PUNE","5 yrs", "9096302898 ","CatersImages/caters2.jpeg","CatersImages/overview4.jpeg","CatersImages/overview5.jpeg","CatersImages/overview6.jpeg","SWEET:\tJamoon (or) Carrot Halwa (or) Kashi Halwa (or) Chakkara\n Pongali (or) Payasam\r\n" + //
                        "INDIAN BREAD:\t2 Poori (or) 1 Chapathi  (Pre prepared)\r\n" + //
                        "VEG GRAVY :\tAloo curry (or) Mix veg curry (or) Channa masala (or)\n Green peas masala\r\n" + //
                        "FLAVOURED RICE:\tGhee Rice (or) Jeera rice (or) Fried Rice \n(or) Menthe bath (or) Tomato Bath (or) Vangi Bath (or) Veg Biriyani\n (or) Veg Pulav(or) Peas Pulav (or) Palak pulav\r\n" + //
                        "+Raitha\r\n" + //
                        "RICE & SAMBAR\tWHITE RICE\r\n" + //
                        " Andhra pappu (or) Sambar (or) Rasam (or) Dhal fry (or) Dhal tadka\r\n" + //
                        "EXTRAS\tSalt, Papad, & Pickle\r\n" + //
                        "COUNT:       PRICE:\n" + //
                        "50 People:   RS.9500\n" + //
                        "60 People:   RS.11000\n" + //
                        "70 People:   RS.12500\n" + //
                        "80 People:   RS.14000\n" + //
                        "90 People:   RS.15000\n" + //
                        "100 People:  RS.17000\n" + //
                        " "));
        maid.add(new catererModel("Ranjeet caters","DELHI","2 yrs", "9420643135","CatersImages/caters3.jpeg","CatersImages/overview7.jpeg","CatersImages/overview8.jpeg","CatersImages/overview9.jpeg"," WELCOME DRINK:\tLemon mint (or) Lemon ginger (or)\n Fruit moctail (or) Soft drinks (Fruti/Mirinda/Pepsi/Coke)\r\n" + //
                        "\r\n" + //
                        "SWEET:\tHobbattu/Holige/Poli(Dhal/Coconut) (or) \nJamoon (or) \nCarrot Halwa (or) Kashi Halwa (or)\n Chakkara Pongali (or) Payasam\n (or) Laddu \n(or) Badusha (or) Rasgulla \n(or) Ramalai (or) Jangiri\r\n" + //
                        "VEG STARTER:\tMini Samosa (or) Babycorn Manchurian (or)\n Gobi Manchurian (or)\n Veg Roll (or) \nCheese balls\r\n" + //
                        "INDIAN BREAD:\tPoori (or) Methi poori (or) \nPalak poori \n(or) Battura\n (or) \nRumali roti (or)\n Masala roti (or) Chapathi (or) \nMethi/ Palak / \nGhee chapathi\r\n" + //
                        "VEG GRAVY:\tPaneer curry (or) Guttonkaya curry \n(or) Channa masala\n (or) Mixed veg korma\n (or) Aloo saagu\n (or) Green peas masala\r\n" + //
                        "FLAVOURED RICE:\tVeg Biriyani (or) Veg Pulav (or) Peas Pulav\n (or) Tamrind Pulihora\n (or) Lemon / Jeera/ Ghee / Fried rice\r\n" + //
                        "+Raitha (or) Kurma (or) \nChutney (or) Ketchup\r\n" + //
                        "WHITE RICE:+\tSambar & Rasam (or) Andhra pappu & Sambar\n (or) Rasam & Andhra pappu (or)\n Dhal fry (or) Dhal makhani\r\n" + //
                        "DRY VEG:\tBhendi fry (or) Brinjal fry \n(or) Aloo fry (or)\n Beans fry\n (or) Carrot+Beetroot fry (or) Yam fry\r\n" + //
                        "BHAJI / BONDA / VADA\tMasala Vada (or)\n Chilli Bajji (or) Mysore bonda\n (or) Brinjal bajji (or) Aloo bonda\r\n" + //
                        "CURD ITEM:\tCurd (or) Curd rice (or)\n Buttermilk (or) Curd wada\r\n" + //
                        "EXTRAS :\tSalt, Papad, Pickle(Mango/Lemon), Ghee & Salad (or) Podi \n(or) Kosambri (or)\n Kharam chutney\r\n" + //
                        "ICE CREAM :\tVanilla (or) Chocolate (or) Butterscotch\r\n" + //
                        "COUNT:       PRICE:\n" + //
                        "30 People:   RS.12000 \n" + //
                        "50 People:   RS.16500\n" + //
                        "70 People    RS.21000\n" + //
                        "100 People:   RS.29000\n" + //
                        ""));
        maid.add(new catererModel("Raju caters ","PUNE","6 yrs", "7875677527","CatersImages/caters4.jpeg","CatersImages/overview10.jpeg","CatersImages/overview11.jpeg","CatersImages/overview12.jpeg"," WELCOME DRINK :\tLemon mint (or) Lemon ginger (or) \nFruit moctail (or)/n"+//\n Soft drink :(Fruti/Mirinda/Pepsi/Coke)\r\n" + //
                        "(OR)\r\n" + //
                        "VEG SOUP:\tTomato soup (or) Babycorn soup (or) Mixed veg soup\r\n" + //
                        "SWEET :\tGulab Jamoon (or) Dry Jamoon (or) Kala jamoon (or) \r\n"+"Gaajar ka Halwa (or) Jalebi (or) Bombay Halwa (or) Besan ka Laddu (or)\r\n"+" Mung Dal Halwa\n (or) Boondi (or) Milk kheer\n (or) Semiya kheer (or) Sabudana kheer (or)\r\n"+" Jack fruit kheer (or)\n Rava kheer\r\n" + //
                        "VEG STARTER:\tGobi Manchurian (or) Gobi chilli (or) Gobi 65 (or) \r\nBaby Corn Manchurian (or) \nBaby corn chilli (or)/n"+" Hakka Noodles (or) Vegetable Manchurian \n(or) Mushroom Manchoorian (or) \nHara bhara kebab\r\n"+" (or) Paneer chilli\n (or) Paneer Pakora (or)\n Aloo kebab (or) \r\n"+"Aloo Tikki (or) Mini samosa\n (or) Veg Roll\n (or) Schezwan Roll\r\n" + //
                        "INDIAN BREAD:\tPoori (or) Methi poori (or) \nPalak poori (or) Battura (or) \r\nRumali roti \n(or) Masala roti (or) Chapathi\r\n"+
                        "VEG GRAVY:\tPaneer butter masala (or) Kadai paneer \n(or) Paneer bahari (or) \r\n"+"Mix Veg curry (or) \nPaneer Tikka Masala (or) eer \n(or) Matar Paneer\r\n" + 
                        "FLAVOURED RICE:\tVeg Biriyani (or) Veg Pulav (or) Peas Pulav\n (or) Puliogare (or)\n Lemon / Jeera/ Ghee / Fried rice\r\n" + //
                        "+Raitha (or) Kurma (or) Chutney (or) Ketchup\r\n" + //
                        "RICE & DHAL\tWHITE RICE\r\n" + //
                        "+Dhal fry (or) Dhal makhni (or) Rajma\n (or) Dhal palak (or) Dhal Tadka (or) \nMethi dhal\n (or) Tomato dhal\r\n" + //
                        "DRY VEG:\tAloo Mutter Dry (or) Aloo Gobi Dry (or) \nAloo Jeera Dry (or) Mixed Veg Dry\n (or) Bhendi Dry \r\n"+"(or) Beans Dry (or) Cabbage Dry\r\n" + //
                        "CURD ITEM:\tCurd (or) Curd rice (or) Dahi bada \n(or) Buttermilk\r\n" + //
                        "SALAD :\tGreen Salad (or) Finger Salad\r\n" + //
                        "ICE CREAM:\tVanilla (or) Chocolate (or) Butterscotch\r\n" + //
                        "EXTRAS:\tSalt, Papad & Pickle\r\n" + //
                        "COUNT:        PRICE:\n" + //
                        "30 People:    RS.12600\n" + //
                        "50 People:    RS.16500\n" + //
                        "70 People:    RS.21500\n" + //
                        "100 People:   RS.29000\n" + //
                        ""));
        maid.add(new catererModel("Elite Eats Catering ","SOLAPUR","4yrs", "93255834312 ","CatersImages/caters5.jpeg","CatersImages/overview13.jpeg","CatersImages/overview14.jpeg","CatersImages/overview15.jpeg"," SWEET :\tJamoon (or) Carrot Halwa (or)\n Kashi Halwa (or) Chakkara Pongali (or) Payasam\r\n" + //
                        "INDIAN BREAD:\t2 Poori (or) 1 Chapathi  (Pre prepared)\r\n" + //
                        "VEG GRAVY:\tAloo curry (or) Mix veg curry (or)\n Channa masala (or) Green peas masala\r\n" + //
                        "FLAVOURED RICE:\tGhee Rice (or) Jeera rice (or) Fried Rice (or) \nMenthe bath (or) /r"+"Tomato Bath \n(or) Vangi Bath (or) \nVeg Biriyani (or)Veg Pulav\n (or) Peas Pulav (or) Palak pulav\r\n" + //
                        "+Raitha\r\n" + //
                        "RICE & SAMBAR\tWHITE RICE\r\n" + //
                        "+ Andhra pappu (or) Sambar (or) Rasam (or) Dhal fry (or) Dhal tadka\r\n" + //
                        "EXTRAS:\tSalt, Papad, & Pickle\r\n" + //
                        "COUNT:       PRICE:\n" + //
                        "50 People:   RS.9500\n" + //
                        "60 People:   RS.11000\n" + //
                        "70 People:   RS.12500\n" + //
                        "80 People:   RS.14000\n" + //
                        "90 People:   RS.15500\n" + //
                        "100 People:  RS.17000\n" + //
                        ""));
        maid.add(new catererModel("Manakar caters ","HINJEWADI, PUNE","3 yrs", "78238227901","CatersImages/caters6-1.jpg","CatersImages/overview16.jpeg","CatersImages/overview17.jpeg","CatersImages/overview18.jpeg","WELCOME DRINK:\tLemon mint (or) Lemon ginger (or) \nFruit moctail (or) Soft drinks (Fruti/Mirinda/Pepsi/Coke)\r\n" + //
                        "(OR)\r\n" + //
                        "SWEET:\tHobbattu/Holige/Poli(Dhal/Coconut) (or) Jamoon (or)\n Carrot Halwa (or) Kashi /r/n"+"Halwa (or) Chakkara Pongali\n (or) Payasam (or) Laddu \n(or) Badusha (or) Rasgulla (or) \nRamalai \n(or) Jangiri\r\n" + //
                        "VEG STARTER:\tMini Samosa (or) Babycorn Manchurian (or) \nGobi Manchurian (or) Veg Roll (or) Cheese balls\r\n" + //
                        "INDIAN BREAD:\tPoori (or) Methi poori (or) Palak poori (or) Battura \n(or) Rumali roti (or) \nMasala roti (or) Chapathi \n(or) Methi/ Palak / Ghee chapathi\r\n" + //
                        "VEG GRAVY:\tPaneer curry (or) Guttonkaya curry (or)\n Channa masala (or)\n Mixed veg korma (or)\n Aloo saagu\n (or) Green peas masala\r\n" + //
                        "FLAVOURED RICE :\tVeg Biriyani (or) Veg Pulav (or) Peas Pulav\n (or)\n Tamrind Pulihora (or)\n Lemon / Jeera/ Ghee / \nFried rice\r\n" + //
                        "+Raitha (or) Kurma (or) Chutney (or) Ketchup\r\n" + //
                        "WHITE RICE: +\tSambar & Rasam (or) Andhra pappu & Sambar (or)\n Rasam & Andhra pappu \n(or) Dhal fry (or)\n Dhal makhani\r\n" + //
                        "DRY VEG :\tBhendi fry (or) Brinjal fry (or)\n Aloo fry (or) Beans fry (or)\n Carrot+Beetroot fry (or) Yam fry\r\n" + //
                        "BHAJI / BONDA / VADA\tMasala Vada (or) Chilli Bajji (or)\n Mysore bonda \n(or) Brinjal bajji (or)\n Aloo bonda\r\n" + //
                        "CURD ITEM :\tCurd (or) Curd rice (or) Buttermilk (or) Curd wada\r\n" + //
                        "EXTRAS :\tSalt, Papad, Pickle(Mango/Lemon), \nGhee & Salad (or) Podi (or)\n Kosambri(or)\n Kharam chutney\r\n" + //
                        "ICE CREAM :\tVanilla (or) Chocolate (or) Butterscotch\r\n" + //
                        "COUNT:         PRICE:\n" + //
                        "30 People:     RS.12600\n" + //
                        "50 People:     RS.16500\n" + //
                        "70 People:     RS.21000\n" + //
                        "100 People:    RS.29000\n" + //
                        ""));
        maid.add(new catererModel("Culinary  Catering","PIMPARI PUNE","3 yrs", "9975166466","CatersImages/caters7.jpg","CatersImages/overview19.jpeg","CatersImages/overview20.jpeg","CatersImages/overview21.jpeg","WELCOME DRINK :\tLemon mint (or) Lemon ginger (or) Fruit moctail (or) Soft drinks (Fruti/Mirinda/Pepsi/Coke)\r\n" + //
                        "(OR)\r\n" + //
                        "SWEET :\tHobbattu/Holige/Poli(Dhal/Coconut) (or) Jamoon (or) Carrot Halwa (or) Kashi Halwa (or) Chakkara Pongali (or) Payasam (or) Laddu (or) Badusha (or) Rasgulla (or) Ramalai (or) Jangiri\r\n" + //
                        "VEG STARTER :\tMini Samosa (or) Babycorn Manchurian (or) Gobi Manchurian (or) Veg Roll (or) Cheese balls\r\n" + //
                        "INDIAN BREAD :\tPoori (or) Methi poori (or) Palak poori (or) Battura (or) Rumali roti (or) Masala roti (or) Chapathi (or) Methi/ Palak / Ghee chapathi\r\n" + //
                        "VEG GRAVY :\tPaneer curry (or) Guttonkaya curry (or) Channa masala (or) Mixed veg korma (or) Aloo saagu (or) Green peas masala\r\n" + //
                        "FLAVOURED RICE :\tVeg Biriyani (or) Veg Pulav (or) Peas Pulav (or) Tamrind Pulihora (or) Lemon / Jeera/ Ghee / Fried rice\r\n" + //
                        "+Raitha (or) Kurma (or) Chutney (or) Ketchup\r\n" + //
                        "WHITE RICE+\tSambar & Rasam (or) Andhra pappu & Sambar (or) Rasam & Andhra pappu (or) Dhal fry (or) Dhal makhani\r\n" + //
                        "DRY VEG :\tBhendi fry (or) Brinjal fry (or) Aloo fry (or) Beans fry (or) Carrot+Beetroot fry (or) Yam fry\r\n" + //
                        "BHAJI / BONDA / VADA\tMasala Vada (or) Chilli Bajji (or) Mysore bonda (or) Brinjal bajji (or) Aloo bonda\r\n" + //
                        "CURD ITEM :\tCurd (or) Curd rice (or) Buttermilk (or) Curd wada\r\n" + //
                        "EXTRAS\tSalt, Papad, Pickle(Mango/Lemon), Ghee & Salad (or) Podi (or) Kosambri (or) Kharam chutney\r\n" + //
                        "ICE CREAM :\tVanilla (or) Chocolate (or) Butterscotch\r\n" + //
                        "COUNT:        PRICE:\n" + //
                        "30 People:   RS.126000" + //
                        "50 People:   RS.16500" + //
                        "70 People:   RS.21500" + //
                        "100 People:  RS.29000" + //
                        ""));
    //     maid.add(new madeInfoModel("TechTaste Catering","NASHIK","1 yrs", "veg / non veg","CatersImages/caters8.jpeg","CatersImages/overview22.jpeg","CatersImages/overview24.jpeg","CatersImages/overview25.jpeg"," "));
    //     maid.add(new madeInfoModel("Modern Morsels Catering ","KOTHARUD PUNE","7 yrs", "veg / non veg","CatersImages/caters9.jpg","CatersImages/overview26.jpeg","CatersImages/overview27.jpeg","CatersImages/overview28.jpeg",""));
    //    // maid.add(new madeInfoModel("Culinary Legacy Catering ","kHARADI HADAPSAR","3 yrs", "veg / non veg","CatersImages/caters10.jpeg","CatersImages/overview29.jpeg","CatersImages/overview30.jpeg","CatersImages/overview31.jpeg"));
        
        VBox main = new VBox(30);

        for (int i = 0; i < maid.size(); i++) {
            main.getChildren().add(card(maid.get(i)));
        }

        ScrollPane scrollPane = new ScrollPane();
        scrollPane.setContent(main);

        // Make the ScrollPane scrollable in the vertical direction
        scrollPane.setFitToWidth(true);
        scrollPane.setFitToHeight(true);
        scrollPane.setVbarPolicy(ScrollPane.ScrollBarPolicy.NEVER);
        scrollPane.setHbarPolicy(ScrollPane.ScrollBarPolicy.NEVER);

        Label lb = new Label("List of Catering:");
        lb.setFont(new Font(30));
        lb.setStyle("-fx-font-weight:bold;");
        lb.setLayoutX(0);
        lb.setLayoutY(20);

        scrollPane.setLayoutX(20);
        scrollPane.setLayoutY(70);
        scrollPane.setPrefHeight(900);
        scrollPane.setPrefWidth(800);
        //scrollPane.setStyle("-fx-background-color: ");
        BackgroundFill mp =new BackgroundFill(Color.BLUE, null, null);
        scrollPane.setBackground(new Background(mp));
        scrollPane.setStyle("-fx-scrollbar-thumb: transparent");

        
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
        pane.setStyle(" -fx-background-color: linear-gradient(from 50% 0% to 200% 50%,#FFCC33, #ffffff);");
        lb.setLayoutX(50);
        lb.setLayoutY(10);
        pane.getChildren().addAll(backButton,lb, scrollPane);

        Scene scene = new Scene(pane, 2000, 1000);
        stage.setScene(scene);
        stage.show();


}
}

