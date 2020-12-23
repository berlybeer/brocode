package JOptionPane;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Main {
	
	public static void main(String[] args) {
		
//		JOptionPane.showMessageDialog(null, "This is some useless info", "title", JOptionPane.PLAIN_MESSAGE);
//		JOptionPane.showMessageDialog(null, "Here is more useless info", "title", JOptionPane.INFORMATION_MESSAGE);
//		JOptionPane.showMessageDialog(null, "Really?", "title", JOptionPane.QUESTION_MESSAGE);
//
//		JOptionPane.showMessageDialog(null, "You're computer has A Virus!!", "title", JOptionPane.WARNING_MESSAGE);
//
//	
//		JOptionPane.showMessageDialog(null, "Call tech support now or else", "title", JOptionPane.ERROR_MESSAGE);
		
		//int answer = JOptionPane.showConfirmDialog(null, "bro, do you even code?", "This is my title", JOptionPane.YES_NO_CANCEL_OPTION);
		
		//String name = JOptionPane.showInputDialog("What is your name?: ");
		//System.out.println("Hello " + name);
		
		String[] responses = {"No, you're awesome!", "Thank you!", "*blush"};
		ImageIcon icon = new ImageIcon("smile.png");
		JOptionPane.showOptionDialog(
				null,
				"You are awesome!",
				"Secret message",
				JOptionPane.YES_NO_CANCEL_OPTION,
				JOptionPane.INFORMATION_MESSAGE,
				icon,
				responses,
				0);
		
	}

}
