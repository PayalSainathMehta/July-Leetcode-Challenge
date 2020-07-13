import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SubsetsWithDuplicates {
	
	
	
	
	void backtrack(List<List<Integer>> result, List<Integer> temp, int[] nums, int start) {
		Arrays.sort(nums);   // because of duplicates
		result.add(new ArrayList<>(temp));
		for(int i = start; i < nums.length; i++) {
			if(i >  start && nums[i] == nums[i - 1]) continue;  // extra check for duplicates
			temp.add(nums[i]);
			backtrack(result, temp, nums, i + 1);
			temp.remove(temp.size() - 1);
		}
	}
	
	
	 public List<List<Integer>> subsetsWithDup(int[] nums) {
		 
		 	List<List<Integer>> result = new ArrayList<>();
		 	backtrack(result, new ArrayList<>(), nums, 0);
		 	return result;
	        
	  }
	 
	public static void main(String[] args) {
		int[] nums = {1,2,2};
		SubsetsWithDuplicates obj = new SubsetsWithDuplicates();
		System.out.println(obj.subsetsWithDup(nums).toString());
	}

}
