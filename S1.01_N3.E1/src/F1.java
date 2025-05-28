public class F1 extends News {

    private String team;
    private int score;
    private int price;

    public F1(String headline, String team) {
        super(headline);
        this.team = team;
        this.score = 4;
        this.price = 100;
    }

    public int calculateNewsPrice() {
        if (this.team.equalsIgnoreCase("Ferrari") || this.team.equalsIgnoreCase("Mercedes")) {
            price += 50;
        }
        return price;
    }

    public int calculateNewsScore() {
        if (this.team.equalsIgnoreCase("Ferrari") || this.team.equalsIgnoreCase("Mercedes")) {
            score += 2;
        }
        return score;
    }

    public String toString() {
        return "La noticia de F1 de título \"" + super.getHeadline() + "\" habla sobre la escudería " + this.team + ".\n" +
                "Precio final: " + this.calculateNewsPrice() + "€.\nPuntuación: " + this.calculateNewsScore() + ".\n";
    }
}