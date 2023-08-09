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

public class Editor extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;

	/**
	 * Launch the application.
	 */
	static String id=null;
	static Editor frame = new Editor(id);
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
	public Editor(String id) {
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
		textPane.setBounds(78, 39, 51, 24);
		contentPane.add(textPane);
		
		JTextPane textPane_1 = new JTextPane();
		textPane_1.setText("Student ID: ");
		textPane_1.setForeground(Color.BLACK);
		textPane_1.setFont(new Font("Thames", Font.PLAIN, 15));
		textPane_1.setBackground(new Color(102, 102, 153));
		textPane_1.setBounds(78, 73, 82, 24);
		contentPane.add(textPane_1);
		
		JTextPane textPane_2 = new JTextPane();
		textPane_2.setText("Major: ");
		textPane_2.setForeground(Color.BLACK);
		textPane_2.setFont(new Font("Thames", Font.PLAIN, 15));
		textPane_2.setBackground(new Color(102, 102, 153));
		textPane_2.setBounds(78, 107, 51, 24);
		contentPane.add(textPane_2);
		
		JTextPane textPane_3 = new JTextPane();
		textPane_3.setText("Entry year: ");
		textPane_3.setForeground(Color.BLACK);
		textPane_3.setFont(new Font("Thames", Font.PLAIN, 15));
		textPane_3.setBackground(new Color(102, 102, 153));
		textPane_3.setBounds(78, 145, 82, 24);
		contentPane.add(textPane_3);
		
		JTextPane textPane_4 = new JTextPane();
		textPane_4.setText("Debt amount: ");
		textPane_4.setForeground(Color.BLACK);
		textPane_4.setFont(new Font("Thames", Font.PLAIN, 15));
		textPane_4.setBackground(new Color(102, 102, 153));
		textPane_4.setBounds(78, 179, 95, 24);
		contentPane.add(textPane_4);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(213, 39, 110, 24);
		contentPane.add(textField);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(213, 73, 110, 24);
		contentPane.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(213, 107, 110, 24);
		contentPane.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(213, 145, 110, 24);
		contentPane.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(213, 179, 110, 24);
		contentPane.add(textField_4);
		
		JButton button = new JButton("Cancel");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
			}
		});
		button.setForeground(Color.WHITE);
		button.setBackground(new Color(51, 0, 51));
		button.setBounds(60, 220, 85, 21);
		contentPane.add(button);
		
		JButton btnOk = new JButton("Ok");
		btnOk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String newname = textField.getText();
				String newid = textField_1.getText();
				String newmajor = textField_2.getText();
				String newentry = textField_3.getText();
				String newdebt = textField_4.getText();
				Manager m =new Manager();
				m.EditStudent(id,newname,newid,newmajor,newentry,newdebt);
			}
		});
		btnOk.setForeground(Color.WHITE);
		btnOk.setBackground(new Color(51, 0, 51));
		btnOk.setBounds(293, 220, 85, 21);
		contentPane.add(btnOk);
	}
}
