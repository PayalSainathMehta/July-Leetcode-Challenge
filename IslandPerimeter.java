
public class IslandPerimeter {
			public int islandPerimeter(int[][] grid) {
			        int result = 0;
			        
			        int rows =  grid.length;
			        int cols = grid[0].length;
			        for(int i = 0; i < rows; i++) {
			        	for(int j = 0; j < cols; j++) {
			        		if(grid[i][j] == 1) {
			        			result += 4;
				        		if(i > 0 && grid[i-1][j] == 1)
				        			result -= 2;
				        		if(j > 0 && grid[i][j - 1] == 1)
				        			result -= 2;
			        		}
			        			
			        	}
			        }
			        
			        
			        
			        return result;
			    }


			public static void main(String[] args) {
				int[][] grid = {{0,1,0,0},{1,1,1,0},{0,1,0,0},{1,1,0,0}};
				IslandPerimeter obj = new IslandPerimeter();
				System.out.println(obj.islandPerimeter(grid));
			}
}
