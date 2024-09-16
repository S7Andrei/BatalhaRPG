package org.example;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class GuerreiroTest {

    @Test
    void testAtacar() {
        Guerreiro guerreiro = new Guerreiro("Guerreiro", 1, 100, 20, 5, 5, 5);
        Personagem inimigo = new Guerreiro("Inimigo", 1, 100, 10, 10, 5, 5);
        guerreiro.atacar(inimigo);
        assertEquals(85, inimigo.getPontosDeVida());
    }
}