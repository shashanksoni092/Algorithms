package algo;

import java.util.Scanner;

public class queen {

	
		 // private int board[][];
		  private int n;	
		  private int x[];
		  
		  queen(int n){
			  this.n=n;
			  x=new int[n+1];
			  x[0]=0;
		  }
		  
		  queen() {
			  
		  }
public boolean place(int k,int i) {
	for(int j=1;j<=k-1;j++) {
		if((x[j]==i) || (Math.abs((x[j]-i))==Math.abs((j-k))) )
			
			return false;
	}
	return true;
}

public void print(int[] x) {
	for(int i=1;i<=n;i++) {
		for(int j=1;j<=n;j++)
		{
			if(x[i]==j)
				System.out.print("1 ");
			else
				System.out.print("0 ");
		}
	}
	System.out.println();
}
public void NQueen(int k,int n) {

	this.n=n;
	
	for(int i=1;i<=n;i++) {
		if(place(k,i)) {
			x[k]=i;
			if(k==n) {
				
			}
				
			else
				NQueen(k+1,n);
			
		}
		
	}
}

	public void NQueencall() {
		NQueen(1,x.length);
	}
		public static void main(String []args) {
		
			Scanner sc=new Scanner(System.in);
			int n=sc.nextInt();
			queen q=new queen(n);
			q.NQueencall();
		}
		
}


