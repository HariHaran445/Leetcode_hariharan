class Solution {
    public static boolean isPalindrome(int x) {
        int n=x;
        int sum=0;
        if(x<0){
            return false;
        }//
        while(x!=0){
            int digit=x%10;
            sum=sum*10+digit;
            x=x/10;
        }
    if(sum==n){
        return true;
    }
    else{
        return false;
    }
    }
    public static void main(String []args){
        Scanner s=new Scanner(System.in);
        int a= s.nextInt();
        System.out.print(isPalindrome(a));
    }
}