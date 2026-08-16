class Solution {
    public int reverse(int x) {
        boolean minuschk = true;
        int answer = 0;
        long tempanswer = 0;
        
        if(x<0){
            minuschk = false;
            x*=(-1);
        } 
        while(x!=0){
            tempanswer = (tempanswer * 10) + (x%10);
            x/=10;
        }
        if(tempanswer>Integer.MAX_VALUE || tempanswer<Integer.MIN_VALUE) return 0;
        
        if(minuschk){
            return (int)tempanswer;
        }
        else{
            return (int)(tempanswer*(-1));
        }
        
    }
}
