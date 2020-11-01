import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class UserTest {

    @Test
    fun sayHello() {
        val ennbou = User("ENNBOU")
        val current = ennbou.sayHello()
        assertEquals("Hello ENNBOU!", current)
    }
}
