package java53newGUIwindow;

import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class NewWindow {
	
	JFrame frame = new JFrame();
	JLabel label = new JLabel("Hello!");
	
	NewWindow () {
		
		label.setBounds(0, 0, 500, 500);
		label.setFont(new Font(null, Font.PLAIN, 25));
		label.setLayout(null);
		label.setVerticalAlignment(JLabel.CENTER);
		label.setHorizontalAlignment(JLabel.CENTER);
		
		frame.add(label);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(500, 500);
		frame.setVisible(true);
		frame.setLayout(null);
		
		
	}
	
}
