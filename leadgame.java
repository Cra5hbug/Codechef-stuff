import java.util.Scanner;

class leadgame {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int rounds = sc.nextInt();
		int maxLeadsi = 0, maxLeadti = 0, si=0, ti=0;
		for (int i = 0; i < rounds; ++i) {
			si += sc.nextInt();
			ti += sc.nextInt();
			maxLeadsi = Math.max(si - ti, maxLeadsi);
			maxLeadti = Math.max(ti - si, maxLeadti);
		}
		if (maxLeadsi > maxLeadti) 
			System.out.println("1 " + maxLeadsi);
		else	
			System.out.println("2 " + maxLeadti);
	}

}
