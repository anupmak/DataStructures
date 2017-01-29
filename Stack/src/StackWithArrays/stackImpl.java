package StackWithArrays;

import java.util.Scanner;

public class stackImpl {
	
	public static void main(String[] args) {
		
		Scanner in  =  new Scanner(System.in);
		String str = "\nOptions :  \n1 - createStack \n2 - deleteStack \n3 - printAStack \n4 " +
				"- pushIntoStack \n5 - popFromStack \n6 - Exit";
		System.out.println("Welcome to stack implementation");		
		String option = "0";
		
		stack head = null;
		while(!option.equals("6")){
			System.out.println(str);
			System.out.println("Enter your choice - ");
			option = in.nextLine();
			
			switch(option){
			case "1": head = stack.createStack(head);
					break;
			
			case "2": head = stack.deleteStack(head);
					break;
			
			case "3": stack.printAStack(head);
					break;
			
			case "4": System.out.println("Enter value to be added - ");
					int val =  Integer.parseInt(in.nextLine());
					head = stack.push(head,val);
					break;

			case "5": head = stack.pop(head);
					break;
			
			case "6": stack.deleteStack(head);
					System.out.println("Good Bye!");
					break;
					
			default: System.out.println("Invalid Option!");
					continue;
			}
		}
		in.close();
	}
}
