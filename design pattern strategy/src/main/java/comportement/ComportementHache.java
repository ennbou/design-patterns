package comportement;

public class ComportementHache implements ComportementArme {
    public static String RESULT = "ComportementHache (pew pew)";
    @Override
    public String utiliserArme() {
        return RESULT;
    }

}
