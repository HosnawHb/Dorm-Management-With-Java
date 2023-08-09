package p03_1;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JTextPane;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.io.IOException;
import java.awt.event.ActionEvent;

public class SignUp extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	static SignUp frame = new SignUp();
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					
				//	frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public SignUp() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(102, 102, 153));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTextPane textPane = new JTextPane();
		textPane.setText("Name: ");
		textPane.setForeground(Color.BLACK);
		textPane.setFont(new Font("Thames", Font.PLAIN, 17));
		textPane.setBackground(new Color(102, 102, 153));
		textPane.setBounds(46, 40, 69, 26);
		contentPane.add(textPane);
		
		JTextPane textPane_1 = new JTextPane();
		textPane_1.setText("Gender: ");
		textPane_1.setForeground(Color.BLACK);
		textPane_1.setFont(new Font("Thames", Font.PLAIN, 17));
		textPane_1.setBackground(new Color(102, 102, 153));
		textPane_1.setBounds(46, 86, 69, 31);
		contentPane.add(textPane_1);
		
		JTextPane textPane_2 = new JTextPane();
		textPane_2.setText("Username: ");
		textPane_2.setForeground(Color.BLACK);
		textPane_2.setFont(new Font("Thames", Font.PLAIN, 17));
		textPane_2.setBackground(new Color(102, 102, 153));
		textPane_2.setBounds(46, 127, 83, 26);
		contentPane.add(textPane_2);
		
		JTextPane textPane_3 = new JTextPane();
		textPane_3.setText("Password: ");
		textPane_3.setForeground(Color.BLACK);
		textPane_3.setFont(new Font("Thames", Font.PLAIN, 17));
		textPane_3.setBackground(new Color(102, 102, 153));
		textPane_3.setBounds(46, 170, 83, 26);
		contentPane.add(textPane_3);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBackground(Color.WHITE);
		textField.setBounds(153, 40, 152, 26);
		contentPane.add(textField);
		
		JRadioButton radioButton = new JRadioButton("Male");
		radioButton.setForeground(Color.BLACK);
		radioButton.setFont(new Font("Thames", Font.PLAIN, 17));
		radioButton.setBackground(new Color(102, 102, 153));
		radioButton.setBounds(153, 86, 68, 31);
		contentPane.add(radioButton);
		
		JRadioButton radioButton_1 = new JRadioButton("Female");
		radioButton_1.setForeground(Color.BLACK);
		radioButton_1.setFont(new Font("Thames", Font.PLAIN, 17));
		radioButton_1.setBackground(new Color(102, 102, 153));
		radioButton_1.setBounds(250, 86, 109, 31);
		contentPane.add(radioButton_1);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(153, 127, 152, 26);
		contentPane.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(153, 173, 152, 23);
		contentPane.add(textField_2);
		
		JButton button = new JButton("Cancel");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
			}
		});
		button.setForeground(Color.WHITE);
		button.setBackground(new Color(51, 0, 51));
		button.setBounds(56, 206, 91, 37);
		contentPane.add(button);
		/*
		 * adding the new manager to the file
		 */
		JButton button_1 = new JButton("Finished");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name = textField.getText();
				String username = textField_1.getText();
				String password = textField_2.getText();
				Manager m = new Manager(name, username,password);
				m.newManager(name, username, password);
				try {
					FileWriter writer = new FileWriter("Manager.txt",true);
					writer.write(name+","+username+","+password);
					writer.close();
					
				}
	     		catch (IOException e1) {
	                e1.printStackTrace();
	            }
				JOptionPane.showInternalMessageDialog(contentPane, "New Manager added", "",
						JOptionPane.INFORMATION_MESSAGE);
			}
		});
		button_1.setForeground(Color.WHITE);
		button_1.setBackground(new Color(51, 0, 51));
		button_1.setBounds(283, 206, 91, 37);
		contentPane.add(button_1);
		
	}
}
