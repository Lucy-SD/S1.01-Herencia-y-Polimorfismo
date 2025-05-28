public class StringedInstrument extends Instrument {

    public StringedInstrument(String name, float price) {
        super(name, price);
    }

    public String play() {
        return "Està sonant un instrument de corda.\n";
    }

    public String toString() {
        return "Soy un " + super.getName() + ", instrumento de cuerda, y valgo " + super.getPrice() + "€.\n";
    }
}
