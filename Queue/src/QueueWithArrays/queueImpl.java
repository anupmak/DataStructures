package QueueWithArrays;

import java.util.Scanner;

public class queueImpl {
	
	public static void main(String[] args) {
		
		Scanner in  =  new Scanner(System.in);
		String str = "\nOptions :  \n1 - create \n2 - delete \n3 - print \n4 " +
				"- enqueue \n5 - dequeue \n6 - exit";
		System.out.println("Welcome to Queue implementation");		
		String option = "0";
		
		queue head = null;
		
		while(!option.equals("6")){
			System.out.println(str);
			System.out.println("Enter your choice - ");
			option = in.nextLine();
			
			switch(option){
			case "1": head = queue.createQueue(head);
					break;
			
			case "2": head = queue.deleteQueue(head);
					break;
			
			case "3": queue.printAQueue(head);
					break;
			
			case "4": System.out.println("Enter value to be added - ");
					int val =  Integer.parseInt(in.nextLine());
					head = queue.enqueue(val,head);
					break;

			case "5": head = queue.dequeue(head);
					break;
			
			case "6": queue.deleteQueue(head);
					System.out.println("Good Bye!");
					break;
					
			default: System.out.println("Invalid Option!");
					continue;
			}
		}
		in.close();
	}
}
