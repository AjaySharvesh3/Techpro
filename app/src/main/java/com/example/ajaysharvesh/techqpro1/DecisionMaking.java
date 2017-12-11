package com.example.ajaysharvesh.techqpro1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class DecisionMaking extends AppCompatActivity {

    public ImageView imageView, imageView1, imageView2, imageView3, imageView4 ;
    public Button nxt7, pre7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_decision_making);

        getSupportActionBar().setTitle("Decision Making");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        pre7 = (Button) findViewById(R.id.btn_pre7);
        nxt7 = (Button) findViewById(R.id.btn_nxt7);

        imageView = (ImageView) findViewById(R.id.dm1);
        imageView1 = (ImageView) findViewById(R.id.dm2);
        imageView2 = (ImageView) findViewById(R.id.dm3);
        imageView3 = (ImageView) findViewById(R.id.dm4);
        imageView4 = (ImageView) findViewById(R.id.dm5);

        String url1 = "https://firebasestorage.googleapis.com/v0/b/techqpro99100117.appspot.com/o/Desicion%20Making%2Fdm1.PNG?alt=media&token=794af5f9-a58c-4585-9458-bc3ea508886b";
        String url2 = "https://firebasestorage.googleapis.com/v0/b/techqpro99100117.appspot.com/o/Desicion%20Making%2Fdm2.PNG?alt=media&token=3572fd83-5f19-4f9d-b862-2536450a58b8";
        String url3 = "https://firebasestorage.googleapis.com/v0/b/techqpro99100117.appspot.com/o/Desicion%20Making%2Fdm3.PNG?alt=media&token=75e6a29a-b0ca-4ed9-af3d-5442c3ed3ed3";
        String url4 = "https://firebasestorage.googleapis.com/v0/b/techqpro99100117.appspot.com/o/Desicion%20Making%2Fdm4.PNG?alt=media&token=95021f59-54ba-44ea-b3f2-556637b592ae";
        String url5 = "https://firebasestorage.googleapis.com/v0/b/techqpro99100117.appspot.com/o/Desicion%20Making%2Fdm5.PNG?alt=media&token=800141f8-4217-4a6d-b20f-cff513e56e10";

        Glide.with(getApplicationContext()).load(url1).into(imageView);
        Glide.with(getApplicationContext()).load(url2).into(imageView1);
        Glide.with(getApplicationContext()).load(url3).into(imageView2);
        Glide.with(getApplicationContext()).load(url4).into(imageView3);
        Glide.with(getApplicationContext()).load(url5).into(imageView4);


        nxt7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(DecisionMaking.this, Numbers.class) ;
                startActivity(i);
            }
        });

        pre7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent j = new Intent(DecisionMaking.this, LoopControls.class) ;
                startActivity(j);
            }
        });
    }
}
