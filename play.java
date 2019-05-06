package xxh;
import java.io.*;
import java.util.*;

public class play {
	Map<Integer,Integer> times = new HashMap<>();
	
	public int fre(int[] data) {
		for(int i = 0;i<data.length;i++) {
			times.put(data[i],times.getOrDefault(data[i], 0)+1);
		}
		List<Map.Entry<Integer, Integer>> list = new ArrayList<>(times.entrySet());
		Collections.sort(list,new Comparator<>() {
			public int compare(Map.Entry<Integer,Integer> o1,Map.Entry<Integer,Integer> o2) {
				return o1.getValue()-o2.getValue();
			}
		});
		int len = list.size();
		System.out.println(list.get(len-1).getKey());
		return list.get(len-1).getKey();
    }

    public static void main(String[] args){
        int[] a = {1,1,2,2,3,3,3,3};
        play p = new play();
        p.fre(a);
    }
}
