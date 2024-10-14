package br.com.alura.conversor.modelos;

import java.io.IOException;

public class Moeda {
    private String nome;
    private String sigla;
    private double valor;

    public Moeda(String nome, String sigla, double valor) {
        this.nome = nome;
        this.sigla = sigla;
        this.valor = valor;
    }

    public Moeda() {
    }

    public double getValor() {
        return valor;
    }

    public String getNome() {
        return nome;
    }

    public String getSigla() {
        return sigla;
    }

    public void converterMoeda(String urlBaseCode, String urlTargetCode, double urlAmount) throws IOException, InterruptedException {
        Endereco endereco = new Endereco();
        var urlAPI = "https://v6.exchangerate-api.com/v6/6eed290864dfebbae861b4e6/pair";
        var urlComplete = urlAPI + "/" + urlBaseCode + "/" + urlTargetCode + "/" + urlAmount;

        endereco.encontrarEndereco(urlComplete, urlAmount, urlBaseCode, urlTargetCode);
    }
}
