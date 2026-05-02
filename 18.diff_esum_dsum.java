class Solution {
	public static void main(String[]args){
		int nums[] = {1,2,3,4};
		int op = differenceOfSum(nums);
		System.out.println(op);
	}

    public static int differenceOfSum(int[] nums) {
        int elementsum = 0;
        int digitsum = 0;
        for(int i = 0; i<nums.length; i++){
            elementsum += nums[i];
            int n = nums[i];
            while(n>0){
                digitsum += n%10;
                n/=10;
            }
        }  
        if(digitsum > elementsum){
            return digitsum-elementsum;
        } 
        else{
            return elementsum - digitsum;
        } 
    }
}