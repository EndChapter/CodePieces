import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Insan i1 = new Insan(21, "Ali");
		//Insan i2 = new Insan(30, "Veli");
		//Bisiklet b1 = new Bisiklet();
		/*int baslangic = 0;
		System.out.print("Baþlangýç sayýsýný girin: ");
		baslangic=sc.nextInt();
		int son = 0;
		System.out.print("Son sayýyý girin: ");
		son=sc.nextInt();
		//b1.in();
		
		//b1.bin(i1);
		
		//b1.bin(i2);
		
		//b1.in();
		
		//b1.bin(i2);
		i1.SayiSay(baslangic, son);*/
		menuGoster();
	}
	public static void menuGoster() {
		int x = 0;
		Scanner sc = new Scanner(System.in);
		
		while(x!=4) {
			System.out.println("1. Ara");
			System.out.println("2. Kaydet");
			System.out.println("3. Yükle");
			System.out.println("4. Çýkýþ");
			System.out.print("Seçenek: ");
			x= sc.nextInt();
			if(x==1) {
				System.out.println("Arama Ýþlemi Yapýldý...");
			}
			else if(x==2){
				System.out.println("Kaydetme Ýþlemi Yapýldý...");
			}
			else if(x==3){
				System.out.println("Yükleme Ýþlemi Yapýldý...");
			}
			else if(x==4) {
				System.out.println("Programdan Çýkýyorsunuz...");
			}
			else{
				System.out.println("Yanlýþ girdi!");
			}
		}
	}
}

