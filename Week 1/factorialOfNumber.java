//Name: Kaushik Cottur Krishnamurthy
//EmpID: AVRE98


class factorialOfNumber{
	public static void main(String[] args) {
		int inputNumber = Integer.parseInt(args[0]);
		int fact = 1;
		while(inputNumber > 0){
			fact = fact*inputNumber;
		}
		System.out.println("Factorial of " + inputNumber + " is " + fact);
	}
}
