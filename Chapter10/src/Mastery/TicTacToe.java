package Mastery;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TicTacToe {
	int r = 0;
	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TicTacToe window = new TicTacToe();
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
	public TicTacToe() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 459, 357);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 450, 307);
		frame.getContentPane().add(panel);
		panel.setLayout(null);

		
		
		JButton b1 = new JButton("");
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				r += 1;
				if (r % 2 == 0) {
				b1.setText("O");
				}
				else if (r % 2 != 0) {
					b1.setText("X");
				}
			}
		});
		b1.setBounds(10, 11, 136, 62);
		panel.add(b1);
		
		JButton b2 = new JButton("");
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				r += 1;
				if (r % 2 == 0) {
				b2.setText("O");
				}
				else if (r % 2 != 0) {
					b2.setText("X");
				}
			}
		});
		b2.setBounds(156, 11, 136, 62);
		panel.add(b2);
		
		JButton b3 = new JButton("");
		b3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				r += 1;
				if (r % 2 == 0) {
				b3.setText("O");
				}
				else if (r % 2 != 0) {
					b3.setText("X");
			}
		}});
		b3.setBounds(302, 11, 136, 62);
		panel.add(b3);
		
		JButton b4 = new JButton("");
		b4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				r += 1;
				if (r % 2 == 0) {
				b4.setText("O");
				}
				else if (r % 2 != 0) {
					b4.setText("X");
			}
		}});
		b4.setBounds(302, 84, 136, 62);
		panel.add(b4);
		
		JButton b5 = new JButton("");
		b5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				r += 1;
				if (r % 2 == 0) {
				b5.setText("O");
				}
				else if (r % 2 != 0) {
					b5.setText("X");
			}
		}});
		b5.setBounds(156, 84, 136, 62);
		panel.add(b5);
		
		JButton b6 = new JButton("");
		b6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			r += 1;
			if (r % 2 == 0) {
			b6.setText("O");
			}
			else if (r % 2 != 0) {
				b6.setText("X");
			}
		}});
		b6.setBounds(10, 84, 136, 62);
		panel.add(b6);
		
		JButton b7 = new JButton("");
		b7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				r += 1;
				if (r % 2 == 0) {
				b7.setText("O");
				}
				else if (r % 2 != 0) {
					b7.setText("X");
			}
		}});
		b7.setBounds(10, 157, 136, 62);
		panel.add(b7);
		
		JButton b8 = new JButton("");
		b8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				r += 1;
				if (r % 2 == 0) {
				b8.setText("O");
				}
				else if (r % 2 != 0) {
					b8.setText("X");
			}
		}});
		b8.setBounds(156, 157, 136, 62);
		panel.add(b8);
		
		JButton b9 = new JButton("");
		b9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				r += 1;
				if (r % 2 == 0) {
				b9.setText("O");
				}
				else if (r % 2 != 0) {
					b9.setText("X");
			}
		}});
		b9.setBounds(302, 157, 136, 62);
		panel.add(b9);
		
		JLabel msg = new JLabel("The winner is ");
		msg.setFont(new Font("Tahoma", Font.PLAIN, 14));
		msg.setBounds(24, 249, 148, 14);
		panel.add(msg);
	}
}
