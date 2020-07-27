import java.util.ArrayList;
import java.util.Collections;
import java.util.List;



class TreeNode{
	int val;
	TreeNode left;
	TreeNode right;
	public TreeNode(int val){
		this.val = val;
	}
}


public class ReverseLevelOrderTraversal {
	    List<List<Integer>> levels = new ArrayList<>();
	    public List<List<Integer>> levelOrderBottom(TreeNode root) {
	        if(root == null) return levels;
	        helper(root, 0);
	        Collections.reverse(levels);
	        return levels;
	    }
	    
	    
	    public void helper(TreeNode node, int level){
	        if(levels.size() == level)
	            levels.add(new ArrayList<Integer>());
	        
	        levels.get(level).add(node.val);
	        if(node.left != null)
	            helper(node.left, level + 1);
	        if(node.right != null)
	            helper(node.right, level + 1);
	    }
	
}
