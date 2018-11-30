package com.example.bruno.jobex;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LoginActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    public void btnLogar(View v)
    {
        Intent i = new Intent( LoginActivity.this, TelaPrincipalActivity.class);
        startActivity(i);
    }
    public void btnCadastrar(View v)
    {
        Intent i = new Intent(LoginActivity.this, CadUserActivity.class);
        startActivity(i);
    }
}
