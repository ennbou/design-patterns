import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import static org.junit.jupiter.api.Assertions.assertEquals;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class FrameworkTest {

    private Framework framework;

    @BeforeAll
    void init() {
        framework = Framework.getInstance();
    }

    @Test
    @DisplayName("Le teste du Traitement1, implementation par defaut")
    void test1() {
        int[][] image = {
                new int[]{1, 2, 3},
                new int[]{4, 5, 6},
                new int[]{7, 8, 9},
        };
        long expected = framework.getTraitement().traiter(image);
        long actuel = 45;
        assertEquals(expected, actuel);
    }

    @Test
    @DisplayName("Le teste du Traitement2")
    void test2() {
        int[][] image = {
                new int[]{1, 2, 3},
                new int[]{4, 5, 6},
                new int[]{7, 8, 9},
        };
        framework.setTraitement(new TraitementImpl2());
        long expected = framework.getTraitement().traiter(image);
        long actuel = 45;
        assertEquals(expected, actuel);
    }

    @Test
    @DisplayName("Le teste du Traitement1")
    void test3() {
        int[][] image = {
                new int[]{1, 2, 3},
                new int[]{4, 5, 6},
                new int[]{7, 8, 9},
        };
        framework.setTraitement(new TraitementImpl1());
        long expected = framework.getTraitement().traiter(image);
        long actuel = 45;
        assertEquals(expected, actuel);
    }

    @Test
    @DisplayName("Le teste du ImplNonStandard")
    void test4() {
        int[][] image = {
                new int[]{1, 2, 3},
                new int[]{4, 5, 6},
                new int[]{7, 8, 9},
        };
        framework.setTraitement(new ImplNonStandard());
        long expected = framework.getTraitement().traiter(image);
        long actuel = 45;
        assertEquals(expected, actuel);
    }

}
