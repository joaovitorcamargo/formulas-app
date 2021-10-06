package com.example.pontoturistico;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void quinzinhoTela(View view) {
        Intent intent = new Intent(MainActivity.this, quinzinho.class);
        startActivity(intent);
    }

    public void prefeituraTela(View view) {
        Intent intent = new Intent(MainActivity.this, prefeitura.class);
        startActivity(intent);
    }

    public void chicoMendesTela(View view) {
        Intent intent = new Intent(MainActivity.this, chicomendes.class);
        startActivity(intent);
    }
}