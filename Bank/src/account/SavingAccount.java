package account;

public class SavingAccount extends Account{
	
	protected double rate; //Account interest rate
	
	
	
	//Constructors for a savings account
	public SavingAccount(double bal, double rate){
		super(bal);
		this.rate = rate;
	}
	
	public SavingAccount(double bal){
		this(bal, 0.05);
		
	}
	
	public SavingAccount(){
		this(1000, 0.05);
	}
	
	public SavingAccount(SavingAccount acct){
		 super(acct);
		 rate = acct.rate;
	}
	
	//Methods Area
	public double compund() {
		double interest;
		interest = (bal * rate);
		bal += interest;
		System.out.println(String.format("%s $%.2f",
				"Interest earned:",interest));
		return interest;
	}
	
	public double withd(double amt) {
		if(amt < bal) {
			bal -= amt;
		}
		System.out.println(String.format("%s $%.2f", "You have withdrawn:", amt));
		return amt;
	}
	
	
	public String toString() {
		double rateAsPercent = (rate * 100);
		return super.toString() +
				String.format("%s %.2f%s",
						"Interest Rate:" , rateAsPercent ,"%");
	}
	
	
	
	public double getRate() {
		return rate;
	}
	
}
