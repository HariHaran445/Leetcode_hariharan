class Solution {
    public int divide(int dividend, int divisor) {
        int b=0;
        if(dividend== -2147483648 && divisor==-1){
b=2147483647;
        }
        else
        b= dividend/divisor;
        return b;
    }
}