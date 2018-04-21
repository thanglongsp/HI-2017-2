package com.example.thanglongsp.tuoicay;

import android.content.Intent;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class UpdateOk extends AppCompatActivity {
    private Image imgUpdate;
    private Image imgReupdate;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_update_ok);

        final ImageView imgUpdate = (ImageView)findViewById(R.id.staRed);
        final ImageView imgReupdate = (ImageView)findViewById(R.id.staBlue);

        imgUpdate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imgUpdate.setVisibility(View.INVISIBLE);
                imgReupdate.setVisibility(View.VISIBLE);
                Toast.makeText(getApplicationContext(),"Bạn đã cập nhật thành công!", Toast.LENGTH_LONG).show();
            }
        });
    }
}
