package com.example.ajaysharvesh.techqpro1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class LoopControls extends AppCompatActivity {

    public ImageView imageView, imageView1, imageView2, imageView3, imageView4, imageView5, imageView6;

    public Button nxt6, pre6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loop_controls);

        getSupportActionBar().setTitle("Loop Controls");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        pre6 = (Button) findViewById(R.id.btn_pre6);
        nxt6 = (Button) findViewById(R.id.btn_nxt6);

        imageView = (ImageView) findViewById(R.id.lc1);
        imageView1 = (ImageView) findViewById(R.id.lc2);
        imageView2 = (ImageView) findViewById(R.id.lc3);
        imageView3 = (ImageView) findViewById(R.id.lc4);
        imageView4 = (ImageView) findViewById(R.id.lc5);
        imageView5 = (ImageView) findViewById(R.id.lc6);
        imageView6 = (ImageView) findViewById(R.id.lc7);

        String url1 = "https://firebasestorage.googleapis.com/v0/b/techqpro99100117.appspot.com/o/Loop%20Controls%2Flc1.PNG?alt=media&token=40a193bd-e163-438e-830d-501ba3dd6917";
        String url2 = "https://firebasestorage.googleapis.com/v0/b/techqpro99100117.appspot.com/o/Loop%20Controls%2Flc2.PNG?alt=media&token=69d63a0d-5055-4902-a3e3-97f5ccd90a49";
        String url3 = "https://firebasestorage.googleapis.com/v0/b/techqpro99100117.appspot.com/o/Loop%20Controls%2Flc3.PNG?alt=media&token=25f8d6c5-8bdb-4f36-aac7-73740441cdb9";
        String url4 = "https://firebasestorage.googleapis.com/v0/b/techqpro99100117.appspot.com/o/Loop%20Controls%2Flc4.PNG?alt=media&token=beb7c4ef-bb22-4585-b620-453dcec98ee3";
        String url5 = "https://firebasestorage.googleapis.com/v0/b/techqpro99100117.appspot.com/o/Loop%20Controls%2Flc5.PNG?alt=media&token=c0499ce1-f8da-499d-9596-f8c12b8f772d";
        String url6 = "https://firebasestorage.googleapis.com/v0/b/techqpro99100117.appspot.com/o/Loop%20Controls%2Flc6.PNG?alt=media&token=dca53d47-8e40-496b-8c3b-2614925501d0";
        String url7 = "https://firebasestorage.googleapis.com/v0/b/techqpro99100117.appspot.com/o/Loop%20Controls%2Flc7.PNG?alt=media&token=6a76b613-911a-4beb-88bc-6dd6c239cd31";

        Glide.with(getApplicationContext()).load(url1).into(imageView);
        Glide.with(getApplicationContext()).load(url2).into(imageView1);
        Glide.with(getApplicationContext()).load(url3).into(imageView2);
        Glide.with(getApplicationContext()).load(url4).into(imageView3);
        Glide.with(getApplicationContext()).load(url5).into(imageView4);
        Glide.with(getApplicationContext()).load(url6).into(imageView5);
        Glide.with(getApplicationContext()).load(url7).into(imageView6);

        nxt6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(LoopControls.this, DecisionMaking.class) ;
                startActivity(i);
            }
        });

        pre6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent j = new Intent(LoopControls.this, BasicOperators.class) ;
                startActivity(j);
            }
        });
    }
}
