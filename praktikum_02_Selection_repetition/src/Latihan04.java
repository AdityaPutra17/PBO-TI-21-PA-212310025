import java.util.Scanner;
public class Latihan04 {

   public static void main(String[] args) {
   Scanner input = new Scanner(System.in);
   faktorial(input);
   }
   static void faktorial(Scanner input) {
	   System.out.print("Masukkan Angka = ");
	   int fak = input.nextInt();
	   
	   int tambah=fak;
	   for (int i = fak; i >= 1; i--) {
           if (fak % tambah == 0) {
               System.out.print(tambah+" ");
           }
           tambah--;
	   }
   }
}