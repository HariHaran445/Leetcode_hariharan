class Solution {
    public int minDeletionSize(String[] strs) {
        int rowcount=strs.length;
        int collen=strs[0].length();
        int delcount=0;
        for(int col=0;col<collen;col++){
            for(int row=0;row<rowcount-1;row++){
                if(strs[row].charAt(col)>strs[row+1].charAt(col)){  
                delcount++;
                break;
                }
            }      
        }
        return delcount;
    }
}