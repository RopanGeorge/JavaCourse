package abstractclass;

public class Zoo {
    public static void main(String[] args) {
        Tigru tigru=new Tigru();
        tigru.mananca();
        tigru.scoateSunet("x");
        tigru.doarme();
        System.out.println(tigru.vaneaza());

        tigru.doarme();
        Animal pisica=new Tigru();
        pisica.doarme();
        Animal caine=(Animal)new Tigru();
        caine.doarme();

        Elefant elefant=new Elefant();
        elefant.bea();
        elefant.esteVanat("Elefant");
        elefant.supravietuiesteInJungla();


    }






}
