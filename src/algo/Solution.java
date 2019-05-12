package algo;

public class Solution {


	public static long countOfPairs(int n, int m) {
	int count=0;
    for(int i=1;i<=n;i++){
      for(int j=0;j<=m;j++){
        if((i+j)%5==0)
          ++count;
        
      }
      
    }  
    count=count-1;
      System.out.print(count);
	return count;
	}
public static void main(String[] args) {
	
	Solution.countOfPairs(1, 5);
}
}