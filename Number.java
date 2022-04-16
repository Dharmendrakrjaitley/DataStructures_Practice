package Recursion;

public class Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//print number from one to n
		printNumber(1);
	}
	public static void printNumber(int num)
	{
		if(num>10)
			return;
		System.out.println(num);
		printNumber(num+1);
	}

}
