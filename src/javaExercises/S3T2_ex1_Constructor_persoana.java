package javaExercises;

public class S3T2_ex1_Constructor_persoana {
    String nume;
    int greutate=50;
    public void prezentare(){
        System.out.println("Salut sunt "+ nume);
    }
    public void schimbaNume(String nume){
        this.nume = nume;
    }

    public void mananca() {
        greutate++;
    }

    public static void main(String[] args) {
        S3T2_ex1_Constructor_persoana persoana=new S3T2_ex1_Constructor_persoana();
        persoana.prezentare();
        persoana.schimbaNume("Alex");
        persoana.mananca();
        System.out.println(persoana.nume);

    }

}
