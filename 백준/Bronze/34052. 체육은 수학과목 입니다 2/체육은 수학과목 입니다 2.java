import java.io.*;
import java.util.*;

public class Main {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int sum = 0;
		for (int i = 0; i < 4; i++) {
			sum += Integer.parseInt(br.readLine());
		}
		sum += 300;

		if(sum <= 1800){
			System.out.println("Yes");
		}
		else{
			System.out.println("No");
		}
	}
}
