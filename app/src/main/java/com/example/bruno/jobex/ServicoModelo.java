package com.example.bruno.jobex;

public class ServicoModelo {

    private Integer id;
    private String nome;
    private String descricao;
    private float valorEmReais;
    private float valorEmMoedaVirtual;
    private String tags;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public float getValorEmReais() {
        return valorEmReais;
    }

    public void setValorEmReais(float valorEmReais) {
        this.valorEmReais = valorEmReais;
    }

    public float getValorEmMoedaVirtual() {
        return valorEmMoedaVirtual;
    }

    public void setValorEmMoedaVirtual(float valorEmMoedaVirtual) {
        this.valorEmMoedaVirtual = valorEmMoedaVirtual;
    }

    public String getTags() {
        return tags;
    }

    public void setTags(String tags) {
        this.tags = tags;
    }


}
