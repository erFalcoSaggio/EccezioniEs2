package org.example;

import static java.lang.IO.println;

public class Main {
    public static void main() {
        Reclutatore reclutatore = new Reclutatore();
        int difficolta = 75;

        for (int i = 1; i <= 5; i++) {
            println("Tentativo " + i + ":");
            try {
                reclutatore.recluta(difficolta);
            } catch (EroeNonIdoneoException e) {
                println("Reclutamento fallito per " + e.getNome() + ": potere insufficiente (" + e.getLivello() + "/" + difficolta + ")");
            }
        }
    }
}
