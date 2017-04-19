/* package codechef; // don't place package name! */
import java.util.*;
import java.lang.*;
import java.io.*;

class codechef {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int nums = Integer.parseInt(st.nextToken());
		int divisor = Integer.parseInt(st.nextToken());
		int foo;
		int count = 0;
		if (nums < 10000000 && divisor < 10000000){
			for (int i = 0; i < nums; ++i) {
				foo = Integer.parseInt(br.readLine());
				if (foo % divisor == 0 && foo < 1000000000)
					count++;
		}
		}
		System.out.println(count);
	}

}
