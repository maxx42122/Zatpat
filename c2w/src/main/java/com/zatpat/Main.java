package com.zatpat;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.ExecutionException;

import com.google.auth.oauth2.GoogleCredentials;
import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseOptions;
import com.zatpat.catrerlist.homepagecaters;
import com.zatpat.cleanerlist.cleanerinfo;
import com.zatpat.firebase.FirebaseInitializemaid;
import com.zatpat.logincontroller.Fromnavigation;
import com.zatpat.maidlist.madeInfoModel;

import javafx.application.Application;

public class Main {

    // static {
    //     try {
    //         if (FirebaseApp.getApps().isEmpty()) {
    //             FileInputStream serviceAccount = new FileInputStream("C:\\Users\\Lenovo\\java Project\\bytecoder\\c2w\\src\\main\\resources\\maid-provide-project-firebase-adminsdk-3ps2a-6c4a27851d.json");

    //             FirebaseOptions options = new FirebaseOptions.Builder()
    //                     .setCredentials(GoogleCredentials.fromStream(serviceAccount))
    //                     .setStorageBucket("gs://maid-provide-project.appspot.com") // Set your storage bucket name here
    //                     .build();

    //             FirebaseApp.initializeApp(options);
    //         }
    //     } catch (Exception e) {
    //         e.printStackTrace();
    //     }
    // }

    public static void main(String[] args) throws IOException, ExecutionException, InterruptedException {
        System.out.println("Hello world!");

        
         FirebaseInitializemaid firebaseInitialize = new FirebaseInitializemaid();
        List<madeInfoModel> maidList = firebaseInitialize.getMaidList();

        for (madeInfoModel maid : maidList) {
            System.out.println(maid.getImg());
        }

        
        Application.launch(Fromnavigation.class, args);
    }
}
