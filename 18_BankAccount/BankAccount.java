// Team Wires: Abdullah Faruque, Julia Kozak, Joshua Yagupsky 
// APCS
// HW18 -- CPA-One
// 2021-10-18

/*
DISCO: Integer.toString(<Integer>) can be used to print integers;
       You can use if/else within an if/else statement;
       \n creates a New line within print
QCC:
Team Wires' Latest and Greatest Q2 Response: We know java provides a default constructor because when we try to print the value of an instance variable before the value is set, there is a default printed response (ex. ints printed as 0, and Strings printed as "null")
Team Wires' Latest and Greatest Q3 Response: We can try running System.out.println(John.toString()); which provides a string representation of an object. Since the code compiles and outputs the object as a string, we confirm that there is a toString method that can be used in every class, which we can overload if we desire.
*/
public class BankAccount {
	public static int lastID = 8128;
	public String name;
	private String password;
	private int PIN;
	private int userID;
	private int bal;
	public BankAccount(String pname, String ppassword, int pPIN, int pbal){
		userID = BankAccount.lastID;
		userID=(userID+ 1) % ((int) Math.pow(10,9));
		BankAccount.lastID += 1;
		name = pname;
		password = ppassword;
		PIN = pPIN % 10000;
		bal = pbal;
	}
	public void printInfo(int pPIN){
		if (PIN == pPIN) {
			System.out.println("ACCOUNT SUMMARY\n----------------------\nNAME: " + name + "\nUSER ID: " + userID + "\nBALANCE: $" + bal + "\nPASSWORD: " + password + "\nPIN: " + PIN);
		}
		else {
			System.out.println("PIN was incorrect");
		}
	}
	public void setBal(int pPIN, int newBal){
		if (PIN==pPIN){
			bal=newBal;
		}
		else{
			System.out.println("PIN was incorrect");
		}
	}
	public void setName(int pPIN, String newName){
		if (PIN==pPIN){
			name=newName;
		}
		else{
			System.out.println("PIN was incorrect");
		}
	}
	public void setPassword(int pPIN, String newPass){
		if (PIN==pPIN){
			password=newPass;
		}
		else{
			System.out.println("PIN was incorrect");
		}
	}
	public void setPIN(int pPIN, int newPIN){
		if (PIN==pPIN){
			PIN=newPIN;
		}
		else{
			System.out.println("PIN was incorrect");
		}
	}
	public void depositMoney(int pPIN, int money){
		if (PIN==pPIN){
			if (money>0){
				bal+=money;
			}else {
				System.out.println("Cannot deposit negative amount, try again");
			}
		}
		else{
			System.out.println("PIN was incorrect");
		}
	}
	public void withdrawMoney(int pPIN, int money){
		if (PIN==pPIN){
			if (money>0){
				bal-=money;
			}else {
				System.out.println("Input must be positive");
			}
		}
		else{
			System.out.println("PIN was incorrect");
		}
	}


	public static void main(String[] args){
		BankAccount john = new BankAccount("John Doe", "s3cr3tpassw0rd", 1234, 100000);
		john.printInfo(5432);
		john.printInfo(1234);
		john.setName(1234, "Joe");
		john.printInfo(1234);
		john.setPassword(1234,"joeiscool");
		john.printInfo(1234);
		john.setBal(1234,6969);
		john.printInfo(1234);
		john.setPIN(1234, 4321);
		john.printInfo(4321);
		john.depositMoney(4321,1);
		john.printInfo(4321);
		john.withdrawMoney(4321,6970);
		john.printInfo(4321);

	}
}
