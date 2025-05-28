public class Main {
    public static void main(String[] args) {

        Car car1 = new Car(1500);
        Car car2 = new Car(1200);

        System.out.println(car1.speedUp());
        System.out.println(car2.speedUp());
        System.out.println(Car.stop());
    }
}