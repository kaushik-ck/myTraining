import java.util.Scanner;

class QuestionNine{
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the number to be taken as input: ");
		int number = sc.nextInt();

		System.out.println("Total sum = " + new QuestionNine().customSum(number));
	}

	public int customSum(int number){
		int start = 0, sum = 0;
		while(start<=number){
			if(start%3 == 0 || start%5 == 0){
				sum += start;
				start++;
			}
		}
		return sum;
	}
}