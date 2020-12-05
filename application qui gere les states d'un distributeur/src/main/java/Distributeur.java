public class Distributeur {
    private int montantCumule = 0;
    private int monnaie = 0; // de l'utilisatuer
    private Etat etat;
    public Distributeur(){
        etat = new EtatOff(this);
    }
    public void setEtat(Etat etat) {this.etat = etat;}
    public int getMontantCumule() {
        return montantCumule;
    }
    public void setMontantCumule(int montantCumule) {
        this.montantCumule = montantCumule;
    }
    public int getMonnaie() {
        return monnaie;
    }
    public void setMonnaie(int monnaie) {
        this.monnaie = monnaie;
    }

    public void faireArrete(){
        etat.arrete();
    }

    public void faireDemare(){
        etat.demare();
    }

    public void faireGetProduit(){
        etat.getProduit();
    }

    public void faireIntroduirePiece(int v){
        etat.introduirePiece(v);
    }
}
