public class Tennis extends News {

    private String competition;
    private String player;
    private int score;
    private int price;

    public Tennis(String headline, String competition, String player) {
        super(headline);
        this.competition = competition;
        this.player = player;
        this.score = 4;
        this.price = 150;
    }

    public int calculateNewsPrice() {
        if (this.player.equalsIgnoreCase("Federer") || this.player.equalsIgnoreCase("Nadal") ||
                this.player.equalsIgnoreCase("Djokovic")) {
            price += 100;
        }
        return price;
    }

    public int calculateNewsScore() {
        if (this.player.equalsIgnoreCase("Federer") || this.player.equalsIgnoreCase("Nadal") ||
                this.player.equalsIgnoreCase("Djokovic")) {
            score += 3;
        }
        return score;
    }

    public String toString() {
        return "La noticia de Tenis de título \"" + super.getHeadline() + "\" habla sobre la competencia " + this.competition
                + ", del jugador " + this.player + ".\nPrecio final: " + this.calculateNewsPrice() + "€.\nPuntuación:"
                + this.calculateNewsScore() + ".\n";
    }
}
