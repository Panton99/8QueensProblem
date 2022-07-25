//Jisoo Kim 07/23/2022

//
// Class: Node
//
// Description:
// The Node class has the accessors and mutators for the nodes.
// This class has used in the LinkedStack class to get/set the value, and next nodes.
//
public class Node<E> {
	
	private Node<E> next;
	private E value;
	
	public Node<E> getNext() {
		return next;
	}
	public void setNext(Node<E> next) {
		this.next = next;
	}
	public E getValue() {
		return value;
	}
	public void setValue(E value) {
		this.value = value;
	}
	
}
