package com.zatpat.firebase;

//import java.awt.TextField;
//import java.io.File;
import java.io.FileInputStream;
//import java.io.FileNotFoundException;
import java.io.IOException;
//import java.net.URL;
//import java.util.ArrayList;
import java.util.HashMap;
//import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
//import java.util.concurrent.TimeUnit;

import com.google.api.core.ApiFuture;
//import com.google.api.core.ApiFuture;
import com.google.auth.oauth2.GoogleCredentials;
//import com.google.cloud.firestore.CollectionReference;
//import com.google.cloud.firestore.CollectionReference;
import com.google.cloud.firestore.DocumentReference;
import com.google.cloud.firestore.DocumentSnapshot;
//import com.google.cloud.firestore.DocumentSnapshot;
import com.google.cloud.firestore.Firestore;
//import com.google.cloud.firestore.QuerySnapshot;
//import com.google.cloud.firestore.QuerySnapshot;
import com.google.cloud.firestore.WriteResult;
import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseOptions;
import com.google.firebase.cloud.FirestoreClient;
//import com.google.firebase.cloud.StorageClient;
import com.zatpat.controller.modeluserlogin;
//import com.zatpat.maidlist.madeInfoModel;

public class FirebaseInitialize {
    private Firestore db;

    public FirebaseInitialize() {
        initialize();
        db = FirestoreClient.getFirestore();
    }

    public void initialize() {
        try {
            if (FirebaseApp.getApps().isEmpty()) {
                FileInputStream serviceAccount = new FileInputStream(
                        "D:\\bytecode1\\bytecoder\\c2w\\src\\main\\resources\\maid-provide-project-firebase-adminsdk-3ps2a-6c4a27851d.json");

                FirebaseOptions options = new FirebaseOptions.Builder()
                        .setCredentials(GoogleCredentials.fromStream(serviceAccount))
                        .setStorageBucket("maid-provide-project.appspot.com") // Set your storage bucket name here
                        .build();

                FirebaseApp.initializeApp(options);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Register user
    public void createuserlogin(modeluserlogin mobj) throws ExecutionException, InterruptedException {
        System.out.println("object addresss = " + mobj);
        System.out.println("I crateusernme");
        db = FirestoreClient.getFirestore();
        if (db == null) {
            System.err.println("Firestore instance is not initialized.");
            return;
        }
        System.out.println(mobj.getusername());
        System.out.println(mobj.getpassword());
        System.out.println(mobj.getemail());

        // Upload image and get URL

        // Prepare user data
        Map<String, Object> user = new HashMap<>();
        user.put("username", mobj.getusername());

        user.put("password", mobj.getpassword());
        user.put("email", mobj.getemail());
        user.put("img4", mobj.getImg4());

        // System.out.println(mobj.getusername());
        // System.out.println(mobj.getpassword());
        // System.out.println(mobj.getemail());

        // Store user data in Firestore
        DocumentReference docRef = db.collection("users").document(mobj.getusername());
        WriteResult result = docRef.set(user).get();
        System.out.println("Write result: " + result);
    }

    public boolean authenticateUser(String username, String password) throws ExecutionException, InterruptedException {

        DocumentSnapshot document = db.collection("users").document(username).get().get();
        if (document.exists()) {
            String storedPassword = document.getString("password");
            return password.equals(storedPassword);
        }
        return false;
    }

    public DocumentSnapshot getdata(String collection, String document)
            throws ExecutionException, InterruptedException {

        try {
            DocumentReference docRef = db.collection(collection).document(document);
            ApiFuture<DocumentSnapshot> future = docRef.get();
            return future.get();
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        }
    }

    // // Get list of maids
    // public List<madeInfoModel> getMaidList() throws ExecutionException,
    // InterruptedException {
    // List<madeInfoModel> maidList = new ArrayList<>();

    // CollectionReference users = db.collection("users");
    // ApiFuture<QuerySnapshot> querySnapshot = users.get();

    // for (DocumentSnapshot document : querySnapshot.get().getDocuments()) {
    // madeInfoModel maid = document.toObject(madeInfoModel.class);
    // maidList.add(maid);
    // }

    // return maidList;
    // }

    // public String uploadImg(File img, String name) {
    // StorageClient storageClient = StorageClient.getInstance();
    // try {
    // storageClient.bucket().create(name, new FileInputStream(img), "image/jpeg");
    // } catch (FileNotFoundException e) {
    // System.out.println("Error in uploading");
    // e.printStackTrace();

    // }

    // // Get the image URL
    // URL signedUrl = storageClient.bucket().get(name).signUrl(14, TimeUnit.DAYS);
    // System.out.println("Image upload successful");

    // return signedUrl.toString();
}