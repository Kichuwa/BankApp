package account;

public class Account {
	
	//Account is the base class.
	//The savings and checking classes are extensions of this class.
	
	
	/*
	 * For nextAvail:
	 * A class member that can be used to supply account numbers
	 * for new accounts. Every time a new account is constructed,
	 * the value of this variable is used as the account number
	 * of the new account and then the value of this variable is
	 * incremented to identify the next available account number.
	 */
	
	private static int nextAvailableAcctNumber = 0;
	protected double bal; //Account Balance
	protected int number; //Account Number
	
	//Constructors
	public Account(double bal){
		this.bal = bal;
		this.number = nextAvailableAcctNumber;
		nextAvailableAcctNumber++;
	}

	public Account(){
		this(0);
		this.number = nextAvailableAcctNumber;
		nextAvailableAcctNumber++;
	}
	
	public Account(Account acct){
		this.bal = acct.bal;
		this.number = acct.number;
	}
	
	//Methods
	
	//Deposit method
	public void deposit(double amt) {
		if(amt > 0) {
			bal += amt;
			System.out.println(String.format("%s $%.2f", "You have Deposited:" , amt));
		}else 
			System.out.println("Invalid Deposit");
	}
	
	
	//Account output
	public String toString() {
		return String.format("%s %d %n" 
				+ "%s $%.2f %n",
				"Account Number:", number
				,"Balance:", bal);
	}
	
	
	//Account equality checker
	public boolean equals(Account thisAccount) {
		if(number == thisAccount.number) {
			return true;
		} else 
			return false;
	}
	
	
	//Balance number getter
	public double getBal() {
		return bal;
	}
	
	
	//Account Number getter
	public int getAcctNumber() {
		return number;
	}
	
	
}

