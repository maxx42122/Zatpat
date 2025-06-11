package com.zatpat.firebase;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

import com.google.api.core.ApiFuture;
import com.google.auth.oauth2.GoogleCredentials;
import com.google.cloud.firestore.CollectionReference;
import com.google.cloud.firestore.DocumentReference;
import com.google.cloud.firestore.DocumentSnapshot;
import com.google.cloud.firestore.Firestore;
import com.google.cloud.firestore.QuerySnapshot;
import com.google.cloud.firestore.WriteResult;
import com.google.cloud.storage.Acl;
import com.google.cloud.storage.BlobId;
import com.google.cloud.storage.BlobInfo;
import com.google.cloud.storage.Storage;
import com.google.cloud.storage.StorageOptions;
import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseOptions;
import com.google.firebase.cloud.FirestoreClient;
import com.google.firebase.cloud.StorageClient;
import com.zatpat.logincontroller.registermaid;
import com.zatpat.maidlist.madeInfoModel;

public class FirebaseInitializemaid {
    private Firestore db;

    public FirebaseInitializemaid() {
        initialize();
        db = FirestoreClient.getFirestore();
    }
    static String BUCKET_NAME ="maid-provide-project.appspot.com";

    public void initialize() {
        try {
            if (FirebaseApp.getApps().isEmpty()) {
                FileInputStream serviceAccount = new FileInputStream(
                        "C:\\Users\\Lenovo\\java Project\\bytecoder\\c2w\\src\\main\\resources\\maid-provide-project-firebase-adminsdk-3ps2a-6c4a27851d.json");

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
    public void createMaid(madeInfoModel mobj) throws ExecutionException, InterruptedException {
        System.out.println("in create maid");
        db = FirestoreClient.getFirestore();
        if (db == null) {
            System.err.println("Firestore instance is not initialized.");
            return;
        }

        // Upload image and get URL

        // Prepare user data
        Map<String, Object> user = new HashMap<>();
        user.put("name", mobj.getName());
        user.put("mobile", mobj.getMobile());
        user.put("age", mobj.getAge());
        user.put("location", mobj.getLocation());
        user.put("experiance", mobj.getExperiance()); // Fixed typo
        user.put("language", mobj.getLanguage());
        user.put("type", mobj.getType());
        user.put("password", mobj.getPassword());
        user.put("img", registermaid.img);
        user.put("img1", registermaid.img1);
        user.put("img2", registermaid.img2);
        user.put("img3", registermaid.img3);
        user.put("aboutme", mobj.getAbout()); // Fixed typo

        // Store user data in Firestore
        DocumentReference docRef = db.collection("maidregister").document(mobj.getName());
        WriteResult result = docRef.set(user).get();
        System.out.println("Write result: " + result);
    }

    // Get list of maids
    public List<madeInfoModel> getMaidList() throws ExecutionException, InterruptedException {
        List<madeInfoModel> maidList = new ArrayList<>();

        // CollectionReference users = db.collection("users");
        // ApiFuture<QuerySnapshot> querySnapshot = users.get();

        
        CollectionReference maidregister = db.collection("maidregister");
        ApiFuture<QuerySnapshot> querySnapshot = maidregister.get();

        for (DocumentSnapshot document : querySnapshot.get().getDocuments()) {
            madeInfoModel maid = document.toObject(madeInfoModel.class);
            maidList.add(maid);

        }

        return maidList;
    }

    // public String uploadImg(File img, String name) {
    //     if (img == null) {
    //         System.out.println("Error: File is null");
    //         return null;
    //     }

    //     StorageClient storageClient = StorageClient.getInstance();
    //     try {
    //         storageClient.bucket().create(name, new FileInputStream(img), "image/jpeg");
    //     } catch (FileNotFoundException e) {
    //         System.out.println("Error in uploading");
    //         e.printStackTrace();
    //     }

    //     // Get the image URL
    //     URL signedUrl = storageClient.bucket().get(name).signUrl(14, TimeUnit.DAYS);
    //     System.out.println("Image upload successful");

    //     return signedUrl.toString();

    // }

    public static String uploadImg(String localFilePath,String uploadFileName) {
        try {
            FileInputStream serviceAccount = new

            FileInputStream("C:\\Users\\Lenovo\\java Project\\bytecoder\\c2w\\src\\main\\resources\\maid-provide-project-firebase-adminsdk-3ps2a-6c4a27851d.json");

            Storage storage = StorageOptions.newBuilder().setCredentials(GoogleCredentials.fromStream(serviceAccount))
                    .build()
                    .getService();
            Path path = Paths.get(localFilePath);
            byte[] bytes = Files.readAllBytes(path);

            BlobId blobId = BlobId.of(BUCKET_NAME, uploadFileName);
            BlobInfo blobInfo = BlobInfo.newBuilder(blobId)
                    .setContentType("image/jpeg")

                    .setAcl(Arrays.asList(Acl.of(Acl.User.ofAllUsers(),
                            Acl.Role.READER))) // Make file publicly accessible
                    .build();
            storage.create(blobInfo, bytes);

            return "https://storage.googleapis.com/" + BUCKET_NAME + "/" + uploadFileName;
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
}
