package com.example.aplicacaofinal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MenuActivity extends AppCompatActivity {

    ImageButton butMenu;
    ImageButton butLoc;
    ImageButton butMed;
    ImageButton butCons;
    ImageButton butProfile;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        butMenu    = findViewById(R.id.imageButton4);
        butLoc     = findViewById(R.id.imageButton5);
        butMed     = findViewById(R.id.imageButton6);
        butCons    = findViewById(R.id.imageButton3);
        butProfile = findViewById(R.id.imageButton2);

        butProfile.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Profile.class);
                startActivity(intent);
            }
        });

        butMenu.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Calendar.class);
                startActivity(intent);
            }
        });

        butLoc.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Localizacao.class);
                startActivity(intent);
            }
        });

        butMed.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Medicacao.class);
                startActivity(intent);
            }
        });

        butCons.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Consultas.class);
                startActivity(intent);
            }
        });
    }
}