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
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.awt.event.ActionEvent;

public class RoomRegister extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	static RoomRegister frame = new RoomRegister();
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private final JTextPane txtpnRoomAgent = new JTextPane();
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
	public RoomRegister() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(102, 102, 153));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTextPane textPane = new JTextPane();
		textPane.setText("Room Number: ");
		textPane.setForeground(Color.BLACK);
		textPane.setFont(new Font("Thames", Font.PLAIN, 15));
		textPane.setBackground(new Color(102, 102, 153));
		textPane.setBounds(35, 32, 108, 29);
		contentPane.add(textPane);
		
		JTextPane textPane_1 = new JTextPane();
		textPane_1.setText("Room Capacity:");
		textPane_1.setForeground(Color.BLACK);
		textPane_1.setFont(new Font("Thames", Font.PLAIN, 15));
		textPane_1.setBackground(new Color(102, 102, 153));
		textPane_1.setBounds(35, 72, 110, 29);
		contentPane.add(textPane_1);
		
		JTextPane textPane_2 = new JTextPane();
		textPane_2.setText("Room Rental Cost: ");
		textPane_2.setForeground(Color.BLACK);
		textPane_2.setFont(new Font("Thames", Font.PLAIN, 15));
		textPane_2.setBackground(new Color(102, 102, 153));
		textPane_2.setBounds(34, 111, 129, 29);
		contentPane.add(textPane_2);
		
		JTextPane textPane_3 = new JTextPane();
		textPane_3.setToolTipText("");
		textPane_3.setText("Floor Number: ");
		textPane_3.setForeground(Color.BLACK);
		textPane_3.setFont(new Font("Thames", Font.PLAIN, 15));
		textPane_3.setBackground(new Color(102, 102, 153));
		textPane_3.setBounds(35, 150, 110, 29);
		contentPane.add(textPane_3);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(200, 32, 96, 29);
		contentPane.add(textField);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(200, 72, 96, 29);
		contentPane.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(200, 111, 96, 29);
		contentPane.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(200, 150, 96, 29);
		contentPane.add(textField_3);
		
		JButton button = new JButton("Cancel");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
			}
		});
		button.setForeground(Color.WHITE);
		button.setFont(new Font("Thames", Font.PLAIN, 15));
		button.setBackground(new Color(51, 0, 51));
		button.setBounds(58, 232, 85, 21);
		contentPane.add(button);
		/*
		 * adding a new room
		 */
		JButton button_1 = new JButton("Add");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String room_number = textField.getText();
				String room_capacity = textField_1.getText();
				String cost = textField_2.getText();
				String floor = textField_3.getText();
				String masul = textField_4.getText();
				Room room = new Room(room_number);
				try {
					Room.newRoom(room_number, room_capacity, cost, floor, masul);
				} catch (FileNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				JOptionPane.showInternalMessageDialog(contentPane, "New room added", "",
						JOptionPane.INFORMATION_MESSAGE);
			}
		});
		button_1.setForeground(Color.WHITE);
		button_1.setFont(new Font("Thames", Font.PLAIN, 15));
		button_1.setBackground(new Color(51, 0, 51));
		button_1.setBounds(298, 232, 85, 21);
		contentPane.add(button_1);
		txtpnRoomAgent.setBounds(35, 189, 108, 33);
		contentPane.add(txtpnRoomAgent);
		txtpnRoomAgent.setToolTipText("");
		txtpnRoomAgent.setText("Room Agent");
		txtpnRoomAgent.setForeground(Color.BLACK);
		txtpnRoomAgent.setFont(new Font("Thames", Font.PLAIN, 15));
		txtpnRoomAgent.setBackground(new Color(102, 102, 153));
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(200, 189, 96, 29);
		contentPane.add(textField_4);
		
	}
}
