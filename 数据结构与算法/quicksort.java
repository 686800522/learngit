package xxh;
import java.util.*;
public class reverse {
	public static List<Integer> reverse(int[] data) {
		List<Integer> list = new ArrayList<>();
		for(int x:data) {
			list.add(x);
		}
		Collections.reverse(list);
		return list;
	}
	public static void main(String[] args) {
		int[] data1 = {1,2,3};
		int n = 2;
		
	}
}
