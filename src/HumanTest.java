import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class HumanTest {
    @Test
    public void 初期値() {
        Human human = new Human(10);
        assertEquals( "pos:0 vit:10/10", human.toString() );
    }

    @Test
    public void 自転車に乗る() {
        Human human = new Human(12);

        human.rideOn();

        assertEquals( "pos:0 vit:11/12", human.toString() );
    }

    @Test
    public void 自転車を降りる() {
        Human human = new Human(12);

        human.getDown();

        assertEquals( "pos:0 vit:11/12", human.toString() );
    }

    @Test
    public void 自転車から降りた状態でドライブ() {
        Human human = new Human(12);

        human.drive();

        assertEquals( "pos:0 vit:12/12", human.toString() );
    }

    @Test
    public void 自転車に乗った状態でドライブ() {
        Human human = new Human(12);

        human.rideOn();
        human.drive();

        assertEquals( "pos:5 vit:8/12", human.toString() );
    }

    @Test
    public void 動物の継承確認() {

        Animal animal = new Human(12);

        assertEquals( "pos:0 vit:12/12", animal.toString() );
    }
}
