package SkillBuilders;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.awt.event.ActionEvent;

public class MyfilePart2 {

	private JFrame frame;
	private static final String FILE_PATH = "C:\\Users\\38343009\\git\\CS30P3\\Chapter11\\src\\SkillBuilders\\zzz.txt";
	private File textFile;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MyfilePart2 window = new MyfilePart2();
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
	public MyfilePart2() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() 
	{
		textFile = new File(FILE_PATH);
		
		frame = new JFrame();
		frame.setBounds(100, 100, 527, 422);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 511, 372);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		
		JLabel dis = new JLabel("");
		dis.setBounds(95, 24, 324, 77);
		panel.add(dis);
		
		JButton kp = new JButton("Keep file");
		kp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				if(textFile.exists()) 
				{
					dis.setText("The file already exists.");
				}
				else
				{
					try 
					{
						if(textFile.createNewFile())
						{
							dis.setText("The file has been created.");
						}
						else
						{
							dis.setText("The file could not be ");
						}
					}
					catch(IOException ex)
					{
						dis.setText("Error: " + ex.getMessage());
						System.err.println("IOException: " + ex.getMessage());
					}
				}
			}
		});
		kp.setBounds(95, 154, 114, 49);
		panel.add(kp);
		
		
		JButton dlt = new JButton("Delete file");
		dlt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				if(textFile.delete()) 
				{
					dis.setText("The file has been deleted.");
				}
				else
				{
					dis.setText("Failed to delete the file.");
				}
					
			
			}
		});
		dlt.setBounds(305, 154, 114, 49);
		panel.add(dlt);
	}
}
