public class Tribonacci {
	public static void main (String[] args) {
		int n = 3;
		int fn = 0;
		int fnMinus1 = 1;
		int fnMinus2 = 1;
		int fnMinus3 = 2;
		int nMax = 20;
		int sum = fnMinus1 + fnMinus2 + fnMinus3;
		double average;

		System.out.println("The first " + nMax + "Tribonacci numbers are: ");
		System.out.print(fnMinus1 + " " + fnMinus2 + " " + fnMinus3 + " ");
		
		while (n <= nMax) {
		 
		fn = fnMinus1 + fnMinus2 + fnMinus3;
		 System.out.print(fn + " ");
		 ++n;
		 fnMinus3 = fnMinus2;
		 fnMinus2 = fnMinus1;
		 fnMinus1 = fn;
		
		 sum += fn;
		}
		average = (double)sum / nMax;
		System.out.println();
		System.out.println("Average is " + average);
	}
}