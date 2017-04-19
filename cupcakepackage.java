import java.util.Scanner;

class cupcakepackage {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tests = sc.nextInt();
		int temp;
		for (int i = 0; i < tests; ++i) {
			temp = sc.nextInt();
			if (temp <= 2) 
				System.out.println(temp);
			else
				System.out.println((int) temp/2 + 1);
		}

	}

}
