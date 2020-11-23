interface CalculeTaux {
  fun taux(salaireBrutMensuel: Float): Float
}

class Pays(var name: String) {
  var calcTaux = Class.forName("Taux${name}")?.newInstance() as CalculeTaux
}

class Employe(var cin: String, var salaireBrutMensuel: Float, var pays: Pays) {
//    constructor(cin: String, salaireBrutMensuel: Int, ) : this(cin, salaireBrutMensuel)

  fun calculerIGR2(): Float {
    val taux = pays.calcTaux.taux(salaireBrutMensuel)
    return salaireBrutMensuel * 12 * taux / 100
  }

  fun calculerIGR(): Float {
    val taux =
            //region Code Changable
            if (salaireBrutMensuel < 40000)
              5f
            else if (salaireBrutMensuel >= 40000 && salaireBrutMensuel < 12000)
              20f
            else
              42f
    //endregion
    return salaireBrutMensuel * 12 * taux / 100
  }

  fun getSalaireNetMensuel(): Float = (salaireBrutMensuel * 12 - calculerIGR()) / 12

}

class TauxMaroc : CalculeTaux {
  override fun taux(salaireBrutMensuel: Float) =
          if (salaireBrutMensuel < 40000)
            5f
          else if (salaireBrutMensuel >= 40000 && salaireBrutMensuel < 12000)
            20f
          else
            42f
}

class TauxAlgerie : CalculeTaux {
  override fun taux(salaireBrutMensuel: Float) = 35f
}

fun main() {
  val emp1 = Employe("cin1", 9000f, Pays("Maroc"))
  println(emp1.calculerIGR())
  println(emp1.calculerIGR2())
  print(emp1.getSalaireNetMensuel())
}
