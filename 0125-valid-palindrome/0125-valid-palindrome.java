class Solution {
    public boolean isPalindrome(String s) {
        s=s.toLowerCase();
         StringBuilder a=new StringBuilder();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)>='a'&&s.charAt(i)<='z' || s.charAt(i)>='0'&&s.charAt(i)<='9'){
            a.append(s.charAt(i));
            }
        }
        StringBuilder b=new StringBuilder();
        for(int i=a.length()-1;i>=0;i--){
            b.append(a.charAt(i));
        }

        return a.toString().equals(b.toString());
    }
}