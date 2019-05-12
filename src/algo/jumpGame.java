package algo;

import java.util.Scanner;

class jumpGame {
    
    public boolean canJump(int[] nums) {
        int i;
       // int x=nums[0];
        for(i=0;i<nums.length-1;i+=nums[i]){
 	
        }
        if(i==(nums.length-1+nums[nums.length-1])) {
        	System.out.println(i);
            return true;
        }
        else if(i==nums.length-1)
        	return true;
        else {
        	System.out.println(i); 
            return false;
    }
    }
    public static void main(String []args) {
    	Scanner sc =new Scanner(System.in);
    	int nums[]= {2,1,3,5,6,7};
    	jumpGame j=new jumpGame();
    	
    	boolean val=j.canJump(nums);
    	System.out.println(val);
    }
}