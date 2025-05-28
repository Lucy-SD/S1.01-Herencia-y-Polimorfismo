abstract class Instrument {

    private String name;
    private float price;

    public Instrument(String name, float price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return this.name;
    }
    public float getPrice() {
        return this.price;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setPrice(float price) {
        this.price = price;
    }

    abstract String play();

    public String toString() {
        return "Soy un " + this.name + ", y mi precio es " + this.price + "€.\n";

    }
}