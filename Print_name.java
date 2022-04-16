package Recursion;

public class Print_name {

	public static void main(String[] args) {
		String name = "Dharmendra";
		printName(1, name);

	}

	public static void printName(int i, String name) {
		if (i > 5)
			return;
		System.out.println(name);

		printName(i + 1, name);
		
	}

}
