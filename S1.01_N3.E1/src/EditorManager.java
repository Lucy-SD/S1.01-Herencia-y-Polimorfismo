import java.util.ArrayList;
import java.util.Scanner;

public class EditorManager {

    static Scanner scan = new Scanner(System.in);
    static ArrayList<Editor> editors = new ArrayList<Editor>();
    static int idEditor = -1;

    public static int findEditor(int dni) {
        int i = 0;
        idEditor = -1;
        boolean found = false;
        while (i < editors.size() && !found) {
            if (dni == editors.get(i).getDNI()) {
                idEditor = i;
                found = true;
            }
            i++;
        }
        return idEditor;
    }

    public static String addEditor() {
        String txt;
        String name;
        int dni;

        System.out.println("Ingrese el número de DNI del redactor a registrar:");
        dni = scan.nextInt();
        scan.nextLine();
        idEditor = findEditor(dni);
        if (idEditor != -1) {
            txt = "El DNI ingresado corresponde a un redactor ya registrado.\n";
        } else {
            System.out.println("Ingrese el nombre del redactor:");
            name = scan.nextLine();
            editors.add(new Editor(name, dni));
            txt = "Redactor añadido correctamente.\n";
        }
        return txt;
    }

    public static String deleteEditor() {
        String txt = "Datos incorrectos.\n";
        int dni;

        System.out.println("Ingrese el número de DNI del redactor a eliminar:");
        dni = scan.nextInt();
        idEditor = findEditor(dni);
        if (idEditor != -1) {
            editors.remove(idEditor);
            txt = "Redactor eliminado correctamente.\n";
        }
        return txt;
    }
}