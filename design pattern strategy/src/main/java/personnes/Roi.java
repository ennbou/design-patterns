package personnes;

import comportement.ComportementArcEtFleches;
import comportement.ComportementPoignard;

public class Roi extends Personnage{

    @Override
    public String combattre() {
        System.out.println("Roi a commencé à combattre : ");
        setArme(new ComportementArcEtFleches());
        setArme(new ComportementPoignard());
        String result = super.combattre();
        System.out.println("Roi est terminée -------------------------");
        return result;
    }

}
