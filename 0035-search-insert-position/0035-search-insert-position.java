class Solution {
    public int searchInsert(int[] nums, int target) {
        int b=nums.length;
        for(int i=0;i<nums.length;i++){
            if(target <=nums[i]){
                b= i;
                break;
            }
        }
        return b;
    }
}