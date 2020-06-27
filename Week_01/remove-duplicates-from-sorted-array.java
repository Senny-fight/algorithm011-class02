class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;
        int i = 0;
        for(int j = 0; j < nums.length - 1; j++){
            if(nums[i] != nums[j+1]){
                i++;
                nums[i] = nums[j+1];
            }
        }
        return i + 1;
     }
}