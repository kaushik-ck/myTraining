import java.util.Scanner;

class QuestionFive{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();

		System.out.println(new QuestionFive().cubesSum(number));

	}

	int cubesSum(int number){
		int sum=0;
		while(number>0)
		{
			int digit = number%10;
			sum += digit*digit*digit;
			number = number/10;
		}
		return sum;
	}
}