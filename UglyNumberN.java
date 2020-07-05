
class Ugly{
	 public int[] nums = new int[1690];
	Ugly(){
		int ugly, i2 = 0, i3 = 0, i5 = 0;
		nums[0] = 1;
		
		for(int i = 1; i < 1690; i++) {
			ugly = Math.min(Math.min(nums[i2] * 2, nums[i3] * 3),nums[i5] * 5);
			nums[i] = ugly;
			if(ugly == nums[i2] * 2) ++i2;
			if(ugly == nums[i3] * 3) ++i3;
			if(ugly == nums[i5] * 5) ++i5;

		}
		
		
	}
}
public class UglyNumberN {
	public static Ugly u = new Ugly();

		public int nthUglyNumber(int n) {
				return u.nums[n-1];
		}
	
			public static void main(String[] args) {
				int n = 10;
				UglyNumberN obj = new UglyNumberN();
				System.out.println(obj.nthUglyNumber(n));
			}
}
