package java54JOptionPane;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Main {
	public static void main(String[] args) {
		
//		JOptionPane.showMessageDialog(null, "This is some useless info.", "Hi, I am a title!", (JOptionPane.PLAIN_MESSAGE));
//		JOptionPane.showMessageDialog(null, "This is more useless info.", "Hi, I am a title!", (JOptionPane.INFORMATION_MESSAGE));
//		JOptionPane.showMessageDialog(null, "Really?", "Hi, I am a title!", (JOptionPane.QUESTION_MESSAGE));
//		JOptionPane.showMessageDialog(null, "Your computer has a VIRUS!  >:)", "Hi, I am a title!", (JOptionPane.WARNING_MESSAGE));
//		JOptionPane.showMessageDialog(null, "[ERROR] Input a valid value!", "Hi, I am a title!", (JOptionPane.ERROR_MESSAGE));
		
//		int answer = JOptionPane.showConfirmDialog(null, "Bro, are you good?", "This is not a title!", JOptionPane.YES_NO_CANCEL_OPTION);
//		
//		switch(answer) {
//		case 0:
//			System.out.println("That`s fine! :)");
//			break;
//		case 1:
//			System.out.println("Oh.. Why? :(");
//			break;
//		case 2:
//			System.out.println("So rude! >:(");
//			break;
//		case -1:
//			System.out.println("I don`t care... '-'");
//			break;
//		}

//		String name = JOptionPane.showInputDialog("What is your name?");
//		System.out.printf("Hello, %s.\n",name);
		
		ImageIcon icon = new ImageIcon("src\\java54OptionPane\\sheenaringo.jpg");
		
		JOptionPane.showOptionDialog(null, "You are awesome", "Secret Message", JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.INFORMATION_MESSAGE, icon, null, 0);
	}
}
