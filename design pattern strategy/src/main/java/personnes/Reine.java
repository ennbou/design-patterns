package personnes;

import comportement.ComportementPoignard;

public class Reine extends Personnage{

    @Override
    public String combattre() {
        System.out.println("Reine a commencé à combattre : ");
        String result = super.combattre();
        setArme(new ComportementPoignard());
        result += super.combattre();
        System.out.println("Reine est terminée -------------------------");
        return result;
    }
}
