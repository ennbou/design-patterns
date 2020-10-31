package personnes;

import comportement.ComportementArcEtFleches;
import comportement.ComportementHache;

public class Chevalier extends Personnage {
    @Override
    public String combattre() {
        /**
         * dans ce exemple le Chevalier est utilise deux armes, mais
         * ce n'est pas dans le meme temps.
         * Il peut seulement utiliser une seule arme a la fois.
         */
        System.out.println("Chevalier a commencé à combattre : ");

        // utiliser l'arme initial
        String result = super.combattre();

        setArme(new ComportementHache());

        // utiliser l'arme de Hache
        result += super.combattre();

        setArme(new ComportementArcEtFleches());

        // utiliser l'arme de Arc Et Fleches
        result += super.combattre();

        System.out.println("Chevalier est terminée -------------------------");

        return result;
    }
}
