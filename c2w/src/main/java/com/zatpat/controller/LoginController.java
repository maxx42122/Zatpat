// package com.zatpat.controller;

// import java.util.concurrent.ExecutionException;

// import javafx.scene.Scene;

// public class LoginController {
    
//     private void handleLogin(String username, String password) {
//         try {

//             if (dataService.authenticateUser(username, password)) {
//                 key = username;
//                 initUserScene(); // Initializeuser scene
//                 primaryStage.setScene(userScene);

//                 primaryStage.setTitle("User Dashboard");
//             } else {
//                 System.out.println("Invalid credentials");
//                 key = null;
//             }
//         } catch (ExecutionException | InterruptedException ex) {
//             ex.printStackTrace();
//         }
//     }

//     private void showSignupScene() {

//         SignupController signupController = new SignupController(this);
//         Scene signupScene = signupController.createSignupScene(primaryStage);

//         primaryStage.setScene(signupScene);
//         primaryStage.setTitle("Signup");
//         primaryStage.show();
//     }

//     private void handleLogout() {
//         primaryStage.setScene(loginScene);
//         primaryStage.setTitle("Login");
//     }

// }
