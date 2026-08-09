class Solution {
    public int climbStairs(int n) {
        int a = 1;
        int b = 2;
        int count = 2;
        if(n == 1) return 1;
        if(n == 2) return 2;
        while(count < n){
            int temp = b;
            b += a;
            a = temp;
            count++;
        }
        return b;
    }
}
