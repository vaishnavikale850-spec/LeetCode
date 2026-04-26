class Solution {
	public static void main(String[]args){
		int[] nums = {10,20,30,40,0,20,30};
		int op = Solution.singleNumber(nums);
		System.out.print(op);
	}
    public static int singleNumber(int[] nums) {
        int op = 0;
        for(int i = 0; i<nums.length; i++){
		int cnt = 0;
		  for(int j = 0; j<nums.length; j++){
			if(nums[i] == nums[j]){
				cnt++;
			}
		}
		if(cnt == 1){
			op = nums[i];
		}
	}
	return op;
    }
}