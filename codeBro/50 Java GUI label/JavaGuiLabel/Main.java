package JavaGuiLabel;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.Border;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//JLabel = a GUI display area for a string of text, an image, or both
		
		
		
		
		
		ImageIcon image = new ImageIcon(new ImageIcon("developer.png").getImage().getScaledInstance(450, 400, Image.SCALE_SMOOTH));
		
		Border border = BorderFactory.createLineBorder(Color.green, 3);
		JLabel label = new JLabel(); //create a label
		label.setText("Bro, do you even code?"); //set text of label
		label.setIcon(image);
		label.setHorizontalTextPosition(JLabel.CENTER); //Set text LEFT, CENTER, RIGHT of imageicon
		label.setVerticalTextPosition(JLabel.TOP); //Set text TOP, CENTER, BOTTOM of imageicon
		label.setForeground(new Color(0x00FF00)); //Set font color of text
		label.setFont(new Font("MV Boli", Font.PLAIN, 20));
		label.setIconTextGap(-33); //set gap of text to image
		label.setBackground(Color.black); //set background color
		label.setOpaque(true);
		label.setBorder(border);
		label.setVerticalAlignment(JLabel.CENTER);  //set vertical position of icon+text within label
		label.setHorizontalAlignment(JLabel.CENTER); //set horizontal position of icon+text within label
		//label.setBounds(50,50,500,500);  //set x,y position within frame as well as dimensions
		
		
		
		
		
		JFrame frame = new JFrame();
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(600,600);
		//frame.setLayout(null);
		frame.setVisible(true);
		frame.add(label);
		
		frame.pack();
	
		
	
	
	}

}
