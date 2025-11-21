import java.util.*;
class Solution {
    public static int[] twoSum(int[] nums, int target) {
        for (int i=0;i<nums.length-1;i++){
            for (int j=i+1;j<nums.length;j++){
                if(nums[j]==target-nums[i]){
return new int[] {i,j};
                }
            }
        }
        return new int[] {};
    }
//hjddscjdv
    public static void main(String []args){
        Scanner s = new Scanner(System.in);
        String[] input= s.nextLine().trim().split(" ");
        int[] nums = new int[input.length];
        for (int i=0;i<input.length;i++){
            nums[i] = Integer.parseInt(input[i]);
        }
        int target=s.nextInt();
        int[] res = twoSum(nums, target);
        System.out.println("[" + res[0] + ", " + res[1] + "]");
    }
}
