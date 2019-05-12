package algo;

import java.util.Scanner;

public class RainWater {

public int minimum(int x,int y) {
	if(x>y)
		return y;
	else if(x<y)
		return x;
	else
		return x;
	}
public int maximum(int x,int y) {
	if(x>y)
		return x;
	else if(x<y)
		return y;
	else
		return x;
	}

public void amount(int input[],int n) {
	
	int small[]=new int[n];
	
	for(int i=0;i<n;i++) {
		if(i==0)
			small[i]=input[0];
		else
			small[i]=maximum(small[i-1],input[i]);
		
	//	System.out.println(small[i]+" "+i);
		
	}
	System.out.println("kk");
	int large[]=new int[n];
	
	for(int j=n-1;j>=0;j--) {
		
		if(j==n-1)
			large[j]=input[j];
		else {
			large[j]=maximum(input[j],large[j+1]);
		}
		//System.out.println(large[j]+" "+j);
		
	}
	System.out.println("kk");
	int main[]=new int[n];
	int sum=0;
	for(int k=0;k<n;k++) {
		main[k]=minimum(large[k],small[k])-input[k];
		//System.out.println(main[k]);
		sum=sum+main[k];
	}
	int l=5%5;
		System.out.println(sum+" "+l);
		
	 
		
		
}
public static void main(String []args) {
	
	

	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the input size");
	int n=sc.nextInt();
	int input[]=new int[n];	
	System.out.println("Enter the Array elements");
	
	for(int i=0;i<n;i++)
		input[i]=sc.nextInt();
	
	RainWater r=new RainWater();
	
	r.amount(input,n);
}

}





