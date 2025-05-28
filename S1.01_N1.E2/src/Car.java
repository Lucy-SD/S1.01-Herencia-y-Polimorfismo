public class Car {

    static final String BRAND = "MiMarca";
    static String marca = "";
    private final int POWER;

    public Car(int POWER) {
        this.POWER = 1800;
    }
    static String getBrand() {
        return  Car.BRAND;
    }
    static String getMarca() {
        return  Car.marca;
    }
    public int getPower () {
        return this.POWER;
    }

    static void setMarca (String marca) {
        Car.marca = marca;
    }

    static String stop() {
        return "El vehicle està frenant.";
    }
    public String speedUp() {
        return "El vehicle està accelerant.";
    }


}
