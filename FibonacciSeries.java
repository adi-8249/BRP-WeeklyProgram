package WeeklyProblems;

import java.util.Scanner;

public class FibonacciSeries {
	
	public void Fibonacci()
	{

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter how many numbers of series you want");
		int n=sc.nextInt();
		int n1=0; int n2=1;
		System.out.print(n1+" "+n2);
		
		for(int i=2;i<n;i++)
		{
		    int n3= n1+n2;
		    n1=n2;
		    n2=n3;
		    System.out.print(" " + n3);	
		}
		
		for(int j=0;j<n;j++)
		{
			for(int k=0;k<j;k++)
			{
				System.out.print(j);
			}
			System.out.println();
		}
	}

	public static void main(String[] args) 
	{
		FibonacciSeries series = new FibonacciSeries();
		series.Fibonacci();
	}

}
