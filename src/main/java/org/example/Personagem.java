package org.example;

public abstract class Personagem {
    protected String nome;
    protected int nivel;
    protected int pontosDeVida;
    protected int pontosDeAtaque;
    protected int pontosDeDefesa;

    public Personagem(String nome, int nivel, int pontosDeVida, int pontosDeAtaque, int pontosDeDefesa) {
        this.nome = nome;
        this.nivel = nivel;
        this.pontosDeVida = pontosDeVida;
        this.pontosDeAtaque = pontosDeAtaque;
        this.pontosDeDefesa = pontosDeDefesa;
    }

    public void atacar(Personagem inimigo) {
        int dano = this.pontosDeAtaque - inimigo.pontosDeDefesa;
        if (dano > 0) {
            inimigo.receberDano(dano);
        }
    }

    public void receberDano(int dano) {
        this.pontosDeVida -= dano;
        if (this.pontosDeVida < 0) {
            this.pontosDeVida = 0;
        }
    }

    public void exibirStatus() {
        System.out.println("Nome: " + nome);
        System.out.println("Nível: " + nivel);
        System.out.println("HP: " + pontosDeVida);
        System.out.println("ATK: " + pontosDeAtaque);
        System.out.println("DEF: " + pontosDeDefesa);
    }
}