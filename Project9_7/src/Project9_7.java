import java.text.NumberFormat;

public class Project9_7 {

	public static void main(String[] args)
	{

		Account Account = new Account(1122, 20000);
		
		//set annual interest rate as well as withdraw and deposit amounts
		Account.setAnnualInterestRate(4.5);
		Account.withdraw(2500);
		Account.deposit(3000);
		
		
		//Display balance, monthly interest and account creation date.
		System.out.println("Your current blance is: " + 
				NumberFormat.getCurrencyInstance().format(Account.getBalance()));
		System.out.println("Your monthly interest was: " + NumberFormat.getCurrencyInstance().format(Account.getMonthlyInterest()));
		System.out.println("Account created on: " +
				Account.getDateCreated());
	}
}
