package exception;


class InsufficientAmount extends Exception
{
	
}

class Bank
{
	double balance;
	
	public void getBalance()
	{
		System.out.println("Current balance is : "+balance);
	}
	
	public void deposite(double amt)
	{
		balance = balance+amt;
	}
	
	public void withdrow(double amt) throws InsufficientAmount
	{
		if(amt>balance)
		{
			throw new InsufficientAmount();
		}
		else
		{
			balance = balance-amt;
		}
	}
}

public class E003_CustomeException {
	public static void main(String[] args) {
		
		Bank b = new Bank();
		b.getBalance();
		b.deposite(5000);
		b.deposite(4000);
		b.getBalance();
		try {
			b.withdrow(15000);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		b.getBalance();
	}
}
