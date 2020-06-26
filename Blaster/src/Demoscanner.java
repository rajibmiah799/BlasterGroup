import java.util.Scanner;

public class Demoscanner {

	public static void main(String[] args) {

		Scanner Scn = new Scanner(System.in);
		System.out.println("Enter First Number:");
		int x = Scn.nextInt();
		System.out.println("Enter 2nd Number:");
		int y = Scn.nextInt();
		if (x > y)
				System.out.println("x is bigger");
		else
			System.out.println("y is bigger");

	}

}
