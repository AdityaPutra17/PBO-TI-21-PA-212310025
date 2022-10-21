package Biodata;

import javax.swing.JOptionPane;

public class Biodata {
	private String namalengkap, alamat;
	private int usia;
	
	void setData(String var_nama, int var_usia, String var_alamat) {
		namalengkap = var_nama;
		usia = var_usia;
		alamat = var_alamat;
	}
	
	void getData() {
		String output = "Biodata " + namalengkap + "\n\n" + "Nama : " + namalengkap + "\n" + "Usia : " + usia + "\n"+ "Alamat : " + alamat + "\n";
		
		JOptionPane.showMessageDialog(null, output, "Data Biodata", JOptionPane.INFORMATION_MESSAGE);
	}
	
}

