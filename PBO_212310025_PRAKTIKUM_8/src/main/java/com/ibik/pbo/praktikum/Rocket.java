package com.ibik.pbo.praktikum;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.event.KeyAdapter;

public class Rocket extends JFrame {

	private JPanel contentPane;
	private JLabel rocket_Img;
	
	private ImageIcon rocket_right, rocket_left, rocket_up, rocket_down;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					new Rocket().setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	public Rocket() {
		setResizable(false);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 656, 630);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		setLocationRelativeTo(null);
		contentPane.setLayout(null);
		setVisible(true);
		
		String packageName = "C:\\Users\\asus\\PBO_212310025_PRAKTIKUM_8\\src\\main\\java\\com\\ibik\\pbo\\praktikum\\images";
		
		URL rocket_right_path = Rocket.class.getClassLoader().getResource(packageName+"rocket_right.png");
		rocket_right = new ImageIcon(rocket_right_path);
		
		URL rocket_left_path = Rocket.class.getClassLoader().getResource(packageName+"rocket_left.png");
		rocket_left = new ImageIcon(rocket_left_path);
		
		URL rocket_up_path = Rocket.class.getClassLoader().getResource(packageName+"rocket_up.png");
		rocket_up = new ImageIcon(rocket_up_path);
		
		URL rocket_down_path = Rocket.class.getClassLoader().getResource(packageName+"rocket_down.png");
		rocket_down = new ImageIcon(rocket_down_path);
		
		rocket_Img = new JLabel();
		rocket_Img.setBounds(50, 50, 302, 319);
	    rocket_Img.setIcon(rocket_right);
	    
		contentPane.add(rocket_Img);
		contentPane.setBackground(Color.BLACK);
		
		addKeyListener(new KeyListener() {
			
			@Override
			public void keyTyped(KeyEvent e) {
				switch (e.getKeyChar()) {
		          case 'a':
		          	rocket_Img.setLocation(rocket_Img.getX()-10, rocket_Img.getY());
		          	rocket_Img.setIcon(rocket_left);
		          break;
		          case 'w':
		          	rocket_Img.setLocation(rocket_Img.getX(), rocket_Img.getY()-10);
		          	rocket_Img.setIcon(rocket_up);
		          break;
		          case 's':
		          	rocket_Img.setLocation(rocket_Img.getX(), rocket_Img.getY()+10); 
		          	rocket_Img.setIcon(rocket_down);
		          break;
		          case 'd':
		          	rocket_Img.setLocation(rocket_Img.getX()+10, rocket_Img.getY()); 
		          	rocket_Img.setIcon(rocket_right);
		          break;
				}
				if (rocket_Img.getX() >= 480) {
					rocket_Img.setLocation(-160, rocket_Img.getY());
				} else if (rocket_Img.getX() <= -160) {
					rocket_Img.setLocation(480, rocket_Img.getY());
				} else if (rocket_Img.getY() <= -260) {
					rocket_Img.setLocation(rocket_Img.getX(), 460);
				} else if (rocket_Img.getY() >= 460) {
					rocket_Img.setLocation(rocket_Img.getX(), -260);
				}	
			}
			@Override
			public void keyReleased(KeyEvent e) {
				// TODO Auto-generated method stub	
			}
			@Override
			public void keyPressed(KeyEvent e) {
				switch (e.getKeyCode()) {
					case 37:
		          	rocket_Img.setLocation(rocket_Img.getX()-10, rocket_Img.getY());
		          	rocket_Img.setIcon(rocket_left);
		          break;
		          case 38:
		          	rocket_Img.setLocation(rocket_Img.getX(), rocket_Img.getY()-10);
		          	rocket_Img.setIcon(rocket_up);
		          break;
		          case 40:
		          	rocket_Img.setLocation(rocket_Img.getX(), rocket_Img.getY()+10); 
		          	rocket_Img.setIcon(rocket_down);
		          break;
		          case 39:
		          	rocket_Img.setLocation(rocket_Img.getX()+10, rocket_Img.getY()); 
		          	rocket_Img.setIcon(rocket_right);
		          break;
				}
				
				if (rocket_Img.getX() >= 480) {
					rocket_Img.setLocation(-160, rocket_Img.getY());
				} else if (rocket_Img.getX() <= -160) {
					rocket_Img.setLocation(480, rocket_Img.getY());
				} else if (rocket_Img.getY() <= -260) {
					rocket_Img.setLocation(rocket_Img.getX(), 460);
				} else if (rocket_Img.getY() >= 460) {
					rocket_Img.setLocation(rocket_Img.getX(), -260);
				}
			}
		});
	}
}