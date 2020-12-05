public abstract class Etat {

    protected Distributeur distributeur;

    public abstract void arrete();
    public abstract void demare();
    public abstract void getProduit();
    public abstract void introduirePiece(int v);

}
