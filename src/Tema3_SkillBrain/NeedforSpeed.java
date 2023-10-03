package Tema3_SkillBrain;

import static Tema3_SkillBrain.NeedForSpeed.nitro;

class NeedForSpeed {
    public int speed;
    public int meters = 0;
    public int batteryDrain;
    public int battery = 100;

    public NeedForSpeed(int speed, int batteryDrain) {//de ce nu pot static?
        this.speed = speed;
        this.batteryDrain = batteryDrain;
    }

    public static NeedForSpeed nitro() {
        NeedForSpeed car = new NeedForSpeed(50, 4);
        return car;
    }

    public boolean batteryDrained() {
        return battery > 0;
    }

    public void distanceDriven() {
        System.out.println(meters);
    }

    public void drive() {
        meters += speed;
        battery -= batteryDrain;
    }


}

class RaceTrack {
    public static int distance;

    public RaceTrack(int distance) {
        this.distance = distance;
    }

    public static boolean carCanFinish(NeedForSpeed car) {
        if (100 / car.batteryDrain > distance / car.speed)
            return true;
        return false;
    }

    public static void main(String[] args) {
        NeedForSpeed car1 = new NeedForSpeed(5, 5);
        RaceTrack map1 = new RaceTrack(200);
        System.out.println(carCanFinish(car1));
        System.out.println(carCanFinish(nitro()));
    }
}

