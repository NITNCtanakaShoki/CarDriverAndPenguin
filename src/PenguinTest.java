import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PenguinTest {
    @Test
    public void 初期値() {
        Penguin penguin = new Penguin(10);
        assertEquals("pos:0 vit:10/10", penguin.toString());
    }

    @Test
    public void 飛ぶ() {
        Penguin penguin = new Penguin(10);
        penguin.fly();
        assertEquals("pos:0 vit:9/10", penguin.toString());
    }
    @Test
    public void 継承されているか() {
        Bird bird = new Penguin(11);
        assertEquals("pos:0 vit:11/11", bird.toString());
    }
}
