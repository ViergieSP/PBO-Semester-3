package nomor2;

public class DemoNilai {
 public static void main(String[] args) {
     Nilai mahasiswa = new Nilai();

     mahasiswa.NIM = "xxxxxxx";
     mahasiswa.Nama = "xxxxxxx";
     mahasiswa.NilaiAbsen = 0000000;
     mahasiswa.NilaiTugas = 0000000;
     mahasiswa.NilaiUTS = 0000000;
     mahasiswa.NilaiUAS = 0000000;
     
     mahasiswa.CetakNilai();
 }
}