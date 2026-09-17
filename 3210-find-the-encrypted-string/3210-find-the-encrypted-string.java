class Solution {
    public String getEncryptedString(String s, int k) {
        String ans = "";
        //find pivot
        int i = 0;
        int tempK = k;
        while(tempK!=0){
            if(i==s.length()) k = k % s.length();
            else i++;
            --tempK;
        }
        for(int l = k ; l < s.length() ; l++) ans += s.charAt(l);
        for(int j = 0 ; j < k ; j++) ans += s.charAt(j);
        
        return ans;
    }
}