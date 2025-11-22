class Solution {
    public boolean isSubsequence(String s, String t) {
        if (s.length() == 0) {
            return true;
        }
        int s_pointer = 0; 
        for (int t_pointer = 0; t_pointer < t.length(); t_pointer++) {
            if (s_pointer < s.length()) {
                if (s.charAt(s_pointer) == t.charAt(t_pointer)) {
                    s_pointer++; 
                }
            }
        }
        return s_pointer == s.length();
    }
}