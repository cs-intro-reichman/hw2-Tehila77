// Computes an approximation of PI.
public class CalcPi {
	public static void main(String [] args) { 
	    int number=Integer.parseInt(args[0]);
		double sum=0;
		for(int i=0;i<number;i++){
         if(i&2==0) sum=+(1/i); 
         else sum= sum-(1/i); 
		}
		System.out.println((Math.PI(sum)));

		
	}
}
