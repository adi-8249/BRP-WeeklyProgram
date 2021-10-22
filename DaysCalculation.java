package WeeklyProblems;

import java.time.LocalDate;
import java.time.Month;

public class DaysCalculation {
	
	public void Get()
	{
		 LocalDate dt = LocalDate.of(2021, Month.OCTOBER, 10);
		 Month mn = dt.getMonth();
	      int mnIntValue = mn.getValue(); 
	      int minLength = mn.minLength();
	      System.out.println("Month is :"+ dt.getMonth());
	      System.out.println("Length of the month is:"+mn.minLength());  
		 
	}

	public static void main(String[] args) 
	{
		 DaysCalculation calculation = new DaysCalculation();
		 calculation.Get();

	}

}
