class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
       int arr = (nums1.length>nums2.length)?2:1;
		int[] prim,sec,out;

		Set<Integer> set = new HashSet<>();
		if (arr ==1) 
		{
			prim = nums1; sec=nums2;
		}
		else 
		{
			prim = nums2 ; sec = nums1;
		}
		
		Set<Integer> outset = new HashSet<>();
		for (int i = 0 ; i < prim.length; i ++)
		{
			set.add(prim[i]);
		}
		//System.out.print(" Set = " + set);
		
		for(int j = 0 ; j < sec.length; j++)
		{
			if (set.contains(sec[j]))
			{
				outset.add(sec[j]);
			}
		}
		out = new int[outset.size()];
		
		Iterator i = outset.iterator(); 
		int k=0;
		while (i.hasNext()) { 
            out[k++]=(int) i.next(); 
        } 
		
		return out; 
    }
}
