学习笔记

树或图 遍历搜索

深度优先搜索 递归

//Java
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> allResults = new ArrayList<>();
        if(root==null){
            return allResults;
        }
        travel(root,0,allResults);
        return allResults;
    }


    private void travel(TreeNode root,int level,List<List<Integer>> results){
        if(results.size()==level){
            results.add(new ArrayList<>());
        }
        results.get(level).add(root.val);
        if(root.left!=null){
            travel(root.left,level+1,results);
        }
        if(root.right!=null){
            travel(root.right,level+1,results);
        }
    }

广度优先搜索

//Java
	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int x) {
			val = x;
		}
	}

	public List<List<Integer>> levelOrder(TreeNode root) {
		List<List<Integer>> allResults = new ArrayList<>();
		if (root == null) {
			return allResults;
		}
		Queue<TreeNode> nodes = new LinkedList<>();
		nodes.add(root);
		while (!nodes.isEmpty()) {
			int size = nodes.size();
			List<Integer> results = new ArrayList<>();
			for (int i = 0; i < size; i++) {
				TreeNode node = nodes.poll();
				results.add(node.val);
				if (node.left != null) {
					nodes.add(node.left);
				}
				if (node.right != null) {
					nodes.add(node.right);
				}
			}
			allResults.add(results);
		}
		return allResults;
	}
	

贪心算法 每一步选择当下最优解且不会回退

解决一些最优化问题


二分查找
1.目标函数单调性
2.存在上下界
3.通过索引查找

// Java
public int binarySearch(int[] array, int target) {
    int left = 0, right = array.length - 1, mid;
    while (left <= right) {
        mid = (right - left) / 2 + left;

        if (array[mid] == target) {
            return mid;
        } else if (array[mid] > target) {
            right = mid - 1;
        } else {
            left = mid + 1;
        }
    }

    return -1;
}


使用二分查找，寻找一个半有序数组 [4, 5, 6, 7, 0, 1, 2] 中间无序的地方

首先取mid = (right - left) / 2 + left，比较arr[mid - 1]与arr[mid + 1],如果有序则分别左右二分取mid,直至找到无序mid