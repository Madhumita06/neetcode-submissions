class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        for(int i=0;i<matrix.length;i++){
            if(target >= matrix[i][0] && target <= matrix[i][matrix[i].length-1]){
                return binarySearch(matrix,i,target);
            }
        }
        return false;
    }

    private boolean binarySearch(int[][] matrix, int row, int target){
        int start =0;
        int end = matrix[row].length-1;
        while(start<=end){
            int mid = start + (end-start)/2;
            if(matrix[row][mid] == target ){
                    return true;
            }
            else if(matrix[row][mid]<target){
                start = mid+1;
            }
             else{
            end = mid-1;
             }
        }

        return false;
    }
}
