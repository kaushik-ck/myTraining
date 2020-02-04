import java.util.Scanner;

class ReverseString{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the String: ");
		String s = sc.nextLine();
		StringBuilder rev = new StringBuilder(s);
		rev = rev.reverse();
		System.out.println(rev);
	}
}