package oops;

import java.util.Scanner;

public class AtmoperationImple implements Atmoperation {

	ATMmachine atm= new ATMmachine();
	private double time;
	private double rate;
	private double principal;
	Scanner scc= new Scanner(System.in);
	@Override
	public void viewBalance() {
	System.out.println("Available Balance is :"+atm.getBalance());
	}
	@Override
	public void withrawAmount(double withrawAmount) {
	if(withrawAmount<=atm.getBalance())
	{
	System.out.println("Collect the cash"+withrawAmount);
	atm.setBalance(atm.getBalance()-withrawAmount);
	viewBalance();
	}
	else
	{
	System.out.println("----Insufficent Balance----");
	} }
	@Override
	public void depositAmount(double depositAmount) {
	System.out.println("----Amount Successfully Deposited----");
	atm.setBalance(atm.getBalance()+depositAmount);
	viewBalance();
	}
	@Override
	public double principal() {
	System.out.println("Enter your Principal :");
	 principal= scc.nextDouble();
	 atm.setPrincipal( atm.getPrincipal());
	return principal; }
	@Override
	public double rate() {
	 System.out.println("Enter your Interest rate :");
	 rate= scc.nextDouble();
	 atm.setRate(atm.getRate());
	return rate; }
	@Override
	public double time() {
	System.out.println("Enter your Time :");
	time= scc.nextInt();
	atm.setTime(atm.getTime());
	return time; }
	@Override
	public double calculateInterest() {
	double interest = (principal*rate*time) / 100;
	atm.setCalculateInterest(atm.getCalculateInterest()+interest);
	System.out.println("Your Interest rate is:"+atm.getCalculateInterest());
	return interest;
	 
	} 
}

