package com.muxi.rockandroiddemo;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.ryanhuen.rockkotlindemo.KotlinDemoEntry;
import com.ryanhuen.rocknet.RockOkPractice;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView rockNet = findViewById(R.id.rock_net);
        rockNet.setOnClickListener(v -> RockOkPractice.rockSimpleGet());
        TextView kotlinDemo = findViewById(R.id.kotlin_demo);
        kotlinDemo.setOnClickListener(v -> startActivity(new Intent(this, KotlinDemoEntry.class)));

    }
}
