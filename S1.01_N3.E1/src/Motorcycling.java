public class Motorcycling extends News {

    private String team;
    private int score;
    private int price;

    public Motorcycling(String headline, String team) {
        super(headline);
        this.team = team;
        this.score = 3;
        this.price = 100;
    }

    public int calculateNewsPrice() {
        if (this.team.equalsIgnoreCase("Honda") || this.team.equalsIgnoreCase("Yamaha")) {
            price += 50;
        }
        return price;
    }

    public int calculateNewsScore() {
        if (this.team.equalsIgnoreCase("Honda") || this.team.equalsIgnoreCase("Yamaha")) {
            score += 3;
        }
        return score;
    }

    public String toString() {
        return "La noticia de Motociclismo de título \"" + super.getHeadline() + "\" habla sobre el equipo "
                + this.team + ".\nPrecio final: " + this.calculateNewsPrice() + "€.\nPuntuación: " +
                this.calculateNewsScore() + ".\n";
    }
}