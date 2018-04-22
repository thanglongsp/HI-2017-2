package com.example.thanglongsp.tuoicay;

import android.content.Intent;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    private Button btnClickOk;
    private Button btnClickCancel;
    private Button btnGui;
    private Button btnGopy;
    private Button btnHoso;
    private Button btnGiaitri;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnClickOk=(Button)findViewById(R.id.btnOk);

        btnClickOk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,ClickOk.class);
                startActivity(intent);
            }
        });

        btnGui=(Button)findViewById(R.id.bntGuide);
        btnGui.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,Guide.class);
                startActivity(intent);
            }
        });

        btnGopy=(Button)findViewById(R.id.bntGopy);
        btnGopy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,GopY.class);
                startActivity(intent);
            }
        });

        btnHoso=(Button)findViewById(R.id.bntProfile);
        btnHoso.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,Hoso.class);
                startActivity(intent);
            }
        });

        btnClickCancel=(Button)findViewById(R.id.btnCancel);
        btnClickCancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,ClickCancel.class);
                startActivity(intent);
            }
        });

        btnGiaitri=(Button)findViewById(R.id.button3);
        btnGiaitri.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,Gaitri.class);
                startActivity(intent);
            }
        });

    }

}
