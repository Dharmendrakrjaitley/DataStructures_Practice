package Recursion;

public class Number2 {

	public static void main(String[] args) {
		//print number from n to 1
				printNumber(1);
			}
			public static void printNumber(int num)
			{
				if(num>10)
					return;
				printNumber(num+1);
				System.out.println(num);
			}

		}