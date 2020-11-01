import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class EmployeTest {

    @Test
    fun `IGR pour un employe marocain, moine de 40000`() {
        val salaire = (2500..40000).random().toFloat()
        val taux = 5f
        val employe = Employe("MC312", salaire, Pays("Maroc"));
        val expected = salaire * 12 * taux / 100
        assertEquals(expected, employe.calculerIGR())
        assertEquals(expected, employe.calculerIGR2())
    }

    @Test
    fun `IGR pour un employe marocain, entre 40000 et 120000`() {
        val salaire = (40000..120000).random().toFloat()
        val taux = 20f
        val employe = Employe("MC312", salaire, Pays("Maroc"));
        val expected = salaire * 12 * taux / 100
        assertEquals(expected, employe.calculerIGR())
        assertEquals(expected, employe.calculerIGR2())
    }

    @Test
    fun `IGR pour un employe marocain, plus de 120000`() {
        val salaire = (120000..800000).random().toFloat()
        val taux = 42f
        val employe = Employe("MC312", salaire, Pays("Maroc"));
        val expected = salaire * 12 * taux / 100
        assertEquals(expected, employe.calculerIGR())
        assertEquals(expected, employe.calculerIGR2())
    }


    @Test
    fun `IGR pour un employe algerien`() {
        val salaire = (3000..800000).random().toFloat()
        val taux = 35f
        val employe = Employe("MC312", salaire, Pays("Algerie"));
        val expected = salaire * 12 * taux / 100
        assertEquals(expected, employe.calculerIGR())
        assertEquals(expected, employe.calculerIGR2())
    }

}
