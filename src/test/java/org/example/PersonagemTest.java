package org.example;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PersonagemTest {

    @Test
    void testAtacar() {
        Personagem atacante = new Guerreiro("Atacante", 1, 100, 20, 5, 5, 5);
        Personagem defensor = new Guerreiro("Defensor", 1, 100, 10, 10, 5, 5);
        atacante.atacar(defensor);
        assertEquals(90, defensor.getPontosDeVida());
    }

    @Test
    void testReceberDano() {
        Personagem personagem = new Guerreiro("Personagem", 1, 100, 20, 5, 5, 5);
        personagem.receberDano(30);
        assertEquals(70, personagem.getPontosDeVida());
    }

    @Test
    void testExibirStatus() {
        Personagem personagem = new Guerreiro("Personagem", 1, 100, 20, 5, 5, 5);
        personagem.exibirStatus();
    }
}