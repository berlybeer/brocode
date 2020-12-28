package JavaGuiRadioButtons;

import java.awt.FlowLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JRadioButton;

public class MyFrame extends JFrame implements ActionListener {
	
	JRadioButton pizzaButton;
	JRadioButton hamburgerButton; 
	JRadioButton hotdogButton;
	
	ButtonGroup group;
	
	JButton button;
	
	ImageIcon pizzaIcon;
	ImageIcon hamburgerIcon;
	ImageIcon hotdogIcon;
	
	MyFrame(){
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());
		
		pizzaIcon = new ImageIcon(new ImageIcon("pizza.png").getImage().getScaledInstance(20, 20, Image.SCALE_SMOOTH));
		hamburgerIcon = new ImageIcon(new ImageIcon("hamburger.png").getImage().getScaledInstance(20, 20, Image.SCALE_SMOOTH));
		hotdogIcon = new ImageIcon(new ImageIcon("hotdog.png").getImage().getScaledInstance(20,20, Image.SCALE_SMOOTH));
		
		button = new JButton("Submit");
		
		group = new ButtonGroup();
		
		pizzaButton = new JRadioButton("pizza");
		hamburgerButton = new JRadioButton("hamburger");
		hotdogButton = new JRadioButton("hotdog");
		
		pizzaButton.setIcon(pizzaIcon);
		hamburgerButton.setIcon(hamburgerIcon);
		hotdogButton.setIcon(hotdogIcon);
		
		
		
		group.add(pizzaButton);
		group.add(hamburgerButton);
		group.add(hotdogButton);
		
		
		pizzaButton.addActionListener(this);
		hamburgerButton.addActionListener(this);
		hotdogButton.addActionListener(this);
		
		
		
		
		this.add(button);
		this.add(pizzaButton);
		this.add(hamburgerButton);
		this.add(hotdogButton);
		this.pack();
		this.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		if(e.getSource()==pizzaButton) {
			System.out.println("You ordered pizza!");
		}
		else if(e.getSource()==hamburgerButton) {
			System.out.println("You ordered a hamburger!");
		}
		else if(e.getSource()==hotdogButton) {
			System.out.println("You ordered a hotdog");
		}
		
	}

}
