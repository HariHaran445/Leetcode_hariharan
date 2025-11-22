class Solution {
    public boolean isSubsequence(String s, String t) {
        // Handle edge case where s is empty (an empty string is always a subsequence)
        if (s.length() == 0) {
            return true;
        }

        // Pointer for the short string s (what we are looking for)
        int s_pointer = 0; 
        
        // Iterate through the long string t
        for (int t_pointer = 0; t_pointer < t.length(); t_pointer++) {
            
            // Check if we are still looking for characters in s
            if (s_pointer < s.length()) {
                
                // If the characters match, advance the s_pointer to look for the next character
                if (s.charAt(s_pointer) == t.charAt(t_pointer)) {
                    s_pointer++; 
                }
            }
        }
        
        // If s_pointer reached the end of s's length, all characters were found in order.
        return s_pointer == s.length();
    }
}