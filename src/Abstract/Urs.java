package Abstract;

public class Urs implements Animal{
    @Override
    public void sunet() {
        System.out.println("Ursul face mor");
    }

    @Override
    public void tipMancare() {
        System.out.println("Ursul este omnivor");
    }

    @Override
    public void culoare() {
        System.out.println("Ursul este maro");
    }
}
