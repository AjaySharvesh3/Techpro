package com.example.ajaysharvesh.techqpro1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class DataStructures extends AppCompatActivity {

    public ImageView imageView, imageView1, imageView2;
    public Button nxt22, pre22;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data_structures);

        getSupportActionBar().setTitle("Interfaces");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        pre22 = (Button) findViewById(R.id.btn_pre22);
        nxt22= (Button) findViewById(R.id.btn_nxt22);

        imageView = (ImageView) findViewById(R.id.ds1);
        imageView1 = (ImageView) findViewById(R.id.ds2);
        imageView2 = (ImageView) findViewById(R.id.ds3);

        String url1 = "https://firebasestorage.googleapis.com/v0/b/techqpro99100117.appspot.com/o/Data%20Structures%2Fds1.PNG?alt=media&token=7453bdb0-5561-46fc-b5fd-92d4a0a1b52d";
        String url2 = "https://firebasestorage.googleapis.com/v0/b/techqpro99100117.appspot.com/o/Data%20Structures%2Fds2.PNG?alt=media&token=6873b3a5-a2fa-4d68-ab78-7542476ed9fb";
        String url3 = "https://firebasestorage.googleapis.com/v0/b/techqpro99100117.appspot.com/o/Data%20Structures%2Fds3.PNG?alt=media&token=376e1eb5-f6c2-481b-8840-14796746c412";

        Glide.with(getApplicationContext()).load(url1).into(imageView);
        Glide.with(getApplicationContext()).load(url2).into(imageView1);
        Glide.with(getApplicationContext()).load(url3).into(imageView2);

        /**nxt22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(DataStructures.this, CollectionsC.class) ;
                startActivity(i);
            }
        });*/

        pre22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent j = new Intent(DataStructures.this, PakagesP.class) ;
                startActivity(j);
            }
        });
    }
}
