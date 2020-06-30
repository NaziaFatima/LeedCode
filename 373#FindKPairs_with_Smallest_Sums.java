package LinkedList;

import java.util.*;

//import LinkedList.LLGeneral.ListNode;

public class KSmallestSum {

	Comparator<Integer> c = new Comparator<Integer>() {
        @Override
        public int compare(Integer o1, Integer o2) {
            return o1.compareTo(o2);//return o2.compareTo(o1);
        }
    };
    
    static class ListNode 
	{
		public String val;
		public ListNode next;

		public ListNode(String nodeData) 
		{
			this.val = nodeData;
			this.next = null;
		}
	}
    public static ListNode getLastNode(ListNode head)
    {
    	ListNode lst = head;
    	
    	while (lst.next!= null)
    	{
    		lst = lst.next;
    	}
    	return lst;
    }
    static HashMap<Integer, ListNode> map = new HashMap<>();
    
    public static List<List<String>> kSmallestPairs(int[] nums1, int[] nums2, int k)
    {
	List<List<String>> result = new ArrayList<>();
	result.add(Arrays.asList());
	
	for (int i = 0; i < nums1.length; i++)
	{
        for (int j = 0; j < nums2.length; j++)
        { 
        	int sum = nums1[i] + nums2[j];
        	
        	if (map.containsKey(sum))
        	{
        		//get last listnode
        		ListNode newnode = new ListNode(Integer.toString(nums1[i])+ ","+ Integer.toString(nums2[j]));
        		
        		ListNode lst = getLastNode(map.get(sum));
        		lst.next = newnode;
        		//
        	}
        	else 
        	{
        		ListNode newnode = new ListNode(Integer.toString(nums1[i])+ ","+ Integer.toString(nums2[j]));
        		map.put(sum, newnode);
        	}
        }
	}
	
	Set<Integer> s = map.keySet();
	List<Integer> numbersList = new ArrayList<Integer>(s) ;        //set -> list
	 
	//Sort the list
	/*Collections.sort(numbersList);
	int i  =0;
	for (Integer key : numbersList) 
	{
		System.out.println(key + "=" + map.get(key));
		ListNode x = map.get(key);
		result.add(Arrays.asList(x.val));
		while(x.next!=null)
		{
			if (result.get(0).size()<k)
			{
				result.add(Arrays.asList());
			}
		}
	}
	
	//result.add(Arrays.asList(1, 2));
	 * */
	 
	return result;
    }
	
    public static void printHashMap()
    {
    	//map.forEach((key, value) -> System.out.println(key + " : " + value.val));
    	for(Map.Entry<Integer, ListNode> temp : map.entrySet())
    	{
    		System.out.println();
    		System.out.print("Key = "+temp.getKey()+ "; Val = ");
    		ListNode x = temp.getValue();
    		System.out.print(x.val + " | ");
    		while(x.next!=null)
    		{
    			x =x.next;
    			System.out.print(x.val + " | ");
    		}
    		 // Or something as per temp defination. can be used
    	}
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1 = {1,1,3,4};
		int[] arr2 = {2,1,4};
		int k = 3;
		
		List<List<String>> out = kSmallestPairs(arr1,arr2,k);
		printHashMap();
		
		/*for (int i = 0; i < out.size(); i++) 
		{ 
            for (int j = 0; j < out.get(i).size(); j++) 
            { 
                System.out.print(out.get(i).get(j) + " "); 
            } 
            System.out.println(); 
        } */
		System.out.println("Done!!"); 
	}

}
