package dizi1;

public class matriselemanlartoplami {

	public static void main(String[] args) {
		//Her bir elemanı rastgele oluşturulmuş 3 x 2 lik matriste bulunan sayıların toplamını yazdıran program.
		//Matriste yer alan en küçük ve en büyük sayıyı bulmak.
		
		int[][] matris= new int[3][2];
		int enKucukSayi=101 , enBuyukSayi=0;
		
		for(int satir=0; satir<matris.length; satir++) {
			
			for(int sutun=0; sutun<matris[satir].length; sutun++) {
				
				int rastgeleSayi = (int) (Math.random() *100);
				matris[satir][sutun] = rastgeleSayi;
				
				System.out.println(satir + ".satırdaki" + sutun + ".sutunun elemanı"+ matris[satir][sutun]);
				
				if(enKucukSayi >rastgeleSayi) {
					
					enKucukSayi=rastgeleSayi;
				}
				if(enBuyukSayi <rastgeleSayi) {
					
					enBuyukSayi=rastgeleSayi;
				}
				
			}
			System.out.println("Bu matristeki en küçük sayı:" + enKucukSayi + "en büyük sayı" +enBuyukSayi);
		}
	}

}
