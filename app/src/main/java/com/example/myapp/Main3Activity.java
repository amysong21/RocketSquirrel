package com.example.myapp;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.widget.Button;

public class Main3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        final Button correct = findViewById(R.id.correct_answer);
        correct.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                openNextPage();
            }
        });
        final Button incorrect1 = findViewById(R.id.incorrect_answer);
        incorrect1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // pop up funciton
            }
        });
        final Button incorrect2 = findViewById(R.id.incorrect_answer2);
        incorrect2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // pop up funciton
            }
        });

    }

    public void openNextPage() {
        Intent intent = new Intent (this, Main4Activity.class);
        startActivity(intent);
    }


}
