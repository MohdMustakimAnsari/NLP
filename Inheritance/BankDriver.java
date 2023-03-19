package Inheritance;

public class BankDriver {
	public static void main(String[] args) {
		Bank bank=new Bank("ICICI BANK", "ICICI2036B6",271001);
		bank.displayBank();
		
		
		SavingsAccount savingsAccount=new SavingsAccount("SBI BANK", "SBIN0014612",271001,"Saad Ansari",203236466,96548530);
		savingsAccount.displaySavingsAccount();
	}
}
