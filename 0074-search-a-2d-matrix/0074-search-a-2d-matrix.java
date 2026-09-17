class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
            int start = 0;
            int end = matrix.length - 1;
            while(start<=end){
                int mid = start + (end - start)/2;
                
                if(target >= matrix[mid][0] && target <= matrix[mid][matrix[mid].length - 1]){
                    int tempStart = 0;
                    int tempEnd = matrix[mid].length - 1;
                        while(tempStart <= tempEnd) {

                            int tempMid = tempStart + (tempEnd - tempStart) / 2;

                                if(matrix[mid][tempMid] == target) return true;

                                else if(matrix[mid][tempMid] > target) tempEnd = tempMid - 1;

                                else tempStart = tempMid + 1;
                        }
                        return false;
                }
                else if(target > matrix[mid][matrix[mid].length - 1]){
                    start = mid + 1;
                }
                else{
                    end = mid - 1;
                }
            }    

    return false;
    }

}


    // public boolean searchMatrix(int[][] matrix, int target) {
    //     for(int i = 0 ; i < matrix.length ; i++){
    //         if(binarySearch(matrix[i] , target)) return true;
    //     }
    //     return false;
    // }
    // public boolean binarySearch(int[] nums ,int passedTarget){
    //     int end = nums.length-1;
    //     int start = 0;
    //     for(int i = 0 ; i < nums.length ; i++){
    //         int mid = start + (end-start) / 2;
    //         if(nums[mid]>passedTarget){
    //             end = mid - 1;
    //         }
    //         else if(nums[mid]<passedTarget){
    //             start = mid + 1;
    //         }
    //         else{
    //             return true;
    //         }
    //     }
    //     return false;
    // }