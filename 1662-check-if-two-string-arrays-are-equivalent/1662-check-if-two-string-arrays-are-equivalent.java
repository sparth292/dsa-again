class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String string_1 = "";
        String string_2 = "";

        for(String s1 : word1){
            string_1 += s1;
        }
        for(String s2 : word2){
            string_2 += s2;
        }

        return string_1.equals(string_2);
    }
}