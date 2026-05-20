
public class MyLinkedList<T> {

	MyLinkedListElement<T> first;
	
	public MyLinkedList() {
		first = null;
	}
	
	public void add(T value) {
		MyLinkedListElement<T> newElement = new MyLinkedListElement<T>();
		newElement.payload = value;
		
		if (first == null) {
			first = newElement;
		} else {
			MyLinkedListElement<T> current = first;
			while ( current.next != null ) {
				current = current.next;
			}
			current.next = newElement;
		}
	}
	
}
