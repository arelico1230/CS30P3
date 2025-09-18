package SkillBuilders;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Demo30P3 {

	private JFrame frame;
	private JTextField fN;
	private JTextField Ln;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Demo30P3 window = new Demo30P3();
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
	public Demo30P3() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 708, 334);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 692, 284);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		fN = new JTextField();
		fN.addKeyListener(new KeyAdapter() 
		{
			@Override
			public void keyTyped(KeyEvent e) 
			{
				
				if(fN.getText().equals("First Name"))
						fN.setText("");
				
				
			}
		});
		fN.setForeground(new Color(192, 192, 192));
		fN.setFont(new Font("Tahoma", Font.PLAIN, 20));
		fN.setText("First Name");
		fN.setBounds(40, 28, 160, 40);
		panel.add(fN);
		fN.setColumns(10);
		
		Ln = new JTextField();
		Ln.addKeyListener(new KeyAdapter() {
			
			@Override
			public void keyTyped(KeyEvent e) {
				if(Ln.getText().equals("Last Name"))
					Ln.setText("");
				
			}
		});
		Ln.setForeground(new Color(192, 192, 192));
		Ln.setFont(new Font("Tahoma", Font.PLAIN, 20));
		Ln.setText("Last Name");
		Ln.setColumns(10);
		Ln.setBounds(217, 28, 160, 40);
		panel.add(Ln);
		
		JComboBox gradelvl = new JComboBox();
		gradelvl.setForeground(new Color(255, 0, 0));
		gradelvl.setFont(new Font("Tahoma", Font.PLAIN, 17));
		gradelvl.setModel(new DefaultComboBoxModel(new String[] {"Select grade level", "12", "11", "10"}));
		gradelvl.setBounds(40, 78, 160, 40);
		panel.add(gradelvl);
		
		JComboBox schools = new JComboBox();
		schools.setFont(new Font("Tahoma", Font.PLAIN, 16));
		schools.setModel(new DefaultComboBoxModel(new String[] {"Select school", "Crescent Heights", "Pearson", "Nelson Mandela", "Forest Lawn"}));
		schools.setBounds(217, 79, 160, 40);
		panel.add(schools);
		
		JTextArea dis = new JTextArea();
		dis.setBackground(new Color(240, 240, 240));
		dis.setBounds(40, 129, 337, 104);
		panel.add(dis);
		
		JButton submit = new JButton("Submit");
		submit.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) 
			{
				String year = "";
				String school = "";
				
				String firstN = fN.getText();
				String lastN = Ln.getText();
				
				if(gradelvl.getSelectedItem().equals("12")) {
					year = "12";
				}
				
				if(gradelvl.getSelectedItem().equals("11")) {
					year = "11";
				}
				
				if(gradelvl.getSelectedItem().equals("10")) {
					year = "10";
				}
				
				if(schools.getSelectedItem().equals("Crescent Heights")) {
					school = "Crescent Heights";
				}
				
				if(schools.getSelectedItem().equals("Pearson")) {
					school = "Pearson";
				}
				
				if(schools.getSelectedItem().equals("Nelson Mandela")) {
					school = "Nelson Mandela";
				}
				
				if(schools.getSelectedItem().equals("Forest Lawn")) {
					school = "Forest Lawn";
				}
				
				dis.setText(firstN + " " + lastN + " School: " + school + " Grade: " + year);
				
				
			}
		});
		submit.setFont(new Font("Tahoma", Font.PLAIN, 20));
		submit.setBounds(387, 28, 109, 211);
		panel.add(submit);
	}
}
