package nomor1;

public class Mahasiswa {
	String nama;

    public Mahasiswa(String namaMahasiswa) {
        this.nama = namaMahasiswa;
    }

    public void membaca() {
        System.out.println(this.nama + " membaca.");
    }

    public void nyontek() {
        System.out.println(this.nama + " menyontek.");
    }

    public void modifikasi() {
        System.out.println(this.nama + " memodifikasi.");
    }
}