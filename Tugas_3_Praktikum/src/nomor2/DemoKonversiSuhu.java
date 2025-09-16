package nomor2;

public class DemoKonversiSuhu {

 public static void main(String[] args) {
     KonversiSuhu2 konverter = new KonversiSuhu2();

     double suhuCelcius = 25.459;
     
     System.out.println("Suhu Awal: " + suhuCelcius + "°C\n");

     double hasilFahrenheit = konverter.celciusToFahrenheit(suhuCelcius);
     System.out.println(suhuCelcius + "°C = " + hasilFahrenheit + "°F");

     double hasilReamur = konverter.celciusToReamur(suhuCelcius);
     System.out.println(suhuCelcius + "°C = " + hasilReamur + "°R");

     double hasilReamurDariFahrenheit = konverter.fahrenheitToReamur(hasilFahrenheit);
     System.out.println(hasilFahrenheit + "°F = " + hasilReamurDariFahrenheit + "°R");
 }

}
