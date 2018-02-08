package Unit4;

public class SavingsAccount 
{

	private double balance;
	private double interestRate;

	   public SavingsAccount()
	   {   
	      balance = 0;
	      interestRate = 10;
	   }

	   public SavingsAccount(double initialBalance, double rate)
	   {   
	      balance = initialBalance;
	      interestRate = 10;
	   }

	   
	   public void deposit(double amount)
	   {  
	      double newBalance = balance + amount;
	      balance = newBalance;
	   }

	   
	   public void withdraw(double amount)
	   {   
	      double newBalance = balance - amount;
	      balance = newBalance;
	   }

	   
	   public double getBalance()
	   {   
	      return balance;
	   }

	   
	   public void addInterest()
	   {
		   balance = balance + (balance * interestRate) / 100;
	   }
	   
	   
	}