
public class BuySellCooldown {
	
	public static int maximizeProfit(int[] prices) 
	{
		/*
		 * state diagram
		 * s0 (rest or buy), s1 (rest or sell), s2 - only rest as cooldown
		 */
		if(prices.length < 2) return 0;
		int s0 = 0, s1 = -prices[0], s2 = 0;
		for(int i = 1; i < prices.length; i++) {
			int last_s2 = s2;
			s2 = s1 + prices[i];
			s1 = Math.max(s1, s0 - prices[i]);
			s0 = Math.max(s0, last_s2);
		}
		return Math.max(s0, s2);
	}
	
	
	public static void main(String[] args) {
		int[] prices = {1,2,3,0,2};
		System.out.println(maximizeProfit(prices));
	}
}
