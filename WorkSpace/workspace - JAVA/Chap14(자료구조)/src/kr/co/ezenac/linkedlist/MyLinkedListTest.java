package kr.co.ezenac.linkedlist;

public class MyLinkedListTest {

	public static void main(String[] args) {
		MyLinkedList list = new MyLinkedList();
		list.addElement("A");
		list.addElement("B");
		list.addElement("C");
		list.printAll();
		
		list.insertElement(3, "D");
		list.printAll();
		list.insertElement(0, "S");
		list.printAll();
		
		list.insertElement(1, "A+");
		list.printAll();
		System.out.println("사이즈: " + list.getSize());
		
		list.removeElement(0);
		list.printAll();
		
		System.out.println(list.getElement(2));
		
		
//		list.removeAll();
//		list.printAll();
	}

}
