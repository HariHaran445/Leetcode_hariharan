class Solution {
    public int countOdds(int low, int high) {
       int n=high-low+1;
       if(n%2==0){
        return n/2;
       }
       else{
        if(low%2!=0){
            return (n/2)+1;
        }
        else{
            return n/2;
        }
       }
    }
}
               ///or
// int countUpToHigh = (high + 1) / 2;
//         int countBeforeLow = low / 2;
//         return countUpToHigh - countBeforeLow;
//         }}