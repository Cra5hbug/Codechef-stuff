import java.util.*;
import java.lang.*;
import java.io.*;
class ATM {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int withdraw = sc.nextInt();
		double balance = sc.nextDouble();
		double temp = withdraw + 0.50;
		if (withdraw % 5 == 0 && temp < balance) {
			balance -= (withdraw + 0.50);
		}
		System.out.println(String.format("%.2f", balance));
	}

}
