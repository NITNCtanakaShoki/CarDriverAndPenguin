public class Animal {
    private int position;
    private int currentVitality;
    private final int maxVitality;

    Animal( int vitality ) {
        position = 0;
        currentVitality = vitality;
        maxVitality = vitality;
    }

    void movePosition( int n ) {
        position += n;
    }

    void useVitality( int n ) {
        currentVitality -= n;
    }

    void walk() {
        movePosition(1);
        useVitality(1);
    }

    void eat() {
        currentVitality = maxVitality;
    }

    public String toString() {
        return String.format(
                "pos:%d vit:%d/%d",
                position,
                currentVitality,
                maxVitality
        );
    }
}
