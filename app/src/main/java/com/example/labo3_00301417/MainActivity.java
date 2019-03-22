package com.example.labo3_00301417;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import com.example.labo3_00301417.utilis.AppConstant;

public class MainActivity extends AppCompatActivity {

    private EditText mEdit;
    private Button mButton,mButtonShare;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mEdit=findViewById(R.id.et_text);
        mButton = findViewById(R.id.btn_send);
        mButtonShare = findViewById(R.id.btn_share);
        mButton.setOnClickListener(v-> {
            String text = mEdit.getText().toString();
            Intent mIntent = new Intent(MainActivity.this,newactivity.class);
            mIntent.putExtra(AppConstant.TEXT_kEY,text);
            startActivity(mIntent);
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
