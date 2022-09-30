import java.util.Scanner;

public class Latihan02 {	
	    public static void main(String args[]){
	        Scanner input = new Scanner(System.in);
	        int NPM, cek=0;

	        System.out.print("Masukan NPM Anda : ");
	        NPM = input.nextInt();
	        
	        input.close();
	        
	        System.out.println("----------------------------------------------");
	        for (int i=2; i<=NPM; i++){
	            if (NPM %i == 0){
	                cek++;
	            }
	        }
	        
	        if (cek==1){
	            System.out.println("Termasuk bilangan prima");
	        }else {
	            System.out.println("Bukan bilangan prima karena dapat dibagi dengan 2");
	        }  
	}
}
