package com.example.bruno.jobex;

import android.widget.EditText;


public class FormServicoHelper {

    private EditText nome;
    private EditText descricao;
    private EditText valorEmReais;
    private EditText valorEmMoedaVirtual;
    private EditText tags;

    private ServicoModelo servico;

    public FormServicoHelper(CadServicoActivity activity) {

        this.nome =  activity.findViewById(R.id.edtCadNome);
        this.descricao = activity.findViewById(R.id.edtCadDescricao);
        this.valorEmReais = activity.findViewById(R.id.edtValorReais);
        this.valorEmMoedaVirtual = activity.findViewById(R.id.edtValorMoedaVirtual);
        this.tags = activity.findViewById(R.id.edtTags);

        servico = new ServicoModelo();
    }

    public ServicoModelo getServico() {

        servico.setNome(nome.getText().toString());
        servico.setDescricao(descricao.getText().toString());
        servico.setValorEmReais(valorEmReais.getText().toString());
        servico.setValorEmMoedaVirtual(valorEmMoedaVirtual.getText().toString());
        servico.setTags(tags.getText().toString());

        return servico;
    }
}
