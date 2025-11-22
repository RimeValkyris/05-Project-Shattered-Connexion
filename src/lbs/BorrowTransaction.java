package lbs;

import java.awt.EventQueue;
import java.time.LocalDate;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Cursor;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.JOptionPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTabbedPane;

public class BorrowTransaction extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private DefaultTableModel model;

	/**
	 * Launch the application.
	 */

	/**
	 * Create the frame.
	 */
	public BorrowTransaction() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(1200, 700);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel_1_1_1 = new JPanel();
		panel_1_1_1.setBackground(new Color(79, 70, 229));
		panel_1_1_1.setBounds(0, 0, 1190, 49);
		contentPane.add(panel_1_1_1);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBackground(new Color(30, 41, 59));
		panel_1.setBounds(0, 49, 400, 563);
		contentPane.add(panel_1);
		
		JLabel lblNewLabel = new JLabel("Issue New Book");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblNewLabel.setBounds(27, 31, 204, 38);
		panel_1.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Student ID");
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_1.setBounds(27, 88, 115, 14);
		panel_1.add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(27, 113, 327, 20);
		panel_1.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("ISBN");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setBounds(27, 144, 46, 14);
		panel_1.add(lblNewLabel_2);
		
		textField_1 = new JTextField();
		textField_1.setBounds(27, 169, 327, 20);
		panel_1.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Book Title");
		lblNewLabel_3.setForeground(Color.WHITE);
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_3.setBounds(27, 200, 78, 20);
		panel_1.add(lblNewLabel_3);
		
		textField_2 = new JTextField();
		textField_2.setBounds(27, 231, 327, 20);
		panel_1.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblNewLabel_3_1 = new JLabel("Date Today");
		lblNewLabel_3_1.setForeground(Color.WHITE);
		lblNewLabel_3_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_3_1.setBounds(27, 262, 115, 20);
		panel_1.add(lblNewLabel_3_1);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(27, 293, 327, 20);
		textField_3.setText(LocalDate.now().toString());
		panel_1.add(textField_3);
		
		JLabel lblNewLabel_3_1_1 = new JLabel("Number of Days");
		lblNewLabel_3_1_1.setForeground(Color.WHITE);
		lblNewLabel_3_1_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_3_1_1.setBounds(27, 334, 120, 20);
		panel_1.add(lblNewLabel_3_1_1);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(27, 365, 327, 20);
		panel_1.add(textField_4);
		
		JButton btnIssueBook = new JButton("Issue Book");
		btnIssueBook.setOpaque(true);
		btnIssueBook.setForeground(Color.WHITE);
		btnIssueBook.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		btnIssueBook.setFocusPainted(false);
		btnIssueBook.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnIssueBook.setBorderPainted(false);
		btnIssueBook.setBackground(new Color(55, 65, 81));
		btnIssueBook.setBounds(27, 421, 180, 40);
		panel_1.add(btnIssueBook);
		
		JButton btnGoBack = new JButton("Go Back");
		btnGoBack.setOpaque(true);
		btnGoBack.setForeground(Color.WHITE);
		btnGoBack.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		btnGoBack.setFocusPainted(false);
		btnGoBack.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnGoBack.setBorderPainted(false);
		btnGoBack.setBackground(new Color(55, 65, 81));
		btnGoBack.setBounds(27, 486, 89, 40);
		panel_1.add(btnGoBack);
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setBackground(new Color(79, 70, 229));
		panel_1_1.setBounds(0, 612, 1190, 49);
		contentPane.add(panel_1_1);
		
		// Add right panel for the table
		JPanel panel_right = new JPanel();
		panel_right.setLayout(null);
		panel_right.setBounds(400, 49, 784, 563);
		contentPane.add(panel_right);
		
		JTabbedPane tabbedPane = new JTabbedPane();
		tabbedPane.setBounds(10, 10, 760, 543);
		panel_right.add(tabbedPane);
		
		// Borrowed Books Tab
		JPanel borrowedPanel = new JPanel();
		borrowedPanel.setLayout(null);
		JLabel lblBorrowedBooks = new JLabel("Borrowed Books");
		lblBorrowedBooks.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblBorrowedBooks.setBounds(10, 10, 200, 30);
		borrowedPanel.add(lblBorrowedBooks);
		
		String[] columnNames = {"Title", "Author", "ISBN", "Student Number", "Student Name", "Issue Date", "Due Date"};
		model = new DefaultTableModel(columnNames, 0);
		JTable table = new JTable(model);
		JScrollPane scrollPane = new JScrollPane(table);
		scrollPane.setBounds(10, 50, 720, 443);
		borrowedPanel.add(scrollPane);
		tabbedPane.addTab("Borrowed Books", borrowedPanel);
		
		// Books Tab
		JPanel booksPanel = new JPanel();
		booksPanel.setLayout(null);
		JLabel lblBooks = new JLabel("Books");
		lblBooks.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblBooks.setBounds(10, 10, 100, 30);
		booksPanel.add(lblBooks);
		
		JTextField searchBooksField = new JTextField();
		searchBooksField.setBounds(10, 40, 200, 25);
		booksPanel.add(searchBooksField);
		
		JButton searchBooksBtn = new JButton("Search");
		searchBooksBtn.setBounds(220, 40, 80, 25);
		booksPanel.add(searchBooksBtn);
		
		String[] bookColumns = {"Title", "Author", "ISBN", "Genre", "Publisher", "Year", "Available"};
		DefaultTableModel booksModel = new DefaultTableModel(bookColumns, 0);
		for (Book b : BookManager.instance.getBooks()) {
		    booksModel.addRow(new Object[]{b.getTitle(), b.getAuthor(), b.getIsbn(), b.getGenre(), b.getPublisher(), b.getYear(), b.isAvailable() ? "Yes" : "No"});
		}
		JTable booksTable = new JTable(booksModel);
		JScrollPane booksScroll = new JScrollPane(booksTable);
		booksScroll.setBounds(10, 75, 720, 418);
		booksPanel.add(booksScroll);
		
		searchBooksBtn.addActionListener(e -> {
		    String query = searchBooksField.getText().toLowerCase().trim();
		    booksModel.setRowCount(0);
		    for (Book b : BookManager.instance.getBooks()) {
		        if (query.isEmpty() ||
		            b.getTitle().toLowerCase().contains(query) ||
		            b.getAuthor().toLowerCase().contains(query) ||
		            b.getIsbn().toLowerCase().contains(query) ||
		            b.getGenre().toLowerCase().contains(query) ||
		            b.getPublisher().toLowerCase().contains(query)) {
		            booksModel.addRow(new Object[]{b.getTitle(), b.getAuthor(), b.getIsbn(), b.getGenre(), b.getPublisher(), b.getYear(), b.isAvailable() ? "Yes" : "No"});
		        }
		    }
		});
		
		tabbedPane.addTab("Books", booksPanel);
		
		// Members Tab
		JPanel membersPanel = new JPanel();
		membersPanel.setLayout(null);
		JLabel lblMembers = new JLabel("Members");
		lblMembers.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblMembers.setBounds(10, 10, 100, 30);
		membersPanel.add(lblMembers);
		
		JTextField searchMembersField = new JTextField();
		searchMembersField.setBounds(10, 40, 200, 25);
		membersPanel.add(searchMembersField);
		
		JButton searchMembersBtn = new JButton("Search");
		searchMembersBtn.setBounds(220, 40, 80, 25);
		membersPanel.add(searchMembersBtn);
		
		String[] memberColumns = {"ID", "First Name", "Last Name", "Course", "Section", "Email", "Phone", "Join Date"};
		DefaultTableModel membersModel = new DefaultTableModel(memberColumns, 0);
		for (Member m : MemberManager.instance.getMembers()) {
		    membersModel.addRow(new Object[]{m.getStudentID(), m.getFirstName(), m.getLastName(), m.getCourse(), m.getSectionAndYear(), m.getEmail(), m.getPhoneNumber(), m.getDateJoined()});
		}
		JTable membersTable = new JTable(membersModel);
		JScrollPane membersScroll = new JScrollPane(membersTable);
		membersScroll.setBounds(10, 75, 720, 418);
		membersPanel.add(membersScroll);
		
		searchMembersBtn.addActionListener(e -> {
		    String query = searchMembersField.getText().toLowerCase().trim();
		    membersModel.setRowCount(0);
		    for (Member m : MemberManager.instance.getMembers()) {
		        if (query.isEmpty() ||
		            m.getFirstName().toLowerCase().contains(query) ||
		            m.getLastName().toLowerCase().contains(query) ||
		            m.getCourse().toLowerCase().contains(query) ||
		            m.getEmail().toLowerCase().contains(query)) {
		            membersModel.addRow(new Object[]{m.getStudentID(), m.getFirstName(), m.getLastName(), m.getCourse(), m.getSectionAndYear(), m.getEmail(), m.getPhoneNumber(), m.getDateJoined()});
		        }
		    }
		});
		
		tabbedPane.addTab("Members", membersPanel);
		
		btnIssueBook.addActionListener(e -> {
	        String studentId = textField.getText().trim();
	        try {
	            Long id = Long.valueOf(studentId);
	            Member member = null;
	            for (Member m : MemberManager.instance.getMembers()) {
	                if (m.getStudentID() == id.longValue()) {
	                    member = m;
	                    break;
	                }
	            }
	            if (member == null) {
	                JOptionPane.showMessageDialog(null, "Student not found.");
	                return;
	            }
	            String studentName = member.getFirstName() + " " + member.getLastName();
	            
	            String isbn = textField_1.getText().trim();
	            Book book = BookManager.instance.findBookByISBN(isbn);
	            
	            if (book != null && book.isAvailable()) {
	                try {
	                    int days = Integer.parseInt(textField_4.getText().trim());
	                    LocalDate dueDate = LocalDate.now().plusDays(days);
	                    book.checkOut();
	                    Transaction transaction = new Transaction.BorrowTransaction(studentId, isbn, days);
	                    BookManager.instance.addTransaction(transaction);
	                    JOptionPane.showMessageDialog(null, "Book issued successfully!");
	                    
	                    // Add the borrowed book to the table
	                    model.addRow(new Object[]{book.getTitle(), book.getAuthor(), book.getIsbn(), studentId, studentName, LocalDate.now().toString(), dueDate.toString()});
	                    
	                    // Clear the text fields
	                    textField.setText("");
	                    textField_1.setText("");
	                    textField_2.setText("");
	                    textField_3.setText(LocalDate.now().toString());
	                    textField_4.setText("");
	                } catch (NumberFormatException ex) {
	                    JOptionPane.showMessageDialog(null, "Please enter a valid number for days.");
	                }
	            } else {
	                JOptionPane.showMessageDialog(null, "Book is not available.");
	            }
	        } catch (NumberFormatException ex) {
	            JOptionPane.showMessageDialog(null, "Invalid student ID.");
	        }
	    });
		
		btnGoBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				new LibraryDashboard().setVisible(true);
			}
		});
	}
}

class IssueBooks {

    private ArrayList<Transaction> transactions = new ArrayList<>();

    public IssueBooks() {
        // initialize with empty transactions list
    }

    /**
     * Issue a book to a member.
     * Returns true if the issue succeeded and transaction was recorded.
     */
    public boolean issueBook(String memberId, String isbn, String issueDate, String dueDate) {
        if (memberId == null || isbn == null || issueDate == null || dueDate == null) return false;

        // validate member
        if (!validateMember(memberId)) return false;

        // validate book
        Book book = BookManager.instance.findBookByISBN(isbn);
        if (!validateBook(isbn)) return false;

        // check out the book
        book.checkOut();

        // create a borrow transaction (use subclass for clarity)
        Transaction t = new Transaction.BorrowTransaction(memberId, isbn, (int) (java.time.LocalDate.parse(dueDate).toEpochDay() - java.time.LocalDate.parse(issueDate).toEpochDay()));

        // override the transactionDate and dueDate to match provided strings
        t.setTransactionDate(issueDate);
        t.setDueDate(dueDate);

        // record locally and in BookManager
        transactions.add(t);
        BookManager.instance.addTransaction(t);

        return true;
    }

    public ArrayList<Transaction> getIssuedBooks() {
        return new ArrayList<>(transactions);
    }

    public boolean validateMember(String member) {
        if (member == null) return false;
        try {
            long id = Long.parseLong(member);
            for (Member m : MemberManager.instance.getMembers()) {
                if (m.getStudentID() == id) return true;
            }
        } catch (NumberFormatException ex) {
            return false;
        }
        return false;
    }

    public boolean validateBook(String isbn) {
        if (isbn == null) return false;
        Book b = BookManager.instance.findBookByISBN(isbn);
        return b != null && b.isAvailable();
    }
}