package org.example;

public class Guerreiro extends Personagem {
    private int forcaExtra;
    private int armadura;

    public Guerreiro(String nome, int nivel, int pontosDeVida, int pontosDeAtaque, int pontosDeDefesa, int forcaExtra, int armadura) {
        super(nome, nivel, pontosDeVida, pontosDeAtaque, pontosDeDefesa);
        this.forcaExtra = forcaExtra;
        this.armadura = armadura;
    }

    @Override
    public void atacar(Personagem inimigo) {
        int dano = (this.pontosDeAtaque + this.forcaExtra) - inimigo.pontosDeDefesa;
        if (dano > 0) {
            inimigo.receberDano(dano);
        }
    }
}