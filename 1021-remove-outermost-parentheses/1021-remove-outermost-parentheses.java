class Solution {
    public String removeOuterParentheses(String s) {
        int depth = 0;
        int mark = 0;
        String ans = "";
        for(int i = 0; i < s.length(); i++) {

            if(s.charAt(i) == '(') {
                depth++;

                if(depth > 1) {
                    ans += "(";
                }
            }
            else {
                if(depth > 1) {
                    ans += ")";
                }

                depth--;
            }
        }
        return ans;
    }
}

