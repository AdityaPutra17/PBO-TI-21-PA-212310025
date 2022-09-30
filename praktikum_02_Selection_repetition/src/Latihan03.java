import java.util.Scanner;

public class Latihan03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Menu Sarapan :");
		System.out.println("1. Nasi Goreng");
		System.out.println("2. Bubur Ayam");
		System.out.println("3. Soto Ayam");
		
		int pilih;
		Scanner inputUser = new Scanner(System.in);
		
		System.out.print("Pilih Menu = ");
		pilih = inputUser.nextInt();
		
		inputUser.close();
		switch(pilih) {
			case 1 :{
				System.out.println("Anda memesan Nasi Goreng dengan harga Rp22.000,-");
			}
			break;
		
			case 2 :{
				System.out.println("Anda memesan Bubur Ayam dengan harga Rp15.000,-");
			}
			break;
			case 3 :{
				System.out.println("Anda memesan Soto Ayam dengan harga Rp 25.000,-");
			}
			break;
			default :{
				System.out.println("Maaf menu yang anda masukan salah.");
			}
		}
	}
}
