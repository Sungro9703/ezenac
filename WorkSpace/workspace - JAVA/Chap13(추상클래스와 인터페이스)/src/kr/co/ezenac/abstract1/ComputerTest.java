package kr.co.ezenac.abstract1;

public class ComputerTest {

	public static void main(String[] args) {
		Computer computer = new DeskTop();
		computer.display();
		computer.turnOn();
		
		NoteBook noteBook = new MyNoteBook();
		noteBook.display();
		noteBook.turnOn();
	}

}
