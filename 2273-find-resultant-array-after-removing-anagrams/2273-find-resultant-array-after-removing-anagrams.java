class Solution {
    public List<String> removeAnagrams(String[] words) {
        ArrayList<String> list=new ArrayList<>();
        if(words.length>0){
            list.add(words[0]);
        }
        for(int i=1;i<words.length;i++){
String curr=words[i];
String lastres=list.get(list.size()-1);
if(!areanagram(curr,lastres)){
    list.add(curr);
}
        }
        return list;
        }
        static boolean areanagram(String s1,String s2){
            if(s1.length()!=s2.length()){
                return false;
            }
            char[] c1=s1.toCharArray();
            char[] c2=s2.toCharArray();
            Arrays.sort(c1);
            Arrays.sort(c2);
            return Arrays.equals(c1,c2);
        }

    }
