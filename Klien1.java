public class Klien1 {
	public static void main(String[] args) {
//Orang1<String> orang1Gen = new Orang1<String>("Ali");
Orang1<String, Integer> orang1Gen = new Orang1<>("Ali",130);
		orang1Gen.setNama("Susi");
	orang1Gen.setKtp(123);
	System.out.println(orang1Gen.getNama());
	System.out.println(orang1Gen.getKtp());
	}
}