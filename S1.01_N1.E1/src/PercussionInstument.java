public class PercussionInstument extends Instrument {

    public PercussionInstument(String name, float price) {
        super(name, price);
    }

    public String play() {
        return "Està sonant un instrument de percussió.\n";
    }

    public String toString() {
        return "Soy un " + super.getName() + ", instrumento de percusión, y valgo " + super.getPrice() + "€.\n";

    }
}
