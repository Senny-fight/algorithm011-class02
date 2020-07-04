class Solution {
    List ans = new ArrayList<Integer>();
    public List<Integer> preorder(Node root) {
        if(root==null) return ans;
        ans.add(root.val);
        for(Node node : root.children){
            preorder(node);
        }
        return ans;
    }
}