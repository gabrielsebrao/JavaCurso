package java47labels;

import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.Border;

public class Main {
	public static void main(String[] args) {
		
		ImageIcon image = new ImageIcon("src\\java47labels\\sheenaringo.jpg");
		Border border = BorderFactory.createLineBorder(Color.pink, 4);
		
		JLabel label = new JLabel();
		label.setText("Marinouchi Sadistic"); // set the label text
		label.setIcon(image); // set the label image 
		label.setHorizontalTextPosition(JLabel.CENTER); // set text LEFT, CENTER or RIGHT of ImageIcon
		label.setVerticalTextPosition(JLabel.TOP); // set text TOP, CENTER or BOTTOM of ImageIcon
		label.setForeground(Color.pink); // if i want choose another color, i can create a "new Color(r, g, b)"
		label.setFont(new Font("MV Boli",Font.PLAIN,23)); // set the font of text (font name, style, size)
		label.setIconTextGap(5); // set gap of text to image
		label.setBackground(Color.black); // set the background color
		label.setOpaque(true); // display background color
		label.setBorder(border);
		label.setVerticalAlignment(JLabel.CENTER);
		label.setHorizontalAlignment(JLabel.CENTER);
		label.setBounds(60, 0, 350, 350); //set x,y position within frame as well as dimentions
		
		
		JFrame frame = new JFrame();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//frame.setSize(500,500); 
		frame.add(label); // add the label into the frame
		//frame.setLayout(null);
		frame.pack(); // dont need setSize and setLayout
		frame.setResizable(false);
		
		// ALWAYS set add(label) before .pack() 
	}
}
