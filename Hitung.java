public class Hitung<T extends Comparable> {
	 private T a;
	 private T b;
public Hitung(T a, T b) {
 	this.a = a; 
	this.b = b; 
}
 public T maksimal() { 
		if (a.compareTo(b)>=0) 
			return a; 
		else return b; 
} 
public static <T> T cekKesamaan(T a, T b){ 
		if (a.equals(b))
		 return a; 
		else
		 return b;
 }
}