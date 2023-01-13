package lineards;

import java.util.Arrays;

public class Arr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] res = {1,2,3,4,5,6,7,8};
		int [] arr = new int[5];
		
		//Here For Finding The Length Using The Arrays it is length and it is a property not a method
		
		System.out.println(res.length);
		
		for(int val:res)
		{
			System.out.println(val);
		}
		//Another Method 
		System.out.println(Arrays.toString(res));
		
		//Filling an Array With The Same Value
		int[] fill = new int[30];
		
		Arrays.fill(fill, 10);
		
		//Comparing Arrays
		
		Arrays.equals(res, fill);
		
		//sorting An Array
		Arrays.sort(res);
		
	}

}
