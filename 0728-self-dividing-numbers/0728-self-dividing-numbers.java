class Solution {
      static boolean isdivisible(int c){
        int b=c;
            while(b>0){
                int digit=b%10;
                if(digit==0){
                    return false;
                }
                else if(c%digit!=0){
                    return false;
                }
                b/=10;
            }
            return true;
    }
    public List<Integer> selfDividingNumbers(int left, int right) {
        ArrayList<Integer> arr=new ArrayList<>();
        for(int i=left;i<right+1;i++){
            if(isdivisible(i)){
                arr.add(i);
            }
        }
        return arr;
    }
}