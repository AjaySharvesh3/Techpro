package com.example.ajaysharvesh.techqpro1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class ArraysLists extends AppCompatActivity {

    public ImageView imageView, imageView1, imageView2, imageView3, imageView4, imageView5, imageView6 , imageView7 , imageView8,
            imageView9, imageView10, imageView11, imageView12;

    public Button nxt10, pre10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_arrays_lists);

        getSupportActionBar().setTitle("Arrays and Lists");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        pre10 = (Button) findViewById(R.id.btn_pre10);
        nxt10 = (Button) findViewById(R.id.btn_nxt10);

        imageView = (ImageView) findViewById(R.id.a1);
        imageView1 = (ImageView) findViewById(R.id.a2);
        imageView2 = (ImageView) findViewById(R.id.a3);
        imageView3 = (ImageView) findViewById(R.id.a4);
        imageView4 = (ImageView) findViewById(R.id.a5);
        imageView5 = (ImageView) findViewById(R.id.a6);
        imageView6 = (ImageView) findViewById(R.id.a7);
        imageView7 = (ImageView) findViewById(R.id.a8);
        imageView8 = (ImageView) findViewById(R.id.a9);
        imageView9 = (ImageView) findViewById(R.id.a10);
        imageView10 = (ImageView) findViewById(R.id.a11);
        imageView11 = (ImageView) findViewById(R.id.a12);
        imageView12 = (ImageView) findViewById(R.id.a13);

        String url1 = "https://firebasestorage.googleapis.com/v0/b/techqpro99100117.appspot.com/o/Arrays%2Fa1.PNG?alt=media&token=0d6bc6cb-5b65-499e-b72a-e3446900f950";
        String url2 = "https://firebasestorage.googleapis.com/v0/b/techqpro99100117.appspot.com/o/Arrays%2Fa2.PNG?alt=media&token=cf3a1552-3fd7-42fb-a574-f7db582aa6da";
        String url3 = "https://firebasestorage.googleapis.com/v0/b/techqpro99100117.appspot.com/o/Arrays%2Fa3.PNG?alt=media&token=99d6e312-6b61-466d-9c55-d14b731e3f31";
        String url4 = "https://firebasestorage.googleapis.com/v0/b/techqpro99100117.appspot.com/o/Arrays%2Fa4.PNG?alt=media&token=d6c8dd8c-c3a8-4e7e-9586-62ad0a5eeab3";
        String url5 = "https://firebasestorage.googleapis.com/v0/b/techqpro99100117.appspot.com/o/Arrays%2Fa5.PNG?alt=media&token=2f251a5d-d5ce-4545-9f72-525a1e923b2d";
        String url6 = "https://firebasestorage.googleapis.com/v0/b/techqpro99100117.appspot.com/o/Arrays%2Fa6.PNG?alt=media&token=9915d593-8ff9-423a-9ecb-2dd1a9cfdb0d";
        String url7 = "https://firebasestorage.googleapis.com/v0/b/techqpro99100117.appspot.com/o/Arrays%2Fa7.PNG?alt=media&token=b71c8e78-518b-4990-8eb5-a6b571e00207";
        String url8 = "https://firebasestorage.googleapis.com/v0/b/techqpro99100117.appspot.com/o/Arrays%2Fa8.PNG?alt=media&token=c142abdf-5e16-47de-9f4f-5bd86f17d734";
        String url9 = "https://firebasestorage.googleapis.com/v0/b/techqpro99100117.appspot.com/o/Arrays%2Fa9.PNG?alt=media&token=dca2401f-0542-42c3-96ef-962cac531676";
        String url10 = "https://firebasestorage.googleapis.com/v0/b/techqpro99100117.appspot.com/o/Arrays%2Fa10.PNG?alt=media&token=4640d572-8eb6-4579-9faa-a599a4ec394c";
        String url11 = "https://firebasestorage.googleapis.com/v0/b/techqpro99100117.appspot.com/o/Arrays%2Fa11.PNG?alt=media&token=77dac4a6-e379-43d5-a56b-695206e1dd16";
        String url12 = "https://firebasestorage.googleapis.com/v0/b/techqpro99100117.appspot.com/o/Arrays%2Fa12.PNG?alt=media&token=f7d109d9-97c3-49a5-ae36-2b8863b0a318";
        String url13 = "https://firebasestorage.googleapis.com/v0/b/techqpro99100117.appspot.com/o/Arrays%2Fa13.PNG?alt=media&token=b275a80c-f6ff-41ab-8d0c-0027bb6f8b89";

        Glide.with(getApplicationContext()).load(url1).into(imageView);
        Glide.with(getApplicationContext()).load(url2).into(imageView1);
        Glide.with(getApplicationContext()).load(url3).into(imageView2);
        Glide.with(getApplicationContext()).load(url4).into(imageView3);
        Glide.with(getApplicationContext()).load(url5).into(imageView4);
        Glide.with(getApplicationContext()).load(url6).into(imageView5);
        Glide.with(getApplicationContext()).load(url7).into(imageView6);
        Glide.with(getApplicationContext()).load(url8).into(imageView7);
        Glide.with(getApplicationContext()).load(url9).into(imageView8);
        Glide.with(getApplicationContext()).load(url10).into(imageView9);
        Glide.with(getApplicationContext()).load(url11).into(imageView10);
        Glide.with(getApplicationContext()).load(url12).into(imageView11);
        Glide.with(getApplicationContext()).load(url13).into(imageView12);

        nxt10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(ArraysLists.this, DateAndTime.class) ;
                startActivity(i);
            }
        });

        pre10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent j = new Intent(ArraysLists.this, Strings.class) ;
                startActivity(j);
            }
        });

    }
}
