package Biodata;

import javax.swing.JOptionPane;

public class Latihan02 {

	public static void main(String[] args) {
		Biodata bio = new Biodata();
		
		JOptionPane.showMessageDialog(null, "Welcome!!!");
		
		String nama = JOptionPane.showInputDialog(null, "Masukkan nama lengkap Anda:", "Isi Nama", JOptionPane.QUESTION_MESSAGE);
		String usia = JOptionPane.showInputDialog(null, "Masukkan usia Anda:", "Isi Usia", JOptionPane.QUESTION_MESSAGE);
		String alamat = JOptionPane.showInputDialog(null, "Masukkan alamat Anda:", "Isi Alamat", JOptionPane.QUESTION_MESSAGE);
		
		int umur = Integer.parseInt(usia);
		
		bio.setData(nama, umur, alamat);
		bio.getData();
	}
	
}