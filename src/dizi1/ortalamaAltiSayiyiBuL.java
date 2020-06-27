package dizi1;

public class ortalamaAltiSayiyiBuL {

	public static void main(String[] args) {
		
		//Rastgele oluşturulan 100 elemanlı dizinin elemanlarının ortalamasını aldıktan sonra ortalamanın altında kalan elemanları yazdırın.
		int sayilar []= new int[100];
		int tumSayilarinToplami=0;
		
				for(int i=0; i<sayilar.length; i++) {
			
			int rastgeleSayi= (int)(Math.random() *100);
			sayilar[i]=rastgeleSayi;
			tumSayilarinToplami +=rastgeleSayi;
			//tümSayilarinToplami=tümSayilarinToplami+rastgeleSayi;
		}
				double ortalama=(double) tumSayilarinToplami/(double)sayilar.length;
				System.out.println("Ortalama: "+ ortalama);
				int ortalamaAltindakiDegerlerinSayisi=0;
				
				for(int i=0; i<sayilar.length; i++) {
					if(sayilar[i] < ortalama) {
						ortalamaAltindakiDegerlerinSayisi++;
						
					}
				}
				System.out.println("Ortalama :"  + ortalama + "ve ortalamanın altındaki değerlerin sayısı: " + ortalamaAltindakiDegerlerinSayisi);
	}
	

}
