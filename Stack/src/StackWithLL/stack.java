package StackWithLL;

public class stack {

	private int val;
	private stack next;
	
	public stack(int val, stack next){
		this.val= val;
		this.next = next;
	}
	
	public stack() {
	}

	public static stack pop(stack head) {
		if(head==null)
			System.out.println("No elements exists to pop");
		else
			head = head.next;
		return head;
	}

	public static stack push(int val, stack head) {
		if(head==null)
			System.out.println("No head exists to push. Create stack first");
		else
			head = new stack(val,head);
		return head;
	}

	public static stack printAStack(stack head) {
		if(head==null || head.next==null)
			System.out.println("No element exists to print");
		else{
			stack temp = head;
			System.out.print(temp.val);
			temp = temp.next;
			while(temp.next!=null){
				System.out.print("->" + temp.val);
				temp = temp.next;
			}			
		}
		return head;
	}

	public static stack deleteStack(stack head) {
		if(head==null)
			System.out.println("No elements exists to delete");
		else{
			stack temp = head.next;
			while(temp!=null){
				head = null;
				head = temp;
				temp = temp.next;
			}
		}
		return null;
	}

	public static stack createStack(stack head){
		if(head!=null)
			System.out.println("Stack already created!");
		else{
			head =  new stack();
			head.next = null;
		}
		return head;
	}
	
}
