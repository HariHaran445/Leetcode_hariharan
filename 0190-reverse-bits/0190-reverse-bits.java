class Solution {
    public int reverseBits(int n) {
        int temp=n;
        StringBuilder str=new StringBuilder();
        for(int i=31;i>=0;i--){
            long mask=1L<<i;
            if((n&mask)!=0){
                str.append('1');
            }
            else{
                str.append('0');
            }
        }
        StringBuilder str1=new StringBuilder();
        for(int i=str.length()-1;i>=0;i--){
            str1.append(str.charAt(i));
        }

        int number=0;
        int power=1;
        for(int i=str1.length()-1;i>=0;i--){
            char c=str1.charAt(i);
            int re=c-'0';
            if(re==1){
                number=number+power;
            }
            power=power*2;
        }
        return number;
    }
}