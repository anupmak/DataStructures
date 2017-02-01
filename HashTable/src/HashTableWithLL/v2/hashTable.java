package HashTableWithLL.v2;

import java.util.Arrays;

public class hashTable {

	private int hashSize = 10;
	private node[] hashArr;
	
	public hashTable(){
		node[] hashArr = new node[hashSize];
		this.hashArr = hashArr;
		Arrays.fill(this.hashArr, null);
	}

	private static int hashFunction(String key, hashTable head) {
		int hashValue = key.hashCode();
		hashValue %= head.hashArr.length; 
		return hashValue;
	}
	
	public static hashTable create(hashTable head) {
		if(head!=null)
			System.out.println("HashTable already creared!");
		else{
			head = new hashTable();
		}
		return head;
	}

	public static hashTable delete(hashTable head) {
		if(head==null)
			System.out.println("HashTable does not exists!");
		else{
			node temp = null;
			for(node n : head.hashArr){
				temp = n;
				while(n!=null){
					n = null;
					n = temp = temp.getNext();
				}
			}
		}
		return null;
	}

	public static void print(hashTable head) {
		if(head==null)
			System.out.println("HashTable is not created!");
		else{
			int i=0;
			for(node n : head.hashArr){
				System.out.print("for element " + i++ + "	 ");
				while(n!=null){
					System.out.print(" -> [" + n.getKey() + " | " + n.getVal() + "] ");
					n=n.getNext();
				}
				System.out.println();
			}
		}
	}

	public static hashTable put(String key, String val, hashTable head) { // replace value if key exists
		if(head==null)
			System.out.println("HashTable is not created!");
		else{
			int index = hashFunction(key, head);
			node newNode = new node(key,val);
			node currNode = head.hashArr[index];
			if(currNode==null)
				head.hashArr[index] = newNode;
			else{
				node prevNode = null;
				while(currNode!=null && compare(currNode.getKey(),key)){
					prevNode = currNode;
					currNode = currNode.getNext();
				}
				if(prevNode==null)
					head.hashArr[index] = newNode;
				else
					prevNode.setNext(newNode);
				
				newNode.setNext(currNode);
			}
		}
		return head;
	}

	private static boolean compare(String key, String key2) {
		int l1=key.length(), l2 = key2.length();
		for(int i=l1;i<l1 && i<l2; i++){
			if(key.charAt(i)<key2.charAt(i))
				return true;
		}
		return false;
	}

	public static String get(String key, hashTable head) {
		String value = null;
		if(head==null)
			System.out.println("HashTable is not created!");
		else{
			int index = hashFunction(key,head);
			node currNode = head.hashArr[index];
			while(currNode!=null && compare(currNode.getKey(),key)){
				currNode = currNode.getNext();
			} 
			value = (currNode!=null)? currNode.getVal(): value; 
		}
		return value;
	}

	public static hashTable remove(String key, hashTable head) {
		if(head==null)
			System.out.println("HashTable is not created!");
		else{
			int index = hashFunction(key, head);
			node currNode = head.hashArr[index];
			if(currNode==null)
				System.out.println("No elements exists in HashTable!");
			else{
				node prevNode = null;
				while(currNode!=null){
					if(currNode.getKey().equals(key)){
						if(prevNode!=null)
							prevNode.setNext(currNode.getNext());
						else
							head.hashArr[index] = null;
						break;
					}
					prevNode = currNode;
					currNode = currNode.getNext();
				} 
				
				if(currNode==null)
					System.out.println("This element does not exist in HashTable!");
				else
					currNode = null;
			}
		}
		return head;
	}
}
