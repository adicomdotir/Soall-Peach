import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) {
		try {
			String line = null;
			FileReader in = new FileReader(new File(args[0]));
			BufferedReader br = new BufferedReader(in);

			OutputStream out = new BufferedOutputStream ( System.out );

			while ((line = br.readLine()) != null) {
				out.write((isPrime(Integer.parseInt(line)) + "\n").getBytes());
			}
			out.flush();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

	private static int isPrime(int num) {
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
