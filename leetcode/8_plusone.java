class Solution {
    public int[] plusOne(int[] digits) {
        if(digits[digits.length-1] != 9){
            digits[digits.length-1] += 1;
            return digits;
        }

        if(isAllNine(digits)){
            int[] revisedArray = new int[digits.length + 1];
            revisedArray[0] = 1;
            return revisedArray;
        }
        
        boolean add = true;
        for(int i = digits.length-1 ; i >= 0 ; --i){
            
            if(digits[i] == 9){
                digits[i] = 0;
                add = true;
            } 
            else{
                digits[i]++;
                add = false;
                break;
            }
            
        }
        
        return digits;
   }

   static boolean isAllNine(int[] nums){
        int chk = nums.length;
        int nineCounter = 0;
        for(int i = 0 ; i < nums.length ; i++){
            if(nums[i] == 9) nineCounter++;
        }
        if(chk == nineCounter) return true;
        return false;
   }
}
