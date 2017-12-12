package com.example.ajaysharvesh.techqpro1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class Polymorphism extends AppCompatActivity {

    public ImageView imageView, imageView1, imageView2, imageView3, imageView4, imageView5;
    public Button nxt18, pre18;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_polymorphism);

        getSupportActionBar().setTitle("Polymorphism");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        pre18 = (Button) findViewById(R.id.btn_pre18);
        nxt18 = (Button) findViewById(R.id.btn_nxt18);

        imageView = (ImageView) findViewById(R.id.pm1);
        imageView1 = (ImageView) findViewById(R.id.pm2);
        imageView2 = (ImageView) findViewById(R.id.pm3);
        imageView3 = (ImageView) findViewById(R.id.pm4);
        imageView4 = (ImageView) findViewById(R.id.pm5);
        imageView5 = (ImageView) findViewById(R.id.pm6);

        String url1 = "https://firebasestorage.googleapis.com/v0/b/techqpro99100117.appspot.com/o/Polymorphism%2Fpm1.PNG?alt=media&token=94bf6882-90e1-488e-82c0-49208afb736c";
        String url2 = "https://firebasestorage.googleapis.com/v0/b/techqpro99100117.appspot.com/o/Polymorphism%2Fpm2.PNG?alt=media&token=e58a74c3-1815-4b46-b095-db39585d9ee8";
        String url3 = "https://firebasestorage.googleapis.com/v0/b/techqpro99100117.appspot.com/o/Polymorphism%2Fpm3.PNG?alt=media&token=e10ec2f9-adbe-4cc1-a61f-b1133647906a";
        String url4 = "https://firebasestorage.googleapis.com/v0/b/techqpro99100117.appspot.com/o/Polymorphism%2Fpm4.PNG?alt=media&token=93b0dc3a-4388-4884-a2ac-19d683e2c9bf";
        String url5 = "https://firebasestorage.googleapis.com/v0/b/techqpro99100117.appspot.com/o/Polymorphism%2Fpm5.PNG?alt=media&token=67ca2d62-e9b0-4d8d-8fce-bc73ed84362b";
        String url6 = "https://firebasestorage.googleapis.com/v0/b/techqpro99100117.appspot.com/o/Polymorphism%2Fpm6.PNG?alt=media&token=da05fcf5-500a-49db-b394-a616b2206e6e";

        Glide.with(getApplicationContext()).load(url1).into(imageView);
        Glide.with(getApplicationContext()).load(url2).into(imageView1);
        Glide.with(getApplicationContext()).load(url3).into(imageView2);
        Glide.with(getApplicationContext()).load(url4).into(imageView3);
        Glide.with(getApplicationContext()).load(url5).into(imageView4);
        Glide.with(getApplicationContext()).load(url6).into(imageView5);

        nxt18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Polymorphism.this, Encapsulation.class) ;
                startActivity(i);
            }
        });

        pre18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent j = new Intent(Polymorphism.this, Overriding.class) ;
                startActivity(j);
            }
        });

    }
}
