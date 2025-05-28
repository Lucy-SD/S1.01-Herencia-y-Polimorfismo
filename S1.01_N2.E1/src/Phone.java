public class Phone {

    private String brand;
    private String model;

    public Phone(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    public String getBrand() {
        return this.brand;
    }
    public String getModel() {
        return this.model;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
    public void setModel(String model) {
        this.model = model;
    }

    public String call(String phoneNumber) {
        return "Se está llamando al número: " + phoneNumber + ". Aguarde por favor.\n";
    }

    public String toString() {
        return "Soy un Teléfono de la marca " + this.brand + ", modelo " + this.model + ".\n";
    }
}
