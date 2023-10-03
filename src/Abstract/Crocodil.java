package Abstract;

public class Crocodil implements Animal{
    @Override
    public void sunet() {
        System.out.println("Crocodilul face qqqqqqq");
    }

    @Override
    public void tipMancare() {
        System.out.println("Crocodilul este carnivor");
    }

    @Override
    public void culoare() {
        System.out.println("Crocodilul este verde");
    }
}
