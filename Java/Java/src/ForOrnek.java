import java.util.Scanner;

public class ForOrnek 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		PazarListesi liste = new PazarListesi(6);
		liste.listeyeEkle("Un");
		liste.listeyeEkle("Ekmek");
		liste.listeyeEkle("Su");
		liste.listeyeEkle("Gofret");
		liste.listeyeEkle("Ayýcýk");
		liste.listeyeEkle("AAAAA");
		liste.kucuktenBuyugeSirala();
		liste.yaz();
		liste.buyuktenKucugeSirala();
		liste.yaz();
		/*int[] a = new int[3];
		int i = 0;
		int sonuc = 0;
		while(i <5) 
		{
			System.out.print((i+1) + ". sayýyý girin: ");
			a[i]=sc.nextInt();
			i++;
		}
		
		for(int x = 0;x<5;x++) 
		{
			sonuc += a[x];
		}
		System.out.println("Sonuç= " + sonuc);
		*/
	}
}