package com.example.myrecycierview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList<contactModel> arrayContact = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        @SuppressLint({"MissingInflatedId", "LocalSuppress"})
        RecyclerView recyclerView = findViewById(R.id.recyclerContact);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        arrayContact.add(new contactModel(R.drawable.d,"A","987645123"));
        arrayContact.add(new contactModel(R.drawable.b,"B","977645123"));
        arrayContact.add(new contactModel(R.drawable.c,"C","967645123"));
        arrayContact.add(new contactModel(R.drawable.d,"D","957645123"));
        arrayContact.add(new contactModel(R.drawable.e,"E","947645123"));
        arrayContact.add(new contactModel(R.drawable.f,"F","927645123"));
        arrayContact.add(new contactModel(R.drawable.i,"G","937645123"));
        arrayContact.add(new contactModel(R.drawable.d,"H","917645123"));
        arrayContact.add(new contactModel(R.drawable.b,"I","907645123"));
        arrayContact.add(new contactModel(R.drawable.c,"J","997645123"));
        arrayContact.add(new contactModel(R.drawable.d,"A","987645123"));
        arrayContact.add(new contactModel(R.drawable.b,"B","977645123"));
        arrayContact.add(new contactModel(R.drawable.c,"C","967645123"));
        arrayContact.add(new contactModel(R.drawable.d,"D","957645123"));
        arrayContact.add(new contactModel(R.drawable.e,"E","947645123"));
        arrayContact.add(new contactModel(R.drawable.e,"E","947645123"));
        arrayContact.add(new contactModel(R.drawable.f,"F","927645123"));
        arrayContact.add(new contactModel(R.drawable.i,"G","937645123"));
        arrayContact.add(new contactModel(R.drawable.d,"H","917645123"));
        arrayContact.add(new contactModel(R.drawable.b,"I","907645123"));
        arrayContact.add(new contactModel(R.drawable.c,"J","997645123"));
        arrayContact.add(new contactModel(R.drawable.d,"A","987645123"));
        arrayContact.add(new contactModel(R.drawable.b,"B","977645123"));
        arrayContact.add(new contactModel(R.drawable.c,"C","967645123"));
        arrayContact.add(new contactModel(R.drawable.d,"D","957645123"));
        arrayContact.add(new contactModel(R.drawable.e,"E","947645123"));
        arrayContact.add(new contactModel(R.drawable.f,"F","927645123"));
        arrayContact.add(new contactModel(R.drawable.i,"G","937645123"));
        arrayContact.add(new contactModel(R.drawable.d,"H","917645123"));
        RecyclerContactAdapter recyclerContactAdapter = new RecyclerContactAdapter(this,arrayContact);
        recyclerView.setAdapter(recyclerContactAdapter)  ;
    }
}