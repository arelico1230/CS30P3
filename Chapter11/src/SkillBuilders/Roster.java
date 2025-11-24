package SkillBuilders;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.JTextArea;
import javax.swing.border.LineBorder;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Roster {

	private JFrame frame;
	private JTextField enter;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Roster window = new Roster();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Roster() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 507, 514);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 499, 464);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		enter = new JTextField();
		enter.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) 
			{
				enter.setText(null);
			}
		});
		enter.setForeground(new Color(192, 192, 192));
		enter.setBackground(new Color(255, 255, 255));
		enter.setFont(new Font("Tahoma", Font.PLAIN, 14));
		enter.setText("Enter File Path Here");
		enter.setBounds(146, 11, 317, 46);
		panel.add(enter);
		enter.setColumns(10);
		
		JButton enterbtn = new JButton("Enter");
		enterbtn.setForeground(new Color(255, 255, 255));
		enterbtn.setBackground(new Color(0, 128, 192));
		enterbtn.setBounds(28, 12, 108, 46);
		panel.add(enterbtn);
		
		JTextArea dis = new JTextArea();
		dis.setBorder(new LineBorder(new Color(0, 0, 0)));
		dis.setEditable(false);
		dis.setBounds(28, 69, 435, 384);
		panel.add(dis);
	}
}
