package p03_1;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JTextPane;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class SearchStudent extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	static SearchStudent frame = new SearchStudent();
	private JTextField textField;
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
	public SearchStudent() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(102, 102, 153));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTextPane textPane = new JTextPane();
		textPane.setText("Please enter student id:");
		textPane.setForeground(Color.BLACK);
		textPane.setFont(new Font("Thames", Font.BOLD, 17));
		textPane.setBackground(new Color(102, 102, 153));
		textPane.setBounds(110, 77, 179, 26);
		contentPane.add(textPane);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(110, 120, 179, 33);
		contentPane.add(textField);
		
		JButton button = new JButton("Cancel");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
			}
		});
		button.setForeground(Color.WHITE);
		button.setFont(new Font("Thames", Font.PLAIN, 11));
		button.setBackground(new Color(51, 0, 51));
		button.setBounds(76, 195, 89, 26);
		contentPane.add(button);
		/*
		 * search the student
		 */
		JButton button_1 = new JButton("Enter");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String id = textField.getText();
				Manager manager = new Manager();
				manager.search(id);
				frame.setVisible(false);
				EditStudent es = new EditStudent(id);
				es.setLocationRelativeTo(null);
				es.setVisible(true);
			}
		});
		button_1.setForeground(Color.WHITE);
		button_1.setFont(new Font("Thames", Font.PLAIN, 11));
		button_1.setBackground(new Color(51, 0, 51));
		button_1.setBounds(269, 196, 89, 24);
		contentPane.add(button_1);
	}

}
