class Solution {
    public String reverseVowels(String s) {
        
        char[] word = s.toCharArray();
        int start = 0;
        int end = s.length() - 1;
        String vowels = "aeiouAEIOU";
/*
I WAS LITERATTLY DOING THIS BEFORE WTH !!
word[end] == 'A' || 
word[end] == 'a' || 
word[end] == 'e' || 
word[end] == 'E' || 
word[end] == 'i' || 
word[end] == 'I' || 
word[end] == 'o' || 
word[end] == 'O' || 
word[end] == 'u' || 
word[end] == 'U'
*/
        while(start<end){
            while (start < end && vowels.indexOf(word[start]) == -1) {
                start++;
            }
            
            while (start < end && vowels.indexOf(word[end]) == -1) {
                end--;
            }
            
            char temp = word[start];
            word[start] = word[end];
            word[end] = temp;

            start++;
            end--;
            
            }

            return new String(word);
        }
     
}
