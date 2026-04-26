class Solution {
	public static void main(String[]args){
		int a = fib(7);
		System.out.println(a);
	}

    public static int fib(int n) {
        int a = 0;
        int b = 1;
        int c = a + b;
        for(int i = 1; i<=n; i++){
            a = b;
            b = c;
            c = a+b;
        }
        return a;
    }
}