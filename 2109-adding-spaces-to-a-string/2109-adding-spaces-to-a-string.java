class Solution {
    public String addSpaces(String s, int[] spaces) {
        StringBuilder str=new StringBuilder();
        int n=0;
        for(int i=0;i<s.length();i++){
            if(n<spaces.length && i==spaces[n]){
                str.append(" ");
                n++;
            }
str.append(s.charAt(i));
        }
        return str.toString();
    }
}