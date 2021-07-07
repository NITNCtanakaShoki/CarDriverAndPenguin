import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CarDriverTest {
    @Test
    public void 初期値() {
        CarDriver carDriver = new CarDriver(10);
        assertEquals( "pos:0 vit:10/10", carDriver.toString() );
    }

    @Test
    public void ドライブする1回() {
        CarDriver carDriver = new CarDriver(10);
        carDriver.drive();
        assertEquals( "pos:8 vit:9/10", carDriver.toString() );
    }

    @Test
    public void ドライブする10回() {
        CarDriver carDriver = new CarDriver(10);
        for (int i = 0; i < 10; i++) {
            carDriver.drive();
        }
        assertEquals( "pos:80 vit:0/10", carDriver.toString() );
    }

    @Test
    public void 歩行する() {
        CarDriver carDriver = new CarDriver(10);
        carDriver.walk();
        assertEquals( "pos:0 vit:10/10", carDriver.toString() );
    }
}
