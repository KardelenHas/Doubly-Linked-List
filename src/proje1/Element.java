package proje1;

public class Element<Type> {
	
	Element<Type> next;
	Element<Type> prev;
	Type data;
	
	public Element() {
		next=null;
		prev=null;
		data=null;
	}
	public Element(Type value){
		this.data=value;
		next=null;
		prev=null;
	}

}