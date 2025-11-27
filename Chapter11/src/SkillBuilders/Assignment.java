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
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Assignment {

	private JFrame frame;
	private JTextField filepath;
	FileReader in;
	BufferedReader readFile;

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
		
		filepath = new JTextField();
		filepath.setForeground(new Color(0, 0, 0));
		filepath.setFont(new Font("Tahoma", Font.PLAIN, 13));
		filepath.setBounds(32, 31, 275, 38);
		frame.getContentPane().add(filepath);
		filepath.setColumns(10);
		
		JTextArea instrlist = new JTextArea();
		instrlist.setEditable(false);
		instrlist.setBounds(32, 80, 456, 293);
		frame.getContentPane().add(instrlist);
		
		JButton rcv = new JButton("Receive instructions");
		rcv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String filename = "C:\\Users\\38343009\\git\\CS30P3\\Chapter11\\src\\SkillBuilders\\" + filepath.getText().trim();
				if (filename.isEmpty()) {
					instrlist.setText("Please enter file name");
			}
				File dataFile = new File(filename);
				if(!dataFile.exists()) {
					instrlist.setText("Please enter a proper file path");
				}
				try {
					in = new FileReader(filename);
					readFile = new BufferedReader(in);
					 StringBuilder output = new StringBuilder();

					 String line;
					 while((line = readFile.readLine()) != null) {
						 output.append(line +"\n");
					 }
				instrlist.setText(output.toString());	 
				} catch(IOException ex) {
						 System.err.print("Error: " + ex.getMessage() + " while reading file");
					 }
			}
		});
		rcv.setFont(new Font("Tahoma", Font.PLAIN, 16));
		rcv.setForeground(new Color(0, 0, 0));
		rcv.setBounds(317, 30, 171, 38);
		frame.getContentPane().add(rcv);
		
		JLabel lblNewLabel = new JLabel("Enter file name:");
		lblNewLabel.setBounds(32, 11, 216, 14);
		frame.getContentPane().add(lblNewLabel);
	}
}
