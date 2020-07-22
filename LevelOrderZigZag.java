import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;


class TreeNode2{
	int val;
 	TreeNode2 left;
 	TreeNode2 right;
 	TreeNode2() {}
 	TreeNode2(int val) { this.val = val; }
 	TreeNode2(int val, TreeNode2 left, TreeNode2 right) {
 		this.val = val;
 		this.left = left;
 		this.right = right;
 	}
}

public class LevelOrderZigZag {
	public List<List<Integer>> zigzagLevelOrder(TreeNode2 root) {
		List<List<Integer>> result = new ArrayList<>();
		if(root == null) return result;
		Queue<TreeNode2> pq = new LinkedList<>();
		pq.offer(root);
		boolean zigzag = false;//this is to ensure the first element is taken as is
		while(!pq.isEmpty()) {  
			List<Integer> level = new ArrayList<>(); //new level
			int size = pq.size(); //take size of queue so you know how many ele to add to current level
			for(int i = 0; i < size; i++) { 
				TreeNode2 current = pq.poll(); 
				if(zigzag) //if its the zigzag level (even) then we add to the end of list
					level.add(0, current.val); //by doing this
				else
					level.add(current.val); //otherwise normal add to list
				if(current.left != null)
					pq.offer(current.left); //keep the game going
				if(current.right != null)
					pq.offer(current.right); //same
			}
			result.add(level); //add current level before beginning new
			zigzag = !zigzag; //this is for alternate zigzag
		}
		return result;
	}
}