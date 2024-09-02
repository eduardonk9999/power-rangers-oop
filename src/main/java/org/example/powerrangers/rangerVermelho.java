package org.example.powerrangers;

class rangerVermelho extends powerRanger {
    public rangerVermelho(String nome) {
        super("Vermelho", nome, "Espada do Poder", new TRexZord());
    }

    // Sobrescrita do método lutar
    @Override
    public void lutar() {
        System.out.println(getNome() + " (Ranger Vermelho) ataca com a " + getArma());
    }


    public void chamarTRexZord() {
        chamarZord();
    }
}