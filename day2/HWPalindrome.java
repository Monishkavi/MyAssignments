package week1.day2;

public class HWPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int input=123;
		int rev, i;
		rev=input;
		int rem;
		//0; 1>0; 0.1
		for (i = 0; input>0; input=input/10) {
			rem = input%10;
			//  1=   1%10
			i=(i*10)+rem;
			//120+1
			//i=121
			
		} 
			
		if(i==rev) {
			System.out.println("Palindrome");
		}
		else {
			System.out.println("not palindrome");
		}
		
		

	}

}
