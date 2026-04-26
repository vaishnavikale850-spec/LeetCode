class Solution{
	public static void main(String[]args){
		int a = sumOfTheDigitsOfHarshadNumber(18);
		System.out.println(a);
	}

    public static int sumOfTheDigitsOfHarshadNumber(int x) {
        int num = x;
        int n = x;
        int sum = 0;
        int op = -1;
        while(n>0){
            sum = sum+n%10;
            n/=10;
        }
        if(num % sum == 0){
            op = sum;
        }
        return op;
        
    }
}