import java.lang.reflect.Array;
import java.util.ArrayList;

public class News {

    private String headline;
    private String body;
    private int score;
    private int price;

    public News(String headline) {
        this.headline = headline;
    }

    public String getHeadline() {
        return this.headline;
    }

    public int calculateNewsPrice() {
        return this.price;
    }

    public String toString() {
        return "La noticia de título \"" + this.headline + "\" tiene una puntuación de  " + this.score
                + ", y un precio de " + this.price + "€.\n";
    }
}
