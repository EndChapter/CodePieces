package com.deneme.kitap;
import java.io.FileNotFoundException;
import java.util.StringTokenizer;
public class StringKes {
	public static void main(String args[]) throws FileNotFoundException{
		String s = "Birçkapiçkapanirsaçmutlakçbaskaçbirçkapiçacilacaktir";
		StringTokenizer sp = new StringTokenizer(s, "ç");
		while(sp.hasMoreTokens()) {
			System.out.println(sp.nextToken());
		}
	}
}
