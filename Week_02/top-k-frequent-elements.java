class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        PriorityQueue<Map.Entry<Integer, Integer>> maxheap = new PriorityQueue<>((a,b) -> b.getValue() - a.getValue());
        int[] result = new int[k];
        for(int i = 0; i < nums.length; i++){
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }
        for(Map.Entry<Integer, Integer> m : map.entrySet()){
            maxheap.offer(m);
        }
        for(int i = 0; i < k; i++){
            result[i] = maxheap.poll().getKey();
        }

        return result;
    }
}