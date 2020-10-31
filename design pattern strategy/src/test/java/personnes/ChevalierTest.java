package personnes;

import comportement.ComportementArcEtFleches;
import comportement.ComportementArme;
import comportement.ComportementHache;
import comportement.ComportementPoignard;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ChevalierTest {
    private Personnage chevalier;

    @BeforeEach
    void init() {
        chevalier = new Chevalier();
    }

    @Test
    @DisplayName("Chevalier Combattre avec Arme init, Hach et ArcEtFleches")
    void combattre() {
        assertEquals(ComportementArme.RESULT + ComportementHache.RESULT+ ComportementArcEtFleches.RESULT, chevalier.combattre());
    }
}
