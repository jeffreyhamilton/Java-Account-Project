import java.util.Date;

public class Account {
	//data fields
	int id = 0;
	double balance = 0, annualInterestRate = 0;
	Date dateCreated = new Date();
	//nor-arg constructor for default account
	Account()
	{
	
	}
	//constructor for account w/ id and balance specified
	Account(int newId, double newBalance)
	{
		id = newId;
		balance = newBalance;
	}
	//accessor and mutator methods for id, balance and annualInterestRate
	public void setId(int I) 
	{
		id = I;
	}
	
	public int getId()
	{
		return id;
	}
	
	public void setBalance(double b)
	{
		balance = b;
	}
	
	public double getBalance()
	{
	return balance;
	}
	
	public void setAnnualInterestRate(double newAnnualInterestRate)
	{
		annualInterestRate = newAnnualInterestRate / 100;
	}
	
	public double getAnnualInterestRate()
	{
	return annualInterestRate;	
	}
	//accessor method for dateCreated
	public Date getDateCreated()
	{
		return dateCreated;
	}
	//method for monthlyInterestRate
	public double getMonthlyInterestRate()
	{
		
		return annualInterestRate / 12;
		 
	}
	//method for the monthlyInterestRate
	public double getMonthlyInterest()
	{
		return balance * (annualInterestRate / 12);
	}
	//method for withdraw
	public double withdraw(double w)
	{
		return balance = balance - w;
	}
	//method for deposit
	public double deposit(double d)
	{
		return balance = balance + d;
	}
	
	
}
