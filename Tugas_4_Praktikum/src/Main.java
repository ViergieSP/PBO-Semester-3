
public class Main {
    public static void main(String[] args) {

    	Balok balok1 = new Balok(10.7, 5, 8);
        Balok kubus1 = new Kubus(5.3);
        Kubus kubus2 = new Kubus(6.7);

        balok1.getInfo();
        System.out.println("Volume         : " + balok1.hitungVolume());
        System.out.println("Luas Permukaan : " + balok1.hitungLuasPermukaan());

        System.out.println();

        kubus1.getInfo();
        System.out.println("Volume         : " + kubus1.hitungVolume());
        System.out.println("Luas Permukaan : " + kubus1.hitungLuasPermukaan());
        
        System.out.println();
        
        kubus2.getInfo();
        System.out.println("Volume         : " + kubus2.hitungVolume());
        System.out.println("Luas Permukaan : " + kubus2.hitungLuasPermukaan());
    }
}