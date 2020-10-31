package personnes;

import comportement.ComportementArcEtFleches;
import comportement.ComportementHache;

public class Troll extends Personnage {

    @Override
    public String combattre() {
        System.out.println("Troll a commencé à combattre : ");
        setArme(new ComportementArcEtFleches());
        String result = super.combattre();
        setArme(new ComportementHache());
        result += super.combattre();
        System.out.println("Troll est terminée -------------------------");
        return result;
    }
}
