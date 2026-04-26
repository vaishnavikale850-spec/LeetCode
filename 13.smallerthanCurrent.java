import java.util.*;
class Solution{
	public static void main(String[]args){
		int[] num = {8,1,2,2,3};
		int [] op = smallerNumbersThanCurrent(num);
		System.out.println(Arrays.toString(op));
	}

    public static int[] smallerNumbersThanCurrent(int[] nums) {
        int [] op = new int[nums.length];
        for(int i = 0; i<nums.length; i++){
            int count = 0;
            for(int j= 0; j<nums.length; j++){
                if(nums[i]>nums[j]){
                    count++;
                }
            }
            op[i] = count;
        }
        return op;
    }
}
