package com.example.ajaysharvesh.techqpro1.Lists;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.example.ajaysharvesh.techqpro1.R;
import com.example.ajaysharvesh.techqpro1.VariableTypes;

public class DataTypes extends AppCompatActivity {

    public Button nxt3, pre3;

    public ImageView imageView, imageView1, imageView2, imageView3, imageView4, imageView5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data_types);

        getSupportActionBar().setTitle("DataTypes");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        pre3 = (Button) findViewById(R.id.btn_pre3);
        nxt3 = (Button) findViewById(R.id.btn_nxt3);

        imageView = (ImageView) findViewById(R.id.dt1);
        imageView1 = (ImageView) findViewById(R.id.dt2);
        imageView2 = (ImageView) findViewById(R.id.dt3);
        imageView3 = (ImageView) findViewById(R.id.dt4);
        imageView4 = (ImageView) findViewById(R.id.dt5);
        imageView5 = (ImageView) findViewById(R.id.dt6);

        String url1 = "https://firebasestorage.googleapis.com/v0/b/techqpro99100117.appspot.com/o/Data%20Types%2Fd1.PNG?alt=media&token=08a58a78-9938-435e-a61a-b44ecb906ad8";
        String url2 = "https://firebasestorage.googleapis.com/v0/b/techqpro99100117.appspot.com/o/Data%20Types%2Fd2.PNG?alt=media&token=fa87e624-b02d-4191-8e7c-07a039d1b014";
        String url3 = "https://firebasestorage.googleapis.com/v0/b/techqpro99100117.appspot.com/o/Data%20Types%2Fd3.PNG?alt=media&token=65672bb3-4bfc-4785-8c93-fed1abd3ca16";
        String url4 = "https://firebasestorage.googleapis.com/v0/b/techqpro99100117.appspot.com/o/Data%20Types%2Fd4.PNG?alt=media&token=4ad7f348-8a42-485d-b0e6-7e90cce4bdad";
        String url5 = "https://firebasestorage.googleapis.com/v0/b/techqpro99100117.appspot.com/o/Data%20Types%2Fd5.PNG?alt=media&token=bc0f1815-b484-48df-bccb-7ccc50debceb";
        String url6 = "https://firebasestorage.googleapis.com/v0/b/techqpro99100117.appspot.com/o/Data%20Types%2Fd6.PNG?alt=media&token=712c7c8b-4d03-4728-8457-ce54cd9a0b45";

        Glide.with(getApplicationContext()).load(url1).into(imageView);
        Glide.with(getApplicationContext()).load(url2).into(imageView1);
        Glide.with(getApplicationContext()).load(url3).into(imageView2);
        Glide.with(getApplicationContext()).load(url4).into(imageView3);
        Glide.with(getApplicationContext()).load(url5).into(imageView4);
        Glide.with(getApplicationContext()).load(url6).into(imageView5);

        pre3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(DataTypes.this, ObjectClass.class);
                startActivity(i);
            }
        });

        nxt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent j = new Intent(DataTypes.this, VariableTypes.class);
                startActivity(j);
            }
        });
    }
}