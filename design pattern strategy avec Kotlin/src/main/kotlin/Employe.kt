class Employe(var cin: String, var salaireBrutMensuel: Float,
              var pays: Pays) {
    
    fun calculerIGR2(): Float {
        val taux = pays.calcTaux.taux(salaireBrutMensuel)
        return salaireBrutMensuel * 12 * taux / 100
    }
    fun calculerIGR(): Float {
        val taux =
            //region Code Changable
            if(this.pays.name == "Algerie")
                35f
            else if (salaireBrutMensuel < 40000)
                5f
            else if (salaireBrutMensuel >= 40000
                && salaireBrutMensuel < 120000)
                20f
            else
                42f
        //endregion
        return salaireBrutMensuel * 12 * taux / 100
    }
    fun getSalaireNetMensuel(): Float =
        (salaireBrutMensuel * 12 - calculerIGR()) / 12
}
