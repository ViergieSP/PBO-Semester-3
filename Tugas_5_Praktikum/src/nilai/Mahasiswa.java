package nilai;

public class Mahasiswa {
 private String npm;
 private String nama;
 private double nilaiKehadiran;
 private double nilaiTugas;
 private double nilaiUTS;
 private double nilaiUAS;

 public Mahasiswa(String npm, String nama, double nilaiKehadiran, double nilaiTugas, double nilaiUTS, double nilaiUAS) {
     this.npm = npm;
     this.nama = nama;
     this.nilaiKehadiran = nilaiKehadiran;
     this.nilaiTugas = nilaiTugas;
     this.nilaiUTS = nilaiUTS;
     this.nilaiUAS = nilaiUAS;
 }

 public double getNilaiAkhir() {
     return (0.10 * this.nilaiKehadiran) + (0.20 * this.nilaiTugas) + (0.30 * this.nilaiUTS) + (0.40 * this.nilaiUAS);
 }

 public char getGrade() {
     double nilaiAkhir = getNilaiAkhir();
     if (nilaiAkhir >= 76) {
         return 'A';
     } else if (nilaiAkhir >= 66) {
         return 'B';
     } else if (nilaiAkhir >= 56) {
         return 'C';
     } else if (nilaiAkhir >= 46) {
         return 'D';
     } else {
         return 'E';
     }
 }

 public String getKeterangan() {
     char grade = getGrade();
     switch (grade) {
         case 'A':
             return "ISTIMEWA";
         case 'B':
             return "BAIK";
         case 'C':
             return "CUKUP";
         case 'D':
             return "KURANG";
         case 'E':
             return "KURANG SEKALI";
         default:
             return "Tidak Valid";
     }
 }

 public String getNpm() {
     return this.npm;
 }

 public String getNama() {
     return this.nama;
 }

}
