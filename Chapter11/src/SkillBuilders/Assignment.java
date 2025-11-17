package SkillBuilders;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Assignment {

	private JFrame frame;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Assignment window = new Assignment();
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
	public Assignment() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 547, 423);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton rcv = new JButton("Receive instructions");
		rcv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				
			}
		});
		rcv.setFont(new Font("Tahoma", Font.PLAIN, 16));
		rcv.setForeground(new Color(0, 0, 0));
		rcv.setBounds(317, 21, 171, 38);
		frame.getContentPane().add(rcv);
		
		JLabel instrlist = new JLabel("");
		instrlist.setVerticalAlignment(SwingConstants.TOP);
		instrlist.setBounds(32, 80, 456, 293);
		frame.getContentPane().add(instrlist);
		
		textField = new JTextField();
		textField.setBounds(32, 21, 275, 38);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
	}
}
