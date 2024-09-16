package org.example;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MagoTest {

    @Test
    void testLancarMagia() {
        Mago mago = new Mago("Mago", 1, 80, 15, 5, 50, 25);
        Personagem inimigo = new Guerreiro("Inimigo", 1, 100, 10, 10, 5, 5);
        mago.lancarMagia(inimigo);
        assertEquals(85, inimigo.getPontosDeVida());
        assertEquals(40, mago.getMana());
    }
}