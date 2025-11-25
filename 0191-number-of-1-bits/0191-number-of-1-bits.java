class Solution {
    public int hammingWeight(int n) {
        StringBuilder sb=new StringBuilder();
        int temp=n;
        while(temp>0){
            int rem=temp%2;
            sb.insert(0,rem);
            temp=temp/2;
        }
        int count=0;
        for(int i=0;i<sb.length();i++){
            if(sb.charAt(i)=='1'){
                count++;
            }
        }
        return count;
    }
}