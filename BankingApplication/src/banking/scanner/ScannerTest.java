package banking.scanner;

import java.util.Scanner;

public class ScannerTest {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter a char: ");
		//int a=scanner.nextInt();
		char c=scanner.next().charAt(0);
		System.out.println("value :"+c);

	}

}
