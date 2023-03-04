package com.example.practice;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    EditText edt1;
    Button bt1;
    @SuppressWarnings("ResultOfMethodCallIgnored")
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edt1 = findViewById(R.id.edt1);
        bt1 = findViewById(R.id.btn1);
        bt1.setOnClickListener(view -> {
            Uri uri = Uri.parse(String.valueOf(edt1));
            Intent intent = new Intent(Intent.ACTION_VIEW,uri);
            String.valueOf(edt1);
            startActivity(intent);

        });

    }
}