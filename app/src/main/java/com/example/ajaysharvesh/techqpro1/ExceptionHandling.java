package com.example.ajaysharvesh.techqpro1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class ExceptionHandling extends AppCompatActivity {

    public ImageView imageView, imageView1, imageView2, imageView3, imageView4, imageView5, imageView6, imageView7, imageView8,
            imageView9, imageView10, imageView11, imageView12, imageView13, imageView14, imageView15, imageView16, imageView17, imageView18,
            imageView19, imageView20, imageView21, imageView22, imageView23, imageView24, imageView25, imageView26, imageView27, imageView28,
     imageView29, imageView30, imageView31, imageView32, imageView33;
    public Button nxt15, pre15;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exception_handling);

        getSupportActionBar().setTitle("Exception Handling");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        pre15 = (Button) findViewById(R.id.btn_pre15);
        nxt15 = (Button) findViewById(R.id.btn_nxt15);

        imageView = (ImageView) findViewById(R.id.eh1);
        imageView1 = (ImageView) findViewById(R.id.eh2);
        imageView2 = (ImageView) findViewById(R.id.eh3);
        imageView3 = (ImageView) findViewById(R.id.eh4);
        imageView4 = (ImageView) findViewById(R.id.eh5);
        imageView5 = (ImageView) findViewById(R.id.eh6);
        imageView6 = (ImageView) findViewById(R.id.eh7);
        imageView7 = (ImageView) findViewById(R.id.eh8);
        imageView8 = (ImageView) findViewById(R.id.eh9);
        imageView9 = (ImageView) findViewById(R.id.eh10);
        imageView10 = (ImageView) findViewById(R.id.eh11);
        imageView11 = (ImageView) findViewById(R.id.eh12);
        imageView12 = (ImageView) findViewById(R.id.eh13);
        imageView13 = (ImageView) findViewById(R.id.eh14);
        imageView14 = (ImageView) findViewById(R.id.eh15);
        imageView15 = (ImageView) findViewById(R.id.eh16);
        imageView16 = (ImageView) findViewById(R.id.eh17);
        imageView17 = (ImageView) findViewById(R.id.eh18);
        imageView18 = (ImageView) findViewById(R.id.eh19);
        imageView19 = (ImageView) findViewById(R.id.eh20);
        imageView20 = (ImageView) findViewById(R.id.eh21);
        imageView21 = (ImageView) findViewById(R.id.eh22);
        imageView22 = (ImageView) findViewById(R.id.eh23);
        imageView23 = (ImageView) findViewById(R.id.eh24);
        imageView24 = (ImageView) findViewById(R.id.eh25);
        imageView25 = (ImageView) findViewById(R.id.eh26);
        imageView26 = (ImageView) findViewById(R.id.eh27);
        imageView27 = (ImageView) findViewById(R.id.eh28);
        imageView28 = (ImageView) findViewById(R.id.eh29);
        imageView29 = (ImageView) findViewById(R.id.eh30);
        imageView30 = (ImageView) findViewById(R.id.eh31);
        imageView31 = (ImageView) findViewById(R.id.eh32);
        imageView32 = (ImageView) findViewById(R.id.eh33);
        imageView33 = (ImageView) findViewById(R.id.eh34);

        String url1 = "https://firebasestorage.googleapis.com/v0/b/techqpro99100117.appspot.com/o/Exception%20Handling%2Feh1.PNG?alt=media&token=d6b7b7cc-b1d5-4a31-9704-d5ad6df5d576";
        String url2 = "https://firebasestorage.googleapis.com/v0/b/techqpro99100117.appspot.com/o/Exception%20Handling%2Feh2.PNG?alt=media&token=23c18aed-d4ee-44ab-92d2-8653c692933a";
        String url3 = "https://firebasestorage.googleapis.com/v0/b/techqpro99100117.appspot.com/o/Exception%20Handling%2Feh3.PNG?alt=media&token=7c6d569b-550a-48d6-b949-cf1d6254ace1";
        String url4 = "https://firebasestorage.googleapis.com/v0/b/techqpro99100117.appspot.com/o/Exception%20Handling%2Feh4.PNG?alt=media&token=fec50702-63fd-462a-900f-bf47db9aa192";
        String url5 = "https://firebasestorage.googleapis.com/v0/b/techqpro99100117.appspot.com/o/Exception%20Handling%2Feh5.PNG?alt=media&token=a7420602-908d-411a-918b-02ac67424d72";
        String url6 = "https://firebasestorage.googleapis.com/v0/b/techqpro99100117.appspot.com/o/Exception%20Handling%2Feh6.PNG?alt=media&token=a44adcd1-fc7a-4d88-876e-ea0975556330";
        String url7 = "https://firebasestorage.googleapis.com/v0/b/techqpro99100117.appspot.com/o/Exception%20Handling%2Feh7.PNG?alt=media&token=a32aac89-83e4-45a5-ad49-03cc620984b1";
        String url8 = "https://firebasestorage.googleapis.com/v0/b/techqpro99100117.appspot.com/o/Exception%20Handling%2Feh8.PNG?alt=media&token=c2e1b287-02fd-4e10-b0d4-4084b56b1709";
        String url9 = "https://firebasestorage.googleapis.com/v0/b/techqpro99100117.appspot.com/o/Exception%20Handling%2Feh9.PNG?alt=media&token=f56aa6a8-aa03-437b-a39e-7a8200a122b8";
        String url10 = "https://firebasestorage.googleapis.com/v0/b/techqpro99100117.appspot.com/o/Exception%20Handling%2Feh10.PNG?alt=media&token=0adbc52c-c034-4eb8-85ff-5a766fafa9ea";
        String url11 = "https://firebasestorage.googleapis.com/v0/b/techqpro99100117.appspot.com/o/Exception%20Handling%2Feh11.PNG?alt=media&token=3fcc4baa-7193-4a7d-afcc-719d58410348";
        String url12 = "https://firebasestorage.googleapis.com/v0/b/techqpro99100117.appspot.com/o/Exception%20Handling%2Feh12.PNG?alt=media&token=4c6a9834-1458-423f-a1c1-da6c31521d82";
        String url13 = "https://firebasestorage.googleapis.com/v0/b/techqpro99100117.appspot.com/o/Exception%20Handling%2Feh13.PNG?alt=media&token=55a9ef67-4ca1-4c19-8ff6-39a5ec50a6e8";
        String url14 = "https://firebasestorage.googleapis.com/v0/b/techqpro99100117.appspot.com/o/Exception%20Handling%2Feh14.PNG?alt=media&token=3e92070d-6f00-40ea-972b-38eb329016e8";
        String url15 = "https://firebasestorage.googleapis.com/v0/b/techqpro99100117.appspot.com/o/Exception%20Handling%2Feh15.PNG?alt=media&token=ac743f29-5844-45ed-87a8-ca77056f878d";
        String url16 = "https://firebasestorage.googleapis.com/v0/b/techqpro99100117.appspot.com/o/Exception%20Handling%2Feh16.PNG?alt=media&token=a26efd43-d509-411a-bc3c-b59e4a49ebfd";
        String url17 = "https://firebasestorage.googleapis.com/v0/b/techqpro99100117.appspot.com/o/Exception%20Handling%2Feh17.PNG?alt=media&token=e92d20b7-b76c-4c2e-ad60-89b5ebf937bf";
        String url18 = "https://firebasestorage.googleapis.com/v0/b/techqpro99100117.appspot.com/o/Exception%20Handling%2Feh18.PNG?alt=media&token=316190e2-00e3-4e1f-80b7-836ed2112e31";
        String url19 = "https://firebasestorage.googleapis.com/v0/b/techqpro99100117.appspot.com/o/Exception%20Handling%2Feh19.PNG?alt=media&token=36899486-cb5f-4e31-bf49-be4b539f57ae";
        String url20 = "https://firebasestorage.googleapis.com/v0/b/techqpro99100117.appspot.com/o/Exception%20Handling%2Feh20.PNG?alt=media&token=1e8d25b3-677d-4d81-a3e3-6182a072f465";
        String url21 = "https://firebasestorage.googleapis.com/v0/b/techqpro99100117.appspot.com/o/Exception%20Handling%2Feh21.PNG?alt=media&token=82354ccf-3643-491a-88b5-1dd2d3d9fe65";
        String url22 = "https://firebasestorage.googleapis.com/v0/b/techqpro99100117.appspot.com/o/Exception%20Handling%2Feh22.PNG?alt=media&token=8f1f83bb-bd6f-4d4d-890a-7bfb499d66ea";
        String url23 = "https://firebasestorage.googleapis.com/v0/b/techqpro99100117.appspot.com/o/Exception%20Handling%2Feh23.PNG?alt=media&token=ff070835-434a-4eb5-9ea0-edabe83cb46f";
        String url24 = "https://firebasestorage.googleapis.com/v0/b/techqpro99100117.appspot.com/o/Exception%20Handling%2Feh24.PNG?alt=media&token=5c6030d0-03b1-4abd-ad5b-9378e14b5f5f";
        String url25 = "https://firebasestorage.googleapis.com/v0/b/techqpro99100117.appspot.com/o/Exception%20Handling%2Feh25.PNG?alt=media&token=0db38853-909e-449e-882e-aefbf88076ea";
        String url26 = "https://firebasestorage.googleapis.com/v0/b/techqpro99100117.appspot.com/o/Exception%20Handling%2Feh26.PNG?alt=media&token=0ff43fbb-955d-4dab-849e-5eb0c745047a";
        String url27 = "https://firebasestorage.googleapis.com/v0/b/techqpro99100117.appspot.com/o/Exception%20Handling%2Feh27.PNG?alt=media&token=1c75befe-3904-4357-a755-00218e4ec0ff";
        String url28 = "https://firebasestorage.googleapis.com/v0/b/techqpro99100117.appspot.com/o/Exception%20Handling%2Feh28.PNG?alt=media&token=8f8747ba-5dd7-454c-b50d-8285ca544745";
        String url29 = "https://firebasestorage.googleapis.com/v0/b/techqpro99100117.appspot.com/o/Exception%20Handling%2Feh29.PNG?alt=media&token=f0535586-ed7a-482b-8311-e66cec04fcc7";
        String url30 = "https://firebasestorage.googleapis.com/v0/b/techqpro99100117.appspot.com/o/Exception%20Handling%2Feh30.PNG?alt=media&token=a936e579-abda-4526-978d-f7187b7a4eae";
        String url31 = "https://firebasestorage.googleapis.com/v0/b/techqpro99100117.appspot.com/o/Exception%20Handling%2Feh31.PNG?alt=media&token=9c15c04b-f4b9-45c3-a249-8896a30e47d6";
        String url32 = "https://firebasestorage.googleapis.com/v0/b/techqpro99100117.appspot.com/o/Exception%20Handling%2Feh32.PNG?alt=media&token=7444feca-edc9-4fa1-a2f6-15b9f053d6dc";
        String url33 = "https://firebasestorage.googleapis.com/v0/b/techqpro99100117.appspot.com/o/Exception%20Handling%2Feh33.PNG?alt=media&token=092a3eac-82df-4a4d-89de-2fe40a8fd692";
        String url34 = "https://firebasestorage.googleapis.com/v0/b/techqpro99100117.appspot.com/o/Exception%20Handling%2Feh34.PNG?alt=media&token=5427191c-ddbc-4dd2-9b51-ce030eb2aaea";

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
        Glide.with(getApplicationContext()).load(url24).into(imageView23);
        Glide.with(getApplicationContext()).load(url25).into(imageView24);
        Glide.with(getApplicationContext()).load(url26).into(imageView25);
        Glide.with(getApplicationContext()).load(url27).into(imageView26);
        Glide.with(getApplicationContext()).load(url28).into(imageView27);
        Glide.with(getApplicationContext()).load(url29).into(imageView28);
        Glide.with(getApplicationContext()).load(url30).into(imageView29);
        Glide.with(getApplicationContext()).load(url31).into(imageView30);
        Glide.with(getApplicationContext()).load(url32).into(imageView31);
        Glide.with(getApplicationContext()).load(url33).into(imageView32);
        Glide.with(getApplicationContext()).load(url34).into(imageView33);


        nxt15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(ExceptionHandling.this, Inheritance.class) ;
                startActivity(i);
            }
        });

        pre15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent j = new Intent(ExceptionHandling.this, FilesIo.class) ;
                startActivity(j);
            }
        });
    }
}
