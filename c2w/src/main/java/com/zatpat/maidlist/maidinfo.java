package com.zatpat.maidlist;

import java.net.URI;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;

import com.zatpat.Home.Homepage;
import com.zatpat.firebase.FirebaseInitializemaid;
import com.zatpat.logincontroller.Frontpage;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextField;
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
import javafx.stage.Stage;
import javafx.stage.Popup;
import java.awt.Desktop;
;

public class maidinfo {

      
    public static Stage stage;
   //public TextField ptr;
    Popup popup;
    public static String str1;
    // maidinfo(Stage stage){
    //     this.stage=stage;
    // }
    public void totalrate(String str1){
        maidinfo.str1=str1;
        
    }

    
   

 
    public void conmaid(Stage stage){
        maidinfo.stage=stage;
        System.out.println("888888888888"+stage);
    }


    HBox card(madeInfoModel obj) {
        HBox card = new HBox(30);
        
        // String image = obj.getImg();
        // System.out.println("55555555555"+image);
        //System.out.println(obj.getImg());
         Image ig1 = new Image(obj.getImg(), 130, 130, false, false);
         ImageView iv1 = new ImageView(ig1);

        card.setPrefWidth(400); // Set preferred width

        //////////////////////name hb
        Label nameLabel = new Label("Name:");
        nameLabel.setFont(Font.font("Times New Roman", FontWeight.BOLD, 40));
        Label namLabel = new Label(obj.getName());
        namLabel.setFont(Font.font("Times New Roman", FontWeight.BOLD, 40));
        HBox namehb = new HBox(10, nameLabel, namLabel);

        Label ageLabel = new Label("Age:");
        ageLabel.setFont(Font.font("Times New Roman", FontWeight.BOLD, 35));
        Label agLabel = new Label(obj.getAge());
        agLabel.setFont(Font.font("Times New Roman", FontWeight.BOLD, 35));
        HBox agehb = new HBox(10, ageLabel,agLabel);
        
        HBox hb1= new HBox(90, namehb, agehb);


        //////////////////////////////location hb

        Label locatioLabel = new Label("Location:");
        locatioLabel.setFont(Font.font("Times New Roman", FontWeight.BOLD, 30));
        Label locLabel = new Label(obj.getLocation());
        locLabel.setFont(Font.font("Times New Roman", FontWeight.BOLD, 30));
        HBox lochb2 = new HBox(10, locatioLabel,locLabel);

        
        Label experiancLabel = new Label("Exeperiance:");
        experiancLabel.setFont(Font.font("Times New Roman", FontWeight.BOLD, 30));
        Label exLabel = new Label(obj.getExperiance());
        exLabel.setFont(Font.font("Times New Roman", FontWeight.BOLD, 30));
        HBox experiancehb = new HBox(10, experiancLabel, exLabel);

        HBox hb2 = new HBox(70,lochb2,experiancehb );



       
        Label vegLabel = new Label(obj.getType());
        vegLabel.setFont(Font.font("Times New Roman", FontWeight.BOLD, 25));

        Label timeLabel = new Label("Time:");
        timeLabel.setFont(Font.font("Times New Roman", FontWeight.BOLD, 25));
        HBox hb3 = new HBox(10,vegLabel);

      
        VBox vb1 = new VBox(7, hb1, hb2, hb3);

        card.getChildren().addAll(iv1, vb1);//iv1

        card.setStyle(
                " -fx-background-color:  linear-gradient(from 50% 0% to 300% 0%, #FFCC33, #ffffff);" + //   Light grey background color
                        "-fx-padding: 10; " + // Padding inside the HBox
                        "-fx-border-color: #333; " + // Dark grey border color
                        "-fx-border-width: 2; " + // Border width
                        "-fx-border-radius: 5; " + // Rounded corners for border
                        "-fx-background-radius: 5;"
                         // Rounded corners for background
        );

        // List<Popup> list = new ArrayList<>();
        // card.setOnMouseClicked(event -> {
        //     // list.clear();
        //     System.out.println(list.size());
        //     popup = new Popup();
        //     // Popup popup = new Popup();
        //     // popup.getContent().clear();

        //     System.out.println(popup.getContent().size());
        //     VBox popupLabel = new VBox(new maidinfo().card2(obj));
        //     popup.getContent().addAll(popupLabel);
        //     popup.show(card, event.getScreenX(), event.getScreenY());

        //     // card.setOnMousePressed(event1->{
        //     // popup.getContent().clear();

        //     // });
        //     // popup.setOnCloseRequest(event1->{
        //     // popup.getContent().clear();
        //     // });

        // });

        Popup popup = new Popup();
    

    // card.setOnMouseClicked(event -> {
    // popup.getContent().clear();
    // VBox popupContent = new VBox(new maidinfo().card2(obj)); // Assuming card2() returns Node(s) to display
    // popup.getContent().addAll(popupContent);
    // popup.show(card, event.getScreenX(), event.getScreenY());
    
    // });
    Image ig2 = new Image("cookpage/crossicon.png",30,30, false, false);
    ImageView iv2 = new ImageView(ig2);
    Button closeButton = new Button("",iv2);
    closeButton.setStyle("-fx-background-color: transparent");
    closeButton.setLayoutX(560);
        
    card.addEventFilter(MouseEvent.MOUSE_CLICKED, event -> {
        // Show the popup
        popup.getContent().clear();
        VBox popupContent = new VBox(new maidinfo().card2(obj)); // Assuming card2() returns Node(s) to display
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

    public VBox card2(madeInfoModel obj1) {

        

        VBox card2 = new VBox(30);
        card2.setPrefWidth(800);
        card2.setPrefHeight(800);

        Image ig1 = new Image(obj1.getImg(), 150, 200, false, false);
        ImageView iv1 = new ImageView(ig1);

        Label dishLabel = new Label("Three best dishes:");
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
        
        Label ageLabel = new Label("Age:");
        ageLabel.setFont(Font.font("Times New Roman", FontWeight.BOLD, 23));
        Label agLabel = new Label(obj1.getAge());
        agLabel.setFont(Font.font("Times New Roman", FontWeight.BOLD, 23));
        HBox agehb = new HBox(10, ageLabel,agLabel);
        
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
        
        
        
        
        Label vegLabel = new Label(obj1.getType());
        vegLabel.setFont(Font.font("Times New Roman", FontWeight.BOLD, 23));  
        
        
        Label languageLabel = new Label("Language:");
        languageLabel.setFont(Font.font("Times New Roman", FontWeight.BOLD, 23));
         
        Label langLabel = new Label(obj1.getLanguage());
        langLabel.setFont(Font.font("Times New Roman", FontWeight.BOLD, 23));
        
        
        HBox langhb3 = new HBox(10,languageLabel,langLabel);
        
        
        VBox vb1 = new VBox(7, namehb,agehb,lochb2,experiancehb,vegLabel,langhb3);
        HBox hb1Box = new HBox(10,iv1,vb1);//iv1

        Label oldexLabel = new Label("aboutme");
        oldexLabel.setFont(Font.font("Times New Roman", FontWeight.BOLD, 23));
         
        Text st= new Text(obj1.getAbout());
        st.setFont(Font.font("Times New Roman", FontWeight.BOLD, 18));

        VBox vb3Box = new VBox(10,oldexLabel,st);


        VBox maidprofile = new VBox(7, hb1Box,besthb,vb3Box);        
        Button select_maid = new Button("Select");
        select_maid.setLayoutY(400);
        select_maid.setMaxWidth(550);
        select_maid.setStyle("-fx-background-color : #C8D3E1;-fx-background-radius :20; -fx-border-radius :10; -fx-padding:10");
        select_maid.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                System.out.println("click herreeeeee");
                pay objPay=new pay(stage );

                objPay.rate(str1);
              
               
            }
            
        });

       
        
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


    public void initializemaidlist()     {
          FirebaseInitializemaid firebaseInitialize = new FirebaseInitializemaid();
          List<madeInfoModel> maid = new ArrayList<>();
        try {
         maid = firebaseInitialize.getMaidList();
        } catch (ExecutionException e) {
            
            e.printStackTrace();
        } catch (InterruptedException e) {
                        e.printStackTrace();
        }

       
    


       
       // List<madeInfoModel> maid = new ArrayList<>();
        // maid.add(new madeInfoModel("sakshi gade ","23","Ambegoan.bk","3 yrs", "veg / non veg","Marathi/Hindi","cookpage/a2.jpg","cookpage/d1.png","cookpage/d2.png","cookpage/d3.png","Cooking has always been my passion. I love experimenting\r\n"+" with new recipes and seeing the family enjoy my food. \r\n"+"The long hours can be tiring, but the smiles make \r\n"+"it worth it. Sometimes, I miss having a break, \r\n"+"but it's part of the job. I take pride in keeping spotless."));
        // maid.add(new madeInfoModel("divya gade ","25","vadgoan","5 yrs","veg ", "Marathi/Hindi","cookpage/a3.jpg","cookpage/d6.png","cookpage/d5.png","cookpage/d4.png","\"Being a cook is fulfilling. I get to create delicious\r\n"+
        //                 " meals and learn different cuisines. The family appreciates my efforts,\r\n" + 
        //                                                 " which motivates me. However, managing time between cooking\r\n" + " and cleaning can be challenging. I always strive for perfection in every dish."));
        //  maid.add(new madeInfoModel("pranali patil ","28","Narhe","10 yrs" ," non veg","Marathi/Hindi", "cookpage/a4.jpg","cookpage/d7.png","cookpage/d8.png","cookpage/d9.png","Cooking has always been my passion. I love experimenting\r\n"+" with new recipes and seeing the family enjoy my food. \r\n"+"The long hours can be tiring, but the smiles make \r\n"+"it worth it. Sometimes, I miss having a break, \r\n"+"but it's part of the job. I take pride in keeping spotless." ));
        //  maid.add(new madeInfoModel("priya dhamdhere ","26","Karvenagar","8 yrs" ,"veg / non veg","Marathi/Hindi", "cookpage/a5.jpg","cookpage/d1.png","cookpage/d11.png","cookpage/d10.png","Cooking has always been my passion. I love experimenting\r\n"+" with new recipes and seeing the family enjoy my food. \r\n"+"The long hours can be tiring, but the smiles make \r\n"+"it worth it. Sometimes, I miss having a break, \r\n"+"but it's part of the job. I take pride in keeping spotless." ));
        //  maid.add(new madeInfoModel("vaishnavi gade ","25","Ambegoan.bk","9 yrs" ,"veg ","Marathi/Hindi", "cookpage/a6.jpg","cookpage/d5.png","cookpage/d1.png","cookpage/d8.png","Cooking has always been my passion. I love experimenting\r\n"+" with new recipes and seeing the family enjoy my food. \r\n"+"The long hours can be tiring, but the smiles make \r\n"+"it worth it. Sometimes, I miss having a break, \r\n"+"but it's part of the job. I take pride in keeping spotless." ));
        //  maid.add(new madeInfoModel("sanu gade ","29","pune","13 yrs" ,"veg ","Marathi/Hindi", "cookpage/a7.jpg","cookpage/d7.png","cookpage/d6.png","cookpage/d2.png" ,"Cooking has always been my passion. I love experimenting\r\n"+" with new recipes and seeing the family enjoy my food. \r\n"+"The long hours can be tiring, but the smiles make \r\n"+"it worth it. Sometimes, I miss having a break, \r\n"+"but it's part of the job. I take pride in keeping spotless."));
        //  maid.add(new madeInfoModel("sangita gade ","35","katraj","19 yrs"," non veg","Marathi/Hindi", "cookpage/a8.jpg","cookpage/d3.png","cookpage/d5.png","cookpage/d9.png","Cooking has always been my passion. I love experimenting\r\n"+" with new recipes and seeing the family enjoy my food. \r\n"+"The long hours can be tiring, but the smiles make \r\n"+"it worth it. Sometimes, I miss having a break, \r\n"+"but it's part of the job. I take pride in keeping spotless."));
        //  maid.add(new madeInfoModel("anjali gade ","38","Varaje","18 yrs" ," non veg","Marathi/Hindi", "cookpage/a17.jpeg","cookpage/d4.png","cookpage/d6.png","cookpage/d10.png","Cooking has always been my passion. I love experimenting\r\n"+" with new recipes and seeing the family enjoy my food. \r\n"+"The long hours can be tiring, but the smiles make \r\n"+"it worth it. Sometimes, I miss having a break, \r\n"+"but it's part of the job. I take pride in keeping spotless." ));
        //  maid.add(new madeInfoModel("shilpa gade ","28","Dhayari","12 yrs" ,"veg / non veg","Marathi/Hindi", "cookpage/a9.jpg","cookpage/d3.png","cookpage/d5.png","cookpage/d1.png","Cooking has always been my passion. I love experimenting\r\n"+" with new recipes and seeing the family enjoy my food. \r\n"+"The long hours can be tiring, but the smiles make \r\n"+"it worth it. Sometimes, I miss having a break, \r\n"+"but it's part of the job. I take pride in keeping spotless."));
        //  maid.add(new madeInfoModel("savita gade ","39","Kondhwa","22 yrs" ,"veg","Marathi/Hindi", "cookpage/a10.jpeg","cookpage/d3.png","cookpage/d6.png","cookpage/d11.png","Cooking has always been my passion. I love experimenting\r\n"+" with new recipes and seeing the family enjoy my food. \r\n"+"The long hours can be tiring, but the smiles make \r\n"+"it worth it. Sometimes, I miss having a break, \r\n"+"but it's part of the job. I take pride in keeping spotless." ));
        //  maid.add(new madeInfoModel("kavita gade ","33","Upper Depo","13 yrs" ,"veg / non veg", "Marathi/Hindi","cookpage/a11.jpeg","cookpage/d1.png","cookpage/d1.png","cookpage/d1.png","Cooking has always been my passion. I love experimenting\r\n"+" with new recipes and seeing the family enjoy my food. \r\n"+"The long hours can be tiring, but the smiles make \r\n"+"it worth it. Sometimes, I miss having a break, \r\n"+"but it's part of the job. I take pride in keeping spotless." ));
        //  maid.add(new madeInfoModel("ruchika gade ","34","Janata","14 yrs"," non veg","Marathi/Hindi", "cookpage/a12.jpeg","cookpage/d1.png","cookpage/d1.png","cookpage/d1.png","Cooking has always been my passion. I love experimenting\r\n"+" with new recipes and seeing the family enjoy my food. \r\n"+"The long hours can be tiring, but the smiles make \r\n"+"it worth it. Sometimes, I miss having a break, \r\n"+"but it's part of the job. I take pride in keeping spotless."));
        //  maid.add(new madeInfoModel("sakshi gade ","23","Ambegoan.bk","3 yrs", "veg / non veg","Marathi/Hindi", "cookpage/a2.jpg","cookpage/d1.png","cookpage/d1.png","cookpage/d1.png","Cooking has always been my passion. I love experimenting\r\n"+" with new recipes and seeing the family enjoy my food. \r\n"+"The long hours can be tiring, but the smiles make \r\n"+"it worth it. Sometimes, I miss having a break, \r\n"+"but it's part of the job. I take pride in keeping spotless."));
        //  maid.add(new madeInfoModel("divya gade ","25","vadgoan","5 yrs","veg ","Marathi/Hindi", "cookpage/a3.jpg","cookpage/d1.png","cookpage/d1.png","cookpage/d1.png","Cooking has always been my passion. I love experimenting\r\n"+" with new recipes and seeing the family enjoy my food. \r\n"+"The long hours can be tiring, but the smiles make \r\n"+"it worth it. Sometimes, I miss having a break, \r\n"+"but it's part of the job. I take pride in keeping spotless."));
        //  maid.add(new madeInfoModel("pranali chaskar patil ","28","Narhe","10 yrs" ," non veg","Marathi/Hindi", "cookpage/a4.jpg" ,"cookpage/d1.png","cookpage/d1.png","cookpage/d1.png","Cooking has always been my passion. I love experimenting\r\n"+" with new recipes and seeing the family enjoy my food. \r\n"+"The long hours can be tiring, but the smiles make \r\n"+"it worth it. Sometimes, I miss having a break, \r\n"+"but it's part of the job. I take pride in keeping spotless."));
        //  maid.add(new madeInfoModel("priya gade ","26","Karvenagar","8 yrs" ,"veg / non veg","Marathi/Hindi", "cookpage/a5.jpg" ,"cookpage/d1.png","cookpage/d1.png","cookpage/d1.png","Cooking has always been my passion. I love experimenting\r\n"+" with new recipes and seeing the family enjoy my food. \r\n"+"The long hours can be tiring, but the smiles make \r\n"+"it worth it. Sometimes, I miss having a break, \r\n"+"but it's part of the job. I take pride in keeping spotless."));
        //  maid.add(new madeInfoModel("vaishnavi gade ","25","Ambegoan.bk","9 yrs" ,"veg ","Marathi/Hindi", "cookpage/a6.jpg" ,"cookpage/d1.png","cookpage/d1.png","cookpage/d1.png","Cooking has always been my passion. I love experimenting\r\n"+" with new recipes and seeing the family enjoy my food. \r\n"+"The long hours can be tiring, but the smiles make \r\n"+"it worth it. Sometimes, I miss having a break, \r\n"+"but it's part of the job. I take pride in keeping spotless."));
        //  maid.add(new madeInfoModel("sanu gade ","29","pune","13 yrs" ,"veg ","Marathi/Hindi", "cookpage/a7.jpg","cookpage/d1.png","cookpage/d1.png","cookpage/d1.png","Cooking has always been my passion. I love experimenting\r\n"+" with new recipes and seeing the family enjoy my food. \r\n"+"The long hours can be tiring, but the smiles make \r\n"+"it worth it. Sometimes, I miss having a break, \r\n"+"but it's part of the job. I take pride in keeping spotless." ));
        //  maid.add(new madeInfoModel("sangita gade ","35","katraj","19 yrs"," non veg","Marathi/Hindi", "cookpage/a8.jpg","cookpage/d1.png","cookpage/d1.png","cookpage/d1.png","Cooking has always been my passion. I love experimenting\r\n"+" with new recipes and seeing the family enjoy my food. \r\n"+"The long hours can be tiring, but the smiles make \r\n"+"it worth it. Sometimes, I miss having a break, \r\n"+"but it's part of the job. I take pride in keeping spotless."));
        //  maid.add(new madeInfoModel("anjali gade ","38","Varaje","18 yrs" ," non veg","Marathi/Hindi", "cookpage/a17.jpeg","cookpage/d1.png","cookpage/d1.png","cookpage/d1.png","Cooking has always been my passion. I love experimenting\r\n"+" with new recipes and seeing the family enjoy my food. \r\n"+"The long hours can be tiring, but the smiles make \r\n"+"it worth it. Sometimes, I miss having a break, \r\n"+"but it's part of the job. I take pride in keeping spotless." ));
        //  maid.add(new madeInfoModel("shilpa gade ","28","Dhayari","12 yrs" ,"veg / non veg","Marathi/Hindi", "cookpage/a9.jpg","cookpage/d1.png","cookpage/d1.png","cookpage/d1.png","Cooking has always been my passion. I love experimenting\r\n"+" with new recipes and seeing the family enjoy my food. \r\n"+"The long hours can be tiring, but the smiles make \r\n"+"it worth it. Sometimes, I miss having a break, \r\n"+"but it's part of the job. I take pride in keeping spotless."));
        //  maid.add(new madeInfoModel("savita gade ","39","Kondhwa","22 yrs" ,"veg","Marathi/Hindi", "cookpage/a10.jpeg" ,"cookpage/d1.png","cookpage/d1.png","cookpage/d1.png","Cooking has always been my passion. I love experimenting\r\n"+" with new recipes and seeing the family enjoy my food. \r\n"+"The long hours can be tiring, but the smiles make \r\n"+"it worth it. Sometimes, I miss having a break, \r\n"+"but it's part of the job. I take pride in keeping spotless."));
        //  maid.add(new madeInfoModel("kavita gade ","33","Upper Depo","13 yrs" ,"veg / non veg","Marathi/Hindi", "cookpage/a11.jpeg","cookpage/d1.png","cookpage/d1.png","cookpage/d1.png","Cooking has always been my passion. I love experimenting\r\n"+" with new recipes and seeing the family enjoy my food. \r\n"+"The long hours can be tiring, but the smiles make \r\n"+"it worth it. Sometimes, I miss having a break, \r\n"+"but it's part of the job. I take pride in keeping spotless." ));

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

        Label lb = new Label("List of Maid:");
        lb.setFont(new Font(30));
        lb.setStyle("-fx-font-weight: bold;");
        lb.setLayoutX(20);
        lb.setLayoutY(20);

        scrollPane.setLayoutX(20);
        scrollPane.setLayoutY(70);
        scrollPane.setPrefHeight(900);
        scrollPane.setPrefWidth(1000);
        //scrollPane.setStyle("-fx-background-color: ");
        BackgroundFill mp =new BackgroundFill(Color.BLUE, null, null);
        scrollPane.setBackground(new Background(mp));
        scrollPane.setStyle("-fx-scrollbar-thumb: transparent");

        // pop up vbox on the right side
        Image ig1=new Image("cookpage/background.png", 600, 800, false, false);
        ImageView infoiv =new ImageView(ig1);
         VBox rightvBox = new VBox(infoiv); // Replace with
        
         rightvBox.setMaxWidth(400);
         rightvBox.setLayoutX(1180);
         rightvBox.setLayoutY(70);

         Text infoText =new Text(1190, 400,"A When hiring a maid, it’s important to conduct thorough checks to \r\n" +"ensure safety, reliability, and compatibility. Here are key aspects to consider:\r\n"
+"1. **Background Check**: Verify the maid’s identity, previous employment history,\r\n"+" and conduct a criminal background check if possible.\r\n"
+"2. **References**: Ask for and contact references from previous employers to get\r\n"+" insights into the maid's work ethic, reliability, and behavior.\r\n"
+"3. **Health Check**: Ensure the maid is in good health and free from contagious\r\n"+" diseases. A medical check-up might be necessary.\r\n"
+"4. **Skills and Experience**: Assess their skills and experience relevant to\r\n"+" your needs, such as cooking, cleaning, childcare, etc. A practical test can be useful.\r\n"
+"5. **Legal Documents**: Ensure they have the necessary legal documents and \r\n"+"work permits, especially if they are from another country.\r\n"
+"6. **Contract and Terms of Employment**: Clearly outline the terms of employment,\r\n"+" including working hours, salary, duties, holidays, and other conditions.\r\n"
+"7. **Trial Period**: Consider a trial period to observe their work performance\r\n"+" and how well they integrate into your household.\r\n"
+"8. **Personality and Compatibility**: It’s important that the maid’s personality \r\n"+"and values align with your family’s, as they \r\n"+"will be spending a significant amount of time in your home."
);

    
        Image insta =new Image("cookpage/insta2.png",30,30, false, false);
        ImageView instImageView =new ImageView(insta);
         
        Hyperlink link = new Hyperlink("Instagram",instImageView);
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



        Image whats =new Image("cookpage/whats.png",30,30, false, false);
        ImageView wtImageView =new ImageView(whats);

        Hyperlink link1 = new Hyperlink("Whatsapp",wtImageView);
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

        Image backImage=new Image("loginpages/back.png",45,45,false,false);
        ImageView iv1=new ImageView(backImage);

        Button backButton=new Button("",iv1);
        backButton.setStyle("-fx-background-radius :50; -fx-border-radius :50; -fx-padding:10");
        backButton.setStyle("-fx-background-color:transparent");
        backButton.setOnAction(new EventHandler<ActionEvent>() {

         @Override
         public void handle(ActionEvent event) {
            
            Homepage obj6=new Homepage(stage);
            obj6.initializehome();
         }
         
        });
        
        // for (int i = 0; i < maid.size(); i++) {
        // rightvBox.getChildren().add(card2(maid.get(i)));
        // }

        Pane pane = new Pane();
        pane.setStyle(" -fx-background-color: linear-gradient(from 50% 0% to 200% 50%,#FFCC33, #ffffff);");
        lb.setLayoutX(100);
        lb.setLayoutY(10);
        pane.getChildren().addAll(backButton,lb, scrollPane,rightvBox,infoText,link,link1);

        Scene scene = new Scene(pane, 2000, 1000);
        stage.setScene(scene);
        stage.show();
    }

}
