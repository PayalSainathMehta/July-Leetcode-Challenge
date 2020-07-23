import java.util.Arrays;

public class SingleNumber3 {

	
	public static int[] getSingleNumbers(int[] nums) {
		int bitmask = 0;
		for(int num: nums)
			bitmask = bitmask ^ num;
		int diff = bitmask & (-bitmask);
		int x = 0;
		for(int num: nums) {
			if((num & diff) != 0)
				x = x ^ num;
		}
		
		return new int[] {x, bitmask ^ x};
	}
	
	public static void main(String[] args) {
		int[] nums = {1,2,1,2,3,4};
		System.out.println(Arrays.toString(getSingleNumbers(nums)));
	}
}
