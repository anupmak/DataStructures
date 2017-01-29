package StackWithArrays;

public class stack {

	private int head=-1;
	private int size=6;
	private int[] stackArr;
	
	public stack(int head, int size){
		this.head = head;
		this.size = size;
		this.stackArr = new int[size];
	}
	
	public stack() {
		this.head = -1;
		this.stackArr = new int[size];
	}
	
	private static stack resiseStack(stack stack) {
		int newSize = stack.size*2;
		stack newStack = new stack(stack.head,newSize);
		newStack.head = stack.head;
		System.arraycopy( stack.stackArr, 0, newStack.stackArr, 0, stack.stackArr.length );
		return newStack;
	}
	
	public static stack pop(stack stack) {
		if(stack==null)
			System.out.println("No elements exists to pop");
		else
			stack.stackArr[stack.head--] = 0;
		return stack;
	}

	public static stack push(stack stack, int value) {
		if(stack==null)
			System.out.println("No head exists to push. Create stack first");
		else{
			if(stack.size-stack.head < 3)
				stack = resiseStack(stack);
			++stack.head;
			stack.stackArr[stack.head] = value;
		}
		return stack;
	}

	public static stack printAStack(stack stack) {
		if(stack==null)
			System.out.println("No element exists to print");
		else if(0<=stack.head){
			int index = stack.head;
			System.out.print(stack.stackArr[index]);
			index--;
			while(0<=index){
				System.out.print(", " + stack.stackArr[index]);
				index--;
			}			
		}
		return stack;
	}

	public static stack deleteStack(stack stack) {
		if(stack==null)
			System.out.println("No elements exists to delete");
		else{
			int index = stack.head;
			while(0<=index){
				stack.head = 0;
				index--;
			}
		}
		return null;
	}

	public static stack createStack(stack stack){	
		if(stack!= null && 0<=stack.head)
			System.out.println("Stack already created!");
		else
			stack = new stack();
		return stack;
	}
	
}
