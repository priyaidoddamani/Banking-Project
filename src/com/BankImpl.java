package com;

class BankImpl implements Bank{
	int balance;
	BankImpl(int balance)
	{
		this.balance=balance;	
	}
	@Override
	public void deposite(int amount)
	{
		System.out.println("depositing rs."+amount);
		balance=balance+amount;				//balance +=amount;
		System.out.println("amount deposited sucessfully");
	}
	public void withdraw(int amount)
	{
		if(amount<=balance)
		{
			System.out.println("withdrawing rs."+amount);
			balance=balance-amount;			//balance -=amount;
			System.out.println("amount withdrawn sucessfully");
		}
		else
		{
			try {
				throw new InsufficientBalnaceException("Insufficient Funds");
			}
			catch(Exception e)
			{
				System.out.println(e.getMessage());
			}
		}
	}
	@Override
	public int checkBalanace() {
		return balance;
	}

}
