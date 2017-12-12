package com.example.ajaysharvesh.techqpro1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class Encapsulation extends AppCompatActivity {

    public ImageView imageView, imageView1, imageView2;
    public Button nxt19, pre19;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_encapsulation);

        getSupportActionBar().setTitle("Encapsulation");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        pre19 = (Button) findViewById(R.id.btn_pre19);
        nxt19 = (Button) findViewById(R.id.btn_nxt19);

        imageView = (ImageView) findViewById(R.id.en1);
        imageView1 = (ImageView) findViewById(R.id.en2);
        imageView2 = (ImageView) findViewById(R.id.en3);

        String url1 = "https://firebasestorage.googleapis.com/v0/b/techqpro99100117.appspot.com/o/Encapsulation%2Fen1.PNG?alt=media&token=b504db20-035c-4912-930d-ccb6d6596723";
        String url2 = "https://firebasestorage.googleapis.com/v0/b/techqpro99100117.appspot.com/o/Encapsulation%2Fen2.PNG?alt=media&token=0ba91ea6-1563-4372-8eb6-a86ea9cb7cb6";
        String url3 = "https://firebasestorage.googleapis.com/v0/b/techqpro99100117.appspot.com/o/Encapsulation%2Fen3.PNG?alt=media&token=94f7f2bb-5271-48f7-b44e-f367d9bd6c04";

        Glide.with(getApplicationContext()).load(url1).into(imageView);
        Glide.with(getApplicationContext()).load(url2).into(imageView1);
        Glide.with(getApplicationContext()).load(url3).into(imageView2);

        nxt19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Encapsulation.this, Interfaces.class) ;
                startActivity(i);
            }
        });

        pre19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent j = new Intent(Encapsulation.this, Polymorphism.class) ;
                startActivity(j);
            }
        });
    }
}
