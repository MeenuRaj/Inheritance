
// Inheritance application
import java.util.Scanner;


public class InheritanceApp 
{

	public static void main(String[] args) 
	{
		int i = 0;
		String ans;
		String[] myArray = new String[100];

		Scanner scan = new Scanner(System.in);
		
		String choice = "y";
		
		while (choice.equalsIgnoreCase("y"))
		{
			System.out.println("Book or Software?");
			ans = scan.next();
			
			if (ans.equalsIgnoreCase("Book"))
			{
			System.out.println("Enter product code: ");
			String code = scan.next();
			//myCode[i] = code;
			scan.nextLine();
			
			System.out.println("Enter description: ");
			String description = scan.next();
			//myDes[i] = description;
			scan.nextLine();
			
			System.out.println("Enter price: ");
			double price = scan.nextDouble();
			//myPrice[i] = price;
			scan.nextLine();
			
			System.out.println("Enter Author: ");
			String author = scan.next();
			//myAuth[i] = author;
			scan.nextLine();
			
			
			Book book = new Book();
			book.setCode(code);
			book.setDescription(description);
			book.setPrice(price);
			book.setAuthor(author);
			myArray[i] = book.toString();
			i++;
			
			}
			else
			{
				System.out.println("Enter product code: ");
				String code = scan.next();
				//myCode[i] = code;
				scan.nextLine();
				
				System.out.println("Enter description: ");
				String description = scan.next();
				//myDes[i] = description;
				scan.nextLine();
				
				System.out.println("Enter price: ");
				double price = scan.nextDouble();
				//myPrice[i] = price;
				scan.nextLine();
				
				System.out.println("Enter version: ");
				String version = scan.next();
				//myVer[i] = version;
				scan.nextLine();
				
				Software ver = new Software();
				ver.setCode(code);
				ver.setDescription(description);
				ver.setPrice(price);
				ver.setVersion(version);
				myArray[i] = ver.toString();
				i++;
			}
			System.out.println("Do you want to continue?(y/n) ");
			choice = scan.next();
			
		}
		
		for(int j=0; j<i; j++)
		{
		System.out.println(myArray[j]);
		}

	}

}

