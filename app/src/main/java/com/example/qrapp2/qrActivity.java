package com.example.qrapp2;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class qrActivity extends AppCompatActivity {

    private Button createQRbutton;
    private Button ScanQRbutton;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_makeqr);

        createQRbutton = (Button) findViewById(R.id.createQR);
        ScanQRbutton = (Button) findViewById(R.id.scanQR);

        createQRbutton.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent intent = new Intent(qrActivity.this, CreateQR.class);
                startActivity(intent);
            }
        });

        ScanQRbutton.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent intent = new Intent(qrActivity.this, ScanQR.class);
                startActivity(intent);
            }
        });


    }
}