package abstractclass;

public class Tigru extends Animal{


    @Override
    public void mananca() {

    }

    @Override
    public void scoateSunet(String a) {

    }

    @Override
    public String vaneaza() {
        super.doarme();
        return null;
    }

    @Override
    public void doarme() {
        System.out.println("doarme 24h");
    }
}

