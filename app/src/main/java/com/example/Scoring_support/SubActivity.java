package com.example.Scoring_support;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class SubActivity extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub);

        Intent intent = getIntent();
        String imageId = intent.getStringExtra("IMAGEID");

        ImageView imageView = findViewById(R.id.image_view);

        Picasso.with(this)
                .load(imageId)
                .fit()
                .centerInside()
                .into(imageView);

    }

}