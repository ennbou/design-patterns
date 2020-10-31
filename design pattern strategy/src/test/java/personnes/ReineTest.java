package personnes;

import comportement.ComportementArme;
import comportement.ComportementPoignard;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ReineTest {
    private Personnage reine;

    @BeforeEach
    void init() {
        reine = new Reine();
    }

    @Test
    @DisplayName("Reine Combattre avec Arme init et Poignard")
    void combattre() {
        assertEquals(ComportementArme.RESULT + ComportementPoignard.RESULT, reine.combattre());
    }
}
