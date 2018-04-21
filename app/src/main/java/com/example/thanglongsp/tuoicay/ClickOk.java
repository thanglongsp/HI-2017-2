package com.example.thanglongsp.tuoicay;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.media.Image;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;

public class ClickOk extends AppCompatActivity {
    private Image imgUpdate;
    private Image imgReupdate;
    private Image imgTuoi;
    private Image imgEx;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_click_ok);

        final ImageView imgUpdate = (ImageView)findViewById(R.id.staRed);
        final ImageView imgReupdate = (ImageView)findViewById(R.id.staBlue);
        final ImageView imgTuoi = (ImageView)findViewById(R.id.imageTuoi);
        final ImageView imgEx = (ImageView)findViewById(R.id.imgEx);

        imgUpdate.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                imgUpdate.setVisibility(View.INVISIBLE);
                imgReupdate.setVisibility(View.VISIBLE);
            }
        });

        imgTuoi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ClickOk.this,UpdateOk.class);
                startActivity(intent);
            }
        });

        imgEx.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ClickOk.this,Unupdate.class);
                startActivity(intent);
            }
        });

    }
}
