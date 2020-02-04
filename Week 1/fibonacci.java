//Name: Kaushik Cottur Krishnamurthy
//EmpID: AVRE98


class fibonacci{
	public static void main(String[] args) {
			int count1 = 0;
			int count2 = 1;
			int total=0;
			while(count1<=89)
			{
				System.out.println(count1);
				total = count1+count2;
				count1=count2;
				count2 = total;
			}
		}	
}
