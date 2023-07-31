package java46gui;

import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

@SuppressWarnings("serial")
public class MyFrame extends JFrame{
	
	MyFrame() {
		
		this.setTitle("Hi! I am a JFrame Title."); //That set the JFrame title
		this.setVisible(true); //That makes the this visible
		this.setSize(500, 500); //Set the size (x, y)
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Exit out of application
		this.setResizable(false); //Avoid resize the this
		this.getContentPane().setBackground(new Color(0, 0, 0)); //Set the background color
		
		ImageIcon image = new ImageIcon("src\\java46gui\\sheenaringo.jpg"); //It will create a new ImageIcon
		this.setIconImage(image.getImage()); //That set the JFrame icon
		
	}
}
