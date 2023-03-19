package Inheritance;

public class Bank {
	String bname;
	String ifsc;
	int pin;
	
//	Constructor
	Bank(){}
	Bank(String bname, String ifsc, int pin){
		this.bname=bname;
		this.ifsc=ifsc;
		this.pin=pin;
	}
	
//	Display Method
	public void displayBank() {
		System.out.println("Bank Name: "+this.bname);
		System.out.println("IFSC Code: "+this.ifsc);
		System.out.println("Branch PinCode: "+this.pin);
	}
}
