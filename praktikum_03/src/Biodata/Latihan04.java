package Biodata;

import javax.swing.JOptionPane;

public class Latihan04 {

	public static void main(String[] args) {
		Biodata bio = new Biodata();
		
		JOptionPane.showMessageDialog(null, "Selamat Datang!");
		String WARNING = "PERINGATAN!";
		boolean lnjt = true;
		
		while(lnjt) {
			String nama = JOptionPane.showInputDialog(null, "Masukkan nama lengkap Anda:", "Form Nama", JOptionPane.QUESTION_MESSAGE);
			
			if(nama.isEmpty()) {
				JOptionPane.showMessageDialog(null, "Field Form Nama tidak boleh kosong!", WARNING, JOptionPane.WARNING_MESSAGE);
				System.exit(0);
			}
			
			
			String usia = JOptionPane.showInputDialog(null, "Masukkan usia Anda:", "Form Usia", JOptionPane.QUESTION_MESSAGE);
			final String REG_NUMERIK = "[0-9]+";
			
			if(usia.isEmpty()) {
				JOptionPane.showMessageDialog(null, "Field Form Usia tidak boleh kosong!", WARNING, JOptionPane.WARNING_MESSAGE);
			} else if(!usia.matches(REG_NUMERIK)) {
				JOptionPane.showMessageDialog(null, "Isian Form Usia harus numerik!", WARNING, JOptionPane.WARNING_MESSAGE);
				System.exit(0);
			}
			
			
			String alamat = JOptionPane.showInputDialog(null, "Masukkan alamat Anda:", "Form Alamat", JOptionPane.QUESTION_MESSAGE);
			
			if(alamat.isEmpty()) {
				JOptionPane.showMessageDialog(null, "Field Form Alamat tidak boleh kosong!", WARNING, JOptionPane.WARNING_MESSAGE);
			} else if(alamat.length() < 10) {
				JOptionPane.showMessageDialog(null, "Masukkan alamat minimum 10 karakter!", WARNING, JOptionPane.WARNING_MESSAGE);
			}
			
			int pUsia = Integer.parseInt(usia);
			
			bio.setData(nama, pUsia, alamat);
			bio.getData();
			
			int keluar = JOptionPane.showConfirmDialog(null, "Apakah Anda ingin keluar?", "Keluar?", JOptionPane.YES_NO_OPTION);
			
			if(keluar == JOptionPane.YES_OPTION) {
				lnjt = false;
			} else {
				lnjt = true;
			}
			
		}
		
		JOptionPane.showMessageDialog(null, "Terima kasih!");
		
	}
	
}