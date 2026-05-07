class Solution {
	public static void main(String[]args){
		int arr[] = {-2,1,-3,4,-1,2,1,-5,4};
		int op = maxSubArray(arr);
		System.out.println(op);
	}

    public  static int maxSubArray(int[] nums) {
        int max = Integer.MIN_VALUE;
        int curr = 0;
        for(int i = 0; i<nums.length; i++){
            curr += nums[i];
            max = Math.max(max,curr);
            if(curr<0){
                curr = 0;
            }
        }
        return max;
    }
}