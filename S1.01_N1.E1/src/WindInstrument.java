public class WindInstrument extends Instrument {

    public WindInstrument(String name, float price) {
        super(name, price);
    }

    public String play() {
        return "Està sonant un instrument de vent.\n";
    }

    public String toString() {
        return "Soy un " + super.getName() + ", instrumento de viento, y valgo " + super.getPrice() + "€.\n";
    }
}
