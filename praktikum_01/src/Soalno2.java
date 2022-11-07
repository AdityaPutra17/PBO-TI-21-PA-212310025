
public class Soalno2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int c = 90;
		
		
		CelciusToFahrenheit();
		//kalo tipe data functionnya selain void, buat pemanggilan functiounnya harus pake variabel
		float r=CelciusToReamur();
		System.out.println("r = "+ r);
		
		//ini penggunaan parameter
		int k= CelciusTOKelvin(c);
		System.out.println("k = "+ k);
		
	}
	
	static void CelciusToFahrenheit() {
		int c=90;
		int f = ( 9/5  * c) + 32;
		System.out.println("f = "+ f);
	}

	static float CelciusToReamur() {
		
		int c= 90;
		int r = (4/5 * c);
		
		return r;
	}
	
	//Belajar parameter
	static int CelciusTOKelvin(int c) {
		int k = c + 273;
		return k;
	}
}
