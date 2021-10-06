package com.example.pontoturistico;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class chicomendes extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chicomendes);
    }

    public void btnAbrirMapaClick(View view) {
        Uri uri = Uri.parse("geo:0,0?q=Av+Três+de+Março++1025");
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        //intent.setPackage("com.google.android.apps.maps");
        startActivity(intent);
    }

    public void btnNavegarMapa3Click(View view) {
        Uri uri = Uri.parse("google.navigation:q=Av+Três+de+Março++1025");
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        //intent.setPackage("com.google.android.apps.maps");
        startActivity(intent);
    }

    public void btnSite3(View view) {
        Uri uri = Uri.parse("https://turismo.sorocaba.sp.gov.br/visite/parque-natural-chico-mendes/");
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        //intent.setPackage("com.google.android.apps.maps");
        startActivity(intent);
    }
}