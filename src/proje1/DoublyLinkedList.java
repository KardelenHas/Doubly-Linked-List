package proje1;

public class DoublyLinkedList<Type> implements List<Type> {
	
	Element<Type> head;
	Element<Type> tail;
	int size=0;
	
	public DoublyLinkedList() {
		head=null;
		tail=null;
	}
	
	@Override
	//Adds t to the end of the list. 
	public void add(Type t) {
		Element<Type> dummy= new Element<Type>(t);
		
		if(isEmpty()) {
			head=dummy;
			tail=dummy;
			size++;
		}
		else {
			tail.next=dummy;
			dummy.prev=tail;
			tail=dummy;
			size++;
		}
	}
	
	@Override
	// It adds t to the desired place and merges the two lists.
	public int add(int index, Type t) {
		if(index == this.size()) {
			this.add(t);
		}
		else if(index>this.size()) {
			System.out.println("Index is bigger than list size.");
		}
		else {
			Element<Type> dummy=new Element<Type>(t);
			dummy.next=this.getElement(index);
			this.getElement(index-1).next=dummy;
			size++;
		}
		return 0;
	}

	@Override
	//Adds those in the list to the end of this list.
	public void addAll(List<Type> list) {
		DoublyLinkedList<Type> dummy = (DoublyLinkedList<Type>) list;
		this.getElement(this.size()-1).next=dummy.head;
		dummy.head.prev=this.tail;
		this.tail=dummy.tail;
		size=size+dummy.size;
	}

	@Override
	//Adds those on the list to this list sequentially.
	public int addAll(int index, List<Type> list) {
		if(index == this.size()) {
			this.addAll(list);
		}
		else if(index>this.size()) {
			System.out.println("Index is bigger than list size.");
		}
		else {
			DoublyLinkedList<Type> dummy = (DoublyLinkedList<Type>) list;
			dummy.tail.next=this.getElement(index);
			this.getElement(index).prev=dummy.tail;
			this.getElement(index-1).next=dummy.head;
			dummy.head.prev=this.getElement(index-1);
			size=size+dummy.size;
		}
		return 0;
	}

	@Override
	// Returns the item at the specified index.If the value in the array is empty or invalid, it returns null.
	public Type get(int index) {
		Element<Type> dummy = head;
		for(int i=0;i<this.size();i++) {
			if(i==index) {
				break;
			}
			else {
				dummy=dummy.next;
			}
		}
		return dummy.data;
		
	}

	@Override
	//Clears the list to become empty.
	public void clear() {
		head=null;
		tail=null;
		size=0;
	}

	@Override
	//Removes the specified value from the list.
	public Type remove(int index) {
		Element<Type> dummy = getElement(index);
		
		if(dummy.data==this.head.data) {
			this.head=this.getElement(1);
			this.head.prev=null;
		}
		else if(dummy.data==this.tail.data) {
			this.tail=this.getElement(this.size()-2);
			tail.next=null;
		}
		else {
			getElement(index-1).next=dummy.next;
		}
		size--;
		return dummy.data;
	}

	@Override
	// Prints the size.
	public int size() {
		return size;
	}

	@Override
	// Checks if it contains t.
	public boolean contains(Type t) {
		Element<Type> dummy = head;
		for (int i=0; i<size();i++) {
			if(dummy.data==t) {
				return true;
			}else {
				dummy=dummy.next;
			}
		}
		return false;
	}

	@Override
	// It checks whether it is empty.
	public boolean isEmpty() {
		if(size==0) {
			return true;
		}
		return false;
	}

	public Element<Type> getElement(int index) {
		Element<Type> dummy = head;
		for(int i=0;i<this.size();i++) {
			if(i==index) {
				break;
			}
			else {
				dummy=dummy.next;
			}
		}
		return dummy;
	}
	// Prints the list.
	public void print() {
		Element<Type> dummy=head;
		for(int i=0; i<this.size();i++) {
			System.out.print(dummy.data + " ");
			dummy=dummy.next;
		}
		System.out.println();
	}
}