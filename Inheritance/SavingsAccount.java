package Inheritance;

public class SavingsAccount extends Bank {
	String cus_name;
	long accno;
	double balance;
	
//	Constructor
	SavingsAccount() {}
	SavingsAccount(String bname, String ifsc, int pin, String cus_name,long accno, double balance){
		super(bname, ifsc, pin);
		this.cus_name=cus_name;
		this.accno=accno;
		this.balance=balance;
	}
	
//	Display Method
	public void displaySavingsAccount() {
		System.out.println("Customer Name: "+this.cus_name);
		System.out.println("Account Number: "+this.accno);
		System.out.println("Available Balance: "+this.balance);
		super.displayBank();
		System.out.println("==================");
	}
}
