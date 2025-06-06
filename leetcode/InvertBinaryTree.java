package leetcode;


public class InvertBinaryTree {
    public static void main(String[] args) {

        TreeNode node1 = new TreeNode(1);
        TreeNode node3 = new TreeNode(3);

        TreeNode root = new TreeNode(2, node1, node3);

        System.out.println(invertTree(root));

    }

    static TreeNode invertTree(TreeNode root){

        if(root == null){
            return null;
        }

        invertTree(root.left);
        invertTree(root.right);

        TreeNode temp;

        temp = root.right;
        root.right = root.left;
        root.left= temp;

        return root;
    }

}
