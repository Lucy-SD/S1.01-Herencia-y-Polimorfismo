public class Bascketball extends News {

    private String competition;
    private String club;
    private int score;
    private int price;

    public Bascketball(String headline, String competition, String club) {
        super(headline);
        this.competition = competition;
        this.club = club;
        this.score = 4;
        this.price = 250;
    }

    public int calculateNewsPrice() {
        if (this.competition.equalsIgnoreCase("Eurolliga")) {
            price += 75;
        }
        if (this.club.equalsIgnoreCase("Barca") || this.club.equalsIgnoreCase("Madrid")) {
            price += 75;
        }
        return price;
    }

    public int calculateNewsScore() {
        if (this.competition.equalsIgnoreCase("eurolliga")) {
            score += 3;
        } else if (this.competition.equalsIgnoreCase("ABC")) {
            score += 2;
        }
        if (this.club.equalsIgnoreCase("Barca") || this.club.equalsIgnoreCase("Madrid")) {
            score += 1;
        }
        return score;
    }

    public String toString() {
        return "La noticia de Basquet de título \"" + super.getHeadline() + "\" habla sobre la competencia " + this.competition
                + ", del equipo " + this.club + ".\nPrecio final:" + this.calculateNewsPrice() + "€.\nPuntuación: " +
                this.calculateNewsScore() + ".\n";
    }
}
