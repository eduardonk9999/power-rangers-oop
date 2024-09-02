package org.example.powerrangers;

import java.util.ArrayList;
import java.util.List;

public class MegaZord {
    private List<Zord> zords = new ArrayList<>();

    public void adicionarZord(Zord zord) {
        zords.add(zord);
    }

    public void formaMegazord() {
        System.out.println("Formando MEGAZORD!!!");
        for (Zord zord : zords) {
            zord.combinar();
        }

        System.out.println("Megazord formado com sucesso!");
    }
}
