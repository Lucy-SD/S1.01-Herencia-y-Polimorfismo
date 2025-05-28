import java.util.ArrayList;
import java.util.Scanner;

public class NewsManager {
    static Scanner scan = new Scanner(System.in);
    static ArrayList<News> news = new ArrayList<News>();
    static int idEditor = -1;
    static int idNews = -1;
    static Editor editor = new Editor(EditorManager.editors.get(idEditor).getName(), EditorManager.editors.get(idEditor).getDNI());

    public static String addNews() {
        String txt = "Datos incorrectos.\n";
        int dni;
        int newsType;

        System.out.println("Ingrese el número de DNI del redactor:");
        dni = scan.nextInt();
        idEditor = EditorManager.findEditor(dni);
        if (idEditor != -1) {
            System.out.println("De qué deporte es la noticia ¿?\n" +
                    "1. Fútbol;\n" +
                    "2. Basquet;\n" +
                    "3. Tennis;\n" +
                    "4. F1;\n" +
                    "5. Motociclimso.\n");
            newsType = scan.nextInt();
            scan.nextLine();
            switch (newsType) {
                case 1:
                    txt = addSoccerNews();
                    break;
                case 2:
                    txt = addBascketNews();
                    break;
                case 3:
                    txt = addTennisNews();
                    break;
                case 4:
                    txt = addF1News();
                    break;
                case 5:
                    txt = addMotoNews();
                    break;
            }
        }
        return txt;
    }

    public static String addSoccerNews() {
        String headline;
        String competition;
        String club;
        String player;
        Soccer soccer;

        System.out.println("Ingese el titular de la noticia:");
        headline = scan.nextLine();
        System.out.println("A que competencia hace referencia la noticia ¿?");
        competition = scan.nextLine();
        System.out.println("A que club ¿?");
        club = scan.nextLine();
        System.out.println("A que jugador ¿?");
        player = scan.nextLine();
        soccer = new Soccer(headline, competition, club, player);
        editor.setEditorNews(soccer);
        news.add(soccer);

        return "Noticia creada correctamente.\n";
    }

    public static String addBascketNews() {
        String headline;
        String competition;
        String club;
        Bascketball bascket;

        System.out.println("Ingese el titular de la noticia:");
        headline = scan.nextLine();
        System.out.println("A que competencia hace referencia la noticia ¿?");
        competition = scan.nextLine();
        System.out.println("A que club ¿?");
        club = scan.nextLine();
        bascket = new Bascketball(headline, competition, club);
        editor.setEditorNews(bascket);
        news.add(bascket);

        return "Noticia creada correctamente.\n";
    }

    public static String addTennisNews() {
        String headline;
        String competition;
        String player;
        Tennis tennis;

        System.out.println("Ingese el titular de la noticia:");
        headline = scan.nextLine();
        System.out.println("A que competencia hace referencia la noticia ¿?");
        competition = scan.nextLine();
        System.out.println("A que tenista ¿?");
        player = scan.nextLine();
        tennis = new Tennis(headline, competition, player);
        editor.setEditorNews(tennis);
        news.add(tennis);

        return "Noticia creada correctamente.\n";
    }

    public static String addF1News() {
        String headline;
        String team;
        F1 f1;

        System.out.println("Ingese el titular de la noticia:");
        headline = scan.nextLine();
        System.out.println("A que equipo hace referencia ¿?");
        team = scan.nextLine();
        f1 = new F1(headline, team);
        editor.setEditorNews(f1);
        news.add(f1);

        return "Noticia creada correctamente.\n";
    }

    public static String addMotoNews() {
        String headline;
        String team;
        Motorcycling moto;

        System.out.println("Ingese el titular de la noticia:");
        headline = scan.nextLine();
        System.out.println("A que equipo hace referencia ¿?");
        team = scan.nextLine();
        moto = new Motorcycling(headline, team);
        editor.setEditorNews(moto);
        news.add(moto);

        return "Noticia creada correctamente.\n";
    }

    public static int findNews() {
        int i = 0;
        boolean found = false;
        int dni;
        String headline;

        System.out.println("Ingrese el DNI del redactor de la noticia:");
        dni = scan.nextInt();
        scan.nextLine();
        idEditor = EditorManager.findEditor(dni);

        if (idEditor != -1) {
            System.out.println(("Ingrese el titular de la noticia:"));
            headline = scan.nextLine();
            while ((i < editor.getEditorNews().size() && !found)) {
                if (headline.equalsIgnoreCase(editor.getEditorNews().get(i).getHeadline())) {
                    idNews = i;
                    found = true;
                }
                i++;
            }
        }
        return idNews;
    }

    public static String deleteNews() {
        String txt = "Datos incorrectos.\n";
        idNews = findNews();
        if (idEditor != -1 && idNews != -1) {
            editor.getEditorNews().remove(idNews);
            txt = "Noticia eliminada correctamente.\n";
        }
        return txt;
    }

    public static String showEditorNews() {
        String txt = "";
        int dni;

        System.out.println("Ingrese el DNI del redactor de su interés:");
        dni = scan.nextInt();
        idEditor = EditorManager.findEditor(dni);

        if (idEditor != -1 && !editor.getEditorNews().isEmpty()) {
            for (News news : editor.getEditorNews()) {
                if (txt.isEmpty()) {
                    txt = "Las noticias de dicho redactor son: \n";
                }
                txt += news.toString() + "\n";
            }
        }
        if (idEditor != -1 && editor.getEditorNews().isEmpty()) {
            txt = "El redactor elegido no tiene noticias asociadas.\n";
        }
        if (idEditor == -1) {
            txt = "Datos incorrectos.\n";
        }
        return txt;
    }

    public static String calculateScore() {
        String txt = "Datos incorrectos.\n";
        idNews = findNews();
        int score = 0;
        News news = EditorManager.editors.get(idEditor).getEditorNews().get(idNews);

        if (news instanceof Soccer) {
            score = ((Soccer) news).calculateNewsScore();
        }
        if (news instanceof Bascketball) {
            score = ((Bascketball) news).calculateNewsScore();
        }
        if (news instanceof Tennis) {
            score = ((Tennis) news).calculateNewsScore();
        }
        if (news instanceof F1) {
            score = ((F1) news).calculateNewsScore();
        }
        if (news instanceof Motorcycling) {
            score = ((Motorcycling) news).calculateNewsScore();
        }

        if (score != 0) {
            txt = "La puntuación de la noticia selecicionada es de: " + score + ".\n";
        }
        return txt;
    }

    public static String calculatePrice() {
        String txt = "Datos incorrectos.\n";
        idNews = findNews();
        int price = 0;
        News news = EditorManager.editors.get(idEditor).getEditorNews().get(idNews);

        if (news instanceof Soccer) {
            price = ((Soccer) news).calculateNewsPrice();
        }
        if (news instanceof Bascketball) {
            price = ((Bascketball) news).calculateNewsPrice();
        }
        if (news instanceof Tennis) {
            price = ((Tennis) news).calculateNewsPrice();
        }
        if (news instanceof F1) {
            price = ((F1) news).calculateNewsPrice();
        }
        if (news instanceof Motorcycling) {
            price = ((Motorcycling) news).calculateNewsPrice();
        }

        if (price != 0) {
            txt = "El precio de la noticia selecicionada es de: " + price + "€.\n";
        }
        return txt;
    }
}
