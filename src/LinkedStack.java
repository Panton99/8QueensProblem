//Jisoo Kim 07/23/2022

//
// Class: LinkedStack
//
// Description:
// This class has uses Node.class to generate the linked stack.
// Linked stack will be used to set the column number value of each row where the queen is.
// This class has push(), pop(), isEmpty(), size(), and getNthNode() methods.
//
public class LinkedStack<T> {
	private int count;
	private Node<T> head;
	
	
	/* push() (to fill the value in the stack)
	 * input : value
	 * output : none
	 * return : true if the value is in the list
	 * */
	public boolean push(T val) {
		Node<T> newNode = new Node<T>();
		
		newNode.setValue(val);
		newNode.setNext(head);
		head = newNode;
		count++;
		return true;
	}
	
	/* pop() (to pop out the latest value in the stack)
	 * input : none
	 * output : value of the node
	 * return : original head will be popped out
	 * */
	public T pop() { //pop out the head of the stack
		if (isEmpty()) {
			return null;
		}
		Node<T> tmp = head;
		head = head.getNext();
		count--;
		return tmp.getValue();
	}
	
	/* isEmpty() (shows whether stack is empty)
	 * input : none
	 * output : none
	 * return : true if the stack is empty
	 * */
	public boolean isEmpty() {
		return (count == 0);
	}
	
	/* size() (shows the size of the stack)
	 * input : none
	 * output : none
	 * return : count (size of the stack)
	 * */
	public int size() {
		return count;
	}

	/* getNthNode() (find the nth node of the linked stack)
	 * input : i
	 * output : none
	 * return : value of ith node
	 * */
	public T getNthNode(int i) {
		Node<T> cur = head;
		int cnt = 0;
		//Note that linked stack starts from the head, which is the latest value.
		while (cur != null) {
			if (cnt == i) {  //starting from the head, shows the value when count = input i 
				return cur.getValue();
			}
			cur = cur.getNext();
			cnt++;
		}
		return null;
	}
	
	
	
}
