import java.util.*;
class Solution {
	public static void main(String[]args){
		char[] s = {'h','e','l','l','o'};
		String op = reverseString(s);
		System.out.println(op);
	}

	public static String reverseString(char[] s) {
        	int left = 0;
        	int right = s.length-1;
        	while(left<right){
            		char temp = s[left];
            		s[left] = s[right];
            		s[right] = temp;
            		right--;
            		left++;
		}
		return Arrays.toString(s);
        }
}