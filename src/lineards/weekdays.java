package lineards;

public class weekdays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] days = {"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};
		//Printing The Values Of array
		System.out.println(days.toString());
		//Finding The LOngest Length String
		Integer maxLen = Integer.MIN_VALUE;
		String day = "";
		for(int i=0;i<7;i++)
		{
			if(days[i].length()>maxLen)
			{
				maxLen = days[i].length();
				day = days[i];
			}
		}
		System.out.println("Day with Max Length "+" "+day+" "+" With The Length Of "+" "+maxLen);
		
		

	}

}
