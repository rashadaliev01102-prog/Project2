public class Main {

    public static void main(String[] args) {

        try {
            Cars c1 = new Car(1200, 100);
            Cars c2 = new Truck(5000, 80);

            c1.move();
            c2.move();

            Speed s1 = (Speed) c1;
            Speed s2 = (Speed) c2;

            System.out.println("Speed: " + s1.getSpeed());
            System.out.println("Speed: " + s2.getSpeed());

        } catch (Exp e) {
            System.out.println("Error");
        }
    }
}
