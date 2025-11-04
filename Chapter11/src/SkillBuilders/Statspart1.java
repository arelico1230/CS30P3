package SkillBuilders;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextArea;
import java.awt.Color;
import javax.swing.border.LineBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.NumberFormat;
import java.awt.event.ActionEvent;

public class Statspart1 {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Statspart1 window = new Statspart1();
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
	public Statspart1() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 515, 435);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 499, 385);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel titlelabel = new JLabel("Student test scores analysis");
		titlelabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		titlelabel.setHorizontalAlignment(SwingConstants.CENTER);
		titlelabel.setBounds(99, 47, 295, 34);
		panel.add(titlelabel);
		
		JTextArea resultarea = new JTextArea();
		resultarea.setEditable(false);
		resultarea.setRows(15);
		resultarea.setColumns(40);
		resultarea.setBorder(new LineBorder(new Color(0, 0, 0)));
		resultarea.setBackground(new Color(240, 240, 240));
		resultarea.setBounds(57, 92, 387, 229);
		panel.add(resultarea);
		
		JButton analyzebutton = new JButton("Analyze scores");
		analyzebutton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				//Clear previous results
				resultarea.setText(" ");
				File dataFile = new File("C:\\Users\\38343009\\git\\CS30P3\\Chapter11\\src\\SkillBuilders\\test.txt");
				FileReader in;
				BufferedReader readFile;
				
				String stuName, score;
				
				double scoreValue;
				double lowScore = 100;
				double highScore = 0;
				double avgScore = 0;
				double totalScore = 0;
				int numScores = 0;
				
				NumberFormat percent = NumberFormat.getPercentInstance();
				
				StringBuilder output = new StringBuilder();
				
				try 
				{
					in = new FileReader(dataFile);
					readFile = new BufferedReader(in);
					
					output.append("STUDENT SCORES: \n");
					output.append("--------------------\n");
					
					while((stuName = readFile.readLine())  != null) 
					{
						score = readFile.readLine();
						
						numScores += 1;
						
						scoreValue = Double.parseDouble(score);
						
						output.append(stuName + " " + percent.format(scoreValue/100) + "\n");
						
						totalScore += scoreValue;
						
						if(scoreValue < lowScore) 
							lowScore = scoreValue;
						
						if(scoreValue > highScore) 
							highScore = scoreValue;
						
						
					}
					avgScore = totalScore / numScores;
					
					output.append("\nSTATISTICS:\n");
					output.append("-----------------\n");
					
					output.append("Low Score: " + percent.format(lowScore/100) + "\n");
					output.append("High Score: " + percent.format(highScore/100) + "\n");
					output.append("Average Score: " + percent.format(avgScore/100) + "\n");
					output.append("Total Students: " + numScores + "\n");
					
					resultarea.setText(output.toString());
					
					readFile.close();
					in.close();
				}
				
				catch (FileNotFoundException ex)
				{
					System.out.println("File could not be found.");
					System.err.println("FileNotFoundException: " + ex.getMessage());
				}
				catch (IOException ex) {
					System.out.println("Problem reading file.");
					System.err.println("IOException: " + ex.getMessage());
				}
				
			}
		});
		analyzebutton.setBounds(164, 332, 182, 42);
		panel.add(analyzebutton);
	}
}
