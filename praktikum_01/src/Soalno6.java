import java.util.Scanner;

public class Soalno6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String usia;
		String NPM;
		String Firstname;
		String Lastname;
		
		Scanner keyboard = new Scanner(System.in);
	
		System.out.print("Masukkan Usia : ");
		usia = keyboard.nextLine();
		
		System.out.print("Masukkan Nama Depan : ");
		Firstname = keyboard.nextLine();
		
		System.out.print("Masukkan Nama Belakang : ");
		Lastname = keyboard.nextLine();
		
		System.out.print("Masukkan NPM : ");
		NPM = keyboard.nextLine();
	
		
		System.out.println(usia.concat(Firstname).concat(Lastname).concat(NPM));
		
		keyboard.close();
	}

}
