public class Smartphone extends Phone implements Camera, Clock {

    public Smartphone(String brand, String model) {
        super(brand, model);
    }

    public String takePic() {
        return "S’està fent una foto.\n";
    }

    public String alarm() {
        return "Està sonant l’alarma.\n";
    }

    public String toString() {
        return "Soy un SmartPhone de la marca " + super.getBrand() + ", modelo " + super.getModel() + ".\n";
    }
}
