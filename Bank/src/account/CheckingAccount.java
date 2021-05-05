package account;

public class CheckingAccount extends Account{
	protected double limit;
	protected double charge;

	
	public CheckingAccount(double bal, double limit, double charge){
		super(bal);
		this.limit = limit;
		this.charge = charge;
	}
	
	public CheckingAccount(double bal){
		this(bal, 1000.00, 2.0);
	}
	
	public CheckingAccount(){
		this(1000, 1000, 2.0);
	}
	
	public CheckingAccount(CheckingAccount acct){
		super(acct);
		limit = acct.limit;
		charge = acct.charge;
	}
	
	
	//Methods 
	
	public double withd(double amt) {
		if(amt < bal) {
			bal -= amt;
			if(bal < limit) {
				bal -= charge;
				System.out.println(String.format("%s $%.2f","You have incurred a charge of",  charge));
			}
			System.out.println(String.format("%s $%.2f", "You have withdrawn:", amt));
		}
		return amt;
	}
	
	
	
	//Note to self:
	//Add disclaimer of charge potential and minimum balance to avoid charges before
	//limit and charge.
	public String toString() {
		if(bal < limit) {
		return super.toString() + 
				String.format("%s $%.2f %n"
						+"%s $%.2f %n",  
						"You have a balance below the minimum balance limit of", this.limit,
						"For each withdrawal while under the limit you will be charged:", this.charge);
		}else 
			return super.toString();
	}
	
	public double getLimit() {
		return limit;
	}
	
	public double getCharge() {
		return charge;
	}
	
	
	
}
