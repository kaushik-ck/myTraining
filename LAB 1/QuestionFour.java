import java.util.*;

class QuestionFour{
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter the username : ");
		String str = sc.nextLine();

		if(new QuestionFour().check(str)){
		
			System.out.print("Username accepted!!");
		}
		else{
		
			System.out.print("Username does not fit the criteria");
		}
	}

	public boolean check(String str){
		if(str.length()>=12){
			String subStr = str.substring(str.length()-4);
			// System.out.println(subStr);
			if(subStr!="_job")
			{
				return false;
			}
		}
		return true;
	}
}