package com.example.ajaysharvesh.techqpro1.ProfileActivity;

import android.app.ActionBar;
import android.content.Intent;
import android.provider.ContactsContract;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.MultiAutoCompleteTextView;
import android.widget.Toast;

import com.example.ajaysharvesh.techqpro1.R;
import com.example.ajaysharvesh.techqpro1.RegistrationActivity.MainActivity2;
import com.firebase.client.Firebase;

public class ProfileActivity extends AppCompatActivity {

    private EditText mName, mEmail, mDob, mDegree ;
    private MultiAutoCompleteTextView mCollege ;
    private Firebase mRootref1, mRootref2, mRootref3, mRootref4, mRootref5 ;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        Firebase.setAndroidContext(this) ;

        getSupportActionBar().setTitle("Profile") ;
        getSupportActionBar().setDisplayHomeAsUpEnabled(true) ;

        mRootref1 = new Firebase("https://techqpro99100117.firebaseio.com/");//.push() ;
        mRootref2 = new Firebase("https://techqpro99100117.firebaseio.com/");//.push() ;
        mRootref3 = new Firebase("https://techqpro99100117.firebaseio.com/");//.push() ;
        mRootref4 = new Firebase("https://techqpro99100117.firebaseio.com/");//.push() ;
        mRootref5 = new Firebase("https://techqpro99100117.firebaseio.com/");//.push() ;

        mName = (EditText) findViewById(R.id.name) ;
        mEmail = (EditText) findViewById(R.id.mailid) ;
        mDob = (EditText) findViewById(R.id.date) ;
        mDegree = (EditText) findViewById(R.id.degree) ;
        mCollege = (MultiAutoCompleteTextView) findViewById(R.id.subject) ;

        button = (Button) findViewById(R.id.save);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String value1 = mName.getText().toString() ;
                Firebase childRef1 = mRootref1.child("Name").push() ;
                childRef1.setValue(value1) ;

               String value2 = mEmail.getText().toString() ;
                Firebase childRef2 = mRootref2.child("Email").push() ;
                childRef2.setValue(value2) ;

                String value3 = mDob.getText().toString() ;
                Firebase childRef3 = mRootref3.child("Date-Of-Birth").push() ;
                childRef3.setValue(value3) ;

                String value4 = mDegree.getText().toString() ;
                Firebase childRef4 = mRootref4.child("Degree").push() ;
                childRef4.setValue(value4) ;

                String value5 = mCollege.getText().toString() ;
                Firebase childRef5 = mRootref5.child("College").push() ;
                childRef5.setValue(value5) ;

                if(TextUtils.isEmpty(value1)) {
                    Toast.makeText(getApplication(), "Please fill your data completely !", Toast.LENGTH_LONG).show() ;
                    return;
                } else {
                    Toast.makeText(getApplication(), "Your profile is edited and saved successfully.", Toast.LENGTH_LONG).show() ;
                    Intent intent = new Intent(ProfileActivity.this, MainActivity2.class) ;
                    startActivity(intent) ;
                }

                /** Toast.makeText(ProfileActivity.this, "Your profile is edited and saved successfully.", Toast.LENGTH_LONG).show() ;

                if (mName == null && mName == null && mCollege == null && mDegree == null && mDob == null) {

                    Toast.makeText(ProfileActivity.this, "Please fill your data completely !", Toast.LENGTH_LONG).show();
                    return;

                } else {

                    Toast.makeText(ProfileActivity.this, "Your profile is edited and saved successfully.", Toast.LENGTH_LONG).show() ;
                    Intent intent = new Intent(ProfileActivity.this, MainActivity2.class);
                    startActivity(intent);
                } */

            }
        });

    }
}

