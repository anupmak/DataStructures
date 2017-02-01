package HashTableWithLL.v2;

public class node {

	private String key;
	private String val;
	private node next;
	
	public node(String key, String val){
		this.key = key;
		this.val = val;
		this.next = null;
	}

	public node(){
	}

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}
	
	public String getVal() {
		return val;
	}

	public void setVal(String val) {
		this.val = val;
	}

	public node getNext() {
		return next;
	}

	public void setNext(node next) {
		this.next = next;
	}
}
