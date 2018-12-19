package com.example.bruno.jobex;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class CadServicoActivity extends AppCompatActivity {

    private FormServicoHelper helper;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cad_servico);

        helper = new FormServicoHelper(this);

    }

    public void btnVoltar(View v)
    {
        finish();
    }

    public void btnCadastrar(View v)
    {
        ServicoModelo servico = helper.getServico();

        ServicoDAO dao = new ServicoDAO(CadServicoActivity.this);

        dao.cadastrar(servico);

        dao.close();

        finish();
    }

}
