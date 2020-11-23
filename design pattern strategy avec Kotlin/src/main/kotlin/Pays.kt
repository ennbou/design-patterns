class Pays(var name: String) {
    var calcTaux = Class.forName("Taux${name}")
        ?.newInstance() as ICalculeTaux
}
