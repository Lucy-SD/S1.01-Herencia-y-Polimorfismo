import java.lang.reflect.Array;
import java.util.ArrayList;

public class Editor {

    private String name;
    private final int DNI;
    private static int salary = 1500;
    private ArrayList<News> editorNews;

    public Editor(String name, int DNI) {
        this.name = name;
        this.DNI = DNI;
        this.editorNews = new ArrayList<News>();
    }

    public String getName() {
        return this.name;
    }
    public int getDNI() {
        return this.DNI;
    }
    public ArrayList<News> getEditorNews() {
        return this.editorNews;
    }

    public void setEditorNews(News editorNews) {
        this.editorNews.add(editorNews);
    }

    public String toString() {
        return "Soy " + this.name + ", con DNI: " + getDNI() + ", y mi salario es de " + Editor.salary + "€.\n";
    }


}
