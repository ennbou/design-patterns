package personnes;

import comportement.ComportementArme;

public abstract class Personnage {
    protected ComportementArme arme = () -> ComportementArme.RESULT;
    protected void setArme(ComportementArme arme){
        this.arme = arme;
    }
    protected String combattre(){
        return arme.utiliserArme();
    }
}

