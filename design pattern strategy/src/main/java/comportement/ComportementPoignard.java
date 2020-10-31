package comportement;

public class ComportementPoignard implements ComportementArme {
    public static String RESULT = "ComportementPoignard (pa9 pa9)";
    @Override
    public String utiliserArme() {
        return RESULT;
    }
}
