import java.util.*;

class QuestionTwelve{
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number: ");
		int n = sc.nextInt();
		System.out.println(new QuestionTwelve().PowerOftwo(n));
	}

	public boolean PowerOftwo(int number){

		if(number<=1){
		   return false;
		}

  		while(number > 1){
   			if(number % 2 != 0){
    			return false;
   			}
   			number = number / 2;
  		}
  	return true;
 	}
}