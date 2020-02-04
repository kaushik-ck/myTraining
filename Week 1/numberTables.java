//Name: Kaushik Cottur Krishnamurthy
//EmpID: AVRE98


class numberTables{
	public static void main(String[] args) {
			int number = Integer.parseInt(args[0]);
			int multiples;
			for (int i=1;i<100;i++) {
				multiples = number * i;
				System.out.println(number + " * " + i + " = " + multiples);				
			}
		}	
}
