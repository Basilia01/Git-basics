package com.example.myapplication;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.google.android.material.textfield.TextInputEditText;

import java.util.Spliterators;

public class MainActivity extends AppCompatActivity {
EditText p,t;
Button btn;
TextView txt;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        p= findViewById( R.id.Poids);
        t= findViewById( R.id.Taille);


        findViewById(R.id.BTNOKAY).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               // Toast.makeText(MainActivity.this, "Taille="+t.getText().toString(), Toast.LENGTH_SHORT).show();
                double a= Double.parseDouble(t.getText().toString());
                int b= Integer.parseInt(p.getText().toString());
                double c= b / (a*a);
                Toast.makeText(MainActivity.this, "IMC"+c , Toast.LENGTH_SHORT).show();
                txt= findViewById(R.id.valiny);
                if (c<18.5) {
                    txt.setText("Vous etes sous poids");
                }
                else if ( c>=18.5 && c<=24.9) {
                    txt.setText("Vous etes normale");
                } else if (c>=25 && c<29.9) {
                    txt.setText("Vous etes surpoids");

                }
                else {
                    txt.setText("Vous etes obeise");

                }
            }
        });

        }

    }