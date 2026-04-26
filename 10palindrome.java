class Solution {
	public static void main(String[]args){
		int n = 121;
		boolean op = isPalindrome(n);
		System.out.println(op);
	}

    public static boolean isPalindrome(int x) {
        int n = x;
        int num = x;
        int rev = 0;
        boolean isPal = false;
        while(num > 0){
            rev = rev * 10 + num % 10;
            num/=10;
        }
        if(n == rev){
            isPal = true;
        }
        return isPal;
    }
}