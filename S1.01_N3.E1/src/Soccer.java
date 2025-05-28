public class Soccer extends News {

    private String competition;
    private String club;
    private String player;
    private int score;
    private int price;

    public Soccer(String headline, String competition, String club, String player) {
        super(headline);
        this.competition = competition;
        this.club = club;
        this.player = player;
        this.score = 5;
        this.price = 300;
    }

    public int calculateNewsPrice() {
        if (this.competition.equalsIgnoreCase("lliga de campions")) {
            price += 100;
        }
        if (this.club.equalsIgnoreCase("Barca") || this.club.equalsIgnoreCase("Madrid")) {
            price += 100;
        }
        if (this.player.equalsIgnoreCase("Torres") || this.player.equalsIgnoreCase("benzema")) {
            price += 50;
        }
        return price;
    }

    public int calculateNewsScore() {
        if (this.competition.equalsIgnoreCase("liga de campions")) {
            score += 3;
        } else if (this.competition.equalsIgnoreCase("liga")) {
            score += 2;
        }
        if (this.club.equalsIgnoreCase("Barca") || this.club.equalsIgnoreCase("Madrid")) {
            score += 1;
        }
        if (this.player.equalsIgnoreCase("Torres") || this.player.equalsIgnoreCase("benzema")) {
            score += 1;
        }
        return score;
    }

    public String toString() {
        return "La noticia de Futbol de título \"" + super.getHeadline() + "\" habla sobre la competencia " + this.competition
                + ", del equipo " + this.club + " y el jugador " + this.player + ".\nPrecio final: " +
                this.calculateNewsPrice() + "€.\nPuntuación: " + this.calculateNewsScore() + ".\n";
    }
}
