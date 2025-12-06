class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        if(n==0){
            return true;
        }
        int i=0;
        while(i<flowerbed.length){
            if(flowerbed[i]==0){
                boolean isleftempty=(i==0)||(flowerbed[i-1]==0);
                boolean isrightempty=(i==flowerbed.length-1)||(flowerbed[i+1]==0);
                if(isleftempty && isrightempty){
                    flowerbed[i]=1;
                    n=n-1;
                    if(n==0){
                        return true;
                    }
                    i++;
                }
                }
            i++;
        }
        return n==0;
    }
}