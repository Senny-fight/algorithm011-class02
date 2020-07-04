class Solution {
    List ans = new ArrayList<Integer>();
    public List<Integer> preorderTraversal(TreeNode root) {
        if(root == null) return ans;
        else{
            ans.add(root.val);
            preorderTraversal(root.left);
            preorderTraversal(root.right);
        }
    return ans;
    }
}