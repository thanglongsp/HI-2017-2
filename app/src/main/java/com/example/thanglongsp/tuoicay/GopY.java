package com.example.thanglongsp.tuoicay;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class GopY extends AppCompatActivity {
    private Button btnGui;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gop_y);

        btnGui=(Button)findViewById(R.id.btnGui);
        btnGui.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                        Toast.makeText(getApplicationContext(),"Cảm ơn bạn đã góp ý!", Toast.LENGTH_LONG).show();
            }
        });
    }
}
