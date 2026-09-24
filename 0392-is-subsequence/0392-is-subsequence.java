class Solution {
    public boolean isSubsequence(String s, String t) {
        int curr = 0;
        boolean isFound = false;
        for(int i = 0 ; i < s.length() ; i++){ 
            int j = curr;
            while(j!=t.length()){
                if(s.charAt(i) == t.charAt(j)){
                    isFound = true;
                    curr = j;
                    break;
                }
                else{
                    j++;  
                } 
            }
             
            if(!isFound) return false;
            else isFound = false;
        }
        return true;
    }
}