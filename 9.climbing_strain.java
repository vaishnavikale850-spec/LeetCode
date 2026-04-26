class Solution {
	public static void main(String[]args){
		int n = 2;
		int op = climbStairs(n);
		System.out.println(op);
	}
    public static int climbStairs(int n) {
        int a = 0;
        int b = 1;
        int c = 1;
        for(int i = 1; i<=n ;i++){
            a = b;
            b = c;
            c = a + b;
        }
        return b;
    }
}