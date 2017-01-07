package com.example.bharat.firstproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void Aman(View view) {
        Intent i = new Intent(this, AmanPratap.class);
        startActivity(i);
    }

    public void Aditya(View view) {
        Intent i = new Intent(this, AdityaWazir.class);
        startActivity(i);
    }

    public void Bharat(View view) {
        Intent i = new Intent(this, BharatShah.class);
        startActivity(i);
    }

    public void Kartik(View view) {
        Intent i = new Intent(this, KartikSaxena.class);
        startActivity(i);
    }

    public void Palak(View view) {
        Intent i = new Intent(this, PalakSood.class);
        startActivity(i);
    }
}
