package com.example.bruno.jobex;


import android.database.Cursor;
import android.database.SQLException;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class PesquisaServicoActivity extends AppCompatActivity {

    private List<ServicoModelo> listaServico;

    private ArrayAdapter<ServicoModelo> adapter;

    private int adapterLayout = android.R.layout.simple_list_item_1;

    private ListView lvListagem;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pesquisa_servico);

        lvListagem = findViewById(R.id.lvServicos);


    }

    @Override
    protected void onResume() {
        super.onResume();

        this.carregaLista();
    }

    private void carregaLista()
    {
        ServicoDAO dao = new ServicoDAO(this);

        this.listaServico = dao.listar();

        dao.close();

        this.adapter = new ArrayAdapter<ServicoModelo>(this, adapterLayout, listaServico);

        this.lvListagem.setAdapter(adapter);
    }
}
