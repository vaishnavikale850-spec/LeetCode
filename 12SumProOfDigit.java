class Solution {
	public static void main(String[]args){
		int num = subtractProductAndSum(234);
		System.out.println(num);
	}
    public static int subtractProductAndSum(int n) {
        int sum = 0;
        int multi = 1;
        int num = n;
        while(num > 0){
            int number = num % 10;
            sum += number;
            multi *= number;
            num/=10;
        }
        return multi - sum;
    }
}