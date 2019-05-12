package algo;

public class Greedy {
	int nums[];
    public void nextPermutation(int[] nums) {
        for(int i=nums[nums.length-1];i>=0;i--){
            if(nums[i]>nums[i-1]){
                int index=getnum(nums,i);
                swap(nums[i],nums[index]);
                reverse(nums[i],nums);
                
                break;
            }
        }
        
        for(int i=0;i<nums.length;i++) {
        	System.out.print(nums[i]);
        }
  
    }
	private void reverse(int i, int[] nums2) {
	    for(int j=i+1,k=0;j<nums2.length-1;j++,k++){
            swap(nums2[j],nums2[nums2.length-1-k]);
	    }
	}
	private int getnum(int[] nums2, int i) {
	    int number=nums2[i+1];
        int index=0;
        for(int j=i+1;j<nums2.length-1;j++){
            if(nums2[j]>i){
                if(nums2[j]<=number)
                number=nums2[j];    
                index=j;
            }
        }
        
        return index;
    
	}
	private void swap(int i, int j) {
		 int temp=i;
         i=j;
         j=temp;
		
	}

	public static void main(String[] args) {
		Greedy g=new Greedy();
		int a[]= {5,1,3};
		g.nextPermutation(a);
	}
	
}

