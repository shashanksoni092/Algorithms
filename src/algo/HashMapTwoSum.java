//@Author:Shashank soni
package algo;
import java.util.*;
public class HashMapTwoSum {
	
	
	    
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
	    
	    public static void main(String[] args){
	        HashMapTwoSum s=new HashMapTwoSum();
	         Scanner sc=new Scanner(System.in);
	        int []nums= {1,6,2,4,6,10,367,982,728,8,3,7,111,89,3783,0};
	       /* for(int i=0;i<nums.length;i++)
	            nums[i]=sc.nextInt();
	       */
	        
	        int target=sc.nextInt();
	        s.twoSum(nums,target);
	        
	        sc.close();
	    }
	    }


