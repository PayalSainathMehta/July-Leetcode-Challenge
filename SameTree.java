
class TreeNode1 {
	 	int val;
	 	TreeNode1 left;
	 	TreeNode1 right;
	 	TreeNode1() {}
	 	TreeNode1(int val) { this.val = val; }
	 	TreeNode1(int val, TreeNode1 left, TreeNode1 right) {
	 		this.val = val;
	 		this.left = left;
	 		this.right = right;
	 	}
	}

 
public class SameTree {
    public boolean isSameTree(TreeNode1 p, TreeNode1 q) {
        if(p == null && q == null) return true;
        if(p == null || q == null) return false;
        if(p.val != q.val) return false;
        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }
}