package org.example.powerrangers;

public class rangerVerde extends powerRanger {
    public rangerVerde(String nome) {
        super("Verde", nome, "Adaga do Dragão", new DragonZord());
    }

    @Override
    public void lutar() {
        System.out.println(getNome() + " (Ranger Verde) ataca com a " + getArma());
    }


    public void chamarDragonZord() {
        chamarZord();
    }
}
