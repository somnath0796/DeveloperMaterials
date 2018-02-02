package exceptions;



public class Account {
	
	private double balance;
	public Account (double minBalance) {
		this.balance = minBalance;
		
	}
	
	public double deposit(double amount){
		this.balance = this.balance + amount;
		return this.balance;
	}
}
