package lbs;

public class Transaction {
	
	protected String transactionId;
	protected String memberId;
	protected String itemId;
	protected String transactionDate;
	protected String dueDate;
	protected String type;
	
	public Transaction(String transactionId, String memberId, String itemId, String transactionDate, String dueDate, String type) {
		this.transactionId = transactionId;
		this.memberId = memberId;
		this.itemId = itemId;
		this.transactionDate = transactionDate;
		this.dueDate = dueDate;
		this.type = type;
	}
	
	public String getTransactionId() {
		return transactionId;
	}
	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}
	
	public String getMemberId() {
		return memberId;
	}
	
	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}
	
	public String getItemId() {
		return itemId;
	}
	
	public void setItemId(String itemId) {
		this.itemId = itemId;
	}
	
	public String getTransactionDate() {
		return transactionDate;
	}
	
	public void setTransactionDate(String transactionDate) {
		this.transactionDate = transactionDate;
	}
	
	public String getDueDate() {
		return dueDate;
	}
	
	public void setDueDate(String dueDate) {
		this.dueDate = dueDate;
	}
	
	public String getType() {
		return type;
	}
	
	public void setType(String type) {
		this.type = type;
	}
	
	public static Transaction createBorrowTransaction(String memberId, String itemId, int days) {
		String transactionId = "borrow-" + System.currentTimeMillis();
		String transactionDate = java.time.LocalDate.now().toString();
		String dueDate = java.time.LocalDate.now().plusDays(days).toString();
		return new Transaction(transactionId, memberId, itemId, transactionDate, dueDate, "borrow");
	}
	
	public static class BorrowTransaction extends Transaction {
		public BorrowTransaction(String memberId, String itemId, int days) {
			super("borrow-" + System.currentTimeMillis(), memberId, itemId, java.time.LocalDate.now().toString(), java.time.LocalDate.now().plusDays(days).toString(), "borrow");
		}
	}
}