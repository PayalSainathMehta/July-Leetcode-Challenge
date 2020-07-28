
public class TaskScheduler {
	
	public static int scheduleTasks(char[] tasks, int n) {
		int max = 0;
		int maxCount = 0;
		int[] counter = new int[26];
		for(char task: tasks) {
			counter[task - 'A']++;
			if(max == counter[task - 'A'])
				maxCount++;
			else if(max < counter[task - 'A']) {
				max = counter[task - 'A'];
				maxCount = 1;
			}
		}
		//first we make a count array which stores count of all chars and
		//max is highest frequency - here 3
		//and maxCount is how many chars has this hf - here 2
		//we then calculate chunks after placing the one with hf
		
		//so A_ _A _ _A  
		int chunks = max - 1; //2 parts or chunks    
		int partLength = n - (maxCount - 1); 
		int emptySlots = chunks * partLength; //if only one char with hf then this is simply
		// chunks * n where maxCount = 1 (only 1 char with hf)
		int availableTasks = tasks.length - max * maxCount;
		//this is total tasks - the places already occupied with hf ones
		int idles = Math.max(0,  emptySlots - availableTasks);
		//simply the max of remaining or 0
		
		return tasks.length + idles;
	}
	
	public static void main(String[] args) {
		char[] tasks = {'A','B','A','B','A','B'};
		int n = 2;
		System.out.println(scheduleTasks(tasks, n));
	}
}
