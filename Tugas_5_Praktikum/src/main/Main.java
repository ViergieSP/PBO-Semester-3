package main;

import nilai.Mahasiswa;
import java.util.Scanner;

public class Main{

 public static void main(String[] args) {
	 // TODO Auto-generated method stub
     Scanner input = new Scanner(System.in);

     System.out.println("========================================");
     System.out.println("PROGRAM MENGHITUNG NILAI AKHIR MAHASISWA");
     System.out.println("========================================");

     System.out.print("NPM             : ");
     String npm = input.nextLine();

     System.out.print("Nama Mahasiswa  : ");
     String nama = input.nextLine();

     System.out.print("Nilai Kehadiran : ");
     double kehadiran = input.nextDouble();

     System.out.print("Nilai Tugas     : ");
     double tugas = input.nextDouble();

     System.out.print("Nilai UTS       : ");
     double uts = input.nextDouble();

     System.out.print("Nilai UAS       : ");
     double uas = input.nextDouble();

     Mahasiswa mahasiswa = new Mahasiswa(npm, nama, kehadiran, tugas, uts, uas);

     System.out.println("\n========================================");

     System.out.println("\n========================================");
     System.out.println("NPM Mahasiswa  : " + mahasiswa.getNpm());
     System.out.println("Nama Mahasiswa : " + mahasiswa.getNama());
     System.out.println("Nilai Rata-rata: " + mahasiswa.getNilaiAkhir());
     System.out.println("Grade          : " + mahasiswa.getGrade());
     System.out.println("Keterangan     : " + mahasiswa.getKeterangan());
     System.out.println("========================================");

     input.close();
 }

}