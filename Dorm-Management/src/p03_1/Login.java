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
import java.awt.Frame;

import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.awt.event.ActionEvent;

public class Login extends JFrame {

	private JPanel contentPane1;
	ArrayList<Manager> managers = new ArrayList<Manager>();
	static Login frame = new Login();
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

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
	public Login() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane1 = new JPanel();
		contentPane1.setBackground(new Color(102, 102, 153));
		contentPane1.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane1);
		contentPane1.setLayout(null);

		JTextPane textPane = new JTextPane();
		textPane.setText("Name: ");
		textPane.setForeground(Color.BLACK);
		textPane.setFont(new Font("Thames", Font.PLAIN, 17));
		textPane.setBackground(new Color(102, 102, 153));
		textPane.setBounds(39, 52, 76, 24);
		contentPane1.add(textPane);

		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(153, 52, 201, 24);
		contentPane1.add(textField);

		JTextPane textPane_1 = new JTextPane();
		textPane_1.setText("Username: ");
		textPane_1.setForeground(Color.BLACK);
		textPane_1.setFont(new Font("Thames", Font.PLAIN, 17));
		textPane_1.setBackground(new Color(102, 102, 153));
		textPane_1.setBounds(39, 106, 76, 24);
		contentPane1.add(textPane_1);

		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(153, 106, 201, 24);
		contentPane1.add(textField_1);

		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(153, 154, 201, 24);
		contentPane1.add(textField_2);

		JTextPane textPane_2 = new JTextPane();
		textPane_2.setText("Password: ");
		textPane_2.setForeground(Color.BLACK);
		textPane_2.setFont(new Font("Thames", Font.PLAIN, 17));
		textPane_2.setBackground(new Color(102, 102, 153));
		textPane_2.setBounds(41, 154, 84, 19);
		contentPane1.add(textPane_2);

		JButton button = new JButton("Back");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
			}
		});
		button.setForeground(Color.WHITE);
		button.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		button.setBackground(new Color(51, 0, 51));
		button.setBounds(64, 200, 105, 42);
		contentPane1.add(button);
/*
 *  checking if the managers exists in the file or not
 */
		JButton button_1 = new JButton("Enter");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name = textField.getText();
				String username = textField_1.getText();
				String password = textField_2.getText();
				Manager m = new Manager();
				ArrayList<Manager> mans = m.Login();
				for (int i = 0; i < mans.size(); i++) {
					if (name.equals(mans.get(i).getName()) && username.equals(mans.get(i).getUsername())
							&& password.equals(mans.get(i).getPassword())) {
						Menu menu = new Menu();
						frame.setVisible(false);
						menu.setLocationRelativeTo(null);
						menu.setVisible(true);
						break;
					} else if (i == mans.size()-1) {
						
						JOptionPane.showInternalMessageDialog(contentPane1, "Invalid Information", "",
						JOptionPane.INFORMATION_MESSAGE);
					}
				}
			}
		});
		button_1.setForeground(Color.WHITE);
		button_1.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		button_1.setBackground(new Color(51, 0, 51));
		button_1.setBounds(263, 200, 105, 42);
		contentPane1.add(button_1);

	}
}
