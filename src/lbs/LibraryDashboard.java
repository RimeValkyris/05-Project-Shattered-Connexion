package lbs;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class LibraryDashboard extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private String username;
	
	private List<Book> books = new ArrayList<>();
	private List<Member> members = new ArrayList<>();
	private List<BorrowedBook> borrowed = new ArrayList<>();
	
	private JLabel lblBooksCount, lblBorrowedCount, lblMembersCount;
	
	private static class Book {
		String title, author;
		Book(String title, String author) {
			this.title = title;
			this.author = author;
		}
	}
	
	private static class Member {
		String name, id;
		Member(String name, String id) {
			this.name = name;
			this.id = id;
		}
	}
	
	private static class BorrowedBook {
		Book book;
		Member borrower;
		BorrowedBook(Book book, Member borrower) {
			this.book = book;
			this.borrower = borrower;
		}
	}
	
	public LibraryDashboard(String username) {
		this.username = username;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 798, 461);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel welcomeLabel = new JLabel("Welcome, " + username + "!");
		welcomeLabel.setBounds(439, 11, 109, 14);
		contentPane.add(welcomeLabel);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(128, 128, 255));
		panel.setBounds(0, 0, 232, 446);
		contentPane.add(panel);
		panel.setLayout(null);
		
		// Add Book section
		JLabel lblAddBook = new JLabel("Add Book");
		lblAddBook.setBounds(10, 10, 100, 14);
		lblAddBook.setFont(new Font("Arial", Font.BOLD, 12));
		panel.add(lblAddBook);
		
		JLabel lblAuthor = new JLabel("Author:");
		lblAuthor.setBounds(10, 30, 50, 14);
		panel.add(lblAuthor);
		
		JTextField authorField = new JTextField();
		authorField.setBounds(60, 30, 150, 20);
		panel.add(authorField);
		
		JLabel lblTitle = new JLabel("Title:");
		lblTitle.setBounds(10, 55, 50, 14);
		panel.add(lblTitle);
		
		JTextField titleField = new JTextField();
		titleField.setBounds(60, 55, 150, 20);
		panel.add(titleField);
		
		JButton addBookBtn = new JButton("Add Book");
		addBookBtn.setBounds(10, 80, 100, 25);
		panel.add(addBookBtn);
		
		addBookBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String author = authorField.getText().trim();
				String title = titleField.getText().trim();
				if (!author.isEmpty() && !title.isEmpty()) {
					books.add(new Book(title, author));
					updateLabels();
					authorField.setText("");
					titleField.setText("");
				}
			}
		});
		
		// Borrow Book section
		JLabel lblBorrowBook = new JLabel("Borrow Book");
		lblBorrowBook.setBounds(10, 120, 100, 14);
		lblBorrowBook.setFont(new Font("Arial", Font.BOLD, 12));
		panel.add(lblBorrowBook);
		
		JLabel lblBookTitle = new JLabel("Book:");
		lblBookTitle.setBounds(10, 140, 50, 14);
		panel.add(lblBookTitle);
		
		JTextField bookTitleField = new JTextField();
		bookTitleField.setBounds(60, 140, 150, 20);
		panel.add(bookTitleField);
		
		JLabel lblBorrower = new JLabel("Borrower:");
		lblBorrower.setBounds(10, 165, 60, 14);
		panel.add(lblBorrower);
		
		JTextField borrowerField = new JTextField();
		borrowerField.setBounds(70, 165, 140, 20);
		panel.add(borrowerField);
		
		JButton borrowBtn = new JButton("Borrow");
		borrowBtn.setBounds(10, 190, 100, 25);
		panel.add(borrowBtn);
		
		borrowBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String bookTitle = bookTitleField.getText().trim();
				String borrowerName = borrowerField.getText().trim();
				Book book = findBookByTitle(bookTitle);
				Member borrower = findMemberByName(borrowerName);
				if (book != null && borrower != null) {
					borrowed.add(new BorrowedBook(book, borrower));
					updateLabels();
					bookTitleField.setText("");
					borrowerField.setText("");
				}
			}
		});
		
		// Add Member section
		JLabel lblAddMember = new JLabel("Add Member");
		lblAddMember.setBounds(10, 230, 100, 14);
		lblAddMember.setFont(new Font("Arial", Font.BOLD, 12));
		panel.add(lblAddMember);
		
		JLabel lblName = new JLabel("Name:");
		lblName.setBounds(10, 250, 50, 14);
		panel.add(lblName);
		
		JTextField nameField = new JTextField();
		nameField.setBounds(60, 250, 150, 20);
		panel.add(nameField);
		
		JLabel lblId = new JLabel("ID:");
		lblId.setBounds(10, 275, 50, 14);
		panel.add(lblId);
		
		JTextField idField = new JTextField();
		idField.setBounds(60, 275, 150, 20);
		panel.add(idField);
		
		JButton addMemberBtn = new JButton("Add Member");
		addMemberBtn.setBounds(10, 300, 120, 25);
		panel.add(addMemberBtn);
		
		addMemberBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name = nameField.getText().trim();
				String id = idField.getText().trim();
				if (!name.isEmpty() && !id.isEmpty()) {
					members.add(new Member(name, id));
					updateLabels();
					nameField.setText("");
					idField.setText("");
				}
			}
		});
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.LIGHT_GRAY);
		panel_1.setBounds(259, 72, 143, 119);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Books");
		lblNewLabel.setBounds(48, 5, 46, 14);
		panel_1.add(lblNewLabel);
		
		lblBooksCount = new JLabel("0");
		lblBooksCount.setFont(new Font("Arial", Font.BOLD, 36));
		lblBooksCount.setHorizontalAlignment(SwingConstants.CENTER);
		lblBooksCount.setBounds(10, 25, 123, 84);
		panel_1.add(lblBooksCount);
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setBackground(Color.LIGHT_GRAY);
		panel_1_1.setBounds(439, 72, 143, 119);
		contentPane.add(panel_1_1);
		panel_1_1.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Borrowed Books");
		lblNewLabel_1.setBounds(20, 5, 100, 14);
		panel_1_1.add(lblNewLabel_1);
		
		lblBorrowedCount = new JLabel("0");
		lblBorrowedCount.setFont(new Font("Arial", Font.BOLD, 36));
		lblBorrowedCount.setHorizontalAlignment(SwingConstants.CENTER);
		lblBorrowedCount.setBounds(10, 25, 123, 84);
		panel_1_1.add(lblBorrowedCount);
		
		JPanel panel_1_1_1 = new JPanel();
		panel_1_1_1.setBackground(Color.LIGHT_GRAY);
		panel_1_1_1.setBounds(613, 72, 143, 119);
		contentPane.add(panel_1_1_1);
		panel_1_1_1.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("Members");
		lblNewLabel_2.setBounds(48, 5, 46, 14);
		panel_1_1_1.add(lblNewLabel_2);
		
		lblMembersCount = new JLabel("0");
		lblMembersCount.setFont(new Font("Arial", Font.BOLD, 36));
		lblMembersCount.setHorizontalAlignment(SwingConstants.CENTER);
		lblMembersCount.setBounds(10, 25, 123, 84);
		panel_1_1_1.add(lblMembersCount);
	}
	
	private void updateLabels() {
		lblBooksCount.setText(String.valueOf(books.size()));
		lblBorrowedCount.setText(String.valueOf(borrowed.size()));
		lblMembersCount.setText(String.valueOf(members.size()));
	}
	
	private Book findBookByTitle(String title) {
		for (Book b : books) {
			if (b.title.equalsIgnoreCase(title)) {
				return b;
			}
		}
		return null;
	}
	
	private Member findMemberByName(String name) {
		for (Member m : members) {
			if (m.name.equalsIgnoreCase(name)) {
				return m;
			}
		}
		return null;
	}
}