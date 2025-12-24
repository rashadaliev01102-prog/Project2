public class Truck extends Cars implements Speed {

    int speed;

    public Truck(int weight, int speed) throws Exp {
        super(weight);

        if (speed < 0) {
            throw new Exp("Wrong speed");
        }

        this.speed = speed;
    }

    @Override
    public void move() {
        System.out.println("Truck is moving");
    }

    @Override
    public int getSpeed() {
        return speed;
    }
}