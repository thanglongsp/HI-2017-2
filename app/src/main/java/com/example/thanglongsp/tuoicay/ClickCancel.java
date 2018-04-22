package com.example.thanglongsp.tuoicay;

import android.content.Intent;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class ClickCancel extends AppCompatActivity {
    private Image imgView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_click_cancel);

        final ImageView imgView = (ImageView)findViewById(R.id.imageView);
        imgView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ClickCancel.this,ClickOk.class);
                startActivity(intent);
            }
        });
    }
}
