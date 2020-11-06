package Calculator;

public class FDAccount extends Account{
	double interestRate,amount;
	
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public int getAgeOfACHolder() {
		return ageOfACHolder;
	}
	public void setAgeOfACHolder(int ageOfACHolder) {
		this.ageOfACHolder = ageOfACHolder;
	}
	int noOfDays,ageOfACHolder;
	public int getNoOfDays() {
		return noOfDays;
	}
	public void setNoOfDays(int noOfDays) {
		this.noOfDays = noOfDays;
	}
	@Override
	double calculateInterest() {
		// TODO Auto-generated method stub
		
		return 0;
	}

}
