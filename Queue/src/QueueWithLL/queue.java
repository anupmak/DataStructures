package QueueWithLL;

public class queue {

	private node head;
	private node tail;
	
	public queue(){
		this.head = null;
		this.tail = null;
	}
	
	public static queue dequeue(queue queue) {
		if(queue==null || queue.head==null)
			System.out.println("No elements exists to dequeue");
		else{
			node temp = queue.head;
			temp = null;
			queue.head = queue.head.getNext();
		}
		return queue;
	}

	public static queue enqueue(int val, queue q) {
		if(q==null)
			System.out.println("No head exists to enqueue. Create queue first");
		else{
			node newNode = new node(val);
			if(q.head==null)
				q.head = newNode;
			
			if(q.tail==null)
				q.tail = newNode;
			else{
				q.tail.setNext(newNode);
				q.tail = q.tail.getNext();
			}
		}
		return q;
	}

	public static queue printAQueue(queue queue) {
		if(queue==null|| queue.head==null)
			System.out.println("No element exists to print");
		else{
			node temp = queue.head;
			System.out.print(temp.getVal());
			temp = temp.getNext();
			while(temp!=null){
				System.out.print(" <- " + temp.getVal());
				temp = temp.getNext();
			}			
		}
		return queue;
	}

	public static queue deleteQueue(queue queue) {
		if(queue==null|| queue.head==null)
			System.out.println("No elements exists to delete");
		else{
			node temp = queue.head.getNext();
			node head = queue.head;
			while(temp!=null){
				head = null;
				head = temp;
				temp = temp.getNext();
			}
		}
		return null;
	}

	public static queue createQueue(queue queue){
		if(queue!=null)
			System.out.println("Stack already created!");
		else{
			queue = new queue();
		}
		return queue;
	}
	
}
