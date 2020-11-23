package push;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import static org.junit.jupiter.api.Assertions.assertEquals;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class JournalistTest {

    private CNN cnn;
    private Journalist journalist;

    @BeforeEach
    void init(){
        cnn = new CNN();
        journalist = new Journalist("Mohammed");
        cnn.addObserver(journalist);
    }

    @Test @DisplayName("CNN Ajouter info, le journaliste il le reçoit")
    void update1() {
        cnn.addNews("news1");
        assertEquals(cnn.getNews(), journalist.displayNews());
    }

    @Test @DisplayName("CNN Ajouter 2 info, le journaliste il les reçoit")
    void update2() {
        cnn.addNews("news1");
        cnn.addNews("news2");
        assertEquals(cnn.getNews(), journalist.displayNews());
    }
}
