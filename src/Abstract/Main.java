package Abstract;

public class Main {
    public static void main(String[] args) {
        Crocodil crocodil1=new Crocodil();
        Elefant elefant1=new Elefant();
        Urs urs1=new Urs();
        crocodil1.sunet();
        crocodil1.tipMancare();
        crocodil1.culoare();
        System.out.println("___________");
        urs1.sunet();
        urs1.tipMancare();
        urs1.culoare();
        System.out.println("___________");
        elefant1.sunet();
        elefant1.tipMancare();
        elefant1.culoare();
    }

}
