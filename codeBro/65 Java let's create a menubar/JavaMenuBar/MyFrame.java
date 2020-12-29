package JavaMenuBar;
import java.awt.FlowLayout;
import java.awt.Image;
import java.awt.event.*;
import javax.swing.*;


public class MyFrame extends JFrame implements ActionListener {
	
	
	JMenuBar menuBar;
	JMenu fileMenu;
	JMenu editMenu;
	JMenu helpMenu;
	
	JMenuItem loadItem;
	JMenuItem saveItem;
	JMenuItem exitItem;
	
	ImageIcon loadIcon;
	ImageIcon saveIcon;
	ImageIcon exitIcon;
	
	
	
	MyFrame(){
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(500,500);
		this.setLayout(new FlowLayout());
		
		loadIcon = new ImageIcon(new ImageIcon("load.png").getImage().getScaledInstance(20, 20, Image.SCALE_SMOOTH));
		saveIcon = new ImageIcon(new ImageIcon("save.png").getImage().getScaledInstance(20, 20, Image.SCALE_SMOOTH));
		exitIcon = new ImageIcon(new ImageIcon("exit.png").getImage().getScaledInstance(20, 20, Image.SCALE_SMOOTH));
		
		
		
		menuBar = new JMenuBar();
		fileMenu = new JMenu("File");
		editMenu = new JMenu("Edit");
		helpMenu = new JMenu("help");
		
		loadItem = new JMenuItem("Load");
		saveItem = new JMenuItem("Save");
		exitItem = new JMenuItem("Exit");
		
		loadItem.addActionListener(this);
		saveItem.addActionListener(this);
		exitItem.addActionListener(this);
		
		
		loadItem.setIcon(loadIcon);
		saveItem.setIcon(saveIcon);
		exitItem.setIcon(exitIcon);
		
		fileMenu.setMnemonic(KeyEvent.VK_F); //Alt + f for file 
		editMenu.setMnemonic(KeyEvent.VK_E); //Alt + e for edit
		helpMenu.setMnemonic(KeyEvent.VK_H); //Alat + h for help
		loadItem.setMnemonic(KeyEvent.VK_L); //l for load
		saveItem.setMnemonic(KeyEvent.VK_S); //s for saved
		exitItem.setMnemonic(KeyEvent.VK_E); //e for exit
	
		
		fileMenu.add(loadItem);
		fileMenu.add(saveItem);
		fileMenu.add(exitItem);
		
		menuBar.add(fileMenu);
		menuBar.add(editMenu);
		menuBar.add(helpMenu);
		
		
		this.setJMenuBar(menuBar);
		this.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		if(e.getSource()==loadItem) {
			System.out.println("*beep boop* you loaded a file");
		}
		else if(e.getSource()==saveItem) {
			System.out.println("*beep boop* you saved a file");
		}
		else if(e.getSource()==exitItem) {
			System.exit(0);
		}
			
		
	}
	

}
