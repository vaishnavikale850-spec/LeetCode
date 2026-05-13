class Solution {
	public static void main(String[]args){
		int target = 10;
		int matrix [] []  = {{1,3,5,7},{10,11,16,20},{23,30,34,60}};
		boolean isFound = searchMatrix(matrix, target);
		System.out.print(isFound);
	}
	
    public static boolean searchMatrix(int[][] matrix, int target) {
        boolean isFound = false;
        for(int i = 0; i<matrix.length; i++){
            for(int j = 0; j< matrix[0].length; j++){
                if(matrix[i][j] == target){
                    isFound = true;
                }
            }
        }
        return isFound;
    }
}