package oops;

import java.util.Scanner;


public class Mainclass {

	public static void main(String[] args) {
		Atmoperation op= new AtmoperationImple();
		int atmnumber=1012;
		int atmpin=5355;
		double principal;
		double rate;
		double time;
		Scanner sc = new Scanner (System.in);
		System.out.println("Welcome to ATM Machine ");
		System.out.println("Enter ATM number : ");
		int atmNumber=sc.nextInt();
		System.out.println("Enter Pin number : ");
		int atmPin=sc.nextInt();
		if(atmnumber==atmNumber && atmpin==atmPin) {
		System.out.println("Validation Done");
		while(true) {
		 System.out.println(" ");
		System.out.println("Choose 1: View Available Balance");
		System.out.println("Choose 2: Withraw Amount");
		System.out.println("Choose 3: Deposite the Amount");
		System.out.println("Choose 4: Interest Calculator");
		System.out.println("Choose 5: Exit");
		System.out.println("Enter Your Choice:");
		int choice=sc.nextInt();
		if(choice==1)
		{
		 op.viewBalance(); 
		}
		else if(choice==2)
		{ 
		System.out.println("Enter amount to withdraw :"); 
		double withdraw=sc.nextDouble(); 
		op.withrawAmount(withdraw);
		}
		 
		else if(choice==3) 
		{
		System.out.println("Enter Amount to deposite :");
		double depositamt= sc.nextDouble();
		op.depositAmount(depositamt);
		}
		else if(choice==4)
		{
		op.principal();
		op.rate();
		op.time();
		op.calculateInterest();
		}
		else if(choice==5) {
		System.out.println("Please Collect Your ATM card");
		System.out.println("Thank You");
		System.exit(0);
		
		}
		
		else
		{
		System.out.println("Please enter correct ATM Pin and Number ");
		} 
     
		}
		}
	}
}
		
	

