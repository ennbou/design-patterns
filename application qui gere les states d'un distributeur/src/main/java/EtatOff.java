public class EtatOff extends Etat {

    public EtatOff(Distributeur distributeur){
        super.distributeur = distributeur;
    }

    public void arrete() {
        System.out.println("arrete ne fait rien dans l'EtatOFF. Le distributeur a ete deja arreter");
    }

    public void demare() {
        System.out.println("EtatOFF -> EtatON.");
        distributeur.setEtat(new EtatOn(distributeur));
    }

    public void getProduit() {
        System.out.println("getProduit ne fait rien dans l'EtatOFF.");
    }

    public void introduirePiece(int v) {
        System.out.println("introduirePiece ne fait rien dans l'EtatOFF.");
    }
}
