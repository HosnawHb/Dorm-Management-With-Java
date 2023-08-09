package p03_1;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Menu extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	static Menu frame = new Menu();
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
	public Menu() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(102, 102, 153));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		/*
		 * adding a new room
		 */
		JButton btnNewRoom = new JButton("New Room");
		btnNewRoom.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				RoomRegister r = new RoomRegister();
				r.setLocationRelativeTo(null);
				r.setVisible(true);
			}
		});
		btnNewRoom.setForeground(Color.WHITE);
		btnNewRoom.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnNewRoom.setBackground(new Color(51, 0, 51));
		btnNewRoom.setBounds(20, 13, 121, 58);
		contentPane.add(btnNewRoom);
		/*
		 * adding anew block
		 */
		JButton btnNewBlock = new JButton("New Block");
		btnNewBlock.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				BlockRegister b = new BlockRegister();
				b.setLocationRelativeTo(null);
				b.setVisible(true);
			}
		});
		btnNewBlock.setForeground(Color.WHITE);
		btnNewBlock.setFont(new Font("Thames", Font.BOLD, 13));
		btnNewBlock.setBackground(new Color(51, 0, 51));
		btnNewBlock.setBounds(20, 94, 121, 58);
		contentPane.add(btnNewBlock);
		/*
		 *  search the student and go to the student's page
		 */
		JButton button_2 = new JButton("Edit Student");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				SearchStudent ss = new SearchStudent();
				ss.setLocationRelativeTo(null);
				ss.setVisible(true);
			}
		});
		button_2.setForeground(Color.WHITE);
		button_2.setFont(new Font("Thames", Font.PLAIN, 16));
		button_2.setBackground(new Color(51, 0, 51));
		button_2.setBounds(20, 169, 121, 58);
		contentPane.add(button_2);
		/*
		 * adding a new student
		 */
		JButton btnNewStudent = new JButton("New Student");
		btnNewStudent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				AddStudent as = new AddStudent();
				as.setLocationRelativeTo(null);
				as.setVisible(true);
			}
		});
		btnNewStudent.setForeground(Color.WHITE);
		btnNewStudent.setFont(new Font("Thames", Font.BOLD, 13));
		btnNewStudent.setBackground(new Color(51, 0, 51));
		btnNewStudent.setBounds(165, 167, 123, 58);
		contentPane.add(btnNewStudent);
		/*
		 * deleting all the students of the selected room
		 */
		JButton button_4 = new JButton("Delete all students");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				DeleteAll as = new DeleteAll();
				as.setLocationRelativeTo(null);
				as.setVisible(true);
			}
		});
		button_4.setForeground(Color.WHITE);
		button_4.setFont(new Font("Thames", Font.BOLD, 11));
		button_4.setBackground(new Color(51, 0, 51));
		button_4.setBounds(165, 91, 123, 61);
		contentPane.add(button_4);
		/*
		 * returning to the last page
		 */
		JButton button_5 = new JButton("Return");
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
			}
		});
		button_5.setForeground(Color.WHITE);
		button_5.setFont(new Font("Thames", Font.PLAIN, 16));
		button_5.setBackground(new Color(51, 0, 51));
		button_5.setBounds(323, 97, 91, 48);
		contentPane.add(button_5);
		/*
		 * showing the room members
		 */
		JButton btnShowRoomMembers = new JButton("Room Members");
		btnShowRoomMembers.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				Members as = new Members();
				as.setLocationRelativeTo(null);
				as.setVisible(true);
			}
		});
		btnShowRoomMembers.setForeground(Color.WHITE);
		btnShowRoomMembers.setFont(new Font("Thames", Font.BOLD, 12));
		btnShowRoomMembers.setBackground(new Color(51, 0, 51));
		btnShowRoomMembers.setBounds(167, 14, 121, 58);
		contentPane.add(btnShowRoomMembers);
		/*
		 * showing empty rooms
		 */
		JButton btnShowEmptyRooms = new JButton("Empty Rooms");
		btnShowEmptyRooms.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Manager m = new Manager();
				m.showemptyroom();
			}
		});
		btnShowEmptyRooms.setForeground(Color.WHITE);
		btnShowEmptyRooms.setFont(new Font("Thames", Font.BOLD, 13));
		btnShowEmptyRooms.setBackground(new Color(51, 0, 51));
		btnShowEmptyRooms.setBounds(305, 14, 121, 58);
		contentPane.add(btnShowEmptyRooms);
		
	}

}
