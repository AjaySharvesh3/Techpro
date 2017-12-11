package com.example.ajaysharvesh.techqpro1.RatingActivity;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.TextView;
import android.widget.Toast;

import com.example.ajaysharvesh.techqpro1.R;

public class Rating extends AppCompatActivity {

    public RatingBar rb;
    public TextView tv;
    public Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rating);

        getSupportActionBar().setTitle("Rating");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        rb = (RatingBar) findViewById(R.id.ratingBar);
        tv = (TextView) findViewById(R.id.value);
        button = (Button) findViewById(R.id.ratethis);


        rb.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {

                tv.setText("Rated Stars: " + rating);

            }
        });


        /**Intent intent = new Intent(Intent.ACTION_SENDTO);
        intent.setData(Uri.parse("MailTo: "));
        String[] address = new String[1];
        address[0] = "technpro.wolfpack@gmail.com";
        intent.putExtra(Intent.EXTRA_SUBJECT, "Rating");
        intent.putExtra(Intent.EXTRA_TEXT, rating);
        intent.setType("message/rfc822");

        startActivity(Intent.createChooser(intent, "Choose the app..")); */

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText( Rating.this, "Rated Successful !", Toast.LENGTH_SHORT ).show();

                    }
                });

            }


}
