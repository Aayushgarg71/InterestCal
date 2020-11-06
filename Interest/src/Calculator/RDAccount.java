package Calculator;

import java.util.Scanner;

public class RDAccount extends Account{
	double interestRate,amount,monthlyAmount;
	public void setMonthlyAmount(double monthlyAmount) {
		this.monthlyAmount = monthlyAmount;
	}


	int noOfDays;
	
	
	public void setNoOfDays(int noOfDays) {
		this.noOfDays = noOfDays;
	}


	double calculateInterest() {
		// TODO Auto-generated method stub
		
		switch(noOfDays) {
		case 6:
			interestRate=7.50;
			break;
		case 9:
			interestRate=7.75;
			break;
		case 12:
			interestRate=8.00;
			break;
		case 15:
			interestRate=7.50;
			break;
		case 18:
			interestRate=7.50;
			break;
		case 21:
			interestRate=7.50;
			break;
		}
		double rate= interestRate/12;
		for(int i=0;i<noOfDays;i++) {
			amount=(((monthlyAmount+amount)*rate)/100)+amount+monthlyAmount;
			System.out.format("%.2f\n",amount);
		}
		return 0;
	}
	public static void main(String args[]) {
		RDAccount r=new RDAccount();
		Scanner sc = new Scanner(System.in);
		r.setMonthlyAmount(sc.nextDouble());
		r.setNoOfDays(sc.nextInt());
		r.calculateInterest();
	}
}
