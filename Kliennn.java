public class Kliennn {
public static void main(String[] args) { 
	Hitung<Integer> hitung = new Hitung<>(0,1); 
	System.out.println(hitung.maksimal(100,9)); 
	Hitung<String> cekHitung = new Hitung<>("","");
System.out.println(cekHitung.<String>cekKesamaan(" Ali","ali"));
System.out.println(Hitung.<String>cekKesamaan("Ali ","ali"));
 }
}