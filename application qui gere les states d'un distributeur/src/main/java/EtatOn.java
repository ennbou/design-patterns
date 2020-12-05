public class EtatOn extends Etat {

    public EtatOn(Distributeur distributeur){
        super.distributeur = distributeur;
    }

    public void arrete() {
        System.out.println("EtatON -> EtatOFF.");
        distributeur.setEtat(new EtatOff(distributeur));
    }

    public void demare() {
        System.out.println("On ne peut pas faire cette operation. Le distributeur a ete deja demare.");
    }

    public void getProduit() {
        System.out.println("Le distributeur n'est pas dans l'EtatDistribution.");
    }

    public void introduirePiece(int v) {
        System.out.println("EtatON -> EtatDistribution.");
        distributeur.setEtat(new EtatDistribution(distributeur));
        int oldM = distributeur.getMonnaie();
        distributeur.setMontantCumule(oldM+v);
    }
}
