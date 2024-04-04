package application;

public interface BankInterface {
	
		public void validatedTransactionAmount(double transactionAmount);
		public void validateWidrawalAmount(double transactionAmount);
		public double newBalanceDeposit(double transactionAmout);
		public double newBalanceWithdrawal(double transactionAmout);
		public double newBalanceWithdrawalcents(double transactionAmout);
		public double newBalanceDepositcents(double transactionAmout);
		public double transferToCents(double transactionAmout);
		public double transferToMain(double transactionAmout);
		
		
		public void validateLogout();
	}

