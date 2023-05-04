package com.example.pra_4_explicit_intent;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class second_activity extends AppCompatActivity {
    TextView txt2;
    EditText edt2;
    Button btn2;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        txt2 = findViewById(R.id.txt3);
        edt2 = findViewById(R.id.edtNumber);
        btn2 = findViewById(R.id.btnBack);
        Intent intent1 = new Intent();
        Intent intent2 = new Intent(second_activity.this,MainActivity.class);
        String name = intent1.getStringExtra("name");
        intent2.putExtra("number", String.valueOf(edt2));
        txt2.setText(name);
        btn2.setOnClickListener(view -> startActivity(intent2));

    }
}