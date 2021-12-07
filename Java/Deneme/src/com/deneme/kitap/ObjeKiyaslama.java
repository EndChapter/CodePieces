package com.deneme.kitap;

public class ObjeKiyaslama {
	int numara;
	String ad;
	
	public boolean equals(Object o) {
		if(o == null)
			return false;
		if(o== this)
			return true;
		if(!(o instanceof ObjeKiyaslama))
			return false;
		ObjeKiyaslama bu = (ObjeKiyaslama)o;
		return bu.numara == this.numara && bu.ad == this.ad;
	}
	public static void main(String args[]) {
		ObjeKiyaslama o1 = new ObjeKiyaslama();
		o1.ad ="Musa";
		o1.numara = 42;
		
		ObjeKiyaslama o2 = new ObjeKiyaslama();
		o2.ad ="Musa";
		o2.numara = 42;
		
		System.out.println(o1.equals(o2));
	}
}
