package algo;
import java.util.*;

public class MazeRunner {

	
	public boolean findpath(int maze[][],int path[][],int x,int y,int n) {
     //   System.out.println(x+" "+y);
		//out of bounds
		if(x<0 || x>=n || y<0 || y>=n)
			return false;
		
		//reached destination
		
		if(x==n-1 && y==n-1) {
			path[x][y]=1;
			for(int i=0;i<n;i++) {
				for(int j=0;j<n;j++) {
					System.out.print(path[i][j]+" ");
				}
				System.out.println();
			}
			return true;
		}
		
		//one of the important step
		if(maze[x][y]==0 || path[x][y]==1)
			return false;
		
		path[x][y]=1;
		
		       //move towards right
		       if(findpath(maze,path,x,y+1,n)) {
		//	       path[x][y]=0;
			       // System.out.println(x+" "+y);
			        return true;
	        	} 
		
	        	//move towards left
				if(findpath(maze,path,x,y-1,n)) {
			//		path[x][y]=0;
			        //System.out.println(x+" "+y);
					return true;
				}
				
				
				//move towards top
				if(findpath(maze,path,x-1,y,n)) {
				//	path[x][y]=0;
			    //    System.out.println(x+" "+y);
					return true;
				}
				
				//move towards bottom
				if(findpath(maze,path,x+1,y,n)) {
					//path[x][y]=0;
			      //  System.out.println(x+" "+y);
					return true;
				}
					path[x][y]=0;
					return false;
	}
	public boolean findpath(int maze[][],int n) {
		
		//initializing x & y to 0 so as to start from (0,0)
		int x=0,y=0;
		
		
	int[][] path = {{0,0,0,0,0},{0,0,0,0,0},{0,0,0,0,0},{0,0,0,0,0},{0,0,0,0,0}};
			/*for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++)
				path[i][j]=0;		
		}
		*/
		//It return true or false if so ever any path exists
		boolean z= findpath(maze,path,x,y,n);
		System.out.println(z);
		return z;
		
		
	}
	
	
	
	public static void main(String[] args) {
		
		int n;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		int maze[][]=new int[n][n];
		int path[][]=new int[n][n];
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++)
				maze[i][j]=sc.nextInt();
		}
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				System.out.print(maze[i][j]+" ");
		}
			System.out.println();
		}
		
		MazeRunner x=new MazeRunner();
		x.findpath(maze, n);
		
		
	
	}
	
	
}
