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
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AddStudent extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	static AddStudent frame = new AddStudent();
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
									
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public AddStudent() {
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
		textPane.setFont(new Font("Thames", Font.PLAIN, 15));
		textPane.setBackground(new Color(102, 102, 153));
		textPane.setBounds(65, 45, 51, 24);
		contentPane.add(textPane);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(199, 45, 110, 24);
		contentPane.add(textField);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(199, 84, 110, 24);
		contentPane.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(199, 120, 110, 24);
		contentPane.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(199, 158, 110, 24);
		contentPane.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(199, 195, 110, 24);
		contentPane.add(textField_4);
		
		JTextPane textPane_1 = new JTextPane();
		textPane_1.setText("Student ID: ");
		textPane_1.setForeground(Color.BLACK);
		textPane_1.setFont(new Font("Thames", Font.PLAIN, 15));
		textPane_1.setBackground(new Color(102, 102, 153));
		textPane_1.setBounds(62, 84, 82, 24);
		contentPane.add(textPane_1);
		
		JTextPane textPane_2 = new JTextPane();
		textPane_2.setText("Major: ");
		textPane_2.setForeground(Color.BLACK);
		textPane_2.setFont(new Font("Thames", Font.PLAIN, 15));
		textPane_2.setBackground(new Color(102, 102, 153));
		textPane_2.setBounds(65, 120, 51, 24);
		contentPane.add(textPane_2);
		
		JTextPane textPane_3 = new JTextPane();
		textPane_3.setText("Entry year: ");
		textPane_3.setForeground(Color.BLACK);
		textPane_3.setFont(new Font("Thames", Font.PLAIN, 15));
		textPane_3.setBackground(new Color(102, 102, 153));
		textPane_3.setBounds(65, 158, 82, 24);
		contentPane.add(textPane_3);
		
		JTextPane textPane_4 = new JTextPane();
		textPane_4.setText("Debt amount: ");
		textPane_4.setForeground(Color.BLACK);
		textPane_4.setFont(new Font("Thames", Font.PLAIN, 15));
		textPane_4.setBackground(new Color(102, 102, 153));
		textPane_4.setBounds(65, 195, 95, 24);
		contentPane.add(textPane_4);
		/*
		 * return to the last page
		 */
		JButton button = new JButton("Cancel");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
			}
		});
		button.setForeground(Color.WHITE);
		button.setBackground(new Color(51, 0, 51));
		button.setBounds(65, 229, 85, 21);
		contentPane.add(button);
		/*
		 * adding a new student
		 */
		JButton button_1 = new JButton("Add");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name = textField.getText();
				String id = textField_1.getText();
				String major = textField_2.getText();
				String entry = textField_3.getText();
				String debt = textField_4.getText();
				Manager manager = new Manager();
				manager.AddStudent(name, id, major, entry, debt);
				JOptionPane.showInternalMessageDialog(contentPane, "New student added", "",
						JOptionPane.INFORMATION_MESSAGE);
			}
		});
		button_1.setForeground(Color.WHITE);
		button_1.setBackground(new Color(51, 0, 51));
		button_1.setBounds(290, 229, 85, 21);
		contentPane.add(button_1);
	}

}
