package org.example.powerrangers;

public class powerRanger {
    private String cor;
    private String nome;
    private String arma;


    //construtor....
    public powerRanger(String cor, String nome, String arma) {
        this.cor = cor;
        this.nome = nome;
        this.arma = arma;
    }

    public void lutar() {
        System.out.println(nome + " (" + cor + ") está lutando com sua " + arma);
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getArma() {
        return arma;
    }

    public void setArma(String arma) {
        this.arma = arma;
    }
}
