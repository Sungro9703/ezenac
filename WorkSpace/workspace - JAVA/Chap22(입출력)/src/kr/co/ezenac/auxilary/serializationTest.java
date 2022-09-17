package kr.co.ezenac.auxilary;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Person implements Serializable{
	String name;
	String job;
	
	public Person(String name, String job) {
		this.name = name;
		this.job = job;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return name + "," + job;
	}
	
	
	
}


public class serializationTest {

	
	
	public static void main(String[] args) throws ClassNotFoundException {
		Person personLee = new Person("이순신", "프로그래머");
		Person personHa = new Person("하륜", "영업사원");
		
		try(FileOutputStream fos = new FileOutputStream("serial.out");
			ObjectOutputStream oos = new ObjectOutputStream(fos)) {
			
			oos.writeObject(personLee);
			oos.writeObject(personHa);
			
		}catch(IOException e) {
			e.printStackTrace();
		}

		try(FileInputStream fis = new FileInputStream("serial.out");
			ObjectInputStream ois = new ObjectInputStream(fis)) {
			
			Person person1 = (Person)ois.readObject();
			Person person2 = (Person) ois.readObject();
			
			System.out.println(person1);
			System.out.println(person2);
			
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		
	}

}
