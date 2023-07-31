package javacurso;
import javax.swing.JOptionPane;

public class Java5 {
	public static void main(String[] args) {
		
		String name = JOptionPane.showInputDialog("What is your name?");
		int age = Integer.parseInt(JOptionPane.showInputDialog("How old are you?"));
		String food = JOptionPane.showInputDialog("What is your favorite food?");
		double grade = Double.parseDouble(JOptionPane.showInputDialog("What is your grade?"));
		
		JOptionPane.showMessageDialog(null, "Your name is "+name);
		JOptionPane.showMessageDialog(null, "You are "+age+" years old.");
		JOptionPane.showMessageDialog(null, "Your favorite food is "+food);
		JOptionPane.showMessageDialog(null, "Your grade is "+grade);
	}
}
