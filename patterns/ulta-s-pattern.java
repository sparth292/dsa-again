class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> list = new ArrayList<Integer>();
        int count = 0;
        for(int i = 0 ; i < matrix.length ; i++){
            if(i == 0 || i%2==0){
                for(int j = 0 ; j < matrix[i].length ; j++){
                    list.add(matrix[i][j]);
                }
            }
            else{
                for(int j = (matrix[i].length - 1) ; j >= 0 ; --j){
                    list.add(matrix[i][j]);
                }
            }
        }
        return list;
    }
}
