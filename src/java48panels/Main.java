package java48panels;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Main {
	public static void main(String[] args) {
		
		ImageIcon icon = new ImageIcon("src\\java48panels\\bonoro.png");
		
		JLabel label = new JLabel();
		label.setText("Hello fellas");
		label.setIcon(icon);
//		label.setVerticalAlignment(JLabel.CENTER);
//		label.setHorizontalAlignment(JLabel.CENTER);
		label.setVerticalTextPosition(JLabel.TOP);
		label.setHorizontalTextPosition(JLabel.CENTER);
		label.setBounds(100, 100, 200,200); // e possivel alterar o setVertical e setHorizontal com (x,y) do setBounds
		
		JPanel redpanel = new JPanel();
		redpanel.setBackground(Color.red);
		redpanel.setBounds(0, 0, 200, 200);
		redpanel.setLayout(new BorderLayout());
		redpanel.setLayout(null);
		
		JPanel greenpanel = new JPanel();
		greenpanel.setBackground(Color.green);
		greenpanel.setBounds(200, 0, 300, 400);
		greenpanel.setLayout(new BorderLayout());
		greenpanel.setLayout(null);
		
		JPanel bluepanel = new JPanel();
		bluepanel.setBackground(Color.blue);
		bluepanel.setBounds(0, 200, 200, 200);
		bluepanel.setLayout(new BorderLayout());
		bluepanel.setLayout(null);
		
		JFrame frame = new JFrame();
		frame.setLayout(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(750, 750);
		frame.setVisible(true);
		
		greenpanel.add(label);
		
		frame.add(redpanel);
		frame.add(greenpanel);
		frame.add(bluepanel);
	}
}
