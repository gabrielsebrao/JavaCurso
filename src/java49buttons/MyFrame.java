package java49buttons;

import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

@SuppressWarnings("serial")
public class MyFrame extends JFrame implements ActionListener{
	
	JButton button;
	
	MyFrame() {
		
		button = new JButton();
		button.setBounds(200, 100, 250, 100);
		button.addActionListener(this);
		button.setText("Hi. I am a button.");
		button.setFocusable(false);
		button.setFont(new Font("Comic Sans", Font.BOLD, 20));
		button.setBackground(Color.gray);
		button.setForeground(Color.white);
		button.setBorder(BorderFactory.createEtchedBorder());
		
		this.setDefaultCloseOperation(EXIT_ON_CLOSE); 
		this.setLayout(null);
		this.setSize(500, 500);
		this.setVisible(true);
		this.add(button);
	}

	// Only if you have implemented ActionListener
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == button) {
			System.out.println("Voce clicou no meu botao kkkk");
			button.setEnabled(false);
		}
		
	}
}
