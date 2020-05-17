public class Klienn {
	public static void main(String[] args) {
//Orang<String> orangGen = new Orang<String>("Ali");
Orang<String, integer> orangGen = new Orang<>("Ali",130);
		orangGen.setNama("Susi");
	orangGen.setKtp(123);
	System.out.println(orangGen.getNama());
	System.out.println(orangGen.getKtp());
	}
}