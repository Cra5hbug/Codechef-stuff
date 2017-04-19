import java.math.BigInteger;
import java.util.Scanner;


class factorial2 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int lines = sc.nextInt();
		BigInteger[] temp = new BigInteger[101];
		temp[0] = BigInteger.ONE;
		for (int i = 1; i < 101; i++){
			temp[i] = new BigInteger(Long.toString(i));
			temp[i] = temp[i-1].multiply(temp[i]);
		}
		for (int j = 0; j < lines; j++) {
			int foo = sc.nextInt();
			System.out.println(temp[foo]);
		}
	}

}
