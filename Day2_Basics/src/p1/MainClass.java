package p1;

class Account {
	private int id;
	private String accountHolderName;

	public Account() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Account(int id, String accountHolderName) {
		super();
		this.id = id;
		this.accountHolderName = accountHolderName;
	}

	// way 1
	public void displayinfo() {
		System.out.println(this.accountHolderName);

	}

	// way 2
	public void displayinfo2() {
		System.out.println(accountHolderName);

	}

	// way 2
	public void displayinfo3(Account a) {
		System.out.println(a.accountHolderName);

	}

}

public class MainClass {

	public static void main(String[] args) {

		Account a1 = new Account(101, "mike");
		Account a2 = new Account(102, "ramesh");

		a1.displayinfo();
		a1.displayinfo2();
		a1.displayinfo3(a1);
		
	}

}// end class
