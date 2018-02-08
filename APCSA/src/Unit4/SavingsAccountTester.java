package Unit4;

public class SavingsAccountTester 
{  
	   public static void main(String[] args)
	   {  
		   SavingsAccount sAccount = new SavingsAccount(1000, 10);

	        sAccount.addInterest();

	        System.out.printf("Current balance: $%,.2f%n", sAccount.getBalance());

	        System.out.println("Expected balance: $1,100.00");
	   }
	}
