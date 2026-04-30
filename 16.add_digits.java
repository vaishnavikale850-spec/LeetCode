import java.util.*;
class Solution {
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter n : ");
		int num = sc.nextInt();
		int ans = addDigits(num);
		System.out.print("Output: "+ ans);
	}

    public static int addDigits(int num){
        while(num>9){
            int sum = 0;
            while(num>0){
                sum += num%10;
                num/=10;
            }
            num = sum;
        }
        return num;  
    }
}