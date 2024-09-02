package org.example.powerrangers;

public class powerRanger {
    private String cor;
    private String nome;
    private String arma;
    private Zord zord;

    //construtor....
    public powerRanger(String cor, String nome, String arma, Zord zord) {
        this.cor = cor;
        this.nome = nome;
        this.arma = arma;
        this.zord = zord;
    }

    public void lutar() {
        System.out.println(nome + " (" + cor + ") está lutando com sua " + arma);
    }

    public void chamarZord() {
        System.out.println(nome + " está chamando seu Zord!");
        zord.combinar();
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
