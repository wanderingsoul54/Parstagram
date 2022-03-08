package com.example.instaclone;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {

    @Override
    public void onCreate(){
        super.onCreate();

        // Register your parse models
        ParseObject.registerSubclass(Post.class);

       // ParseObject.registerSubclass(Post.class);
        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("wYnv7jnX8rWhbxSbdN8arh6hnZ6bLQI7YNtjSrTR")
                .clientKey("SLDAIvaxr91aVXPwIHze1fjf9TUI4R1cs6hbrtJr")
                .server("https://parseapi.back4app.com")
                .build()
        );

    }

}
