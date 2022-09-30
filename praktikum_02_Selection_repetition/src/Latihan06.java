import java.util.Scanner;

public class Latihan06 {
	

	public static void main(String[] args) {
		String jawab;
		int pilih;
		Scanner inputUser = new Scanner(System.in);
		
		do {
			System.out.println("Menu Sarapan :");
			System.out.println("1. Nasi Goreng");
			System.out.println("2. Bubur Ayam");
			System.out.println("3. Soto Ayam");
			
			System.out.print("Pilih Menu = ");
			pilih = inputUser.nextInt();
			inputUser.nextLine();
			
			
			switch(pilih) {
				case 1 :
					System.out.println("Anda memesan Nasi Goreng dengan harga Rp22.000,-");
				
				break;
			
				case 2 :
					System.out.println("Anda memesan Bubur Ayam dengan harga Rp15.000,-");
				
				break;
				case 3 :
					System.out.println("Anda memesan Soto Ayam dengan harga Rp 25.000,-");
				
				break;
				default :
					System.out.println("Maaf menu yang anda masukan salah.");
				
			}
			
			System.out.print("Apakah Anda ingin memesan kembali y/n? ");
			jawab = inputUser.nextLine();
		
		}while(jawab.equals("Y"));
		inputUser.close();
	}
}
