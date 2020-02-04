//Name: Kaushik Cottur Krishnamurthy
//EmpID: AVRE98


class decimalToBinary{
	public static void main(String[] args) {
		double x = Double.parseDouble(args[0]);
		int d = (int)x;
		int binary;
		while(d>0){
			binary = d%2;
			d = d/2;
			System.out.print(binary);
		}
	}
}
