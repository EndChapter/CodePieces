package mc.java.kod167;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;


public class Listeleme {
	public static void main(String args[]){
		File[] f1 = new File("C:\\").listFiles();
		System.out.println(Arrays.toString(f1));
		ArrayList<File> d1 = new ArrayList<File>();
		for(int i = 0; i< f1.length;i++) {
			d1.add(f1[i]);
		}
		for(int i = 0; i<f1.length;i++) {
			System.out.println(d1.get(i));
		}
	}
}
