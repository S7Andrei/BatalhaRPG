package org.example;

public class Mago extends Personagem {
    private int mana;
    private int poderMagico;

    public Mago(String nome, int nivel, int pontosDeVida, int pontosDeAtaque, int pontosDeDefesa, int mana, int poderMagico) {
        super(nome, nivel, pontosDeVida, pontosDeAtaque, pontosDeDefesa);
        this.mana = mana;
        this.poderMagico = poderMagico;
    }

    public void lancarMagia(Personagem inimigo) {
        if (this.mana > 0) {
            int dano = this.poderMagico - inimigo.pontosDeDefesa;
            if (dano > 0) {
                inimigo.receberDano(dano);
            }
            this.mana -= 10;
        }
    }
}