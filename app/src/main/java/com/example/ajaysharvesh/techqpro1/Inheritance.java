package com.example.ajaysharvesh.techqpro1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class Inheritance extends AppCompatActivity {

    public ImageView imageView, imageView1, imageView2, imageView3;
    public Button nxt16, pre16;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inheritance);

        getSupportActionBar().setTitle("Inheritance");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        pre16 = (Button) findViewById(R.id.btn_pre16);
        nxt16= (Button) findViewById(R.id.btn_nxt16);

        imageView = (ImageView) findViewById(R.id.ih1);
        imageView1 = (ImageView) findViewById(R.id.ih2);
        imageView2 = (ImageView) findViewById(R.id.ih3);
        imageView3 = (ImageView) findViewById(R.id.ih4);

        String url1 = "https://firebasestorage.googleapis.com/v0/b/techqpro99100117.appspot.com/o/Inheritance%2Fih1.PNG?alt=media&token=397d82ab-2d1c-45bd-8989-0c51aba99826";
        String url2 = "https://firebasestorage.googleapis.com/v0/b/techqpro99100117.appspot.com/o/Inheritance%2Fih2.PNG?alt=media&token=786e6372-411a-475e-8f85-8747a864d90f";
        String url3 = "https://firebasestorage.googleapis.com/v0/b/techqpro99100117.appspot.com/o/Inheritance%2Fih3.PNG?alt=media&token=81a5fe62-c316-4997-a9e9-2903befc7bc3";
        String url4 = "https://firebasestorage.googleapis.com/v0/b/techqpro99100117.appspot.com/o/Inheritance%2Fih4.PNG?alt=media&token=0ec03255-204d-4bf3-8968-0806f3acdb7b";

        Glide.with(getApplicationContext()).load(url1).into(imageView);
        Glide.with(getApplicationContext()).load(url2).into(imageView1);
        Glide.with(getApplicationContext()).load(url3).into(imageView2);
        Glide.with(getApplicationContext()).load(url4).into(imageView3);

        /**nxt16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Inheritance.this, Polymorphism.class) ;
                startActivity(i);
            }
        });*/

        pre16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent j = new Intent(Inheritance.this, ExceptionHandling.class) ;
                startActivity(j);
            }
        });
    }
}
