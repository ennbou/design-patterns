package personnes;

import comportement.ComportementArcEtFleches;
import comportement.ComportementHache;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class TrollTest {

    private Personnage troll;

    @BeforeEach
    void init() {
        troll = new Troll();
    }

    @Test
    @DisplayName("Troll Combattre avec ArcEtFleches et Hache")
    void combattre() {
        assertEquals(ComportementArcEtFleches.RESULT + ComportementHache.RESULT, troll.combattre());
    }
}
