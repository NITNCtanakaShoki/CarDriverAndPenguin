import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AnimalTest {
    @Test
    public void 初期値() {
        Animal animal = new Animal(10);
        assertEquals( "pos:0 vit:10/10", animal.toString() );
    }

    @Test
    public void 動く() {
        Animal animal = new Animal(12);
        animal.movePosition(3);
        animal.movePosition(8);
        assertEquals( "pos:11 vit:12/12", animal.toString() );
    }

    @Test
    public void 消耗() {
        Animal animal = new Animal(4);
        animal.useVitality(1);
        animal.useVitality(3);
        assertEquals( "pos:0 vit:0/4", animal.toString() );
    }

    @Test
    public void 歩く() {
        Animal animal = new Animal(6);
        for (int i = 0; i < 4; i++) {
            animal.walk();
        }
        assertEquals( "pos:4 vit:2/6", animal.toString() );
    }

    @Test
    public void 食事回復() {
        Animal animal = new Animal(20);
        animal.useVitality(19);
        animal.eat();
        assertEquals( "pos:0 vit:20/20", animal.toString() );
    }


}
