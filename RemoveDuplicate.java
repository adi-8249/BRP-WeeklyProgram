package WeeklyProblems;

public class RemoveDuplicate {
       
	public void Check()
	{
	   int[] a= {20,20,30,40,50,50,50};
	   int[] temp = new int[a.length];
	   
	   int j=0;
	   for(int i=0;i<a.length-1;i++)
	   {
		   if(a[i] != a[i+1])
		   {
			   temp[j]=a[i];
			   j++;
		   }
	   }
	   temp[j]=a[a.length-1];
	   for(int i=0;i<temp.length;i++)
	   {
		   System.out.println(temp[i] + " ");
	   }
	}
	public static void main(String[] args)
	{
		RemoveDuplicate remove = new  RemoveDuplicate();
		remove.Check();
	}

}
