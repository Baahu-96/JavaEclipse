package lineards;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Arrays;

public class StudentDetails {
	private String name;
	private int [] marks;
	//Variable Argument has to be the last parameter when it is defined
	//It is denoted with ... where we can n number of arguments where it treats it as an array
	
	StudentDetails(String name, int...results )
	{
		this.name = name;
		this.marks = results;
	}
	
	int getNumberOfMarks()
	{
		return this.marks.length;
	}
	
	int getSumOfMarks()
	{
		int sum =0 ;
		for(int mark: marks)
		{
			sum+=mark;
		}
		return sum;
	}
	
	int maximumMark()
	{
		Arrays.sort(this.marks);
		int n = getNumberOfMarks();
		return this.marks[n-1];
	}
	
	int minimumMark()
	{
		Arrays.sort(this.marks);
		return this.marks[0];
	}
	
	BigDecimal getAverageMarks()
	{
		int total = getSumOfMarks();
		int n = getNumberOfMarks();
		BigDecimal bd;
		bd = (new BigDecimal(total).divide(new BigDecimal(n),3,RoundingMode.UP));
		
		return bd;
	}
	
}
