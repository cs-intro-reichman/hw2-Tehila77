// Demonstrates the Collatz conjecture.
public class Collatz {
	public static void main(String args[]) {
		int seed = Integer.parseInt(args[0]);
		String vORc = args[1];
		boolean print = vORc.equals("v");

		for (int i = 1; i <= seed; i++) {
			int count = 2;
			int number = i;
			if (print) {
				System.out.print(number + " ");
			}
			if (number % 2 == 0) {
				number = number / 2;
			} else {
				number = number * 3 + 1;
			}
			if (print) {
				System.out.print(number + " ");
			}
			while (number != 1) {
				count++;
				if (number % 2 == 0) {
					number = number / 2;
				} else {
					number = number * 3 + 1;
				}
				if (print) {
					System.out.print(number + " ");
				}
			}
			if (print) {
				System.out.println("(" + count + ")");
			}

    	}
	System.out.println("Every one of the first "+seed+" hailstone sequences reached 1.");
	}
}