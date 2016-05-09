import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JButton;


public class ModalWindow extends JFrame{
	private JPanel panel;
	
	ModalWindow (int score) {
		super ("Calculator play");
		JFrame.setDefaultLookAndFeelDecorated(true);
		createGUI (score);
	}
		
		public void createGUI (int score) {
		panel = new JPanel();
		panel.setLayout(null);
		
			JLabel Mes = new JLabel ("Your score is "+score);
			Mes.setForeground(Color.BLACK);
			Mes.setSize(150, 30);
			Mes.setLocation(120, 60);
			panel.add(Mes);
	
			JButton B1 = new JButton ("Main Menu");
			B1.setSize(110, 50);
			B1.setLocation(30, 110);
			panel.add(B1);
	
			JButton B2 = new JButton ("Try again");
			B2.setSize(110, 50);
			B2.setLocation(200, 110);
			panel.add(B2);
			
			B1.addActionListener(new ActionListener() {
				public void actionPerformed (ActionEvent e) {
					dispose ();
					MainMenuFrame Frame1 = new MainMenuFrame(); // opening of the Main Menu
					Frame1.setVisible(true);
				}
			});
			
			B2.addActionListener(new ActionListener() {
				public void actionPerformed (ActionEvent e) {
					dispose ();
					GameRestart Frame2 = new GameRestart(); // Game will be restarted
					Frame2.setVisible(true);
				}
			});
	
		setContentPane(panel);
		setSize(350, 250);
	}

	public static void main (String [] args) {
		ModalWindow MW = new ModalWindow (50);
		MW.setVisible(true);
		
	}
}
