import java.util.Scanner;

class CharacterChecker{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the string: ");
		String ref = sc.nextLine();

		System.out.print("Enter character to search: ");
		char check = sc.next().charAt(0);

		boolean flag = false;
		for(int i=0; i<ref.length(); i++)
		{
			if (ref.charAt(i) == check){
				System.out.println("Found character at postion: " + i);
				flag = true;
			}
		}
		if(!flag){
			System.out.println("Character not found");
		}
	}
}