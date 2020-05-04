package com.bryanpoh.demoimageview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    // Declare Imageview object
    ImageView ivDay2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Get the imageview obj and assign to ivday2
        ivDay2 = (ImageView) findViewById(R.id.imageView2);

        // Set the image
        ivDay2.setImageResource(R.drawable.day2);
    }
}
