class Solution {
    public void rotate(int[] nums, int k) {
k=k%nums.length;
        int right=0;
        int left =nums.length-1;
ro(nums,right,left);
ro(nums,right,k-1);
ro(nums,k,left);
    }
    public static void ro(int []nums,int r,int l){
        while(r<l){
            int temp=nums[r];
            nums[r]=nums[l];
            nums[l]=temp;
            l--;
            r++;
        }

    }
}