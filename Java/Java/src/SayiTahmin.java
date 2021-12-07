import java.util.Scanner;
public class SayiTahmin {
	public static void main(String[] args) 
	{
		int cevap = 20;
		int girdi = 0;
		
		boolean oyunDevam = true;
		
		Scanner sc = new Scanner(System.in);
		do
		{
			//Oyunun genel mantýðý
			System.out.print("Bir sayi giriniz: ");
			girdi=sc.nextInt();
			if(girdi>cevap) {
				System.out.println("Tahmini Küçült!!");
				oyunDevam=true;
			}else if (girdi < cevap) {
				System.out.println("Tahmini Büyüt!!");
				oyunDevam=true;
			}
			else if(girdi==cevap) {
				System.out.println("Tebrikler Doðru Cevap!!");
				oyunDevam= false;
			}
		}
		while(oyunDevam);
	}
}
