package org.example;

public class Main {
    public static void main(String[] args) {
        Guerreiro guerreiro = new Guerreiro("Guts", 10, 100, 20, 10, 5, 5);
        Mago mago = new Mago("Patolino Mestre dos Magos", 10, 80, 15, 5, 50, 25);
        Arqueiro arqueiro = new Arqueiro("Atreus", 10, 90, 18, 8, 10, 15);

        guerreiro.exibirStatus();
        mago.exibirStatus();
        arqueiro.exibirStatus();

        guerreiro.atacar(mago);
        mago.lancarMagia(guerreiro);
        arqueiro.atirarFlecha(guerreiro);

        guerreiro.exibirStatus();
        mago.exibirStatus();
        arqueiro.exibirStatus();
    }
}