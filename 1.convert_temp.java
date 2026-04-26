import java.util.*;
class Solution {
	public static void main(String[]args){
		double [] temp = convertTemperature(36.50);
		System.out.println(Arrays.toString(temp));
	}

    public static double[] convertTemperature(double celsius) {
        double cel = celsius;
        double kel = cel+273.15;
        double fah = cel * 1.80 + 32.00;
        double ans[] = new double[2];
        ans[0] = kel;
        ans[1] = fah;
        return ans;
        
    }
}