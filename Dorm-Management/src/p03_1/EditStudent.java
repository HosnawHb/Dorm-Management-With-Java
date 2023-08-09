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

public class EditStudent extends JFrame {

	private JPanel contentPane;
	static String id=null;
static EditStudent frame = new EditStudent(id);
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
	public EditStudent(String id) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(102, 102, 153));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		/*
		 * deleting the student
		 */
		JButton btnNewButton = new JButton("Delete Student");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Manager manager = new Manager();
				manager.DelStudent(id);
			}
		});
		btnNewButton.setFont(new Font("Thames", Font.PLAIN, 12));
		btnNewButton.setBackground(new Color(51, 0, 51));
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setBounds(32, 57, 113, 46);
		contentPane.add(btnNewButton);
		/*
		 * editing the student
		 */
		JButton btnEditStudent = new JButton("Edit Student");
		btnEditStudent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Editor e1 = new Editor(id);
				e1.setLocationRelativeTo(null);
				e1.setVisible(true);
			}
		});
		btnEditStudent.setFont(new Font("Thames", Font.PLAIN, 12));
		btnEditStudent.setForeground(new Color(255, 255, 255));
		btnEditStudent.setBackground(new Color(51, 0, 51));
		btnEditStudent.setBounds(32, 144, 113, 46);
		contentPane.add(btnEditStudent);
		/*
		 * adding the student to the chosen room
		 */
		JButton btnSelectRoom = new JButton("Select Room");
		btnSelectRoom.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Astr a = new Astr(id);
				a.setLocationRelativeTo(null);
				a.setVisible(true);
			}
		});
		btnSelectRoom.setForeground(new Color(255, 255, 255));
		btnSelectRoom.setFont(new Font("Thames", Font.PLAIN, 12));
		btnSelectRoom.setBackground(new Color(51, 0, 51));
		btnSelectRoom.setBounds(279, 144, 113, 46);
		contentPane.add(btnSelectRoom);
		/*
		 * showing the room members
		 */
		JButton btnShowRoom = new JButton("Show Room");
		btnShowRoom.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ShowRoom a = new ShowRoom(id);
				a.setLocationRelativeTo(null);
				a.setVisible(true);
			}
		});
		btnShowRoom.setForeground(new Color(255, 255, 255));
		btnShowRoom.setFont(new Font("Thames", Font.PLAIN, 12));
		btnShowRoom.setBackground(new Color(51, 0, 51));
		btnShowRoom.setBounds(279, 57, 113, 46);
		contentPane.add(btnShowRoom);
		
		JButton btnNewButton_1 = new JButton("Back");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
			}
		});
		btnNewButton_1.setBackground(new Color(51, 0, 51));
		btnNewButton_1.setForeground(new Color(255, 255, 255));
		btnNewButton_1.setBounds(168, 219, 85, 21);
		contentPane.add(btnNewButton_1);
	}
}
