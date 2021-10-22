package WeeklyProblems;

import java.util.Scanner;

public class AdditionOfMatrices {
	
	public void Add()
	{
		int a [] []; 
		int b [] [];
		int c [] [];
		
		a = new int [5] [5];
		b = new int [5] [5];
		c = new int [5] [5];
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter first value of matrices");
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				a[i] [j] = sc.nextInt();
			}
		}
		
		System.out.println("Enter the second value of matrices");
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				b[i] [j] = sc.nextInt();
			}
		}
		
		System.out.println("Addition for matrices is :-");
		
		for(int i = 0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				c[i] [j] = a [i] [j] + b [i] [j];
				System.out.println(c[i][j]);
			}
		}
		
		sc.close();
	}

	public static void main(String[] args) 
	{
		
		AdditionOfMatrices matrices = new AdditionOfMatrices();
		matrices.Add();

	}

}
