package com.example.hw4androit1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Activity_second extends AppCompatActivity {
    TextView textviewofsecondactiivity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        textviewofsecondactiivity = findViewById(R.id.textviewofsecondactivity);
        textviewofsecondactiivity.setText( getIntent().getSerializableExtra("key").toString());

    }
}