package com.example.ajaysharvesh.techqpro1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class DateAndTime extends AppCompatActivity {

    public ImageView imageView, imageView1, imageView2, imageView3, imageView4, imageView5, imageView6, imageView7;
    public Button nxt11, pre11;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_date_and_time);

        getSupportActionBar().setTitle("Date and Time");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        pre11 = (Button) findViewById(R.id.btn_pre11);
        nxt11 = (Button) findViewById(R.id.btn_nxt11);

        imageView = (ImageView) findViewById(R.id.dnt1);
        imageView1 = (ImageView) findViewById(R.id.dnt2);
        imageView2 = (ImageView) findViewById(R.id.dnt3);
        imageView3 = (ImageView) findViewById(R.id.dnt4);
        imageView4 = (ImageView) findViewById(R.id.dnt5);
        imageView5 = (ImageView) findViewById(R.id.dnt6);
        imageView6 = (ImageView) findViewById(R.id.dnt7);
        imageView7 = (ImageView) findViewById(R.id.dnt8);

        String url1 = "https://firebasestorage.googleapis.com/v0/b/techqpro99100117.appspot.com/o/Data%20and%20Time%2Fdt1.PNG?alt=media&token=912358c7-15ed-4aeb-8018-79e063a4749c";
        String url2 = "https://firebasestorage.googleapis.com/v0/b/techqpro99100117.appspot.com/o/Data%20and%20Time%2Fdt2.PNG?alt=media&token=8fd6459c-9474-4fd0-b49f-3858286b730d";
        String url3 = "https://firebasestorage.googleapis.com/v0/b/techqpro99100117.appspot.com/o/Data%20and%20Time%2Fdt3.PNG?alt=media&token=f6676cc5-cc44-4a03-8ae5-5a6f4df2fa11";
        String url4 = "https://firebasestorage.googleapis.com/v0/b/techqpro99100117.appspot.com/o/Data%20and%20Time%2Fdt4.PNG?alt=media&token=e077ff10-37b4-47bf-b03f-9232be0d187f";
        String url5 = "https://firebasestorage.googleapis.com/v0/b/techqpro99100117.appspot.com/o/Data%20and%20Time%2Fdt5.PNG?alt=media&token=e5c3b370-d7a2-43f7-80c8-fb8acdd62207";
        String url6 = "https://firebasestorage.googleapis.com/v0/b/techqpro99100117.appspot.com/o/Data%20and%20Time%2Fdt6.PNG?alt=media&token=82175d6c-8231-425b-a55f-a47382bef84c";
        String url7 = "https://firebasestorage.googleapis.com/v0/b/techqpro99100117.appspot.com/o/Data%20and%20Time%2Fdt7.PNG?alt=media&token=7a8b6836-d9de-4b19-b201-49c736023d4e";
        String url8 = "https://firebasestorage.googleapis.com/v0/b/techqpro99100117.appspot.com/o/Data%20and%20Time%2Fdt8.PNG?alt=media&token=e276ed42-a39c-4064-8849-8f151798a9e2";

        Glide.with(getApplicationContext()).load(url1).into(imageView);
        Glide.with(getApplicationContext()).load(url2).into(imageView1);
        Glide.with(getApplicationContext()).load(url3).into(imageView2);
        Glide.with(getApplicationContext()).load(url4).into(imageView3);
        Glide.with(getApplicationContext()).load(url5).into(imageView4);
        Glide.with(getApplicationContext()).load(url6).into(imageView5);
        Glide.with(getApplicationContext()).load(url7).into(imageView6);
        Glide.with(getApplicationContext()).load(url8).into(imageView7);

        nxt11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(DateAndTime.this, RegularExpression.class) ;
                startActivity(i);
            }
        });

        pre11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent j = new Intent(DateAndTime.this, ArraysLists.class) ;
                startActivity(j);
            }
        });
    }
}