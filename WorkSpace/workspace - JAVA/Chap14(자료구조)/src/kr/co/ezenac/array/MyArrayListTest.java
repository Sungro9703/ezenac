package kr.co.ezenac.array;

public class MyArrayListTest {

	public static void main(String[] args) {
		
	MyArrayList mArrayList = new MyArrayList();
	mArrayList.addElement(10);
	mArrayList.addElement(20);
	mArrayList.addElement(30);
	mArrayList.printall();
	
	System.out.println();
	
	mArrayList.insertElement(1, 15);
	mArrayList.printall();
	
	System.out.println();
	
	int removed = mArrayList.removeElement(1);
	System.out.println("삭제된 정수: " + removed);
	mArrayList.printall();
	
	System.out.println();
	mArrayList.addElement(70);
	mArrayList.printall();
	
	System.out.println();
	mArrayList.removeElement(1);
	mArrayList.printall();
	
	System.out.println();
	System.out.println(mArrayList.getelement(3));
	
	}

}
