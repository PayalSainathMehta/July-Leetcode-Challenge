import java.util.ArrayList;
import java.util.List;

public class AllPathsFromSourceToTarget {
	
	
	public static List<List<Integer>> allPaths(int[][] graph) {
		List<List<Integer>> res = new ArrayList<>();
		List<Integer> path = new ArrayList<>();
		path.add(0);
		dfs(graph, 0, path, res);
		return res;
	}
	
	public static void dfs(int[][] graph, int currNode, List<Integer> path, List<List<Integer>> res) {
		if(currNode == graph.length - 1) {
			res.add(new ArrayList<>(path));
			return;
		}
		for(int node: graph[currNode]) {
			path.add(node);
			dfs(graph, node, path, res);
			path.remove(path.size() - 1);
		}
	}
	
	public static void main(String[] args) {
		int[][] graph = {{1,2},{3},{3},{}};
		System.out.println(allPaths(graph).toString());
	}
}
