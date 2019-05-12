package algo;

class stockPlan
{
	
	public static void main(String[] args)
	{
		
		//int stocks[]=new int[30];
		int stock[]= {100,80,60,70,60,75,85,110};
		int total_n=stock.length;
		int s[]=new int[10];
		stockPlan(stock,total_n,s);
	}

	private static void stockPlan(int[] stocks, int n,int s[]) {
		
		
		for(int i=0;i<n;i++)
		{
			s[i]=1;
		}
		
		for(int i=0;i<n;i++)
		{
			for(int j=i-1;j>=0;j--)
			{
				if(stocks[i]>stocks[j]) {
					s[i]+=1;
					
				}
			}
		}
		
		for(int i=0;i<n;i++)
		{
			System.out.println(s[i]);
		}
	}
}


