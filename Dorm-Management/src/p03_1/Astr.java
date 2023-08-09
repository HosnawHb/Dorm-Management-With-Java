package p03_1;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Astr extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	static String id=null;
  static	Astr frame = new Astr(id);
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
	public Astr(String id) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(102, 102, 153));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(96, 123, 219, 37);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JTextPane txtpnPleaseEnterRoom = new JTextPane();
		txtpnPleaseEnterRoom.setForeground(new Color(0, 0, 0));
		txtpnPleaseEnterRoom.setFont(new Font("Thames", Font.BOLD, 17));
		txtpnPleaseEnterRoom.setText("Please Enter Room Number");
		txtpnPleaseEnterRoom.setBackground(new Color(102, 102, 153));
		txtpnPleaseEnterRoom.setBounds(96, 78, 246, 46);
		contentPane.add(txtpnPleaseEnterRoom);
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
		button.setBounds(56, 206, 85, 21);
		contentPane.add(button);
		/*
		 *  choose a room for the student
		 */
		JButton button_1 = new JButton("Ok");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Manager m =new Manager();
				String room_number = textField.getText();
				m.SelectRoom(room_number,id);
			}
		});
		button_1.setForeground(Color.WHITE);
		button_1.setBackground(new Color(51, 0, 51));
		button_1.setBounds(294, 206, 85, 21);
		contentPane.add(button_1);
	}
}
