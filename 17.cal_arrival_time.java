import java.util.*;
class Solution {
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Arrival Time : ");
		int arrivalTime = sc.nextInt();
		System.out.print("Enter Delayed Time : ");
		int delayedTime = sc.nextInt();
		sint op = findDelayedArrivalTime(arrivalTime, delayedTime);
		System.out.print("Output : "+ op);
	}
    public static int findDelayedArrivalTime(int arrivalTime, int delayedTime) {
        int op = 0;
        int digit = arrivalTime + delayedTime;
        if(digit >= 24){
            return digit%24;
        }
        else{
            return digit;
        }

    }
}