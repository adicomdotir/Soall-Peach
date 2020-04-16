import java.util.*;
import java.io.*;
import java.util.stream.*;
import java.nio.file.Paths;
import java.nio.file.Files;

public class Main {
	public static void main(String[] args) {
		
		try {
			Stream<String> lines = Files.lines(Paths.get(args[0]));
			OutputStream out = new BufferedOutputStream ( System.out );
			lines.forEach(l -> {
				try {
					out.write((isPrime(Integer.parseInt(l)) + "\n").getBytes());
				} catch(IOException e) {
					e.printStackTrace();
				} 
			});
			out.flush();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

	private static int isPrime(int num) {
        if (num <= 3) return 1;
		if (num % 2 == 0) return 0;
		if (num % 3 == 0) return 0;
		int max = (int) Math.sqrt(num) + 1;
		for (int i = 5; i <= max; i += 2) {
		    if (num % i == 0) {
			return 0;
		    }
		}
		return 1;
	}
}
