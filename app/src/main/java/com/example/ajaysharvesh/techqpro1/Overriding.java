package com.example.ajaysharvesh.techqpro1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class Overriding extends AppCompatActivity {

    public ImageView imageView, imageView1, imageView2, imageView3, imageView4;
    public Button nxt17, pre17;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_overriding);

        getSupportActionBar().setTitle("Overriding");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        pre17 = (Button) findViewById(R.id.btn_pre17);
        nxt17 = (Button) findViewById(R.id.btn_nxt17);

        imageView = (ImageView) findViewById(R.id.o1);
        imageView1 = (ImageView) findViewById(R.id.o2);
        imageView2 = (ImageView) findViewById(R.id.o3);
        imageView3 = (ImageView) findViewById(R.id.o4);
        imageView4 = (ImageView) findViewById(R.id.o5);

        String url1 = "https://firebasestorage.googleapis.com/v0/b/techqpro99100117.appspot.com/o/Overriding%2Fo1.PNG?alt=media&token=d8639bc2-0604-4079-86c9-d40476b22d38";
        String url2 = "https://firebasestorage.googleapis.com/v0/b/techqpro99100117.appspot.com/o/Overriding%2Fo2.PNG?alt=media&token=56087f79-2337-44cf-84c3-3843d7d36d95";
        String url3 = "https://firebasestorage.googleapis.com/v0/b/techqpro99100117.appspot.com/o/Overriding%2Fo3.PNG?alt=media&token=26c16d16-a80f-4319-8991-3652b2f20c84";
        String url4 = "https://firebasestorage.googleapis.com/v0/b/techqpro99100117.appspot.com/o/Overriding%2Fo4.PNG?alt=media&token=d87b4cf9-58ce-4321-9b2d-a9808e149a8b";
        String url5 = "https://firebasestorage.googleapis.com/v0/b/techqpro99100117.appspot.com/o/Overriding%2Fo5.PNG?alt=media&token=07f0207d-a77c-4a0b-9c27-3251623fe3aa";

        Glide.with(getApplicationContext()).load(url1).into(imageView);
        Glide.with(getApplicationContext()).load(url2).into(imageView1);
        Glide.with(getApplicationContext()).load(url3).into(imageView2);
        Glide.with(getApplicationContext()).load(url4).into(imageView3);
        Glide.with(getApplicationContext()).load(url5).into(imageView4);

        nxt17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Overriding.this, Polymorphism.class) ;
                startActivity(i);
            }
        });

        pre17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent j = new Intent(Overriding.this, Inheritance.class) ;
                startActivity(j);
            }
        });
    }
}
