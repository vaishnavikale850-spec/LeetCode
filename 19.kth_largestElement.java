import java.util.*;
class Demo{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter n : ");
		int n = sc.nextInt();
		int [] arr = new int[n];
		for(int i = 0; i<arr.length; i++){
			System.out.print("Enter element : ");
			arr[i] = sc.nextInt();
		}
		System.out.print("Enter k : ");
		int k = sc.nextInt();
		int k_max = 0;
		for(int i = 0; i<arr.length-1; i++){
			for(int j = i+1; j<arr.length; j ++){
				if(arr[i] > arr[j]){
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		k_max = arr[arr.length - k];
		System.out.println("k th max : "+ k_max);
	}
}