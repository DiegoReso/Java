package leetcode;

public class SameTree {
    public static void main(String[] args) {

        TreeNode node1 = new TreeNode(1);
        TreeNode node3 = new TreeNode(1);

        TreeNode root = new TreeNode(2, node1, node3);

        System.out.println(isSameTree(node3, node1));

    }

    static boolean isSameTree(TreeNode p, TreeNode q){

        if(p == null && q == null){
            return true;
        }

        if(p == null || q == null || p.val != q.val){
            return false;
        }

        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);

    }
}
