import java.util.ArrayList;
import java.util.Scanner;

class CustomClassCollectionAPI{
	
	public static ArrayList<Computer> list = new ArrayList<Computer>();

	public static void main(String[] args){
		
		list.add(new Computer("Apple", "White", 64, 8, 1));
		list.add(new Computer("Apple", "White", 128, 16, 4));
		list.add(new Computer("Lenovo", "Black", 512, 8, 19));

		new CustomClassCollectionAPI().displayMenu();
	}



	public void displayMenu(){

		System.out.println("\n\n1. Add a new Computer");
		System.out.println("2. Display all computers");
		System.out.println("3. Search for a computer : By Name, Color, HDDSize, RamSize, ID");
		System.out.println("4. Delete a computer : By ID");
		System.out.println("5. Update Computer Details: Name, Color, HDDSize, RamSize");
		System.out.println("6. Exit Menu");
		System.out.println("");
		processSelection();

	}



	public void processSelection(){

		Scanner sc = new Scanner(System.in);

		int optionSelected = sc.nextInt();
		switch(optionSelected){
			case 1:
				addComputer();
				break;
			case 2:
				displayList();
				break;
			case 3:
				searchComp();
				break;
			case 4:
				deleteComp();
				break;
			case 5:
				updateComp();
				break;
			case 6:
				System.out.println("Exiting...");
				break;
			default:
				System.out.println("Wrong option selected. Try again");
				processSelection();

		}
	}



	public void addComputer(){

		Scanner sc = new Scanner(System.in);

		String brandAdd, colorAdd;
		int hddSizeAdd, ramSizeAdd, idNumAdd;	

		System.out.print("\nEnter Brand: ");
		brandAdd = sc.next();

		System.out.print("\nEnter Color: ");
		colorAdd = sc.next();
		
		System.out.print("\nEnter HDD Size: ");
		hddSizeAdd = sc.nextInt();
		
		System.out.print("\nEnter RAM Size: ");
		ramSizeAdd = sc.nextInt();
		
		System.out.print("\nEnter ID Number: ");
		idNumAdd = sc.nextInt();	
		
		list.add(new Computer(brandAdd, colorAdd, hddSizeAdd, ramSizeAdd,idNumAdd));
		
		System.out.println("\nSuccessfully added \n");

		displayMenu();
	}



	public void displayList(){

		for(Object ref: list){
			System.out.println(ref);
		}

		System.out.println("");
		displayMenu();
	}



	public void searchComp(){

		int choice = searchCompSubChoice();
		Scanner sc = new Scanner(System.in);

		String search;
		int searchNum;

		switch(choice){
			case 1:
				System.out.print("\nEnter brand: ");
				search = sc.next();

				for(Object ref: list)
				{
					String str = ((Computer)ref).getBrand();
					if(str.equals(search)){
						System.out.println(ref);
					}
				}
				break;
			case 2:
				System.out.print("\nEnter color: ");
				search = sc.next();

				for(Object ref: list)
				{
					String str = ((Computer)ref).getColor();
					if(str.equals(search)){
						System.out.println(ref);
					}
				}
				break;
			case 3:
				System.out.print("\nEnter HDD Size: ");
				searchNum = sc.nextInt();

				for(Object ref: list)
				{
					int intNum = ((Computer)ref).getHddSize();
					if(searchNum == intNum){
						System.out.println(ref);
					}
				}
				break;
			case 4:
				System.out.print("\nEnter RAM Size: ");
				searchNum = sc.nextInt();

				for(Object ref: list)
				{
					int intNum = ((Computer)ref).getRamSize();
					if(searchNum == intNum){
						System.out.println(ref);
					}
				}
				break;
			case 5:
				System.out.print("\nEnter ID Number: ");
				searchNum = sc.nextInt();

				for(Object ref: list)
				{
					int intNum = ((Computer)ref).getIdNum();
					if(searchNum == intNum){
						System.out.println(ref);
					}
				}
				break;
			case 6:
				System.out.println("Exiting...\n");
				break;
			default:
				System.out.println("\nWrong option selected. Try again\n");
				searchCompSubChoice();
		}
		displayMenu();

	}



	public int searchCompSubChoice(){

		System.out.println("\ni.    Search by Brand");
		System.out.println("ii.   Search by Color");
		System.out.println("iii.  Search by HDD Size");
		System.out.println("iv.   Search by RAM Size");
		System.out.println("v.    Search by ID Number");
		System.out.println("vi.   Exit menu \n");

		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();

		return num;
	}



	public void deleteComp(){

		Scanner sc = new Scanner(System.in);

		System.out.print("\nEnter the ID: ");
		int deleteID = sc.nextInt();

		int count = 0;

		for(Object ref: list)
		{
			int intNum = ((Computer)ref).getIdNum();
			if(deleteID == intNum){
				break;
			}
			count++;
		}
		list.remove(count);
		System.out.println("\nDeleted record/records.");
		displayMenu();
	}

	

	public void updateComp(){

		Scanner sc = new Scanner(System.in);

		System.out.print("\nEnter the ID: ");
		int updateID = sc.nextInt();


		String brandUpdate, colorUpdate;
		int hddSizeUpdate, ramSizeUpdate;	

		int index = 0;
		boolean flag = false;
		for(Object ref: list){
			if(((Computer)ref).getIdNum() == updateID){
				flag = true;
				break;
			}
			index++;
		}
		if(flag){
			System.out.println("\nSelect what to update: ");
			System.out.println("1.Brand\n2.Color\n3.HDD Size\n4.RAM Size\n5.Exit");
			int selection = sc.nextInt();

			switch(selection){
				case 1:
					System.out.print("\nEnter Brand: ");
					brandUpdate = sc.next();
					list.set(index, new Computer(brandUpdate, list.get(index).getColor(),list.get(index).getHddSize(),list.get(index).getRamSize(),updateID));
					System.out.println("Successfully updated.");
					break;

				case 2:
					System.out.print("\nEnter Color: ");
					colorUpdate = sc.next();
					list.set(index, new Computer(list.get(index).getBrand(), colorUpdate, list.get(index).getHddSize(),list.get(index).getRamSize(),updateID));
					System.out.println("Successfully updated.");
					break;

				case 3:
					System.out.print("\nEnter HDD Size: ");
					hddSizeUpdate = sc.nextInt();
					list.set(index, new Computer(list.get(index).getBrand(), list.get(index).getColor(), hddSizeUpdate, list.get(index).getRamSize(),updateID));
					System.out.println("Successfully updated.");
					break;

				case 4:
					System.out.print("\nEnter RAM Size: ");
					ramSizeUpdate = sc.nextInt();
					list.set(index, new Computer(list.get(index).getBrand(), list.get(index).getColor(), list.get(index).getHddSize(), ramSizeUpdate,updateID));
					System.out.println("Successfully updated.");
					break;
				
				case 5:
					System.out.println("\nExiting...\n");
					break;

				default:
					System.out.println("\nWrong option\n");
			}
		}
		else{
			System.out.println("\nID Not Found. \n");
		}
		displayMenu();
	}
}


class Computer{
	String brand, color;
	int hddSize, ramSize, idNum;

	Computer(String brand, String color, int hddSize, int ramSize, int idNum){
		this.brand = brand;
		this.color = color;
		this.hddSize = hddSize;
		this.ramSize = ramSize;
		this.idNum = idNum;
	}

	public String getBrand(){
		return this.brand;
	}

	public String getColor(){
		return this.color;
	}

	public int getHddSize(){
		return this.hddSize;
	}

	public int getRamSize(){
		return this.ramSize;
	}

	public int getIdNum(){
		return this.idNum;
	}

	@Override
    public String toString(){
        return "Computer " + this.getIdNum() + ": (" + this.getBrand()
            + ", " + this.getColor()
            + ", " + this.getHddSize()
            + ", " + this.getRamSize()
            + ")";
    }
}