import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class DistributeurTest {

    private Distributeur distributeur = new Distributeur();

    @Test
    @DisplayName("OFF(arrete) -> OFF(demarer) -> ON(getProduit) -> ON(IntroduirePiece) -> Distribution")
    void test1() {
        distributeur.faireArrete();
        System.out.println("------------------------------");
        distributeur.faireDemare();
        System.out.println("------------------------------");
        distributeur.faireGetProduit();
        System.out.println("------------------------------");
        distributeur.faireIntroduirePiece(10);
    }

    @Test
    @DisplayName("OFF(demarer) ->  ON(arrete) -> OFF(getProduit) -> OFF(IntroduirePiece)")
    void test2() {
        distributeur.faireDemare();
        System.out.println("------------------------------");
        distributeur.faireArrete();
        System.out.println("------------------------------");
        distributeur.faireGetProduit();
        System.out.println("------------------------------");
        distributeur.faireIntroduirePiece(10);
    }

    @Test
    @DisplayName("OFF(demarer) ->  ON(IntroduirePiece) -> Distribution(IntroduirePiece) -> OFF")
    void test3() {
        distributeur.faireDemare();
        System.out.println("------------------------------");
        distributeur.faireIntroduirePiece(4);
        System.out.println("------------------------------");
        distributeur.faireIntroduirePiece(10);
    }

    @Test
    @DisplayName("OFF(demarer) ->  ON(faireIntroduirePiece) -> Distribution(IntroduirePiece) -> OFF")
    void test4() {
        distributeur.faireDemare();
        System.out.println("------------------------------");
        distributeur.faireIntroduirePiece(2);
        System.out.println("------------------------------");
        distributeur.faireIntroduirePiece(2);
    }

    @Test
    @DisplayName("OFF(demarer) ->  ON(IntroduirePiece) -> Distribution(getProduit) -> ON(arrete) -> OFF")
    void test5() {
        distributeur.faireDemare();
        System.out.println("------------------------------");
        distributeur.faireIntroduirePiece(4);
        System.out.println("------------------------------");
        distributeur.faireGetProduit();
        System.out.println("------------------------------");
        distributeur.faireArrete();
    }
}
