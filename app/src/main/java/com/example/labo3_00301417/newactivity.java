package com.example.labo3_00301417;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.example.labo3_00301417.utilis.AppConstant;

public class newactivity extends AppCompatActivity {

    private TextView mTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_newactivity);
        mTextView = findViewById(R.id.tv_message);
        Intent mIntent= getIntent();
        if (mIntent!=null){
            mTextView.setText(mIntent.getStringExtra(Intent.EXTRA_TEXT));
        }
    }
}
