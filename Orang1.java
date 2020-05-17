public class Orang1<T1,T2> {
	private T1 nama;
	private T2 ktp;
	public Orang1(T1 nama, T2 ktp) {
		this.nama =nama;
		this.ktp =ktp;
	}
	public T1 getNama(){
		return nama;
	}
	public T2 getKtp() {
		return ktp;
	}
	public void setKtp (T2 ktp) {
		this.ktp= ktp;
	}
}