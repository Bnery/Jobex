package com.example.bruno.jobex;

public class ServicoModelo {

    private Long id;
    private String nome;
    private String descricao;
    private String valorEmReais;
    private String valorEmMoedaVirtual;
    private String tags;

    @Override
    public String toString() {
        return nome;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
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

    public String getValorEmReais() {
        return valorEmReais;
    }

    public void setValorEmReais(String valorEmReais) {
        this.valorEmReais = valorEmReais;
    }

    public String getValorEmMoedaVirtual() {
        return valorEmMoedaVirtual;
    }

    public void setValorEmMoedaVirtual(String valorEmMoedaVirtual) {
        this.valorEmMoedaVirtual = valorEmMoedaVirtual;
    }

    public String getTags() {
        return tags;
    }

    public void setTags(String tags) {
        this.tags = tags;
    }


}
