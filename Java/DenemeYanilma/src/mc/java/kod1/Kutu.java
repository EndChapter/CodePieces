package mc.java.kod1;

public class Kutu<T> {
	private T deger;
	
	void setDeger(T deger) throws NullPointerException{
		this.deger = deger;
	}
	T getDeger() {
		return deger;
	}
}
