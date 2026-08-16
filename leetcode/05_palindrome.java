class Solution {
    public boolean isPalindrome(int x) {
        if(x < 0) return false;
        int temp = 0;
        int cmp = x;
        while(x!=0){
            temp = (temp*10) + (x%10);
            x/=10;
        }
        return (cmp==temp);
    }
}
