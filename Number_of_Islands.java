package LinkedList;

public class Number_of_Islands 
{

	public static int numIslands(char[][] grid) 
	{
      int result = 0; 
      
      for (int i = 0; i < grid.length; i++)
      {
    	  for (int j = 0 ; j < grid[0].length;j++)
    	  {
    		  if (grid[i][j]=='1')
    		  {
    			  result++;
    			  doDFS( i,  j , grid);
    			  //System.out.println("Size of Island = " + out);
    			   
    		  }
    	  }
      }
      
      return result;
    }

	public static void doDFS(int i, int j , char[][] grid)
	{
		
		//int size_of_island = 0 ;
		
		if (i <0|| j<0 || i>=grid.length || j >= grid[0].length ||grid[i][j]=='0')
			return ;
		
		grid[i][j]='0';
		
		//int left = 0,right =0,top=0,bottom=0;
		/*left = doDFS(i-1,j,grid);//left 
		right = doDFS(i+1,j,grid);//right 
		top = doDFS(i,j-1,grid);//top
		bottom = doDFS(i,j+1,grid);//bottom
		*/
		
		doDFS(i-1,j,grid);//left 
		doDFS(i+1,j,grid);//right 
		doDFS(i,j-1,grid);//top
		doDFS(i,j+1,grid);//bottom
		
		return ;
		
	}
	public static void main(String[] args) 
	{
		char[][] arr= {{'1','1','0','0','0'},{'1','1','0','0','0'},{'0','0','1','0','0'},{'0','0','0','1','1'}}; 
		int out = numIslands(arr);
		 System.out.println("Number of Islands = " + out);
	}

}
