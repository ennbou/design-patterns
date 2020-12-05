public class EtatDistribution extends Etat {

    public EtatDistribution(Distributeur distributeur) {
        super.distributeur = distributeur;
    }

    public void arrete() {
        System.out.println("EtatDistribution -> EtatOFF.");
        int m = distributeur.getMontantCumule();
        distributeur.setMonnaie(m);
        distributeur.setEtat(new EtatOff(distributeur));
    }

    public void demare() {
        System.out.println("Demare ne fait rien dans l'EtatDistribution.");
    }

    public void getProduit() {
        System.out.println("EtatDistribution -> EtatON.");
        int m = distributeur.getMontantCumule();
        if(m >= 6){
            distributeur.setMonnaie(m);
        }
        distributeur.setMontantCumule(0);
        distributeur.setEtat(new EtatOn(distributeur));
    }

    public void introduirePiece(int v) {
        System.out.println("EtatDistribution ne se change pas.");
        int m = distributeur.getMontantCumule();
        distributeur.setMonnaie(m+v);
    }
}
