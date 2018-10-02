public class TempClass {
    public static void main(String[] args) {
        Car car1 = new Car();
        Car car2 = new Car();
        System.out.println(car1.MAX_SPEED);

        System.out.println(car2.MAX_SPEED);

        System.out.println(Car.MAX_SPEED);

        System.out.println(car1.SEATS);
        car2.SEATS = 4;
        System.out.println(car2.SEATS);

        System.out.println(Car.SEATS);
        System.out.println(car1.var);
        System.out.println(car1.magnitophone);
        car1.method();

    }
}
