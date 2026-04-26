import java.util.*;
class Solution {
	public static void main(String[]args){
		Scanner s = new Scanner(System.in);
		System.out.print("Enter n : ");
		int n = s.nextInt();
		System.out.print("Enter m : ");
		int m = s.nextInt();
		int op = differenceOfSums(n, m);
		System.out.println(op);
	}

    public static int differenceOfSums(int n, int m) {
        int d_sum = 0;
        int n_sum = 0;
        for(int i = 1; i<=n; i++){
            if(i % m == 0){
                d_sum+=i;
            }
            else{
                n_sum+=i;
            }
        }
        return n_sum - d_sum;
        
    }
}