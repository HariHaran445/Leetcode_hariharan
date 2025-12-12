class Solution {
    public int prefixCount(String[] words, String pref) {
        int c=0;
        int a=pref.length();
        for(int i=0;i<words.length;i++){
            if (words[i].length() >= a) {
            if(pref.equals(words[i].substring(0,a))){
                c++;
            }
        }
        }
        return c;
    }
}