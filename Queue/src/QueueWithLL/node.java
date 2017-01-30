package QueueWithLL;

public class node {

	private int val;
	private node next;
	
	public node(int val){
		this.val= val;
		this.next = null;
	}

	public node(){
	}

	public int getVal() {
		return val;
	}

	public void setVal(int val) {
		this.val = val;
	}

	public node getNext() {
		return next;
	}

	public void setNext(node next) {
		this.next = next;
	}
	
}
