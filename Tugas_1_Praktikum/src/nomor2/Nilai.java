package nomor2;

public class Nilai {
 String NIM;
 String Nama;
 double NilaiAbsen;
 double NilaiTugas;
 double NilaiUTS;
 double NilaiUAS;
 double NilaiAkhir;

 public Nilai() {

 }

 private void hitungNilaiAkhir() {
     NilaiAkhir = (NilaiAbsen * 0.10) + (NilaiTugas * 0.20) + (NilaiUTS * 0.30) + (NilaiUAS * 0.40);
 }

 public void CetakNilai() {
     hitungNilaiAkhir();
     
     System.out.println("NIM              : " + NIM);
     System.out.println("Nama             : " + Nama);
     System.out.println("Nilai Absen[10%] : " + NilaiAbsen);
     System.out.println("Nilai Tugas[20%] : " + NilaiTugas);
     System.out.println("Nilai UTS  [30%] : " + NilaiUTS);
     System.out.println("Nilai UAS  [40%] : " + NilaiUAS);
     System.out.println("Nilai Akhir      : " + NilaiAkhir);
 }
}
