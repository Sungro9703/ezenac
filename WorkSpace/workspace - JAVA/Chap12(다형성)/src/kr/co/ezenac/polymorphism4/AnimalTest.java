package kr.co.ezenac.polymorphism4;

import java.util.ArrayList;

class Animal{
	public void move() {
		System.out.println("동물이 움직입니다.");
	}
}

class Dog extends Animal {
	@Override
	public void move() {
		System.out.println("개가 네발로 걷습니다.");
	}
	public void chews() {
		System.out.println("개가 껌을 씹습니다.");
	}
}

class Tiger extends Animal {
	public void move() {
		System.out.println("호랑이가 네발로 뜁니다.");
	}
	public void hunting() {
		System.out.println("호랑이가 사냥을 합니다.");
	}
}

class Eagle extends Animal {
	@Override
	public void move() {
		System.out.println("독수리가 하늘을 날아갑니다.");
	}
	public void flying() {
	System.out.println("독수리가 날개를 쭉 펴고 멀리 날아갑니다.");	
	}
}

public class AnimalTest {
	public static void main(String[] args) {
		Animal dAnimal = new Dog();
		Animal tAnimal = new Tiger();
		Animal eAnimal = new Eagle();
		
//		AnimalTest test = new AnimalTest();
//		
//		test.moveAnimal(dAnimal);
//		test.moveAnimal(tAnimal);
//		test.moveAnimal(eAnimal);
		
		System.out.println();
		
		ArrayList<Animal> animalList = new ArrayList<>();
		animalList.add(dAnimal);
		animalList.add(tAnimal);
		animalList.add(eAnimal);
		
//		for(Animal animal : animalList) {
//			animal.move();
//		}
		
		AnimalTest test = new AnimalTest();
		test.testDownCasting(animalList);
		
	}
	
	public void moveAnimal(Animal animal) {
		animal.move();
	}
	
	public void testDownCasting(ArrayList<Animal> list) {
		for(int i=0; i<list.size(); i++) {
			Animal animal = list.get(i);
			
			if(animal instanceof Dog) {
				Dog dog = (Dog)animal;
				dog.chews();
			}
			else if(animal instanceof Tiger) {
				Tiger tiger = (Tiger)animal;
				tiger.hunting();
			}
			else if(animal instanceof Eagle) {
				Eagle eagle = (Eagle)animal;
				eagle.flying();
			}
			else {
				System.out.println("error");
			}
		}
	}
	
}
