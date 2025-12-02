class Solution {
    public boolean isHappy(int n) {
        HashSet<Integer> set=new HashSet<>();
        int current=n;
        while(current!=1 && !set.contains(current)){
    set.add(current);
        int b=current;
        int total=0;
        while(0<b){
          int   digit=b%10;
            int c=digit*digit;
            total+=c;
            b/=10;
        }
        current=total;
        }
        return current==1;
    }
}