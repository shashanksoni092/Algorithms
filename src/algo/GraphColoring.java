package algo;

import java.util.Scanner;

public class GraphColoring {
	int m;	
	int x[];
	int n;
	int g[][];
	
	public GraphColoring(){
		n=getN();
		m=getM();
		g=new int[n][n];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the adjacency matrix");
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				g[i][j]=sc.nextInt();
			}
		}
	}
	public void graphcolor(int k,int x[]) {
		//m=getN();
		//n=getM();
		 x=new int[4];
		for(int c=1;c<=m;c++) {
			if(issafe(k,c,g,x)) {
			  x[k]=c;
			  if(k+1>n) {
				  print(x);
				  return;
			  }
				  else {
					  graphcolor(k+1,x);
			  }
			  
			}
		}
	}
	private int getN() {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of n");
		n=sc.nextInt();
		return n;
	}
	private int getM() {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of m");
		m=sc.nextInt();
		return m;
	}
	private void print(int[] x2) {
		for(int i=0;i<n;i++) {
			System.out.print(x[i]+" ");
		}
		
	}
	private boolean issafe(int k, int c,int g[][],int x[]) {
		
		for(int i=0;i<k;i++) {
			if(c==x[i] && g[k][i]==1) {
				return false;
			}
		}
		return true;
	}
	public static void main(String []args) {
		
		GraphColoring g=new GraphColoring();
		int x2[]=new int[4];
		g.graphcolor(0,x2);
		g.print(x2);
		
	}
	
}
