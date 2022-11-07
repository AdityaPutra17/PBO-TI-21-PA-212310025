
public class Soalno3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		SegitigaKerucut();
		
		float v = Tabung();
		System.out.println("Volume Tabung = "+v);
		

		
	}
	static void SegitigaKerucut() {
		double phi = 3.14;
		float r = 6;
		float t = 8;
		float s = 10;
		float LuasP = (float) (phi * r * (r + s)); 
		System.out.println("Luas Permukaaan = "+LuasP);
		
		float volume = 1/(float)3 * LuasP * t;
		System.out.println("Volume Segitiga Kerucut = "+volume);
	}
	
	static float Tabung() {
		double phi = 3.14;
		float r = 10;
		float t = 3;
		float volume = (float) (phi * r * r * t);
		
		return volume;
	}
}
