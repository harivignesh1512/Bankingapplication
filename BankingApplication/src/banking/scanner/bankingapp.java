package banking.scanner;
import java.util.Scanner;
public class bankingapp {

	public static void main(String[] args) {
		account obj=new account("xyz","BAD001");
		obj.showmenu();

	}

}
class account{
	int balance;
	int prevtransaction;
	String name;
	String id;
	
	account(String cname,String cid){           //constructor
		name=cname;
		id=cid;
	}
	
	void deposit(int amount)
	{
		if(amount !=0) {
			balance=balance+amount;
			prevtransaction=amount;
		}
	}
	void withdraw(int amount) {
		if(amount !=0) {
			balance=balance-amount;
			prevtransaction= -amount;
		}
	}
	void getprevtransaction() {
		if(prevtransaction >0)
		{
			System.out.println("Deposited: "+prevtransaction);
		}
		else if(prevtransaction <0) {
			System.out.println("Withdrawn: "+Math.abs(prevtransaction));
		}
		else {
			System.out.println("No transaction");
		}
	}
	void showmenu() {
		char option='\0';
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Welcome "+name);
		System.out.println("Your ID: "+id);
		System.out.println("\n");
		System.out.println("A. Check Balance");
		System.out.println("B. Deposit");
		System.out.println("C. Withdraw");
		System.out.println("D. Prev Transaction");
		System.out.println("E. Exit");
		
		do {
			System.out.println("------------------------------------------------");
			System.out.println("Enter an option");
			System.out.println("--------------------------------------------------");
			option=scanner.next().charAt(0);
			System.out.println("\n");
			
			switch(option) {
			
			case 'A':
				System.out.println("-----------------------------------------------");
				System.out.println("Balance: "+balance);
				System.out.println("------------------------------------------------");
				System.out.println("\n");
				break;
				
			case 'B':
				System.out.println("-----------------------------------------------");
				System.out.println("Enter an amount to deposit: ");
				System.out.println("-----------------------------------------------");
				int amount=scanner.nextInt();
				deposit(amount);
				System.out.println("\n");
				break;
				
			case 'C':
				System.out.println("-----------------------------------------------");
				System.out.println("Enter an amount to withdraw: ");
				System.out.println("-----------------------------------------------");
				int amount2=scanner.nextInt();
				deposit(amount2);
				System.out.println("\n");
				break;
				
			case 'D':
				System.out.println("-----------------------------------------------");
				getprevtransaction();
				System.out.println("-----------------------------------------------");
				System.out.println("\n");
				break;
				
			case 'E':
				System.out.println("--------------------------------------------------");
				break;
				
				default:
					System.out.println("Invalid option");
					break;
			
			}
			
		}
		while(option !='E');
		System.out.println("ThankYou");
	
	}
}
