public class BankAccount {
	public static int lastID = 8128; 
	public String name;
	private String password;
	private int PIN;
	private int userID;
	private int bal;
	public BankAccount(String pname, String ppassword, int pPIN, int pbal){
		userID = (BankAccount.lastID + 1) % 10^9;
		BankAccount.lastID += 1;
		name = pname;
		password = ppassword;
		PIN = pPIN % 10000;
		bal = pbal;
	}
	public void printInfo(int pPIN){
		if (PIN == pPIN) {
			System.out.println("ACCOUNT SUMMARY\n----------------------\nNAME: " + name + "\nUSER ID: " + Integer.toString(userID) + "\nBALANCE: $" + Integer.toString(bal));
		}
		else {
			System.out.println("PIN was incorrect");
		}
	}
	public static void main(String[] args){
		BankAccount john = new BankAccount("John Doe", "s3cr3tpassw0rd", 1234, 100389091);
		john.printInfo(5432);
		john.printInfo(1234);
	}
} 
