package org.example.powerrangers;

public class Main {
    public static void main(String[] args) {
        powerRanger rangerVermelho = new rangerVermelho("Jason");

        rangerVermelho.setArma("Sabre de LUZ");
        rangerVermelho.lutar();
        rangerVermelho.chamarZord();




        powerRanger rangerVerde = new rangerVerde("Tommy");
        rangerVerde.lutar();
        rangerVerde.chamarZord();

        // Criando os Zords
        Zord tRexZord = new TRexZord();
        Zord triceratopsZord = new TriceratopsZord();
        Zord sabertoothTigerZord = new SabertoothTigerZord();
        Zord mastodonZord = new MastodonZord();
        Zord pterodactylZord = new PterodactylZord();

        MegaZord megaZord = new MegaZord();
        megaZord.adicionarZord(tRexZord);
        megaZord.adicionarZord(triceratopsZord);
        megaZord.adicionarZord(sabertoothTigerZord);
        megaZord.adicionarZord(mastodonZord);
        megaZord.adicionarZord(pterodactylZord);


        megaZord.formaMegazord();

    }
}