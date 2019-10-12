package com.example.myapp;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.widget.Button;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        final Button button = findViewById(R.id.set);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                openNextPage();
            }
        });

    }

    public void openNextPage() {
        Intent intent = new Intent (this, Main3Activity.class);
        startActivity(intent);
    }



}
