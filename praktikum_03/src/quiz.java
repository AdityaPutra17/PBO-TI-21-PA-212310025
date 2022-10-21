import javax.swing.JOptionPane;
import javax.swing.ImageIcon;

public class quiz {

	public static void main(String[] args) {
		JOptionPane jop = new JOptionPane();

		ImageIcon icon1 = new ImageIcon("C:\\Users\\asus\\Downloads\\icon1.png");
		jop.showMessageDialog(null, "Selamat Datang", "Welcome", jop.ERROR_MESSAGE, icon1);

		String nama = jop.showInputDialog(null, "Masukkan Nama : ", jop.QUESTION_MESSAGE);
				
		int confirm = jop.showConfirmDialog(null, "apakah ini "+nama+"?","konfirmasi", jop.YES_NO_OPTION);
		
		if(confirm == 0) {
			ImageIcon icon = new ImageIcon("C:\\Users\\asus\\Downloads\\coffee-icon.png");
			jop.showMessageDialog(null, "Benar anda adalah "+nama,"benar", jop.WARNING_MESSAGE, icon);
		}else {
			ImageIcon icon2 = new ImageIcon("C:\\Users\\asus\\Downloads\\icon2.png");
			jop.showMessageDialog(null, "kamu bukan "+nama,"salah", jop.ERROR_MESSAGE, icon2);
		
		}
	}
}