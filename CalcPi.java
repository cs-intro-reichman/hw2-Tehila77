// Computes an approximation of PI.
public class CalcPi {
	public static void main(String[] args) {
		int number = Integer.parseInt(args[0]);
		double sum = 1;
		for (int i = 2; i <= number; i++) {
			if (i % 2 == 0)
			{
				sum = sum - ((double) 1 / ((2 * i) - 1));
			}else{
				sum = sum + ((double) 1 / ((2 * i) - 1));
			}
		}
		System.out.println("pi according to Java: " + Math.PI);
		System.out.println("pi, approximated:     " + (double) (sum * 4));
	}
}
