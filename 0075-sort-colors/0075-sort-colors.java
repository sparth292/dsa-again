class Solution {
    public void sortColors(int[] nums) {
        int start = 0;
        int current = 0;
        int end = nums.length - 1;
        // took me an hour to solve this
        while(current <= end) {
            if(nums[current] == 0) {
                int temp = nums[current];
                nums[current] = nums[start];
                nums[start] = temp;
                start++;
                current++;
            }
            else if(nums[current] == 1) {
                current++;
            }
            else {
                int temp = nums[current];
                nums[current] = nums[end];
                nums[end] = temp;
                end--;
            }
        }
    }
}
