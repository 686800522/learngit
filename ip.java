package xxh;
import java.util.*;
public class ip {
	public int sep(int[] data) {
		Arrays.sort(data);
		int len = data.length;
		int i = 0;
		int j = len-1;
		int sum = 0;
		while(i<j) {
			if(data[i]+data[j] == 20) {
				sum++;
				i++;
				j--;
			}
			if(data[i]+data[j] > 20) {
				j--;
			}
			if(data[i]+data[j] < 20) {
				i++;
			}
		}
		System.out.println(sum);
		return sum;
			
		}
	
	public static void main(String[] args) {
		int[] data = {1,7,17,2,6,3,14};
		ip p = new ip();
		p.sep(data);
}
}
