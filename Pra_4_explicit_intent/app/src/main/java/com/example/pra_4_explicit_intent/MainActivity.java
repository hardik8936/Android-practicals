package com.example.pra_4_explicit_intent;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
     EditText edt1;
     Button btn1;
     TextView txtNumber;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edt1 = findViewById(R.id.edtName);
        btn1 = findViewById(R.id.btnNext);
        txtNumber = findViewById(R.id.txt4);
        Intent iBack = new Intent(MainActivity.this,second_activity.class);
        Intent iNext = new Intent();
        iBack.putExtra("name", edt1.getText().toString());
        iNext.getStringExtra("number");
        btn1.setOnClickListener(view -> startActivity(iBack));

    }
}