package org.example;

public class Arqueiro extends Personagem {
    private int precisao;
    private int alcance;

    public Arqueiro(String nome, int nivel, int pontosDeVida, int pontosDeAtaque, int pontosDeDefesa, int precisao, int alcance) {
        super(nome, nivel, pontosDeVida, pontosDeAtaque, pontosDeDefesa);
        this.precisao = precisao;
        this.alcance = alcance;
    }

    public void atirarFlecha(Personagem inimigo) {
        int dano = (this.pontosDeAtaque + this.precisao) - inimigo.pontosDeDefesa;
        if (dano > 0) {
            inimigo.receberDano(dano);
        }
    }
}