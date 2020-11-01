fun main() {
    val emp1 = Employe("cin1", 9000f, Pays("Maroc"))
    println(emp1.calculerIGR())
    println(emp1.calculerIGR2())
    print(emp1.getSalaireNetMensuel())
}
