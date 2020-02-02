import java.util.Scanner;

class QuestionTen{
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number: ");
		int input = sc.nextInt();

		System.out.println("Difference is: " + new QuestionTen().calculateDifference(input));
	}

	public int calculateDifference(int number){
		int sum = 0;
		int sumOfSquares = 0;
		
		int countNumber = 1;
		while(countNumber<=number){
			sum += countNumber;
			sumOfSquares += (countNumber*countNumber);
			countNumber++;
		}
		int differenceOfSum = Math.abs((sum*sum) - sumOfSquares);
		return differenceOfSum;
	}
}