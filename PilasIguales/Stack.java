package lab03;

public class Stack<E> {
	private Node <E> head;
	private int size;
	
	//EmptyStack
	public Stack() {
		this.head = null;
		this.size = 0;
	}

	public int length() {
		return this.size;
	}
	
	public void push(E x, Stack e) {
		this.head = new Node<E>(x, this.head);
		this.size++;
	}
	
	//Top: devuelve el elemento superior
	public E top() {
		
		return null;
	}
	
	//push: devuelve la pila sin el elemento superior
	public void pop() {
	
	}
	
	public String toString() {
		String str = "";
		for(Node<E> temp = this.head; temp!= null; temp = temp.getNext())
			str += temp.toString() + ",";
		return str;
	}
	
}
