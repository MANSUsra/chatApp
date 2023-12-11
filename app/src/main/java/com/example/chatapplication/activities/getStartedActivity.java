package com.example.chatapplication.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.chatapplication.R;

public class getStartedActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_get_started);
        setContentView(R.layout.activity_get_started);

        Button btnStartSignIn = findViewById(R.id.btnGetStarted);
        btnStartSignIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(getStartedActivity.this, signInActivity.class);
                startActivity(intent);
            }
        });
    }
}