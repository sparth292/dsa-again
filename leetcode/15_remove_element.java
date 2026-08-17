class Solution {
    public int removeElement(int[] nums, int val) {
        int end = nums.length-1;
        for(int i = 0 ; i <= end ; i++){
            while(end>=0 && nums[end]==val){
                end--;
                
            }    
            if(i > end) break;
            if(nums[i] == val){
                swapArr(nums, i , end);
                end--;
            }
        }
        
        return end+1;
    }
    
    static void swapArr(int[] arr , int a , int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
