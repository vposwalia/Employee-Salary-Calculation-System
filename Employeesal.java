package Employeesala;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Employeesal {

	private JFrame frame;
	private JTextField txtsal;
	private JTextField txttax;
	private JTextField txtnetsal;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Employeesal window = new Employeesal();
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
	public Employeesal() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 128, 255));
		panel.setForeground(new Color(255, 255, 255));
		panel.setBounds(10, 10, 416, 36);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Employee Salary Calculation System");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel.setBounds(10, 0, 396, 36);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Employee Salary :");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_1.setBackground(new Color(64, 0, 64));
		lblNewLabel_1.setBounds(25, 71, 157, 25);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Tax :");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_1_1.setBackground(new Color(64, 0, 64));
		lblNewLabel_1_1.setBounds(25, 125, 157, 25);
		frame.getContentPane().add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Net Salary :");
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_1_2.setBackground(new Color(64, 0, 64));
		lblNewLabel_1_2.setBounds(25, 173, 157, 25);
		frame.getContentPane().add(lblNewLabel_1_2);
		
		txtsal = new JTextField();
		txtsal.setBounds(203, 73, 157, 25);
		frame.getContentPane().add(txtsal);
		txtsal.setColumns(10);
		
		txttax = new JTextField();
		txttax.setColumns(10);
		txttax.setBounds(203, 127, 157, 25);
		frame.getContentPane().add(txttax);
		
		txtnetsal = new JTextField();
		txtnetsal.setColumns(10);
		txtnetsal.setBounds(203, 175, 157, 25);
		frame.getContentPane().add(txtnetsal);
		
		JButton btnNewButton = new JButton("OK");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double salary, tax, netsal;
				salary = Double.parseDouble(txtsal.getText());
				if(salary>100000)
				{
					tax = salary*20/100;
				}
				else if(salary>50000)
				{
					tax = salary*10/100;
				}
				else if(salary>35000)
				{
					tax = salary*5/100;
			    }
				else
				{
					tax= 0;
				}
				
				txttax.setText(String.valueOf(tax));
				
				netsal=salary-tax;
				txtnetsal.setText(String.valueOf(netsal));
				
		}});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton.setBounds(335, 222, 79, 31);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnExit.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnExit.setBounds(188, 222, 79, 31);
		frame.getContentPane().add(btnExit);
		
		JButton btnClear = new JButton("Clear");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtsal.setText("");
				txttax.setText("");
				txtnetsal.setText("");
				txtsal.requestFocus();
			}
		});
		btnClear.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnClear.setBounds(31, 222, 79, 31);
		frame.getContentPane().add(btnClear);
	}
}
