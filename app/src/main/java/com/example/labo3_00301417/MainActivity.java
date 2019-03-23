package com.example.labo3_00301417;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import com.example.labo3_00301417.utilis.AppConstant;

public class MainActivity extends AppCompatActivity {

    private EditText mUser, mPassword, mMail, mGender;
    private Button mButton, mButtonShare;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mUser = findViewById(R.id.user);
        mPassword = findViewById(R.id.password);
        mMail = findViewById(R.id.mail);
        mGender = findViewById(R.id.gender);

        mButtonShare = findViewById(R.id.btn_share);


        mButton.setOnClickListener(v -> {

            mButtonShare.setOnClickListener(v -> {
                String user = mUser.getText().toString();
                String password = mPassword.getText().toString();
                String mail = mMail.getText().toString();
                String gender = mGender.getText().toString();
                Intent mIntent = new Intent(MainActivity.this, newactivity.class);
                mIntent.putExtra("user", user);
                mIntent.putExtra("password", password);
                mIntent.putExtra("mail", mail);
                mIntent.putExtra("gender", gender);

                startActivity(mIntent);


            });
        });
        mButtonShare.setOnClickListener(v->{
            String text =mEdit.getText().toString();
            Intent mIntent = new Intent();
            mIntent.setType("text/plain");
            mIntent.setAction(Intent.ACTION_SEND);
            mIntent.putExtra(Intent.EXTRA_TEXT,text);
            startActivity(mIntent);
        });
    }
}
