import java.util.Scanner;

public class triangle {
	private static Scanner sc;

	public static void main(String[] args) {
		int ang1, ang2, ang3, total;
		sc = new Scanner(System.in);
		
		System.out.println("Enter Triangles First, Second & Thrid Angles = ");
		ang1 = sc.nextInt();
		ang2 = sc.nextInt();
		ang3 = sc.nextInt();

		total = ang1 + ang2 + ang3; 
		
		if (total == 180) {
			System.out.println("It is a Valid Triangle");
		}
		else {
			System.out.println("It is Not a Valid Triangle");
		}
	}
}