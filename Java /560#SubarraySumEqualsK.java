package LinkedList;

public class Subarray_sum 
{

	public static int subarraySum(int[] nums, int k) 
	{
		int sum = 0;
		for (int i = 0 ; i < nums.length; i ++)
		{
			int subsum = nums[i];
			if (subsum==k) 
			{
				sum++;
			}
			for (int j = i+1; subsum!=k && j < nums.length; j++)
			{
				subsum = subsum+nums[j];
				if (subsum==k) 
				{
					sum++; break;
				}
			}
		}
		return sum;
	}
	public static void main(String[] args) 
	{
	int[] arr = {28,54,7,-70,22,65,-6};
	int k = 100;
	int out = subarraySum(arr, k) ;
	
	System.out.println("Out = "+out );
	}

}
