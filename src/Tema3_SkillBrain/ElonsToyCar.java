package Tema3_SkillBrain;

public class ElonsToyCar {
    public int meters=0;
    public int percentage=100;

    public static ElonsToyCar buy() {

        return new ElonsToyCar();
    }

    public void distanceDisplay() {
        System.out.println("Driven "+ meters +" meters");
    }

    public void batteryDisplay() {
        System.out.println("Battery at "+ percentage);
    }

    public void drive() {
        if (percentage>0)
        {
            meters+=20;
            percentage--;
        }
    }

    public static void main(String[] args) {
        ElonsToyCar car = ElonsToyCar.buy();
        car.distanceDisplay();
        car.drive();
        car.drive();
        car.drive();
        car.drive();
        car.distanceDisplay();
        car.batteryDisplay();




    }
}

