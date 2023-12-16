package week1.day2;

import java.util.Arrays;

public class HWMissingElement {
	public static void main(String[] args) {
		int a[]= {1, 5,3,2,8, 4, 7};
		Arrays.sort(a);
		
		//0,1,2,3,4,5,6,7
		//1,2,3,4,6,7,8
		
		
		for (int i = 0; i < a.length; i++) 
		{
			
			
			 if (i+1 != a[i])//1!=1
			{
				System.out.println(i+1);
				
				break;
				
			}
			
			
	}
	}

}
