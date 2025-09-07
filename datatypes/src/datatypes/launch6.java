package datatypes;


class Animal{
	public void eat () {
		System.out.println("Animal is eating");
	}
	
	public void  walk() {
		System.out.println("Animal is walking");
	}
}
class Dog extends Animal{
	public void eat() {
		System.out.println("Dog is eating");
	}

	public void bark() {
		System.out.println("barking");
	}
	
}

class Cat extends Animal{
	public void eat () {
		System.out.println("cat is eating");
	}
	
	
	public void shout() {
		System.out.println("Shouting as meoww");
	}
}


public class launch6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Animal d = new Dog();
		d.eat();
		d.walk();
		((Dog)(d)).bark();
		
		Animal a = new Animal();
		a.eat();
		
		
		 	Animal c = new Cat();
		c.eat();
		c.walk();
		((Cat) c).shout();
		
		
		
		
		
		
		

	}
}


