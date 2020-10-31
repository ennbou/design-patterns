package personnes;

import comportement.ComportementPoignard;
import org.junit.jupiter.api.*;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class RoiTest {

    private Personnage roi;

    @BeforeEach
    void initRoi(){
        roi = new Roi();
    }

    @Test
    @DisplayName("Roi Combattre avec Poignard")
    void combattre(){
        Assertions.assertEquals(ComportementPoignard.RESULT,roi.combattre());
    }

}
