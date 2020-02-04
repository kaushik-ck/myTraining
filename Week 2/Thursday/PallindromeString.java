import java.util.Scanner;

class PallindromeString{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String s = sc.nextLine();
		StringBuilder input = new StringBuilder(s), pallindrome = new StringBuilder(s);
		pallindrome.reverse();

		boolean flag = true;

		for(int i=0; i<input.length(); i++){
			if(input.charAt(i) != pallindrome.charAt(i)){
				System.out.println("It is not a pallindrome");
				flag = false;
				break;
			}
		}

		if(flag){
			System.out.println("It is a pallindrome");
		}
	}
}