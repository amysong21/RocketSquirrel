package com.example.myapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Button;
import android.content.Intent;

public class MainActivity extends AppCompatActivity {
    public static final String EXTRA_MESSAGE = "com.example.myapp.MESSAGE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final Button button = findViewById(R.id.set);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                openNextPage();
            }
        });

    }

    public void openNextPage() {
        Intent intent = new Intent (this, Main2Activity.class);
        startActivity(intent);
    }

}
