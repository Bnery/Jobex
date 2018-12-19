package com.example.bruno.jobex;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class TelaPrincipalActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_principal);
    }

    public void btnCadServico(View v)
    {
        Intent intent = new Intent(TelaPrincipalActivity.this, CadServicoActivity.class);
        startActivity(intent);
    }

    public void btnListaServico(View v)
    {
        Intent intent = new Intent( TelaPrincipalActivity.this, PesquisaServicoActivity.class);
        startActivity(intent);
    }
}
