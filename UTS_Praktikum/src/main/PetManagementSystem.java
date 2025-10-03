package main;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

import base.Pet;
import behavior.Interactable;
import model.Cat;
import model.Dog;

public class PetManagementSystem {

    private static ArrayList<Pet> petList = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            showMenu();
            int choice = getUserChoice();

            switch (choice) {
                case 1:
                    addPet();
                    break;
                case 2:
                    showPets();
                    break;
                case 3:
                    interactWithPet();
                    break;
                case 4:
                    System.out.println("Program selesai.");
                    scanner.close();
                    return;
                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
            }
            System.out.println("\nTekan Enter untuk kembali ke menu...");
            scanner.nextLine();
        }
    }

    private static void showMenu() {
        System.out.println("\n--- Sistem Manajemen Hewan Peliharaan ---");
        System.out.println("1. Tambah Hewan Peliharaan Baru");
        System.out.println("2. Tampilkan Daftar Hewan Peliharaan");
        System.out.println("3. Interaksi dengan Hewan Peliharaan");
        System.out.println("4. Keluar");
        System.out.print("Masukkan pilihan Anda: ");
    }

    private static int getUserChoice() {
        try {
            int choice = scanner.nextInt();
            scanner.nextLine();
            return choice;
        } catch (InputMismatchException e) {
            System.out.println("Input harus berupa angka!");
            scanner.nextLine();
            return 0;
        }
    }

    private static void addPet() {
        System.out.println("\nPilih jenis hewan:");
        System.out.println("1. Anjing");
        System.out.println("2. Kucing");
        System.out.print("Pilihan: ");
        int type = getUserChoice();

        System.out.print("Masukkan nama hewan: ");
        String name = scanner.nextLine();
        System.out.print("Masukkan umur hewan: ");
        int age = getUserChoice();

        Pet newPet = null;
        if (type == 1) {
            newPet = new Dog(name, age);
        } else if (type == 2) {
            newPet = new Cat(name, age);
        } else {
            System.out.println("Jenis hewan tidak valid.");
            return;
        }

        petList.add(newPet);
        System.out.println(name + " berhasil ditambahkan ke dalam daftar!");
    }

    private static void showPets() {
        System.out.println("\n--- Daftar Hewan Peliharaan ---");
        if (petList.isEmpty()) {
            System.out.println("Belum ada hewan peliharaan yang terdaftar.");
        } else {
            for (int i = 0; i < petList.size(); i++) {
                System.out.print((i + 1) + ". ");
                petList.get(i).displayInfo();
            }
        }
    }

    private static void interactWithPet() {
        if (petList.isEmpty()) {
            System.out.println("Tidak ada hewan untuk diajak berinteraksi. Silakan tambah hewan terlebih dahulu.");
            return;
        }

        showPets();
        System.out.print("Pilih nomor hewan untuk berinteraksi: ");
        int petNumber = getUserChoice();

        if (petNumber < 1 || petNumber > petList.size()) {
            System.out.println("Nomor hewan tidak valid.");
            return;
        }

        Pet selectedPet = petList.get(petNumber - 1);
        
        System.out.println("\nAnda memilih: " + selectedPet.getName());
        System.out.println("Pilih Aksi:");
        System.out.println("1. Beri Makan");
        System.out.println("2. Ajak Tidur");
        System.out.println("3. Dengar Suara");
        System.out.println("4. Ajak Bermain");
        System.out.println("5. Beri Makan Spesial");
        System.out.print("Pilihan Aksi: ");
        int action = getUserChoice();

        switch (action) {
            case 1:
                selectedPet.eat();
                break;
            case 2:
                selectedPet.sleep();
                break;
            case 3:
                selectedPet.makeSound();
                break;
            case 4:
                if (selectedPet instanceof Interactable) {
                    ((Interactable) selectedPet).play();
                } else {
                    System.out.println(selectedPet.getName() + " tidak tahu cara bermain.");
                }
                break;
            case 5:
                if (selectedPet instanceof Dog) {
                    ((Dog) selectedPet).eat("Tulang");
                } else if (selectedPet instanceof Cat) {
                    ((Cat) selectedPet).eat("Tuna");
                }
                break;
            default:
                System.out.println("Aksi tidak valid.");
        }
    }
}