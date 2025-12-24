public class Car extends Cars implements Speed {

    int speed;

    public Car(int weight, int speed) throws Exp {
        super(weight);

        if (speed < 0) {
            throw new Exp("Wrong speed");
        }

        this.speed = speed;
    }

    @Override
    public void move() {
        System.out.println("Car is moving");
    }

    @Override
    public int getSpeed() {
        return speed;
    }
}
