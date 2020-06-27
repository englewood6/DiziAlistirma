package dizi1;

import java.util.Scanner;

public class ogrenciCevaplariveSonuclari {

	public static void main(String[] args) {
		//Kullanıcıdan istenen öğrenci sayısı ve toplam soru sayısını matriste düzenlemek.
		//Her bir öğrencinin kaç doğru ve yanlışı olduğunu gösteren proje.
		
		for(int i=0; i<10; i++) {
			System.out.println(cevapOlustur());
		}
		Scanner s=new Scanner(System.in);
		System.out.println("Toplam öğrenci sayısını giriniz: ");
		int ogrenciSayisi=s.nextInt();
		System.out.println("Toplam soru sayısını giriniz: ");
		int soruSayisi=s.nextInt();
		
		//A,B,C,D,E cevapları verilebilir.
		
		char[][] tumCevaplar = new char[ogrenciSayisi][soruSayisi];
		char[] cevapAnahtari= new char[soruSayisi];
		
		cevapAnahtariOlustur(cevapAnahtari);
		ogrenciCevaplariniYerlestir(tumCevaplar);
		
		ogrenciCevaplariniGoruntule(tumCevaplar);
		cevapAnahtariniGoruntule(cevapAnahtari);
		
		ogrencileriDegerlendir(cevapAnahtari,tumCevaplar);
	}
	
	 	private static void cevapAnahtariniGoruntule(char[] cevapAnahtari) {
		
	 		for(char secenek:cevapAnahtari) {
	 			System.out.print(secenek+ " ,");
	 		}
	 		System.out.println();
		
	}

		private static void ogrenciCevaplariniGoruntule(char[][] tumCevaplar) {
		       
	 		for(int satir=0; satir<tumCevaplar.length; satir++) {
	 			for(int sutun=0; sutun<tumCevaplar[satir].length; sutun++) {
	 				
	 				System.out.print(tumCevaplar[satir][sutun]+ ",");
	 			}
	 			System.out.println();
	 		}
		
	}

		private static void ogrencileriDegerlendir(char[] cevapAnahtari, char[][] tumCevaplar) {
		
	 		for(int satir=0; satir<tumCevaplar.length; satir++) {
	 			
	 			int dogruCevapSayisi = 0;
	 			for(int sutun=0; sutun<tumCevaplar[satir].length; sutun++) {
	 				
	 				tumCevaplar[satir][sutun]=cevapOlustur();
	 			
	 			if(tumCevaplar[satir][sutun] ==cevapAnahtari[sutun]) {
	 				dogruCevapSayisi++;
	 				
	 			}
	 			}
	 			System.out.println(satir + " indexindeki öğrencinin doğru cevap sayısı"+ dogruCevapSayisi);
	 		}
		
	}

		private static void cevapAnahtariOlustur(char[] cevapAnahtari) {
		
	 		for(int i=0; i<cevapAnahtari.length; i++) {
	 			cevapAnahtari[i]=cevapOlustur();
	 		}
		
	}

		private static void ogrenciCevaplariniYerlestir(char[][] tumCevaplar) {
		
	 		for(int satir=0; satir<tumCevaplar.length; satir++) {
	 			for(int sutun=0; sutun<tumCevaplar[satir].length; sutun++) {
	 				
	 				tumCevaplar[satir][sutun]=cevapOlustur();
	 			}
	 		}
		
	}

		public static char cevapOlustur() {

	 		int rastgeleSayi=65+ (int)(Math.random()*5); //0 1 2 3 4
	 		char uretilenSecenek = (char) rastgeleSayi;
	 		
	 		return uretilenSecenek;
		}

}
