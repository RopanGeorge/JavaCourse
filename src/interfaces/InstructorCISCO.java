package interfaces;

public class InstructorCISCO implements Instructor{
    public void experientaRetelistica(int nrAni){
        System.out.println("Intructorul are "+nrAni+" ani experienta");
    }
    public void numeInstructor(String nume){
        System.out.println("Numele instrutorului este: "+nume);
    }

    @Override
    public void preda() {
        System.out.println("Intructourl preda");
    }

    @Override
    public void corecteaza() {
        System.out.println("Intructourl corecteaza");

    }

    @Override
    public void evalueazaExamen() {
        System.out.println("Intructourl evalueaza");
    }
}
