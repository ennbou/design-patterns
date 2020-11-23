class TauxMaroc : ICalculeTaux {
    override fun taux(salaireBrutMensuel: Float) =
        if (salaireBrutMensuel < 40000)
            5f
        else if (salaireBrutMensuel >= 40000
            && salaireBrutMensuel < 120000)
            20f
        else
            42f
}
