package main;
import models.Car;

public class CarMain {
    public static void main(String[] args) {
        Car myCar = new Car("Honda", "Merah", "B 5678 CDF", 1.9, 1.6);
        
        myCar.displayInfo();

        System.out.println("\n===== Menjalankan Aksi Mobil =====");

        myCar.startEngine();
        myCar.turnOnHeadLamp();
        myCar.Throttle();
        myCar.Brake();
        myCar.turnOffHeadLamp();
        
        System.out.println("==================================");
        
        System.out.println();
        
        Car defaultCar = new Car();
        defaultCar.displayInfo();
    }
}