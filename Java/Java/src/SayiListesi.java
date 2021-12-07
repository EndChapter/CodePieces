
public class SayiListesi {
	int[] liste;
	int elemanSayisi;
	int sinir;
	public SayiListesi(int elemanSayisi) 
	{
		liste = new int[elemanSayisi];
		this.elemanSayisi = 0;
		sinir = elemanSayisi;
	}
	public void listeyeEkle(int eklenecekOlan)
	{
		if(elemanSayisi<sinir) 
		{
		liste[elemanSayisi] = eklenecekOlan;
		elemanSayisi++;
		}
		else {
			System.out.println("Eleman Sayýsý Aþýldý! Yeni Eleman Eklenemiyor!");
		}
	}
	public void yaz() {
		for(int i = 0;i<elemanSayisi;i++ )
		{
			System.out.print(liste[i]+ ", ");
		}
		System.out.println();
	}
	public void sondanSil() {
		if(elemanSayisi>0) {
			liste[elemanSayisi-1]=0;
			elemanSayisi--;	
		}
		else {
			System.out.println("Liste boþ!");
		}
	}
	public void bastanSil() {
		liste[0] = 0;
		for(int i = 0;i<elemanSayisi - 1;i++)
		{
		liste[i]=liste[i+1];
		}
		elemanSayisi--;
	}
	public void sil(int x){
		x--;
		if(x<elemanSayisi&&x>=0)
		{
			for(int i = x;i < elemanSayisi-1;i++)
			{
			liste[i]=liste[i+1];
			}
			elemanSayisi--;
		}
		else
		{
			System.out.println("Böyle bir eleman yok!");
		}
	}
	public void ekle(int eklenecekEleman, int yer) {
		yer--;
		if(yer>=0&&yer<=elemanSayisi)
		{
		int x = elemanSayisi-1;
		while(x>=yer) {
			liste[x+1]=liste[x];
			x--;
		}
		liste[yer]=eklenecekEleman;
		elemanSayisi++;
		}
		else
		{
			System.out.println("Yanlýþ Ýndex!");
		}
	}
	public int max()
	{
		int enBuyuk = liste[0];
		for(int i = 0;i < elemanSayisi;i++)
		{
			if(liste[i]> enBuyuk )
			{
				enBuyuk=liste[i];
			}
		}
		return enBuyuk;
	}
	public int min()
	{
		int enKucuk = liste[0];
		for(int i = 0;i < elemanSayisi;i++)
		{
			if(liste[i]< enKucuk )
			{
				enKucuk=liste[i];
			}
		}
		return enKucuk;
	}
	public void swap(int i1, int i2)
	{
		int tmp = liste[i1];
		liste[i1] = liste[i2];
		liste[i2] = tmp;
	}
	public void kucuktenBuyugeSirala() {
		for(int i = 0;i<elemanSayisi;i++) {
			for(int x = 0;x<elemanSayisi;x++)
			{
				if(liste[x]> liste[i])
				{
					swap(x, i);
				}
			}
			
		}
	}
	public void SelectionSort() {
		int enKucukIndex;
		for(int i = 0;i<elemanSayisi;i++)
		{
			enKucukIndex = i;
			for(int j=i;j<elemanSayisi;j++)
			{
				if(liste[j]<liste[enKucukIndex])
				{
					enKucukIndex =  j;
				}
			}
			swap(enKucukIndex, i);	
		}
		
	}
	public void SelectionSortTers() {
		int enKucukIndex;
		for(int i = 0;i<elemanSayisi;i++)
		{
			enKucukIndex = i;
			for(int j=i;j<elemanSayisi;j++)
			{
				if(liste[j]>liste[enKucukIndex])
				{
					enKucukIndex =  j;
				}
			}
			swap(enKucukIndex, i);	
		}
		
	}
	public void BubbleSort() {
		boolean swapped = true;
		while(swapped)
		{
			swapped=false;
			for(int i = 1;i<elemanSayisi;i++) 
			{
				if(liste[i-1]>liste[i])
				{
					swap(i, i-1);
					swapped= true;
					yaz();
				}
				
			}
		}
	}
}
