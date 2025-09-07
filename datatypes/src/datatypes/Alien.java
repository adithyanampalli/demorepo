package datatypes;

class Aliens{
	private int age;
	private String name;
	
	public Aliens(int age, String name) {
		this.age=age;
		this.name=name;
		
	}
	public Aliens() {
		age = 25;
		name = "adithya";
	}
	
	public int getAge() {
		return age;
	}
	public String getName() {
		return name;
	}
	
	
		
	
}


public class Alien {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Aliens a1 = new Aliens(28, "sai");
		
		System.out.println(a1.getAge());
		System.out.println(a1.getName());
		
		Aliens a2 = new Aliens();
		
		System.out.println(a2.getAge());
		System.out.println(a2.getName());

	}

}
