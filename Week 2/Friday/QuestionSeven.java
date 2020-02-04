import java.util.*;

class QuestionSeven{
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the size of input: ");
		int size = sc.nextInt();
		int[] elementsArray = new int[size];

		System.out.print("Enter the elements: ");

		for(int i=0; i<size; i++){
			elementsArray[i] = sc.nextInt();
		}

		int[] ans = new QuestionSeven().sortReverse(elementsArray);

		for(int i=0; i<ans.length; i++){
			System.out.print(elementsArray[i] + " ");
		}

		System.out.println();

		for(int i=0;i<ans.length;i++){
			System.out.print(ans[i] + " ");
		}
	}

	public int[] sortReverse(int[] elementsArray){
		int[] newArray = new int[elementsArray.length];
		for(int i=0;i<elementsArray.length;i++){
			newArray[i] = reverse(elementsArray[i]);
		}
		for(int i=0;i<newArray.length;i++){
			for(int j=i+1;j<newArray.length;j++){
				if(newArray[i]>newArray[j]){
					int temp  = newArray[i];
					newArray[i] = newArray[j];
					newArray[j] = temp;
				}
			}
		}
		return newArray;
	}

	public int reverse(int number){
		String s = String.valueOf(number);
		StringBuilder sb = new StringBuilder(s);
		sb.reverse();
		int sum = Integer.parseInt(sb.toString());
		return sum;
	}
}