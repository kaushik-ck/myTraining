//Name: Kaushik Cottur Krishnamurthy
//EmpID: AVRE98


class addNumbers{
	public static void main(String[] args) {
			int number1 = Integer.parseInt(args[0]);
			int number2 = Integer.parseInt(args[1]);
			int number3 = Integer.parseInt(args[2]);
			int sum = number1 + number2 + number3;
			boolean check = true;
			if(number1 < 40){
				check = false;
			}
			if(number2 < 40){
				check = false;
			}
			if(number3 < 40){
				check = false;
			}
			if(sum < 125){
				check = false;
			}
			if(check){
				System.out.println("PASSING");
			}
			if(!check)
			{
				System.out.println("FAILING");
			}
		}	
}
