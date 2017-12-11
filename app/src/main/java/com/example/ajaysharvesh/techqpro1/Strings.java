package com.example.ajaysharvesh.techqpro1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class Strings extends AppCompatActivity {

    public ImageView imageView, imageView1, imageView2, imageView3, imageView4, imageView5, imageView6 , imageView7 , imageView8,
            imageView9, imageView10, imageView11, imageView12, imageView13, imageView14, imageView15, imageView16, imageView17,
     imageView18, imageView19, imageView20, imageView21, imageView22;
    public Button nxt9, pre9;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_strings);

        getSupportActionBar().setTitle("Strings");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        pre9 = (Button) findViewById(R.id.btn_pre9);
        nxt9 = (Button) findViewById(R.id.btn_nxt9);

        imageView = (ImageView) findViewById(R.id.s1);
        imageView1 = (ImageView) findViewById(R.id.s2);
        imageView2 = (ImageView) findViewById(R.id.s3);
        imageView3 = (ImageView) findViewById(R.id.s4);
        imageView4 = (ImageView) findViewById(R.id.s5);
        imageView5 = (ImageView) findViewById(R.id.s6);
        imageView6 = (ImageView) findViewById(R.id.s7);
        imageView7 = (ImageView) findViewById(R.id.s8);
        imageView8 = (ImageView) findViewById(R.id.s9);
        imageView9 = (ImageView) findViewById(R.id.s10);
        imageView10 = (ImageView) findViewById(R.id.s11);
        imageView11 = (ImageView) findViewById(R.id.s12);
        imageView12 = (ImageView) findViewById(R.id.s13);
        imageView13 = (ImageView) findViewById(R.id.s14);
        imageView14 = (ImageView) findViewById(R.id.s15);
        imageView15 = (ImageView) findViewById(R.id.s16);
        imageView16 = (ImageView) findViewById(R.id.s17);
        imageView17 = (ImageView) findViewById(R.id.s18);
        imageView18 = (ImageView) findViewById(R.id.s19);
        imageView19 = (ImageView) findViewById(R.id.s20);
        imageView20 = (ImageView) findViewById(R.id.s21);
        imageView21 = (ImageView) findViewById(R.id.s22);
        imageView22 = (ImageView) findViewById(R.id.s23);

        String url1 = "https://firebasestorage.googleapis.com/v0/b/techqpro99100117.appspot.com/o/Strings%2Fs1.PNG?alt=media&token=fd19a71a-850d-4424-9830-7c3972bc8da7";
        String url2 = "https://firebasestorage.googleapis.com/v0/b/techqpro99100117.appspot.com/o/Strings%2Fs2.PNG?alt=media&token=531f9cc9-6072-462d-87b4-84bd25e1a509";
        String url3 = "https://firebasestorage.googleapis.com/v0/b/techqpro99100117.appspot.com/o/Strings%2Fs3.PNG?alt=media&token=a0f28a06-9f01-41cf-b7b2-347871fde43a";
        String url4 = "https://firebasestorage.googleapis.com/v0/b/techqpro99100117.appspot.com/o/Strings%2Fs4.PNG?alt=media&token=5fb23cc2-5ea4-4129-9395-0a7f9dd29d9f";
        String url5 = "https://firebasestorage.googleapis.com/v0/b/techqpro99100117.appspot.com/o/Strings%2Fs5.PNG?alt=media&token=1c4cc5b3-d6db-4eb2-b4a6-6165560f7373";
        String url6 = "https://firebasestorage.googleapis.com/v0/b/techqpro99100117.appspot.com/o/Strings%2Fs6.PNG?alt=media&token=d8ced0ec-dee5-4490-a5ea-80e64797516c";
        String url7 = "https://firebasestorage.googleapis.com/v0/b/techqpro99100117.appspot.com/o/Strings%2Fs7.PNG?alt=media&token=e739222b-49c0-43e5-8c3f-5c269e0c8f29";
        String url8 = "https://firebasestorage.googleapis.com/v0/b/techqpro99100117.appspot.com/o/Strings%2Fs8.PNG?alt=media&token=f4eecd41-b2c2-4f09-93a2-b56c9ab3f572";
        String url9 = "https://firebasestorage.googleapis.com/v0/b/techqpro99100117.appspot.com/o/Strings%2Fs9.PNG?alt=media&token=bfcb547e-bfa7-480d-9489-7152b49bee9e";
        String url10 = "https://firebasestorage.googleapis.com/v0/b/techqpro99100117.appspot.com/o/Strings%2Fs10.PNG?alt=media&token=32b4810c-e747-4907-9d22-4042463af11a";
        String url11 = "https://firebasestorage.googleapis.com/v0/b/techqpro99100117.appspot.com/o/Strings%2Fs11.PNG?alt=media&token=921a3432-413b-48ce-a40f-33d4bc54c533";
        String url12 = "https://firebasestorage.googleapis.com/v0/b/techqpro99100117.appspot.com/o/Strings%2Fs12.PNG?alt=media&token=8bd45417-1be9-4431-bef0-ee7709128a21";
        String url13 = "https://firebasestorage.googleapis.com/v0/b/techqpro99100117.appspot.com/o/Strings%2Fs13.PNG?alt=media&token=49eecc9d-75b9-4238-9935-530abcba0ac8";
        String url14 = "https://firebasestorage.googleapis.com/v0/b/techqpro99100117.appspot.com/o/Strings%2Fs14.PNG?alt=media&token=7e5c0938-51a5-41fb-b9f1-30ae65954275";
        String url15 = "https://firebasestorage.googleapis.com/v0/b/techqpro99100117.appspot.com/o/Strings%2Fs15.PNG?alt=media&token=292f045b-b187-43fd-99d9-f58609bb28ed";
        String url16 = "https://firebasestorage.googleapis.com/v0/b/techqpro99100117.appspot.com/o/Strings%2Fs16.PNG?alt=media&token=6e3cdce8-e1c4-4cfe-98fa-d5d3cbd8bd40";
        String url17 = "https://firebasestorage.googleapis.com/v0/b/techqpro99100117.appspot.com/o/Strings%2Fs17.PNG?alt=media&token=f4fbedbc-6bd8-4915-9636-b9ee191e6ee4";
        String url18 = "https://firebasestorage.googleapis.com/v0/b/techqpro99100117.appspot.com/o/Strings%2Fs18.PNG?alt=media&token=5cb99f19-a6e0-4d99-9499-f6dd51a3f08b";
        String url19 = "https://firebasestorage.googleapis.com/v0/b/techqpro99100117.appspot.com/o/Strings%2Fs19.PNG?alt=media&token=5e353f62-416f-40d6-85aa-372c2cdf70a1";
        String url20 = "https://firebasestorage.googleapis.com/v0/b/techqpro99100117.appspot.com/o/Strings%2Fs20.PNG?alt=media&token=fba54017-8497-4a60-aacc-ff81362a9435";
        String url21 = "https://firebasestorage.googleapis.com/v0/b/techqpro99100117.appspot.com/o/Strings%2Fs21.PNG?alt=media&token=985e4907-6ed8-4c98-a2f5-732d16d2cb8f";
        String url22 = "https://firebasestorage.googleapis.com/v0/b/techqpro99100117.appspot.com/o/Strings%2Fs22.PNG?alt=media&token=99677d74-9d77-4622-b71a-dabd71cf9d1d";
        String url23 = "https://firebasestorage.googleapis.com/v0/b/techqpro99100117.appspot.com/o/Strings%2Fs23.PNG?alt=media&token=167984e6-9f45-4872-9cb2-5b1ef532ec5e";

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
        Glide.with(getApplicationContext()).load(url18).into(imageView17);
        Glide.with(getApplicationContext()).load(url19).into(imageView18);
        Glide.with(getApplicationContext()).load(url20).into(imageView19);
        Glide.with(getApplicationContext()).load(url21).into(imageView20);
        Glide.with(getApplicationContext()).load(url22).into(imageView21);
        Glide.with(getApplicationContext()).load(url23).into(imageView22);

        nxt9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Strings.this, ArraysLists.class) ;
                startActivity(i);
            }
        });

        pre9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent j = new Intent(Strings.this, Numbers.class) ;
                startActivity(j);
            }
        });
    }
}
