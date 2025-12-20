class Solution {
    public int[] sortArray(int[] nums) {
             int n=nums.length;
       sort(nums,0,n-1); 
       return nums;
    }
       public static void sort(int[] arr, int l, int r) {
        if (l < r) {
            int m = l + (r - l) / 2;
            sort(arr, l, m);
            sort(arr, m + 1, r);
            merge(arr, l, m, r);
        }
    }

    private static void merge(int[] arr, int l, int m, int r) {
        int n1 = m - l + 1;
        int n2 = r - m;
        int L[] = new int[n1];
        int R[] = new int[n2];

        for (int i = 0; i < n1; ++i) L[i] = arr[l + i];
        for (int j = 0; j < n2; ++j) R[j] = arr[m + 1 + j];

        int i = 0, j = 0, k = l;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) arr[k++] = L[i++];
            else arr[k++] = R[j++];
        }
        while (i < n1) arr[k++] = L[i++];
        while (j < n2) arr[k++] = R[j++];
    }
    //     int n=nums.length;
    //   sort(nums,0,n-1);
    //  return nums;
    // }
    // static void sort(int[] nums,int low,int high){
    //     if(low<high){
    //     int pivot=pivots(nums,low,high);
    //     sort(nums,low,pivot-1);
    //     sort(nums,pivot+1,high);
    //     }
    // }
    // static int pivots(int[] nums,int low,int high){
    //     int pivot=nums[low];
    //     int i=low;
    //     int j=high;
    //     while(i<j){
    //         while(i<=high && nums[i]<=pivot){
    //             i++;
    //         }
    //         while(j>=low && nums[j]>pivot){
    //             j--;
    //         }
    //         if(i<j){
    //         int temp=nums[i];
    //         nums[i]=nums[j];
    //         nums[j]=temp;
    //         }
    //     }
    // int temp=nums[j];
    // nums[j]=pivot;;
    // nums[low]=temp;
    // return j;
    
}