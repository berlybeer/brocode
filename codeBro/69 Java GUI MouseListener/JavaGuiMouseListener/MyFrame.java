package JavaGuiMouseListener;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MyFrame extends JFrame implements MouseListener{
	
	JLabel label;
	
	ImageIcon smile;
	ImageIcon nervous;
	ImageIcon pain;
	ImageIcon dizzy;
	
	MyFrame(){
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(500,500);
		this.setLayout(new FlowLayout());
		
		label = new JLabel();
		label.addMouseListener(this);
		
		smile = new ImageIcon("happy.png");
		nervous = new ImageIcon("mad.png");
		pain = new ImageIcon("crying.png");
		dizzy = new ImageIcon("confused-1.png");
		
		label.setIcon(smile);
		
		
		this.add(label);
		this.pack();
		this.setLocationRelativeTo(null);
		this.setVisible(true);
		


	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
//		System.out.println("You Clicked the mouse");
		
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		label.setIcon(pain);

		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		label.setIcon(dizzy);


		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
		label.setIcon(nervous);


		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		label.setIcon(smile);


	}
	

}
