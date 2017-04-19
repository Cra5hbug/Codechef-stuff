import java.util.*;
import java.lang.*;
import java.io.*;

class factorial {

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int lines = sc.nextInt();
		int temp;
		for (int i = 0; i < lines; ++i) {
			int count = 0;
			temp = sc.nextInt();
			while (temp/5 != 0) {
				count += Math.floor(temp/5);
				temp = temp/5;
			}
			System.out.println(count);
		}

	}

}
