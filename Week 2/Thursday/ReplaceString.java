import java.util.Scanner;

class ReplaceString{
	public static void main(String[] args) {
		StringBuilder builder = new StringBuilder("Hello Strings");
		System.out.println(builder);

		System.out.println("Enter replacement string text: ");

		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();

		builder.replace(0,builder.length(),s);
		System.out.println(builder);
	}
}