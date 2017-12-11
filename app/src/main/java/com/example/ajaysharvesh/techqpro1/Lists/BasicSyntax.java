package com.example.ajaysharvesh.techqpro1.Lists;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.example.ajaysharvesh.techqpro1.Functions.Topics;
import com.example.ajaysharvesh.techqpro1.R;

public class BasicSyntax extends AppCompatActivity {

    public ImageView imageView, imageView1, imageView2, imageView3, imageView4, imageView5, imageView6, imageView7, imageView8, imageView9,
            imageView10, imageView11, imageView12, imageView13, imageView14, imageView15, imageView16, imageView17;

    public Button nxt, pre;

    //private DatabaseReference databaseReference;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_basic_syntax);

        getSupportActionBar().setTitle("Basic Syntax");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        //databaseReference = FirebaseDatabase.getInstance().getReference();

        nxt = (Button) findViewById(R.id.btn_nxt1);
        pre = (Button) findViewById(R.id.btn_pre1);

        imageView = (ImageView) findViewById(R.id.image);
        imageView1 = (ImageView) findViewById(R.id.image1);
        imageView2 = (ImageView) findViewById(R.id.image2);
        imageView3 = (ImageView) findViewById(R.id.image3);
        imageView4 = (ImageView) findViewById(R.id.image4);
        imageView5 = (ImageView) findViewById(R.id.image5);
        imageView6 = (ImageView) findViewById(R.id.image6);
        imageView7 = (ImageView) findViewById(R.id.image7);
        imageView8 = (ImageView) findViewById(R.id.image8);
        imageView9 = (ImageView) findViewById(R.id.image9);
        imageView10 = (ImageView) findViewById(R.id.image10);
        imageView11 = (ImageView) findViewById(R.id.image11);
        imageView12 = (ImageView) findViewById(R.id.image12);
        imageView13 = (ImageView) findViewById(R.id.image13);
        imageView14 = (ImageView) findViewById(R.id.image14);
        imageView15 = (ImageView) findViewById(R.id.image15);
        imageView16 = (ImageView) findViewById(R.id.image16);
        imageView17 = (ImageView) findViewById(R.id.image17);

        String url = "https://firebasestorage.googleapis.com/v0/b/techqpro99100117.appspot.com/o/Basic%20Syntax%2FCapture.PNG?alt=media&token=bc0b7612-6c4d-46b8-9203-a578fd963db6";
        String url1 = "https://firebasestorage.googleapis.com/v0/b/techqpro99100117.appspot.com/o/Basic%20Syntax%2Fi1.PNG?alt=media&token=9d1cb048-6471-4745-95ac-56a71dc2e189";
        String url2 = "https://firebasestorage.googleapis.com/v0/b/techqpro99100117.appspot.com/o/Basic%20Syntax%2Fi2.PNG?alt=media&token=8738cdc4-7cd0-4d7f-b600-35a9536c7991";
        String url3 = "https://firebasestorage.googleapis.com/v0/b/techqpro99100117.appspot.com/o/Basic%20Syntax%2Fi3.PNG?alt=media&token=bc5aa870-1ba3-4ac1-ab1b-2d6ee489bb23";
        String url4 = "https://firebasestorage.googleapis.com/v0/b/techqpro99100117.appspot.com/o/Basic%20Syntax%2Fi4.PNG?alt=media&token=2103ae3d-a624-4946-a39f-cad2b9f7888e";
        String url5 = "https://firebasestorage.googleapis.com/v0/b/techqpro99100117.appspot.com/o/Basic%20Syntax%2Fi5.PNG?alt=media&token=7c41ceb1-5a8f-41b1-839f-560a6b5a655a";
        String url6 = "https://firebasestorage.googleapis.com/v0/b/techqpro99100117.appspot.com/o/Basic%20Syntax%2Fi6.PNG?alt=media&token=b8ac9101-5daa-433a-b809-2fb955f26ef3";
        String url7 = "https://firebasestorage.googleapis.com/v0/b/techqpro99100117.appspot.com/o/Basic%20Syntax%2Fi7.PNG?alt=media&token=0a986fc2-e387-42f0-a0cd-def701e9d828";
        String url8 = "https://firebasestorage.googleapis.com/v0/b/techqpro99100117.appspot.com/o/Basic%20Syntax%2Fi8.PNG?alt=media&token=7ac45d56-0373-4fc6-aa7f-3daa36412802";
        String url9 = "https://firebasestorage.googleapis.com/v0/b/techqpro99100117.appspot.com/o/Basic%20Syntax%2Fi9.PNG?alt=media&token=69f4b2f2-577e-4e8e-8e9d-95d5ac642048";
        String url10 = "https://firebasestorage.googleapis.com/v0/b/techqpro99100117.appspot.com/o/Basic%20Syntax%2Fi10.PNG?alt=media&token=2042e88f-d7f5-4006-be3b-40b076d6e2a2";
        String url11 = "https://firebasestorage.googleapis.com/v0/b/techqpro99100117.appspot.com/o/Basic%20Syntax%2Fi11.PNG?alt=media&token=97b59504-4a89-4be3-bcbc-101180a90c62";
        String url12 = "https://firebasestorage.googleapis.com/v0/b/techqpro99100117.appspot.com/o/Basic%20Syntax%2Fi12.PNG?alt=media&token=b0515802-d676-41f5-8557-32cfdd9620b7";
        String url13 = "https://firebasestorage.googleapis.com/v0/b/techqpro99100117.appspot.com/o/Basic%20Syntax%2Fi13.PNG?alt=media&token=a9960718-09d7-4dcf-a927-f32bcc37e388";
        String url14 = "https://firebasestorage.googleapis.com/v0/b/techqpro99100117.appspot.com/o/Basic%20Syntax%2Fi14.PNG?alt=media&token=062025af-0203-418c-9d08-fca39ebb96a5";
        String url15 = "https://firebasestorage.googleapis.com/v0/b/techqpro99100117.appspot.com/o/Basic%20Syntax%2Fi15.PNG?alt=media&token=f71e288d-25a6-45af-964b-3f9c77ac1321";
        String url16 = "https://firebasestorage.googleapis.com/v0/b/techqpro99100117.appspot.com/o/Basic%20Syntax%2Fi16.PNG?alt=media&token=1226b329-37ca-4f98-bab9-72f2a76dc33a";
        String url17 = "https://firebasestorage.googleapis.com/v0/b/techqpro99100117.appspot.com/o/Basic%20Syntax%2Fi17.PNG?alt=media&token=3f120e30-86f2-40a5-8e2d-fb8858248647";

        Glide.with(getApplicationContext()).load(url).into(imageView);
        Glide.with(getApplicationContext()).load(url1).into(imageView1);
        Glide.with(getApplicationContext()).load(url2).into(imageView2);
        Glide.with(getApplicationContext()).load(url3).into(imageView3);
        Glide.with(getApplicationContext()).load(url4).into(imageView4);
        Glide.with(getApplicationContext()).load(url5).into(imageView5);
        Glide.with(getApplicationContext()).load(url6).into(imageView6);
        Glide.with(getApplicationContext()).load(url7).into(imageView7);
        Glide.with(getApplicationContext()).load(url8).into(imageView8);
        Glide.with(getApplicationContext()).load(url9).into(imageView9);
        Glide.with(getApplicationContext()).load(url10).into(imageView10);
        Glide.with(getApplicationContext()).load(url11).into(imageView11);
        Glide.with(getApplicationContext()).load(url12).into(imageView12);
        Glide.with(getApplicationContext()).load(url13).into(imageView13);
        Glide.with(getApplicationContext()).load(url14).into(imageView14);
        Glide.with(getApplicationContext()).load(url15).into(imageView15);
        Glide.with(getApplicationContext()).load(url16).into(imageView16);
        Glide.with(getApplicationContext()).load(url17).into(imageView17);

        nxt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(BasicSyntax.this, ObjectClass.class) ;
                startActivity(i);
            }
        });

        pre.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent j = new Intent(BasicSyntax.this, Topics.class);
                startActivity(j);
            }
        });
    }
}
