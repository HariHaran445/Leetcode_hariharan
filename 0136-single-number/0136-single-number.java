class Solution {
    public int singleNumber(int[] nums) {
        int arr[]=new int[nums.length];
        int result=0;
        for(int i=0;i<nums.length;i++){
            int count=0;
            for(int j=0;j<nums.length;j++){
                if(nums[i]==nums[j]){
                    count++;
                }
            }
            arr[i]=count;
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]==1){
                result=nums[i];
            }
        }
        return result;
        // int result = 0;
        // for (int num : nums) {
        //     result = result ^ num;
        // }
        // return result;
    }
}