package com.example.parstagram;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();

        ParseObject.registerSubclass(Post.class);
        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("JHsVaJtoen7RnDGObteEUI5FZz4FYCyAYzMR7Zn1")
                .clientKey("fGDISi30x8urG5oZ9Z0J23bhWk9CHHVUpMNy7tCu")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }


}
