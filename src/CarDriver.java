public class CarDriver extends Human {
    public CarDriver( int vitality ) {
        super( vitality );
    }

    @Override
    public void drive() {
        movePosition(8);
        useVitality(1);
    }

    @Override
    public void walk() {}
}
