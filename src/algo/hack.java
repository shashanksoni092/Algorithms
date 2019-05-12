package algo;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class hack
{
	int row, col, i, j;
    int arr[][] = new int[20][20];

	public void accept() {
	    Scanner scan = new Scanner(System.in);
	    System.out.print("Enter Number of Row for Array (max 10) : ");
	       row = scan.nextInt();
	       System.out.print("Enter Number of Column for Array (max 10) : ");
	       col = scan.nextInt();
		   HashMap<Integer,Integer> h=new HashMap<Integer,Integer>();
	       System.out.print("Enter " +(row*col)+ " Array Elements : ");
	       for(i=0; i<row; i++)
	       {
	           for(j=0; j<col; j++)
	           {	
	        	   
	               arr[i][j] = scan.nextInt();
	               h.put(arr[i][j], arr[i+1][j]);
	           }
	       }	
	       
	       for(i=0; i<row; i++)
	       {
	           for(j=0; j<col; j++)
	           {
	              //3 System.out.print(arr[i][j]+ "  ");
	              System.out.println(h.get(arr[i][j])); 
	           }
	           System.out.println();
	       }

	}
	public void print() {
		  System.out.print("The Array is :\n");
	       for(i=0; i<row; i++)
	       {
	           for(j=0; j<col; j++)
	           {
	               System.out.print(arr[i][j]+ "  ");
	               //h.get(arr[i][j], arr[i+1][j]);
	           }
	           System.out.println();
	       }
	}
	
	
	/*
	 public int[] twoSum(int[] nums, int target) {
		    Map<Integer, Integer> map = new HashMap<>();
		    for (int i = 0; i < nums.length; i++) {
		        int complement = target - nums[i];
		        if (map.containsKey(complement)) {
		        	System.out.println("successful"+nums[i]+" "+complement);
		        	 return new int[] { map.get(complement), i };
		        }
		        map.put(nums[i], i);
		    }
		    throw new IllegalArgumentException("No two sum solution");
		}
	 
	 */
	 
/*	public boolean adjacent(int x,int y) {
		
		
	}
	*/
	
	
	
	public boolean findpath(int arr[][],int path[][],int x,int y,int n) {
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
	
   public static void main(String args[])
   {
       //int row, col, i, j;
	   
    hack h=new hack();
    h.accept();
    h.print();
	   
     
   }
}






