import java.util.LinkedList;

import javafx.util.Pair;

public class WidthOfBinaryTree {
	 public int widthOfBinaryTree(TreeNode root) {
	        if(root == null) return 0;
	        int maxWidth = 0;
	        LinkedList<Pair<TreeNode, Integer>> queue = new LinkedList<>();
	        queue.addLast(new Pair<>(root,0));
	        while(queue.size() > 0){
	            int currLevel = queue.size();
	            Pair<TreeNode,Integer> head = queue.getFirst();
	            Pair<TreeNode,Integer> elem = null;
	            for(int i = 0; i < currLevel; i++){
	                elem = queue.removeFirst();
	                TreeNode node = elem.getKey();
	                if(node.left != null)
	                    queue.addLast(new Pair<>(node.left, elem.getValue() * 2));
	                if(node.right != null)
	                    queue.addLast(new Pair<>(node.right, elem.getValue() * 2 + 1));
	     
	            }
	            maxWidth = Math.max(maxWidth, elem.getValue() - head.getValue() + 1);
	        }
	        
	        
	        return maxWidth;

}
}
