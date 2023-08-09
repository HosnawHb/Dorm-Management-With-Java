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

public class Members extends JFrame {

	private JPanel contentPane;
	static Members frame = new Members();
	private JTextField textField;
	/**
	 * Launch the application.
	 */
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
	public Members() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(102, 102, 153));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTextPane textPane = new JTextPane();
		textPane.setText("Please Enter Room Number");
		textPane.setForeground(Color.BLACK);
		textPane.setFont(new Font("Thames", Font.BOLD, 17));
		textPane.setBackground(new Color(102, 102, 153));
		textPane.setBounds(89, 73, 246, 26);
		contentPane.add(textPane);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(99, 109, 219, 37);
		contentPane.add(textField);
		
		JButton button = new JButton("Cancel");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			  setVisible(false);
			}
		});
		button.setForeground(Color.WHITE);
		button.setBackground(new Color(51, 0, 51));
		button.setBounds(61, 195, 85, 21);
		contentPane.add(button);
		/*
		 * showing the room members
		 */
		JButton button_1 = new JButton("Ok");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Manager m = new Manager();
				String room_number = textField.getText();
				m.ShowRoomMembers(room_number);
			}
		});
		button_1.setForeground(Color.WHITE);
		button_1.setBackground(new Color(51, 0, 51));
		button_1.setBounds(271, 195, 85, 21);
		contentPane.add(button_1);
	}
}
