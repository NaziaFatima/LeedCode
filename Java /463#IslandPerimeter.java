package LinkedList;

public class Island_Perimeter {
	

	public static int islandPerimeter(int[][] grid) {

        int max = 0;   

		for (int i = 0; i < grid.length; i++)
		{
			for (int j = 0 ; j < grid[0].length;j++)
			{
				if (grid[i][j]==1)
				{
					int area = returnArea(i,j,grid);
					//System.out.println("Size of Island = " + area);
					//if (area > max ) max = area;
					max =Math.max(max,area);
				}
			}
		}
		return max;
        
    }
	public static  int returnArea(int row,int col, int[][] grid)
	{
		int area =0;

		if (row <0|| col<0 || row>=grid.length || col >= grid[0].length ||grid[row][col]==0)
			return 1;
        if (grid[row][col]==-1)
			return 0;
        
		grid[row][col]=-1; 
		int left = 0,right =0,top=0,bottom=0;

		left = returnArea(row-1,col,grid);//left 
		right = returnArea(row+1,col,grid);//right 
		top = returnArea(row,col-1,grid);//top
		bottom = returnArea(row,col+1,grid);//bottom


		return area+left+right+top+bottom;
	}
	public static void main(String[] args) {
		int[][] arr= 
			{{0,0,1,0,0,0,0,1,0,0,0,0,0},
			{0,0,0,0,0,0,0,1,1,1,0,0,0},
			{0,1,1,0,1,0,0,0,0,0,0,0,0},
			{0,1,0,0,1,1,0,0,1,0,1,0,0},
			{0,1,0,0,1,1,0,0,1,1,1,0,0},
			{0,0,0,0,0,0,0,0,0,0,1,0,0},
			{0,0,0,0,0,0,0,1,1,1,0,0,0},
			{0,0,0,0,0,0,0,1,1,0,0,0,0}};

	int out = islandPerimeter(arr);
	System.out.println("Max peri of Islands = " + out);
	}

}
