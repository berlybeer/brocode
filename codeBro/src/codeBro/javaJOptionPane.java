package codeBro;

import javax.swing.JOptionPane;

public class javaJOptionPane {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int money;
		
		JOptionPane.showMessageDialog(null, "Never gonna give you up!, Never gonna let you down!");
		String name;
		name = JOptionPane.showInputDialog("What is your name");
		
		JOptionPane.showMessageDialog(null, "Welcome " + name);
		
		money = Integer.parseInt(JOptionPane.showInputDialog("How much money do you have? "));
		
		JOptionPane.showMessageDialog(null, "You have $" + money);
		
		
	}

}
