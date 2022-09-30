import java.util.Scanner;

class Resto {
	private long harga;
	
	public void PilihMenu() {
		Scanner input = new Scanner(System.in);
		boolean next = true;
		String pilihLanjut;
		int pilih;
		
		while(next) {
			System.out.println("====PROGRAM PILIH MENU SARAPAN====");
			System.out.println();
			System.out.println("Menu Sarapan:");
			System.out.println("1. Nasi Goreng");
			System.out.println("2. Bubur Ayam");		
			System.out.println("3. Soto Ayam ");		
			System.out.print("Pilihan : ");
			pilih = input.nextInt();
			
			getPrices(pilih);
			
			System.out.print("\nApakah Anda ingin memesan lagi? [Y/N] : ");
			pilihLanjut = input.next();
			
			if(pilihLanjut.equalsIgnoreCase("Y")) {
				continue;
			} else if(pilihLanjut.equalsIgnoreCase("N")) {
				System.out.println("Terima kasih telah memesan");
				break;
			} else {
				System.out.println("Pilihan yang Anda masukkan salah!");
			}
		}
		input.close();
	}
	
	private long getPrices(int pilih) {
		switch(pilih) {
			case 1:
				harga = 22000;
				System.out.println("Harga Nasi Goreng = Rp " + harga);
			break;
			case 2:
				harga = 15000;
				System.out.println("Harga Bubur Ayam = Rp " + harga);
			break;
			case 3:
				harga = 25000;
				System.out.println("Harga Soto Ayam = Rp " + harga);
			break;
			default:
				System.out.println("Pilihan tidak ada");
		}		
		return pilih;
	}
}

public class Latihan07 {
	
	public static void main(String[] args)  {
		Resto restoran = new Resto();
		
		restoran.PilihMenu();		
	}

}