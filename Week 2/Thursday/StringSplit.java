import java.util.Scanner;

class StringSplit{

	static int counter = 0;

	static String[] splitFunction(String inputString){

		int count = 0;
		
		String[] returnStringArray = new String[100];
		
		for(int i=0; i<100; i++){

			returnStringArray[0] = "";
		
			for(int j=count; j<inputString.length(); j++)
			{
				char dummy2 = inputString.charAt(j);

				if(dummy2 == ' '){
					break;
				}

				if(!(Character.isUpperCase(dummy2)))
				{
					returnStringArray[i]+=inputString.charAt(j); 
				}
				
				else
				{
					returnStringArray[i+1] = "";
					returnStringArray[i+1]+=inputString.charAt(j);
					count++;
					counter++;
					break;
				}
				count++;
			}
		}
		return returnStringArray;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);


		String str = sc.nextLine();
		String[] outputStringArray = splitFunction(str);
		for(int i=0; i<=counter;i++){
			System.out.println(outputStringArray[i]);
		}
	}
}