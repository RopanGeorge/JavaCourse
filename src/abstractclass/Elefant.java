package abstractclass;

public class Elefant implements Comportament{
    @Override
    public void bea() {
        System.out.println("Elefantul bea apa");
    }

    @Override
    public void supravietuiesteInJungla() {
        System.out.println("Elefantul supravietuieste in jungla");

    }

    @Override
    public String esteVanat(String tipanimalvanat) {
        System.out.println("Elefantul nu poate fi vanat");
        return "Elefantul nu poate vanat"+ tipanimalvanat;
    }
}
