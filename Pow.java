
public class Pow {
	
	 public static double myPow(double x, int n) {
		 double ans = 1;
		 double cp = x;
		 
		 long N = n;
		 if( N < 0) {
			 x = 1 / x;
			 N = -N;
		 }
		 
		 for(long i = N; i > 0; i /= 2) {
			 if(i % 2  == 1)
				 ans = ans  * cp;
			 cp = cp * cp;
		 }
		 
		 return ans;
	 }
	
	public static void main(String[] args) {
		int n = 10;
		double x = 2.00000;
		System.out.println(myPow(x, n));
	}
}
