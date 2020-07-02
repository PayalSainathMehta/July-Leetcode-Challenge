
public class ArrangingCoins {
	
	public int arrangeCoins(int n) {
        int result = (int) (Math.sqrt(2 * (long) n  + 0.25) - 0.5);
        return result;
    }
			public static void main(String[] args) {
				int n = 5;
				ArrangingCoins obj = new ArrangingCoins();
				System.out.println(obj.arrangeCoins(n));
			}
}
