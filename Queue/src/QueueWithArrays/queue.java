package QueueWithArrays;

public class queue {

	private int head = -1;
	private int tail = -1;
	private int size = 6;
	private int[] queueArr = null;
	
	public queue(){
		this.head = -1;
		this.tail = -1;
		this.queueArr = new int[size];
	}

	public queue(int head, int size) {
		this.head = head;
		this.size = size;
		this.queueArr = new int[size];
	}

	private queue resiseStack(queue queue) {
		int newSize = queue.size*2;
		queue newQueue = new queue(queue.head,newSize);
		newQueue.head = queue.head;
		newQueue.tail = queue.tail;
		System.arraycopy( queue.queueArr, 0, newQueue.queueArr, 0, queue.queueArr.length );
		return newQueue;
	}
	
	public static queue dequeue(queue queue) {
		if(queue==null || queue.tail<queue.head)
			System.out.println("No elements exists to dequeue");
		else{
			queue.queueArr[queue.tail] = 0;
			queue.tail--;
			
			if(queue.tail==-1)
				queue.head = -1;
		}
		return queue;
	}

	public static queue enqueue(int val, queue queue) {
		if(queue==null)
			System.out.println("No head exists to enqueue. Create queue first");
		else{
			if(queue.size-queue.tail < 3)
				queue = queue.resiseStack(queue);
			
			if(queue.head==-1){
				queue.head++; 
				queue.queueArr[queue.head]=val;
			}
			queue.tail++;
			queue.queueArr[queue.tail]=val;
		}
		return queue;
	}

	public static queue printAQueue(queue queue) {
		if(queue==null || queue.tail<queue.head || queue.tail==-1)
			System.out.println("No element exists to print");
		else{
			int head = queue.head;
			System.out.print(queue.queueArr[head]);
			head++;
			while(head<=queue.tail){
				System.out.print(" <- " + queue.queueArr[head]);
				head++;
			}			
		}
		return queue;
	}

	public static queue deleteQueue(queue queue) {	
		if(queue==null || queue.tail<queue.head || queue.tail==-1)
			System.out.println("No elements exists to delete");
		else{
			int tail = queue.tail;
			int head = queue.head;
			while(head<=tail){
				queue.queueArr[tail] = 0;
				tail--;
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
