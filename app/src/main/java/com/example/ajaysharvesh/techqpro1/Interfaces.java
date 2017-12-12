package com.example.ajaysharvesh.techqpro1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class Interfaces extends AppCompatActivity {

    public ImageView imageView, imageView1, imageView2, imageView3, imageView4, imageView5;
    public Button nxt20, pre20;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_interfaces);

        getSupportActionBar().setTitle("Interfaces");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        pre20 = (Button) findViewById(R.id.btn_pre20);
        nxt20 = (Button) findViewById(R.id.btn_nxt20);

        imageView = (ImageView) findViewById(R.id.it1);
        imageView1 = (ImageView) findViewById(R.id.it2);
        imageView2 = (ImageView) findViewById(R.id.it3);
        imageView3 = (ImageView) findViewById(R.id.it4);
        imageView4 = (ImageView) findViewById(R.id.it5);
        imageView5 = (ImageView) findViewById(R.id.it6);

        String url1 = "https://firebasestorage.googleapis.com/v0/b/techqpro99100117.appspot.com/o/Interfaces%2Fit1.PNG?alt=media&token=438e9110-59b4-461c-a74f-7ffe1b2f2b28";
        String url2 = "https://firebasestorage.googleapis.com/v0/b/techqpro99100117.appspot.com/o/Interfaces%2Fit2.PNG?alt=media&token=b8859510-1a26-47a1-9094-958ce8ddad8a";
        String url3 = "https://firebasestorage.googleapis.com/v0/b/techqpro99100117.appspot.com/o/Interfaces%2Fit3.PNG?alt=media&token=e4a1c466-5726-4571-97cb-f2f88af03e85";
        String url4 = "https://firebasestorage.googleapis.com/v0/b/techqpro99100117.appspot.com/o/Interfaces%2Fit4.PNG?alt=media&token=7fbcadef-46f4-4db9-b4c9-61240758ed6f";
        String url5 = "https://firebasestorage.googleapis.com/v0/b/techqpro99100117.appspot.com/o/Interfaces%2Fit5.PNG?alt=media&token=7955940a-edea-4d88-b76c-4674a3afbda8";
        String url6 = "https://firebasestorage.googleapis.com/v0/b/techqpro99100117.appspot.com/o/Interfaces%2Fit6.PNG?alt=media&token=f38b1744-c2b4-49ef-aa4a-84ef8a990f2b";

        Glide.with(getApplicationContext()).load(url1).into(imageView);
        Glide.with(getApplicationContext()).load(url2).into(imageView1);
        Glide.with(getApplicationContext()).load(url3).into(imageView2);
        Glide.with(getApplicationContext()).load(url4).into(imageView3);
        Glide.with(getApplicationContext()).load(url5).into(imageView4);
        Glide.with(getApplicationContext()).load(url6).into(imageView5);

        nxt20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Interfaces.this, PakagesP.class) ;
                startActivity(i);
            }
        });

        pre20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent j = new Intent(Interfaces.this, Encapsulation.class) ;
                startActivity(j);
            }
        });
    }
}
