class Solution {

    int maxSum = Integer.MIN_VALUE;

    public int maxPathSum(TreeNode root) {
        findMax(root);
        return maxSum;
    }

    private int findMax(TreeNode node) {
        if (node == null) {
            return 0;
        }

        int left = Math.max(0, findMax(node.left));
        int right = Math.max(0, findMax(node.right));

        maxSum = Math.max(maxSum, left + right + node.val);

        return node.val + Math.max(left, right);
    }
}
        
