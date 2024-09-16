package org.example;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ArqueiroTest {

    @Test
    void testAtirarFlecha() {
        Arqueiro arqueiro = new Arqueiro("Arqueiro", 1, 90, 18, 8, 10, 15);
        Personagem inimigo = new Guerreiro("Inimigo", 1, 100, 10, 10, 5, 5);
        arqueiro.atirarFlecha(inimigo);
        assertEquals(85, inimigo.getPontosDeVida());
    }
}