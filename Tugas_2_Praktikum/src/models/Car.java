package models;

public class Car implements CarInterface {
    String color;
    String noPlate;
    double width;
    double height;
    String brand;

    public Car() {
        this.color = "Putih";
        this.noPlate = "A 1234 BCD";
        this.width = 1;
        this.height = 1;
        this.brand = "Yamaha";
        System.out.println("Konstruktor default:");
    }

    public Car(String brand, String color, String noPlate, double width, double height) {
        this.brand = brand;
        this.color = color;
        this.noPlate = noPlate;
        this.width = width;
        this.height = height;
    }


    public void startEngine() {
        System.out.println("Mesin menyala.");
    }

    public void Throttle() {
        System.out.println("Mobil melaju.");
    }

    public void Brake() {
        System.out.println("Mobil berhenti.");
    }

    public void turnOnHeadLamp() {
        System.out.println("Lampu depan dinyalakan.");
    }

    public void turnOffHeadLamp() {
        System.out.println("Lampu depan dimatikan.");
    }

    public void displayInfo() {
        System.out.println("====== Informasi Mobil ======");
        System.out.println("Merek		: " + this.brand);
        System.out.println("Warna		: " + this.color);
        System.out.println("Plat Nomor	: " + this.noPlate);
        System.out.println("Lebar		: " + this.width + " m");
        System.out.println("Tinggi		: " + this.height + " m");
        System.out.println("=============================");
    }
}