package Tema1_SkillBrain;

public class Tema1_ex7 {
    public static void main(String[] args) {
       double x=20;

        suma(x);
        diferenta(x);
        inmultire(x);
        impartire(x);
        modul(x);

    }
    public static void suma(double x){
        System.out.println(x+"+5="+(x+5));
    }
    public static void diferenta(double x){
        System.out.println(x+"-12.3="+(x-12.3));
    }
    public static void inmultire(double x){
        System.out.println(x+"*-3.2="+(x*(-3.2)));
    }
    public static void impartire(double x){
        System.out.println(x+"/4="+(x/4));
    }
    public static void modul(double x){
        System.out.println(x+"%6="+(x%6));
    }
}
