package WeeklyProblems;

public class PrimeNumber {
	public void Prime()
	{
		int temp=0;
		int rem;
		int rev=0;
		for(int i=1;i<1000;i++)
		{
			for(int j=2;j<i-1;j++)
			{
			   if(i%j==0)
			   {
				   temp=temp+1;
			   }
			}
			if(temp==0)
			{
				while(temp > 0) 
				{ 
					
				rem= temp % 10;
				rev=rev*10 + rem;
				temp = temp/10; 
				
				}
				if(temp == rev) 
				{
					System.out.println(temp);
				}
			}	
		}
	}

	public static void main(String[] args) 
	{
         PrimeNumber number = new PrimeNumber();
         number.Prime();
	}

}
