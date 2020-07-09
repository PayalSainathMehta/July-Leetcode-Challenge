import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {
		public List<List<Integer>> threeSum(int[] nums) {
			List<List<Integer>> result = new ArrayList<>();
			Arrays.sort(nums);
			for(int i = 0; i < nums.length; i++) {
				int left = i + 1;
			    int right = nums.length  - 1;
			    while(left < right) {
			    	int sum  = nums[i] + nums[left] + nums[right];
			    	if(sum == 0) {
			    		List<Integer> tmp = new ArrayList<>();
			    		tmp.add(nums[i]);  tmp.add(nums[left]); tmp.add(nums[right]);
			    		result.add(tmp);
			    		int leftVal =  nums[left]; int rightVal =  nums[right];
			    		while(left < nums.length && nums[left] == leftVal) left++;
			    		while(right > left && nums[right] == rightVal) right--;
			    	}
			    	else if(sum < 0) left++;
			    	else right --;
			    }
			    
			    while(i + 1 < nums.length && nums[i] == nums[i + 1]) i++;
			}
			
			
			
			return result;
		}
		
		
		public static void main(String[] args) {
				int[] nums =  {-1, 0, 1, 2, -1, -4};
				ThreeSum obj = new ThreeSum();
				System.out.println(obj.threeSum(nums).toString());
		}
}
