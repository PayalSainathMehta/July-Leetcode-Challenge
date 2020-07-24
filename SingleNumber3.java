import java.util.Arrays;

public class SingleNumber3 {

	
	public static int[] getSingleNumbers(int[] nums) {
		int bitmask = 0;
		for(int num: nums)
			bitmask = bitmask ^ num; // this gives 6 because 3 ^ 5 - separate the numbers appearing odd number of times
		int diff = bitmask & (-bitmask); //this gives 2 - index of rightmost 1 
		int x = 0; //now we are going to separate numbers which have 1 set at 2nd bit.
		for(int num: nums) { // 2nd bit= 1-> 2, 2, 3 // 2nd bit= 0 -> 1,1,5 
			if((num & diff) != 0)
				x = x ^ num; //x = 3
		}
		
		return new int[] {x, bitmask ^ x}; //simply get y by bitmask ^ x; as x^y = bitmask
	}
	
	public static void main(String[] args) {
		int[] nums = {1,2,1,2,3,5};
		System.out.println(Arrays.toString(getSingleNumbers(nums)));
	}
}
