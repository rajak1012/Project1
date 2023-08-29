package oops;

public class ATMmachine {

		private double balance;
		private double depositeamount;
		private double withrawamt;
		private double principal;
		private double Interestrate;
		private double time;
		private double calculateInterest;
		 
		 
		 
		public double getPrincipal() {
		return principal; }
		 public void setPrincipal(double principal) {
		this.principal = principal; }
		public double getTime() {
		return time; }
		public void setTime(double time) {
		this.time = time; }
		public ATMmachine() {
		}
		public double getRate() {
		 return Interestrate;
		 }
		 public void setRate(double rate) {
		 this.Interestrate = rate;
		 }
		 public double getBalance() {
		return balance;
		 }
		 public void setBalance(double balance) {
		this.balance = balance;
		 }
		 public double getDepositeamount() {
		return depositeamount;
		 }
		 public void setDepositeamount(double depositeamount) 
		{
		this.depositeamount = depositeamount;
		 }
		 public double getWithrawamt() {
		return withrawamt;
		 }
		 public void setWithrawamt(double withrawamt) {
		this.withrawamt = withrawamt;
		 }
		 public double getCalculateInterest() {
		return calculateInterest;
		 }
		 public void setCalculateInterest(double
		calculateInterest) {
		this.calculateInterest = calculateInterest; 
		}
	}
		

