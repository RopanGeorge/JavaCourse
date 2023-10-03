package Tema2_SkillBrain;



public class Lasagna {
    public static int expectedMinutesInOven(){
       return 40;
    }
    public static int remainingMinutesInOven(int minuteInCuptor) {
        return expectedMinutesInOven()-minuteInCuptor;
    }
    public static int preparationTimeInMinutes(int layers){

        return 2*layers;
    }
    public static int totalTimeInMinutes(int minute, int layers){
        return remainingMinutesInOven(minute)+preparationTimeInMinutes(layers);
    }

    public static void main(String[] args) {
        Lasagna lasagna = new Lasagna();
        lasagna.expectedMinutesInOven();
        lasagna.remainingMinutesInOven(30);
        lasagna.preparationTimeInMinutes(2);
        lasagna.totalTimeInMinutes(3, 20);


    }
}
