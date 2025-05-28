
public class Main {
    public static void main(String[] args) {

        WindInstrument saxo = new WindInstrument("saxo", 1874.51f);
        StringedInstrument guitarra = new StringedInstrument("guitarra", 1247.74f);
        PercussionInstument tambor = new PercussionInstument("tambor", 574.17f);

        System.out.println(saxo.play() + saxo + guitarra.play() + guitarra +
                tambor.play() + tambor);
    }
}