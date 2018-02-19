import java.util.Random;
import java.util.Scanner;
class RandomStringGenerator {
	private int nrChars;
	private String alphabet;

	RandomStringGenerator(int nr, String inputString) {
		this.nrChars = nr;
		this.alphabet = inputString;
	}

	String next() {
		char[] charAlphabet = this.alphabet.toCharArray();
		Random generator = new Random();
		char[] output = new char[nrChars];
		int randRes;
		for(int i = 0; i < this.nrChars; i++) {
			randRes = generator.nextInt(this.nrChars);
			output[i] = charAlphabet[randRes];
		}

		String stringRes = new String(output);
		return stringRes;
	}

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		int n = reader.nextInt();
		String s = reader.next();
		reader.close();

		RandomStringGenerator r = new RandomStringGenerator(n, s);
		System.out.println(r.next())];
	}
}
