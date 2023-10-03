package interfaces;

public class Persoana {
    public static void main(String[] args) {
        AntrenorHandbal antrenorHandbal=new AntrenorHandbal();
        antrenorHandbal.alearga();
        antrenorHandbal.antreneaza();
        antrenorHandbal.nrEchipe(4);
        antrenorHandbal.sport("Handbal");
        antrenorHandbal.tipa();
        antrenorHandbal.suteaza();

        System.out.println("\n");

        InstructorCISCO intructorCISCO= new InstructorCISCO();
        intructorCISCO.numeInstructor("Stefan");
        intructorCISCO.experientaRetelistica(10);

        Instructor instructor= (Instructor) new InstructorCISCO();
        instructor.corecteaza();
        instructor.evalueazaExamen();
        instructor.preda();

        InstructorCISCO instructor2= new InstructorCISCO();
        instructor2.corecteaza();
        instructor2.evalueazaExamen();
        instructor2.preda();

        Instructor instructor1= new InstructorCISCO();
        







    }
}
