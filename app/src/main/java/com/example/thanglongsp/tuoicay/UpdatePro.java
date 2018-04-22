package com.example.thanglongsp.tuoicay;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class UpdatePro extends AppCompatActivity {
    private Button btnUpdate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_update_pro);

        btnUpdate=(Button)findViewById(R.id.btnUpdateProOk);
        btnUpdate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"Bạn đã cập nhật thành công!", Toast.LENGTH_LONG).show();
            }
        });

    }
}
