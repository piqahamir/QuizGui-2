import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Color;

public class WaterCalculator {

	private JFrame frame;
	private JTextField textFieldWeight;
	private JTextField textFieldAge;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					WaterCalculator window = new WaterCalculator();
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
	public WaterCalculator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(255, 182, 193));
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("WEIGHT (kg):");
		lblNewLabel.setBackground(new Color(255, 228, 225));
		lblNewLabel.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 15));
		lblNewLabel.setBounds(41, 70, 111, 37);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_2 = new JLabel("AGE:");
		lblNewLabel_2.setBackground(new Color(255, 228, 225));
		lblNewLabel_2.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 16));
		lblNewLabel_2.setBounds(41, 166, 90, 37);
		frame.getContentPane().add(lblNewLabel_2);
		
		textFieldWeight = new JTextField();
		textFieldWeight.setBackground(new Color(255, 240, 245));
		textFieldWeight.setBounds(162, 70, 96, 44);
		frame.getContentPane().add(textFieldWeight);
		textFieldWeight.setColumns(10);
		
		textFieldAge = new JTextField();
		textFieldAge.setBackground(new Color(255, 240, 245));
		textFieldAge.setBounds(162, 166, 96, 44);
		frame.getContentPane().add(textFieldAge);
		textFieldAge.setColumns(10);
		
		JButton btnNewButton = new JButton("CALCULATE");
		btnNewButton.setBackground(new Color(250, 128, 114));
		btnNewButton.setFont(new Font("Sitka Text", Font.BOLD, 15));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int age;
				double weight, ans;
				try {
					
					weight = Double.parseDouble(textFieldWeight.getText());
					age = Integer.parseInt(textFieldAge.getText());
					
					ans = weight*0.003;
				
					JOptionPane.showMessageDialog(null, "You have to drink " + ans + " litres of water a day!");
			} catch (Exception c) {
				JOptionPane.showMessageDialog(null, "Enter your weight and age again :) !");
			}
			}	
		});
		btnNewButton.setBounds(269, 114, 140, 44);
		frame.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel_1 = new JLabel("Let's Calculate How Much Water You Should Take!");
		lblNewLabel_1.setFont(new Font("Segoe UI", Font.BOLD, 14));
		lblNewLabel_1.setBounds(42, 23, 367, 22);
		frame.getContentPane().add(lblNewLabel_1);
	}
}
