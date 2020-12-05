public class Framework {
    private ITraitement traitement;
    private static Framework framework;

    private Framework(){
        traitement = new TraitementImpl1();
    }

    public static Framework getInstance(){
        if (framework == null)
            framework = new Framework();
        return framework;
    }

    public ITraitement getTraitement() {
        return traitement;
    }

    public void setTraitement(ITraitement traitement){
        this.traitement = traitement;
    }
}
