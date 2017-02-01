package HashTableWithLL.v2;

import java.util.Scanner;

public class hashTableImpl {

	public static void main(String[] args) {
		Scanner in  =  new Scanner(System.in);
		String str = "\nOptions :  \n1 - create \n2 - delete \n3 - print \n4 " +
				"- put \n5 - get \n6 - remove \n7 - exit";
		System.out.println("Welcome to Hashtable implementation");		
		String option = "0";
		
		hashTable head = null;
		
		while(!option.equals("7")){
			System.out.println(str);
			System.out.println("Enter your choice - ");
			option = in.nextLine();
			
			switch(option){
			case "1": head = hashTable.create(head);
					break;
			
			case "2": head = hashTable.delete(head);
					break;
			
			case "3": hashTable.print(head);
					break;
			
			case "4": System.out.println("Enter key to be added - ");
					String key = in.nextLine();
					System.out.println("Enter value to be added - ");
					String val =  in.nextLine();
					head = hashTable.put(key,val,head);
					break;

			case "5": System.out.println("Enter key to view - ");
					String key1 =  in.nextLine();
					String value = hashTable.get(key1,head);
					System.out.println("value of given key = " +  value);
					break;
			
			case "6": System.out.println("Enter key to remove - ");
					String key2 =  in.nextLine(); 
					head = hashTable.remove(key2,head);
					break;
			
			case "7": hashTable.delete(head);
					System.out.println("Good Bye!");
					break;
					
			default: System.out.println("Invalid Option!");
					continue;
			}
		}
		in.close();
	}
}
