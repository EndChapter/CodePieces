import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Insan i1 = new Insan(21, "Ali");
		//Insan i2 = new Insan(30, "Veli");
		//Bisiklet b1 = new Bisiklet();
		/*int baslangic = 0;
		System.out.print("Ba�lang�� say�s�n� girin: ");
		baslangic=sc.nextInt();
		int son = 0;
		System.out.print("Son say�y� girin: ");
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
			System.out.println("3. Y�kle");
			System.out.println("4. ��k��");
			System.out.print("Se�enek: ");
			x= sc.nextInt();
			if(x==1) {
				System.out.println("Arama ��lemi Yap�ld�...");
			}
			else if(x==2){
				System.out.println("Kaydetme ��lemi Yap�ld�...");
			}
			else if(x==3){
				System.out.println("Y�kleme ��lemi Yap�ld�...");
			}
			else if(x==4) {
				System.out.println("Programdan ��k�yorsunuz...");
			}
			else{
				System.out.println("Yanl�� girdi!");
			}
		}
	}
}

