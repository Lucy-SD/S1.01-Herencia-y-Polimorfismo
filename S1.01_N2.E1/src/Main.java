import javax.xml.transform.stream.StreamSource;

public class Main {
    public static void main(String[] args) {
        Smartphone sPhone = new Smartphone("Super Phone", "XCD159");

        System.out.println(sPhone + sPhone.takePic() + sPhone.alarm() + sPhone.call("+54-735-215-872"));
    }
}