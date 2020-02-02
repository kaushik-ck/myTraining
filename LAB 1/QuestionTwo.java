import java.util.Scanner;

class QuestionTwo{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String str = sc.nextLine();
		

		str = str.toLowerCase();
		str = str.replaceAll(" ","");
		int lengthOfString = str.length();
		System.out.println(str);
		

		boolean check = true;


		for(int i=0; i<lengthOfString-1; i++){

			char ch1 = str.charAt(i);
			char ch2 = str.charAt(i+1);

			int ascii1 = ch1;
			int ascii2 = ch2;

			// System.out.println(ascii1 + " " + ascii2);


			if(!(ascii1<=ascii2)){
				System.out.println("Not a positive string.");
				check = false;
				break;
			}
		}

		if(check){
			System.out.println("It is a positive string.");
		}
	}
}