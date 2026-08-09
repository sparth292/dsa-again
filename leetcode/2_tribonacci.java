class Solution {
    public int tribonacci(int n) {
// T0 = 0
// T1 = 1
// T2 = 1
// T3 = 0 + 1 + 1 = 2
// T4 = 1 + 1 + 2 = 4
// T5 = 1 + 2 + 4 = 7

        int a = 0;
        int b = 1;
        int c = 1;
        int count = 3;
        if(n == 0){
            return 0;
        }
        if(n == 1 || n == 2){
            return 1;
        }
        while(count <= n){
             int temp = c;
             c += a + b;
             a = b;
             b = temp;
             count++;
        }
        return c;
    }
}
