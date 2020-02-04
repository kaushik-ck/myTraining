import java.util.Scanner;

class SplitWordString{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);


		System.out.print("Enter the main string: ");
		String s1 = sc.nextLine();
		System.out.print("Enter the split string: ");
		String s2 = sc.nextLine();

		int size = 0;
		String[] finalString = new String[100];

		for(int i=0;i<100;i++)
		{
			finalString[i] = "";

			int breakPoint = s1.indexOf(s2);
			// System.out.println(breakPoint);	
			if(breakPoint>=0)
			{
				for(int j=0; j<breakPoint; j++)
				{
					char dummy1 = s1.charAt(j);
					finalString[i] += dummy1;
				}
				// System.out.print(finalString[i]);
				s1 = s1.substring((breakPoint+s2.length()),s1.length());
				// System.out.println(s1);
			}
			else
			{
				for(int k=0; k<s1.length(); k++)
				{
					char dummy1 = s1.charAt(k);
					finalString[i] += dummy1;
					// counter++;
				}
				size = i+1;
				break;
			}
		}
		for(int i=0;i<size;i++)
		{
			System.out.println(finalString[i]);
		}
	}	
}
