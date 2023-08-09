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

public class MainFrame extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	static MainFrame frame = new MainFrame();

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frame.setName("Dorm Management");
					frame.setLocationRelativeTo(null);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public MainFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(102, 102, 153));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
/*
 * login as the manager
 */
		JButton btnNewButton = new JButton("Login");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Login login = new Login();
				login.setLocationRelativeTo(null);
				login.setVisible(true);
			} 
			
		});
		btnNewButton.setFont(new Font("Thames", Font.BOLD, 17));
		btnNewButton.setBackground(new Color(51, 0, 51));
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setBounds(52, 90, 116, 53);
		contentPane.add(btnNewButton); 
/*
 * sign up and make a new manager
 */
		JButton btnSingUp = new JButton("Sing Up");
		btnSingUp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SignUp SignUp = new SignUp();
				SignUp.setLocationRelativeTo(null);
				SignUp.setVisible(true);
				
			}
		});
		btnSingUp.setFont(new Font("Thames", Font.BOLD, 17));
		btnSingUp.setForeground(Color.WHITE);
		btnSingUp.setBackground(new Color(51, 0, 51));
		btnSingUp.setBounds(253, 90, 116, 53);
		contentPane.add(btnSingUp);
		
	}
}
