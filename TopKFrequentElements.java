import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class TopKFrequentElements {
    public static int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> mp = new HashMap<>();
        for(int i : nums){
            if(mp.containsKey(i))
                mp.put(i, mp.get(i) + 1);
            else
                mp.put(i, 1);
        }
        PriorityQueue<Integer> minHeap = new PriorityQueue<>((n1, n2) -> mp.get(n1) - mp.get(n2));
        int[] result = new int[k];
        for(int key: mp.keySet()){
            minHeap.add(key);
            if(minHeap.size() > k)
                minHeap.poll();
        }
        for(int i = k - 1; i >= 0; i--)
            result[i] = minHeap.poll();
        return result;
        
}
    
    
    public static void main(String[] args) {
		int[] nums = {1,1,1,1,2,2,3};
		int k = 2;
		System.out.println(Arrays.toString(topKFrequent(nums, k)));
	}
}
