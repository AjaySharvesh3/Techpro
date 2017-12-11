package com.example.ajaysharvesh.techqpro1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class Numbers extends AppCompatActivity {

    public ImageView imageView, imageView1, imageView2, imageView3, imageView4, imageView5, imageView6 , imageView7 , imageView8,
     imageView9, imageView10, imageView11, imageView12;
    public Button nxt8, pre8;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);

        getSupportActionBar().setTitle("Numbers");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        pre8 = (Button) findViewById(R.id.btn_pre8);
        nxt8 = (Button) findViewById(R.id.btn_nxt8);

        imageView = (ImageView) findViewById(R.id.n1);
        imageView1 = (ImageView) findViewById(R.id.n2);
        imageView2 = (ImageView) findViewById(R.id.n3);
        imageView3 = (ImageView) findViewById(R.id.n4);
        imageView4 = (ImageView) findViewById(R.id.n5);
        imageView5 = (ImageView) findViewById(R.id.n6);
        imageView6 = (ImageView) findViewById(R.id.n7);
        imageView7 = (ImageView) findViewById(R.id.n8);
        imageView8 = (ImageView) findViewById(R.id.n9);
        imageView9 = (ImageView) findViewById(R.id.n10);
        imageView10 = (ImageView) findViewById(R.id.n11);
        imageView11 = (ImageView) findViewById(R.id.n12);
        imageView12 = (ImageView) findViewById(R.id.n13);

        String url1 = "https://firebasestorage.googleapis.com/v0/b/techqpro99100117.appspot.com/o/Numbers%2Fn1.PNG?alt=media&token=47ab3e33-2de6-475d-beca-a508b1489231";
        String url2 = "https://firebasestorage.googleapis.com/v0/b/techqpro99100117.appspot.com/o/Numbers%2Fn2.PNG?alt=media&token=d456a417-b588-4209-9510-e15165691b73";
        String url3 = "https://firebasestorage.googleapis.com/v0/b/techqpro99100117.appspot.com/o/Numbers%2Fn3.PNG?alt=media&token=8da7cdec-a72c-4947-9ce0-ccec14f202c3";
        String url4 = "https://firebasestorage.googleapis.com/v0/b/techqpro99100117.appspot.com/o/Numbers%2Fn4.PNG?alt=media&token=c09b5145-9b8e-44f8-a3f7-5390515eb55e";
        String url5 = "https://firebasestorage.googleapis.com/v0/b/techqpro99100117.appspot.com/o/Numbers%2Fn5.PNG?alt=media&token=24cb242f-143a-483a-94c1-55bb607ff196";
        String url6 = "https://firebasestorage.googleapis.com/v0/b/techqpro99100117.appspot.com/o/Numbers%2Fn6.PNG?alt=media&token=def41800-a9f2-4d8b-a2bf-27902af90cd4";
        String url7 = "https://firebasestorage.googleapis.com/v0/b/techqpro99100117.appspot.com/o/Numbers%2Fn7.PNG?alt=media&token=bcff0438-287a-4ec3-a4c0-cb015b34438d";
        String url8 = "https://firebasestorage.googleapis.com/v0/b/techqpro99100117.appspot.com/o/Numbers%2Fn8.PNG?alt=media&token=174e74ac-267c-4434-be79-4acc491ff296";
        String url9 = "https://firebasestorage.googleapis.com/v0/b/techqpro99100117.appspot.com/o/Numbers%2Fn9.PNG?alt=media&token=99767d35-a1d7-4b72-a3ed-44abce163c22";
        String url10 = "https://firebasestorage.googleapis.com/v0/b/techqpro99100117.appspot.com/o/Numbers%2Fn10.PNG?alt=media&token=76f1b647-c35a-41fc-a817-3668b693d466";
        String url11 = "https://firebasestorage.googleapis.com/v0/b/techqpro99100117.appspot.com/o/Numbers%2Fn11.PNG?alt=media&token=1f11c509-697b-421b-806b-c4f20dca79a0";
        String url12 = "https://firebasestorage.googleapis.com/v0/b/techqpro99100117.appspot.com/o/Numbers%2Fn12.PNG?alt=media&token=29f0dedc-6ead-48f9-88ca-caa3619c1b01";
        String url13 = "https://firebasestorage.googleapis.com/v0/b/techqpro99100117.appspot.com/o/Numbers%2Fn13.PNG?alt=media&token=44f43dd6-b4ce-4376-bb47-eebb6535c5ff";

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

        nxt8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Numbers.this, Strings.class) ;
                startActivity(i);
            }
        });

        pre8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent j = new Intent(Numbers.this, DecisionMaking.class) ;
                startActivity(j);
            }
        });
    }
}
