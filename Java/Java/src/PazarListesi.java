public class PazarListesi {
	String[] liste;
	int elemanSayisi;
	int sinir;
	public PazarListesi(int elemanSayisi) 
	{
		liste = new String[elemanSayisi];
		this.elemanSayisi = 0;
		sinir = elemanSayisi;
	}
	public void listeyeEkle(String eklenecekOlan)
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
			System.out.println(liste[i]);
		}
	}
	public void sondanSil() {
		if(elemanSayisi>0) {
			liste[elemanSayisi-1]="";
			elemanSayisi--;	
		}
		else {
			System.out.println("Liste boþ!");
		}
	}
	public void bastanSil() {
		liste[0] = "";
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
	public void ekle(String eklenecekEleman, int yer) {
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
	public String max()
	{
		String enBuyuk = liste[0];
		for(int i = 0;i < elemanSayisi;i++)
		{
			if(liste[i].compareToIgnoreCase(enBuyuk)> 0 )
			{
				enBuyuk=liste[i];
			}
		}
		return enBuyuk;
	}
	public String min()
	{
		String enKucuk = liste[0];
		for(int i = 0;i < elemanSayisi;i++)
		{
			if(liste[i].compareToIgnoreCase(enKucuk)< 0 )
			{
				enKucuk=liste[i];
			}
		}
		return enKucuk;
	}
	public void swap(int i1, int i2)
	{
		String tmp = liste[i1];
		liste[i1] = liste[i2];
		liste[i2] = tmp;
	}
	public void kucuktenBuyugeSirala() {
		for(int i = 0;i<elemanSayisi;i++) {
			for(int x = 0;x<elemanSayisi;x++)
			{
				if(liste[x].compareToIgnoreCase(liste[i])> 0)
				{
					String tmp = liste[i];
					liste[i] = liste[x];
					liste[x] = tmp;
				}
			}
			
		}
	}
	public void buyuktenKucugeSirala() {
		for(int i = 0;i<elemanSayisi;i++) {
			for(int x = 0;x<elemanSayisi;x++)
			{
				if(liste[x].compareToIgnoreCase(liste[i])< 0)
				{
					String tmp = liste[i];
					liste[i] = liste[x];
					liste[x] = tmp;
				}
			}
			
		}
	}

}
