package LinkedList;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;

public class KthFrequent {

	static Comparator<Map.Entry<Integer,Integer>> c = new Comparator<Map.Entry<Integer,Integer>>() {
        @Override
        public int compare(Map.Entry<Integer,Integer> o1, Map.Entry<Integer,Integer> o2) {
            return o2.getValue().compareTo(o1.getValue());
        }
    };
	
	private static PriorityQueue<Map.Entry<Integer,Integer>> maxHeap = new PriorityQueue<>(c);
    
	private static Map<Integer,Integer> map = new HashMap<>();
		public static void createHash(int[] nums)
		{
	        
			for ( int num: nums)
			{
				map.put(num, map.getOrDefault(num, 0)+1);
			}
		}
		
		public static void createHeap(int[] nums)
		{
			for (Map.Entry<Integer,Integer> entry: map.entrySet())
			{
				maxHeap.add(entry);
			}
		}
		
	    public static int[] topKFrequent(int[] nums, int k) {
	    	createHash(nums);
	    	createHeap(nums);
	    	
	    	int[] res = new int[k];
	        for(int i = 0; i < k; i++) {
	            res[i] = maxHeap.poll().getKey();
	        }
	        return res;
	    }
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k = 2;
		int[] arr = {4,4,4,4,4,4,4,5,5,5,8,2};
		int[] out = topKFrequent(arr, k);
		for (int i =0; i < k; i++)
		{
			System.out.println(out[i]);  
		}
		
	}

}
