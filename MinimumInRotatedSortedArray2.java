
public class MinimumInRotatedSortedArray2 {
		
	public static int findMin(int[] nums) {
		int low = 0, high = nums.length - 1;
		while(low < high) {
			int pivot = low + (high - low) / 2;
			if(nums[pivot] < nums[high])
				high = pivot;
			else if(nums[pivot] > nums[high])
				low = pivot + 1;
			else
				high = high - 1; // this is because there can be duplicates
		}
		return nums[low];
	}
	
	public static void main(String[] args) {
		int[] nums = {2,2,2,0,1};
		System.out.println(findMin(nums));
	}
}
