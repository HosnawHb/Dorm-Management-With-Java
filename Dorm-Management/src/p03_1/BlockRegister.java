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

public class BlockRegister extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	static BlockRegister frame = new BlockRegister();
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
	public BlockRegister() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(102, 102, 153));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTextPane textPane = new JTextPane();
		textPane.setText("Block Number: ");
		textPane.setForeground(Color.BLACK);
		textPane.setFont(new Font("Thames", Font.PLAIN, 15));
		textPane.setBackground(new Color(102, 102, 153));
		textPane.setBounds(51, 54, 106, 24);
		contentPane.add(textPane);
		
		JTextPane textPane_1 = new JTextPane();
		textPane_1.setText("Floor Number: ");
		textPane_1.setForeground(Color.BLACK);
		textPane_1.setFont(new Font("Thames", Font.PLAIN, 15));
		textPane_1.setBackground(new Color(102, 102, 153));
		textPane_1.setBounds(51, 95, 106, 24);
		contentPane.add(textPane_1);
		
		JTextPane textPane_2 = new JTextPane();
		textPane_2.setText("Dorm Name: ");
		textPane_2.setForeground(Color.BLACK);
		textPane_2.setFont(new Font("Thames", Font.PLAIN, 15));
		textPane_2.setBackground(new Color(102, 102, 153));
		textPane_2.setBounds(51, 137, 106, 24);
		contentPane.add(textPane_2);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(215, 54, 106, 31);
		contentPane.add(textField);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(215, 99, 106, 31);
		contentPane.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(215, 147, 106, 31);
		contentPane.add(textField_2);
		
		JButton button = new JButton("Cancel");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
			}
		});
		button.setForeground(Color.WHITE);
		button.setFont(new Font("Thames", Font.PLAIN, 17));
		button.setBackground(new Color(51, 0, 51));
		button.setBounds(78, 205, 85, 21);
		contentPane.add(button);
		
		JButton button_1 = new JButton("Add");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String block_number = textField.getText();
				String floor_number = textField_1.getText();
				Block block = new Block(block_number, floor_number);
				Block.newBlock(block_number,floor_number);
				JOptionPane.showInternalMessageDialog(contentPane, "New block added", "",
						JOptionPane.INFORMATION_MESSAGE);
			}
		});
		button_1.setForeground(Color.WHITE);
		button_1.setFont(new Font("Thames", Font.PLAIN, 17));
		button_1.setBackground(new Color(51, 0, 51));
		button_1.setBounds(247, 205, 85, 21);
		contentPane.add(button_1);
	}

}
