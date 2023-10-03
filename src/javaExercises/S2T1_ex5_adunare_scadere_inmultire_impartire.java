package javaExercises;

public class S2T1_ex5_adunare_scadere_inmultire_impartire {
    public static void main(String[] args) {
        double a = 34;
        double b = 23;
        double c = 5;
        //sume
        double sum1 = a + b;
        double sum2 = a + c;
        double sum3 = c + b;
        //diferente
        double sub1 = a - b;
        double sub2 = a - c;
        double sub3 = c - b;
        //inmultire
        double mul1 = a * b;
        double mul2 = a * c;
        double mul3 = c * b;
        //impartire
        double imp1 = a / b;
        double imp2 = a / c;
        double imp3 = c / b;

        System.out.println("Suma a+b este " + sum1);
        System.out.println("Suma a+c este " + sum2);
        System.out.println("Suma c+b este " + sum3);
        System.out.println("Diferenta a-b este " + sub1);
        System.out.println("Diferenta a-c este " + sub2);
        System.out.println("Diferenta c-b este " + sub3);
        System.out.println("Produsul a*b este " + mul1);
        System.out.println("Produsul a*c este " + mul2);
        System.out.println("Produsul c*b este " + mul3);
        System.out.println("Impartirea a/b este " + imp1);
        System.out.println("Impartirea a/c este " + imp2);
        System.out.println("Impartirea c/b este " + imp3);
    }
}
