import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;

public class CourseSchedule2 {
	public static int[] findOrder(int numCourses, int[][] prerequisites) {
        int topOrder[] = new int[numCourses];
        int indegree[] = new int[numCourses];
        Map<Integer, List<Integer>> adjList = new HashMap<>();
        for(int i = 0; i < prerequisites.length; i++){
            int src = prerequisites[i][1];
            int dst = prerequisites[i][0];
            List<Integer> lst = adjList.getOrDefault(src, new ArrayList<Integer>());
            lst.add(dst);
            adjList.put(src, lst);
            
            indegree[dst] += 1;
        }
        
        Queue<Integer> q = new LinkedList<>();
        for(int i = 0; i < numCourses; i++){
            if(indegree[i] == 0)
                q.add(i);
        }
        
        int i = 0;
        while(!q.isEmpty()){
            int node = q.remove();
            topOrder[i++] = node;
            if(adjList.containsKey(node)){
                for(Integer neighbor: adjList.get(node)){
                    indegree[neighbor]--;
                    if(indegree[neighbor] == 0)
                        q.add(neighbor);
                }            
            }
        }
        if(i == numCourses)
            return topOrder;
        return new int[0];
    }
	
	
	 public static void main(String[] args) {
		 	int numCourses = 2;
		 	int[][] prereqs = {{1,0}};
		 	System.out.println(Arrays.toString(findOrder(numCourses, prereqs)));
	}
}
