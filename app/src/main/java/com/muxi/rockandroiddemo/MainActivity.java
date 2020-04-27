package com.muxi.rockandroiddemo;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.ryanhuen.rocknet.RockOkPractice;

public class MainActivity extends AppCompatActivity {

    private TextView mRockNet;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mRockNet = findViewById(R.id.rock_net);
        mRockNet.setOnClickListener(v -> {

            RockOkPractice.rockSimpleGet();
        });
    }
}
