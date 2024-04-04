package application;



public class bankImplementation implements BankInterface {
	 
   BankApp bankapp=new BankApp();
	public void validatedTransactionAmount(double transactionAmount) {
		
		
	}

	public void validateWidrawalAmount(double transactionAmount) {
		if(transactionAmount>bankapp.getAvailableBal()) {
			System.out.println("Your balance is low for the amount you want to withdraw");
		}else {
			System.out.println("You have successfull withdraw"+transactionAmount);
		}
		
	}

	public double newBalanceDeposit(double transactionAmout) {
		double availableBal=bankapp.getAvailableBal();
		return availableBal+transactionAmout;
	}
	public void setNewBalanceDeposit(double transactionAmout) {
		bankapp.setAvailableBal(bankapp.availableBal+transactionAmout);
		
		
	}
	public double newBalanceWithdrawal(double transactionAmout) {
		double availableBal=bankapp.getAvailableBal();
		return availableBal-transactionAmout;
	}
	public void setNewBalanceWithdraw(double transactionAmout) {
		bankapp.setAvailableBal(bankapp.availableBal-transactionAmout);
		
		
	}
	

	public double newBalanceWithdrawalcents(double transactionAmout) {
		double fractionalPart=transactionAmout % 1;
		return  fractionalPart-bankapp.centsBal;
	}

	public double newBalanceDepositcents(double transactionAmout) {
		double fractionalPart=transactionAmout % 1;
		return  fractionalPart+bankapp.centsBal;
	}
	public void validateLogout() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public double transferToCents(double transactionAmout) {
		double CentsBal=bankapp.getCentsBal();
		return CentsBal+transactionAmout;
	}
	public void  setNewBaltransToCents(double transactionAmout) {
		bankapp.setCentsBal(bankapp.getCentsBal()-transactionAmout);
		
	}

	
	public double transferToMain(double transactionAmout) {
		double availableBal=bankapp.getAvailableBal();
		
		return availableBal+transactionAmout;
	}
	public void setNewBaltransToMain(double transactionAmout) {
		
		bankapp.setAvailableBal(bankapp.getAvailableBal()-transactionAmout);
		
		
		
	}

	

	

}



