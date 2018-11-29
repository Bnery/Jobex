package com.example.bruno.jobex;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class CadUserActivity extends AppCompatActivity {

    Button btnBackLogin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cad_user);

        btnBackLogin = findViewById(R.id.btnBackLogin);

        btnBackLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(CadUserActivity.this, LoginActivity.class);
                startActivity(i);
            }
        });
    }
}
