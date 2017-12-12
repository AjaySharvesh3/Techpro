package com.example.ajaysharvesh.techqpro1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class PakagesP extends AppCompatActivity {

    public ImageView imageView, imageView1, imageView2, imageView3, imageView4, imageView5, imageView6, imageView7;
    public Button nxt21, pre21;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pakages_p);

        getSupportActionBar().setTitle("Interfaces");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        pre21 = (Button) findViewById(R.id.btn_pre21);
        nxt21 = (Button) findViewById(R.id.btn_nxt21);

        imageView = (ImageView) findViewById(R.id.pk1);
        imageView1 = (ImageView) findViewById(R.id.pk2);
        imageView2 = (ImageView) findViewById(R.id.pk3);
        imageView3 = (ImageView) findViewById(R.id.pk4);
        imageView4 = (ImageView) findViewById(R.id.pk5);
        imageView5 = (ImageView) findViewById(R.id.pk6);
        imageView6 = (ImageView) findViewById(R.id.pk7);
        imageView7 = (ImageView) findViewById(R.id.pk8);

        String url1 = "https://firebasestorage.googleapis.com/v0/b/techqpro99100117.appspot.com/o/Packages%2Fpk1.PNG?alt=media&token=6ca0bcb7-18ab-46dd-8909-dc04c5f43663";
        String url2 = "https://firebasestorage.googleapis.com/v0/b/techqpro99100117.appspot.com/o/Packages%2Fpk2.PNG?alt=media&token=aa6bd4eb-7c00-40e7-ba96-f1d3bd25edea";
        String url3 = "https://firebasestorage.googleapis.com/v0/b/techqpro99100117.appspot.com/o/Packages%2Fpk3.PNG?alt=media&token=8e33a763-60c8-4d8f-b3b9-9d804e1adecb";
        String url4 = "https://firebasestorage.googleapis.com/v0/b/techqpro99100117.appspot.com/o/Packages%2Fpk4.PNG?alt=media&token=c1f75d91-9cc8-45b3-993f-199356d3bced";
        String url5 = "https://firebasestorage.googleapis.com/v0/b/techqpro99100117.appspot.com/o/Packages%2Fpk5.PNG?alt=media&token=bb6e7484-0be0-4816-8325-ade48cb78c2b";
        String url6 = "https://firebasestorage.googleapis.com/v0/b/techqpro99100117.appspot.com/o/Packages%2Fpk6.PNG?alt=media&token=0d16059c-01bb-40b7-a7d0-f37afd990245";
        String url7 = "https://firebasestorage.googleapis.com/v0/b/techqpro99100117.appspot.com/o/Packages%2Fpk7.PNG?alt=media&token=68bc6ed3-1525-4a73-a480-60c4327ff864";
        String url8 = "https://firebasestorage.googleapis.com/v0/b/techqpro99100117.appspot.com/o/Packages%2Fpk8.PNG?alt=media&token=f275386b-6ac4-47c2-a594-0ce256ca6dfa";

        Glide.with(getApplicationContext()).load(url1).into(imageView);
        Glide.with(getApplicationContext()).load(url2).into(imageView1);
        Glide.with(getApplicationContext()).load(url3).into(imageView2);
        Glide.with(getApplicationContext()).load(url4).into(imageView3);
        Glide.with(getApplicationContext()).load(url5).into(imageView4);
        Glide.with(getApplicationContext()).load(url6).into(imageView5);
        Glide.with(getApplicationContext()).load(url7).into(imageView6);
        Glide.with(getApplicationContext()).load(url8).into(imageView7);

        nxt21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(PakagesP.this, DataStructures.class) ;
                startActivity(i);
            }
        });

        pre21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent j = new Intent(PakagesP.this, Interfaces.class) ;
                startActivity(j);
            }
        });
    }
}
