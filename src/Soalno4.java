
import java.util.Scanner;

public class Soalno4 {

	public static void main(String[] args) {
		int ttl;
		System.out.println("=====================================");
		System.out.println("\t TOKO SERBAGUNA IBIK");
		System.out.println("=====================================");
	
		Scanner jumlah = new Scanner(System.in);
		System.out.print("Masukkan Jumlah Produk yang dibeli : ");
		
		ttl = jumlah.nextInt();
		
		System.out.println();
		System.out.println("10 Sep 2022 (13:00)");
		System.out.println("ITEM     " + "    Qty  "+"    Harga");
		System.out.println("=================================");
		System.out.println("ROTI ENAK" + "     " +ttl +"       6300");
		System.out.println("--------------------------------");
		
		diskon(ttl);
		
		jumlah.close();
		
	}
	
	static void diskon(int value) {
		
		int harga = 6300;
		int hargaAsli = value * harga;
		int potongan, hargaDiskon;
		
		if (value%3==0) {
			float persen = (float) 0.05;
			potongan = (int) (hargaAsli * persen);
			hargaDiskon = hargaAsli - potongan;
			System.out.println("Diskon = 5%");
			System.out.println("Sub Total = "+hargaDiskon);
		}else {
			System.out.println("Diskon = 0%");
			System.out.println("Sub Total = "+hargaAsli);
		}
		
	}
}
