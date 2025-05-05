package com.example.wifi_bluetooth_camera;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);


        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) Button buttonB = (Button) findViewById(R.id.buttonb);
        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) Button buttonW = (Button) findViewById(R.id.buttonw);
        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) Button buttonC = (Button) findViewById(R.id.buttonc);

        buttonB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent gecisB = new Intent(MainActivity.this, bluetooth.class);
                startActivity(gecisB);
            }
        });

        buttonW.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent gecisW = new Intent(MainActivity.this, wifi.class);
                startActivity(gecisW);
            }
        });

        buttonC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent gecisC = new Intent(MainActivity.this, camera.class);
                startActivity(gecisC);
            }
        });



    }
}