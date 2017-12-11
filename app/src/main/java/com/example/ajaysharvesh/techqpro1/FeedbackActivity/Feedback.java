package com.example.ajaysharvesh.techqpro1.FeedbackActivity;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.ajaysharvesh.techqpro1.R;

public class Feedback extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feedback);

        getSupportActionBar().setTitle("Feedback");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        //final EditText sendto = (EditText) findViewById(R.id.sendto);
        final EditText name = (EditText) findViewById(R.id.name);
        final EditText subject = (EditText) findViewById(R.id.subject);

        Button btnfb = (Button) findViewById(R.id.feedback1);

        btnfb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //String sendTo = sendto.getText().toString();
                String nameS = name.getText().toString();
                String subjectS = subject.getText().toString();

                Intent email = new Intent(Intent.ACTION_SEND);
                //email.putExtra(Intent.EXTRA_EMAIL, sendTo);
                //email.putExtra(Intent.EXTRA_EMAIL, new String [] { sendTo });

                email.setData(Uri.parse("mailto: ")); // Only Email app will handle this..
                String[] addresses = new String[1];
                addresses[0] = "technpro.wolfpack@gmail.com";
                email.putExtra(Intent.EXTRA_EMAIL, addresses);
                email.putExtra(Intent.EXTRA_TEXT, subjectS);
                email.putExtra(Intent.EXTRA_SUBJECT, nameS);
                email.setType("message/rfc822");

                if(email.resolveActivity(getPackageManager()) != null) {
                    startActivity(Intent.createChooser(email, "Choose app to send feedback.."));
                }


            }
        });
    }
}
