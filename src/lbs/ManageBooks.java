package lbs;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.Cursor;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ManageBooks extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ManageBooks frame = new ManageBooks();
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
	public ManageBooks() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 1287, 756);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(635, 10, 1, 1);
		panel.setLayout(null);
		panel.setBackground(new Color(30, 41, 59));
		contentPane.add(panel);
		
		JButton btnManage = new JButton("Manage Books");
		btnManage.setOpaque(true);
		btnManage.setForeground(Color.WHITE);
		btnManage.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		btnManage.setFocusPainted(false);
		btnManage.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnManage.setBorderPainted(false);
		btnManage.setBackground(new Color(55, 65, 81));
		btnManage.setBounds(32, 119, 180, 40);
		panel.add(btnManage);
		
		JButton btnIssue = new JButton("Issue Books");
		btnIssue.setOpaque(true);
		btnIssue.setForeground(Color.WHITE);
		btnIssue.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		btnIssue.setFocusPainted(false);
		btnIssue.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnIssue.setBorderPainted(false);
		btnIssue.setBackground(new Color(55, 65, 81));
		btnIssue.setBounds(32, 179, 180, 40);
		panel.add(btnIssue);
		
		JButton btnReturn = new JButton("Return Books");
		btnReturn.setOpaque(true);
		btnReturn.setForeground(Color.WHITE);
		btnReturn.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		btnReturn.setFocusPainted(false);
		btnReturn.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnReturn.setBorderPainted(false);
		btnReturn.setBackground(new Color(55, 65, 81));
		btnReturn.setBounds(32, 239, 180, 40);
		panel.add(btnReturn);
		
		JButton btnMember = new JButton("Member Management");
		btnMember.setOpaque(true);
		btnMember.setForeground(Color.WHITE);
		btnMember.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		btnMember.setFocusPainted(false);
		btnMember.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnMember.setBorderPainted(false);
		btnMember.setBackground(new Color(55, 65, 81));
		btnMember.setBounds(32, 299, 180, 40);
		panel.add(btnMember);
		
		JButton btnLogout = new JButton("Logout");
		btnLogout.setOpaque(true);
		btnLogout.setForeground(Color.WHITE);
		btnLogout.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		btnLogout.setFocusPainted(false);
		btnLogout.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnLogout.setBorderPainted(false);
		btnLogout.setBackground(new Color(55, 65, 81));
		btnLogout.setBounds(32, 359, 180, 40);
		panel.add(btnLogout);
		
		JButton btnExit = new JButton("Exit");
		btnExit.setOpaque(true);
		btnExit.setForeground(Color.WHITE);
		btnExit.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		btnExit.setFocusPainted(false);
		btnExit.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnExit.setBorderPainted(false);
		btnExit.setBackground(new Color(55, 65, 81));
		btnExit.setBounds(32, 419, 180, 40);
		panel.add(btnExit);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(30, 41, 59));
		panel_1.setBounds(0, 49, 412, 619);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Book Details");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel.setBounds(30, 67, 131, 14);
		panel_1.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("ISBN");
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setFont(new Font("Segoe UI Symbol", Font.BOLD, 16));
		lblNewLabel_1.setBounds(10, 116, 56, 20);
		panel_1.add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(97, 119, 257, 20);
		panel_1.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1_1 = new JLabel("Book Title");
		lblNewLabel_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1.setFont(new Font("Segoe UI Symbol", Font.BOLD, 16));
		lblNewLabel_1_1.setBounds(10, 167, 83, 20);
		panel_1.add(lblNewLabel_1_1);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(97, 170, 257, 20);
		panel_1.add(textField_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Author");
		lblNewLabel_1_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1_1.setFont(new Font("Segoe UI Symbol", Font.BOLD, 16));
		lblNewLabel_1_1_1.setBounds(10, 216, 56, 20);
		panel_1.add(lblNewLabel_1_1_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(97, 219, 257, 20);
		panel_1.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(97, 275, 257, 20);
		panel_1.add(textField_3);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("Genre");
		lblNewLabel_1_1_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1_1_1.setFont(new Font("Segoe UI Symbol", Font.BOLD, 16));
		lblNewLabel_1_1_1_1.setBounds(10, 271, 83, 23);
		panel_1.add(lblNewLabel_1_1_1_1);
		
		JLabel lblNewLabel_1_1_1_1_1 = new JLabel("Year");
		lblNewLabel_1_1_1_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1_1_1_1.setFont(new Font("Segoe UI Symbol", Font.BOLD, 16));
		lblNewLabel_1_1_1_1_1.setBounds(10, 371, 83, 20);
		panel_1.add(lblNewLabel_1_1_1_1_1);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(97, 322, 257, 20);
		panel_1.add(textField_4);
		
		JLabel lblNewLabel_1_1_1_2 = new JLabel("Publisher");
		lblNewLabel_1_1_1_2.setForeground(Color.WHITE);
		lblNewLabel_1_1_1_2.setFont(new Font("Segoe UI Symbol", Font.BOLD, 16));
		lblNewLabel_1_1_1_2.setBounds(10, 322, 83, 20);
		panel_1.add(lblNewLabel_1_1_1_2);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(97, 374, 257, 20);
		panel_1.add(textField_5);
		
		JButton btnAdd = new JButton("Add");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnAdd.setOpaque(true);
		btnAdd.setForeground(Color.WHITE);
		btnAdd.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		btnAdd.setFocusPainted(false);
		btnAdd.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnAdd.setBorderPainted(false);
		btnAdd.setBackground(new Color(55, 65, 81));
		btnAdd.setBounds(30, 439, 74, 40);
		panel_1.add(btnAdd);
		
		JButton btnDelete = new JButton("Delete");
		btnDelete.setOpaque(true);
		btnDelete.setForeground(Color.WHITE);
		btnDelete.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		btnDelete.setFocusPainted(false);
		btnDelete.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnDelete.setBorderPainted(false);
		btnDelete.setBackground(new Color(55, 65, 81));
		btnDelete.setBounds(231, 439, 74, 40);
		panel_1.add(btnDelete);
		
		JButton btnUpdate = new JButton("Update");
		btnUpdate.setOpaque(true);
		btnUpdate.setForeground(Color.WHITE);
		btnUpdate.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		btnUpdate.setFocusPainted(false);
		btnUpdate.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnUpdate.setBorderPainted(false);
		btnUpdate.setBackground(new Color(55, 65, 81));
		btnUpdate.setBounds(125, 439, 89, 40);
		panel_1.add(btnUpdate);
		
		JButton btnGoBack = new JButton("Go Back");
		btnGoBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LibraryDashboard dashboard = new LibraryDashboard();
				dashboard.setVisible(true);
				dispose();
			}
		});
		btnGoBack.setOpaque(true);
		btnGoBack.setForeground(Color.WHITE);
		btnGoBack.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		btnGoBack.setFocusPainted(false);
		btnGoBack.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnGoBack.setBorderPainted(false);
		btnGoBack.setBackground(new Color(55, 65, 81));
		btnGoBack.setBounds(30, 540, 89, 40);
		panel_1.add(btnGoBack);
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setBackground(new Color(79, 70, 229));
		panel_1_1.setBounds(0, 668, 1271, 49);
		contentPane.add(panel_1_1);
		
		JPanel panel_1_1_1 = new JPanel();
		panel_1_1_1.setBackground(new Color(79, 70, 229));
		panel_1_1_1.setBounds(0, 0, 1271, 49);
		contentPane.add(panel_1_1_1);
		
		JLabel lblNewLabel_2 = new JLabel("Book Management");
		lblNewLabel_2.setFont(new Font("Segoe UI Symbol", Font.BOLD, 32));
		lblNewLabel_2.setBounds(698, 60, 291, 49);
		contentPane.add(lblNewLabel_2);

	}
}