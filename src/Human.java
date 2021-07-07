public class Human extends Animal {
    private boolean isRide;

    Human(int vitality) {
        super(vitality);
        isRide = false;
    }

    void rideOn() {
        isRide = true;
        useVitality(1);
    }

    void getDown() {
        isRide = false;
        useVitality(1);
    }

    void drive() {
        if (!isRide) return;
        movePosition(5);
        useVitality(3);
    }

}
