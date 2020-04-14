import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) {
		Main obj = new Main();
		Scanner sc = null;
		try {
			sc = new Scanner(new File(args[0]));
		}
		catch(Exception ex) {}

		StringBuilder sb = new StringBuilder();
		while(sc.hasNext()) {
			String num = sc.nextLine();
			sb.append(obj.isPrime(Integer.parseInt(num)));
			sb.append("\n");
		}
		sb.setLength(sb.length() - 1);

		System.out.println(sb.toString());
	}

	private int isPrime(int num) {
        if (num <= 3) return 1;
		int max = Math.ceil(Math.sqrt(num));
        for (int i = 2; i <= max; i++) {
            if (num % i == 0) {
                return 0;
            }
        }
        return 1;
    }
}
