import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int op;
        String txt;

        Editor gime = new Editor("Gime", 1111);
        Editor lala = new Editor("lala", 2222);
        Editor tito = new Editor("tito", 3333);
        EditorManager.editors.add(gime);
        EditorManager.editors.add(lala);
        EditorManager.editors.add(tito);

        News futbol = new Soccer("futbol", "liga", "madrid", "Ferran");
        News basquet = new Bascketball("basquet", " oasdf", "Barca");
        News tennis = new Tennis("tennis", "tumadre", "nadal");
        News f1 = new F1("f1", "mercedes");
        News moto = new Motorcycling("moto", "jssj");

        lala.setEditorNews(futbol);
        lala.setEditorNews(basquet);
        gime.setEditorNews(f1);
        gime.setEditorNews(moto);
        lala.setEditorNews(tennis);

        do {
            System.out.println("Bienvenido a la Redacción.\nElija una opción:\n" +
                    "1.Introducir redactor.\n" +
                    "2.Eliminar redactor.\n" +
                    "3.Introducir noticia a un redactor.\n" +
                    "4.Eliminar noticia.\n" +
                    "5.Mostrar todas las noticias por redactor.\n" +
                    "6.Calcular puntuación de la noticia.\n" +
                    "7.Calcular precio de la noticia.\n" +
                    "0. Salir.\n");
            op = scan.nextInt();
            scan.nextLine();

            switch (op) {
                case 0:
                    txt = "Gracias por su visita. Hasta pronto = )";
                    break;
                case 1:
                    txt = EditorManager.addEditor();
                    break;
                case 2:
                    txt = EditorManager.deleteEditor();
                    break;
                case 3:
                    txt = NewsManager.addNews();
                    break;
                case 4:
                    txt = NewsManager.deleteNews();
                    break;
                case 5:
                    txt = NewsManager.showEditorNews();
                    break;
                case 6:
                    txt = NewsManager.calculateScore();
                    break;
                case 7:
                    txt = NewsManager.calculatePrice();
                    break;
                default:
                    txt = "Elija una opción válida (entre 0 y 7).\n";
            }
            System.out.println(txt);
        }
        while (op != 0);
    }
}