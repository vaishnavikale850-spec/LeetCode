class Solution {
	public static vaoid main(String[]args){
		int n = 19;
		boolean op = isHappy(n);
		System.out.print(op);
	}
	public static boolean isHappy(int num) {
		boolean happy = false;
			while(n != 1){
				while(num > 0){
					int last_D = num%10;
					int sum += last_D * last_D;
					num/= 10;
				}
				if(sum == 1){
					return true;
				}
				n = sum;
				}
				
					 
    }
}