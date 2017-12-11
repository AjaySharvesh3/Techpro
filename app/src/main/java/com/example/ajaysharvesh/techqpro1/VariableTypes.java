package com.example.ajaysharvesh.techqpro1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.example.ajaysharvesh.techqpro1.Lists.DataTypes;

public class VariableTypes extends AppCompatActivity {

    public Button nxt4, pre4;

    public ImageView imageView, imageView1, imageView2, imageView3, imageView4, imageView5, imageView6, imageView7, imageView8,
             imageView9, imageView10, imageView11, imageView12, imageView13, imageView14, imageView15, imageView16;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_variable_types);

        getSupportActionBar().setTitle("Variable Types");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        pre4 = (Button) findViewById(R.id.btn_pre4);
        nxt4 = (Button) findViewById(R.id.btn_nxt4);

        imageView = (ImageView) findViewById(R.id.vt1);
        imageView1 = (ImageView) findViewById(R.id.vt2);
        imageView2 = (ImageView) findViewById(R.id.vt3);
        imageView3 = (ImageView) findViewById(R.id.vt4);
        imageView4 = (ImageView) findViewById(R.id.vt5);
        imageView5 = (ImageView) findViewById(R.id.vt6);
        imageView6 = (ImageView) findViewById(R.id.vt7);
        imageView7 = (ImageView) findViewById(R.id.vt8);
        imageView8 = (ImageView) findViewById(R.id.vt9);
        imageView9 = (ImageView) findViewById(R.id.vt10);
        imageView10 = (ImageView) findViewById(R.id.vt11);
        imageView11 = (ImageView) findViewById(R.id.vt12);
        imageView12 = (ImageView) findViewById(R.id.vt13);
        imageView13 = (ImageView) findViewById(R.id.vt14);
        imageView14 = (ImageView) findViewById(R.id.vt15);
        imageView15 = (ImageView) findViewById(R.id.vt16);
        imageView16 = (ImageView) findViewById(R.id.vt17);

        String url1 = "https://firebasestorage.googleapis.com/v0/b/techqpro99100117.appspot.com/o/Variable%20Types%2Fvt1.PNG?alt=media&token=7f5ad9e9-9327-4cc4-8928-ccc039b48c45";
        String url2 = "https://firebasestorage.googleapis.com/v0/b/techqpro99100117.appspot.com/o/Variable%20Types%2Fvt2.PNG?alt=media&token=6f2fbfa3-70bf-4256-b53c-7f73b1ebadb7";
        String url3 = "https://firebasestorage.googleapis.com/v0/b/techqpro99100117.appspot.com/o/Variable%20Types%2Fvt3.PNG?alt=media&token=21e389f8-4e23-4aba-94e3-d0f7e4733a06";
        String url4 = "https://firebasestorage.googleapis.com/v0/b/techqpro99100117.appspot.com/o/Variable%20Types%2Fvt4.PNG?alt=media&token=a5caa72c-92c1-44ac-a563-ddf0d7d1b27a";
        String url5 = "https://firebasestorage.googleapis.com/v0/b/techqpro99100117.appspot.com/o/Variable%20Types%2Fvt5.PNG?alt=media&token=ee19a056-4d90-4bd2-9421-75d21111eeb9";
        String url6 = "https://firebasestorage.googleapis.com/v0/b/techqpro99100117.appspot.com/o/Variable%20Types%2Fvt6.PNG?alt=media&token=e1156daa-3446-48e6-92fc-37f9944886db";
        String url7 = "https://firebasestorage.googleapis.com/v0/b/techqpro99100117.appspot.com/o/Variable%20Types%2Fvt7.PNG?alt=media&token=607e4be5-6bb4-4d69-b967-aa06c75043ef";
        String url8 = "https://firebasestorage.googleapis.com/v0/b/techqpro99100117.appspot.com/o/Variable%20Types%2Fvt8.PNG?alt=media&token=695e4564-6cb3-40a6-a987-0b4b0cc69b4a";
        String url9 = "https://firebasestorage.googleapis.com/v0/b/techqpro99100117.appspot.com/o/Variable%20Types%2Fvt9.PNG?alt=media&token=10d66eca-0b22-40f6-b75a-2fdbb7e8ff28";
        String url10 = "https://firebasestorage.googleapis.com/v0/b/techqpro99100117.appspot.com/o/Variable%20Types%2Fvt10.PNG?alt=media&token=f510aaa8-0d61-4798-b4cb-15cac481e423";
        String url11 = "https://firebasestorage.googleapis.com/v0/b/techqpro99100117.appspot.com/o/Variable%20Types%2Fvt11.PNG?alt=media&token=42735f90-0205-420b-890d-cc391ebcc329";
        String url12 = "https://firebasestorage.googleapis.com/v0/b/techqpro99100117.appspot.com/o/Variable%20Types%2Fvt12.PNG?alt=media&token=7ab3db90-1a91-47cd-a804-b4bd40da53a9";
        String url13 = "https://firebasestorage.googleapis.com/v0/b/techqpro99100117.appspot.com/o/Variable%20Types%2Fvt13.PNG?alt=media&token=c31d5a80-4e98-4f74-924b-6a8a734a61f8";
        String url14 = "https://firebasestorage.googleapis.com/v0/b/techqpro99100117.appspot.com/o/Variable%20Types%2Fvt14.PNG?alt=media&token=d381b6e1-35ee-4897-9017-e4d2bc303fd1";
        String url15 = "https://firebasestorage.googleapis.com/v0/b/techqpro99100117.appspot.com/o/Variable%20Types%2Fvt15.PNG?alt=media&token=7032f51a-32eb-4c10-98b7-6f08d6701d13";
        String url16 = "https://firebasestorage.googleapis.com/v0/b/techqpro99100117.appspot.com/o/Variable%20Types%2Fvt16.PNG?alt=media&token=ba33c351-692b-4fa0-8e30-aedb0bc90713";
        String url17 = "https://firebasestorage.googleapis.com/v0/b/techqpro99100117.appspot.com/o/Variable%20Types%2Fvt17.PNG?alt=media&token=3a029853-a4bf-4cbb-a52f-0a9a1fb49831";

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
        Glide.with(getApplicationContext()).load(url14).into(imageView13);
        Glide.with(getApplicationContext()).load(url15).into(imageView14);
        Glide.with(getApplicationContext()).load(url16).into(imageView15);
        Glide.with(getApplicationContext()).load(url17).into(imageView16);

        nxt4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(VariableTypes.this, BasicOperators.class);
                startActivity(i);
            }
        });

        pre4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent j = new Intent(VariableTypes.this, DataTypes.class);
                startActivity(j);
            }
        });
    }
}
