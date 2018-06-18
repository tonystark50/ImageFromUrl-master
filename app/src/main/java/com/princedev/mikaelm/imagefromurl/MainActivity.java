package com.princedev.mikaelm.imagefromurl;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class MainActivity extends AppCompatActivity {

    ImageView ivImageFromUrl;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ivImageFromUrl = (ImageView)findViewById(R.id.iv_image_from_url);

        Picasso.with(getApplicationContext()).load("https://source.unsplash.com/collection/190727/500x300").into(ivImageFromUrl);

    }
}
