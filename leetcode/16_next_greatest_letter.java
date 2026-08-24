class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        // Linear Approach

        /*
        for(int i = 0 ; i < letters.length ; i++){
            if(letters[i] > target) return letters[i];
        }
        return letters[0];
        */

        //Binary Approach
     
        int start = 0;
        int end = letters.length-1;
        // if(nums[start] == target) return 0; 
        // if(nums[end] == target) return end;
        while(start<=end){
            int mid = start+(end-start)/2;
            
            if(letters[mid]>target){
                end = mid - 1;
            }
            else{
                start = mid + 1;
            }
        }
        return letters[start%letters.length];
}
}
