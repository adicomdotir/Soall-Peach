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
		if (num % 2 == 0) return 0;
		int max = (int) Math.sqrt(num) + 1;
        for (int i = 3; i <= max; i+=2) {
            if (num % i == 0) {
                return 0;
            }
        }
        return 1;
    }
}
