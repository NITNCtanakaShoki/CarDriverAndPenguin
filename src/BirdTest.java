import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BirdTest {
    @Test
    public void 初期値() {
        Bird bird = new Bird(10);
        assertEquals("pos:0 vit:10/10", bird.toString());
    }

    @Test
    public void 飛ぶ() {
        Bird bird = new Bird(10);
        bird.fly();
        assertEquals("pos:3 vit:9/10", bird.toString());
    }
    @Test
    public void 継承されているか() {
        Animal animal = new Bird(11);
        assertEquals("pos:0 vit:11/11", animal.toString());
    }
}