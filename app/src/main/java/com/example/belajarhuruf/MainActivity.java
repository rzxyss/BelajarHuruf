package com.example.belajarhuruf;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btnHuruf, btnHijaiyah, btnAngka;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnHuruf = findViewById(R.id.btnAbjad);
        btnHuruf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, AbjadActivity.class));
                finish();
            }
        });

        btnAngka = findViewById(R.id.btnAngka);
        btnAngka.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, AngkaActivity.class));
                finish();
            }
        });

        btnHijaiyah = findViewById(R.id.btnHijaiyah);
        btnHijaiyah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, HijaiyahActivity.class));
                finish();
            }
        });
    }
}