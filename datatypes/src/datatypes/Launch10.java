package datatypes;

interface Beta{
	void show();
	void eat();
	
}

class Gamma implements Beta{
	public void show() {
		System.out.println("showing");
	}
	
	public void eat() {
		System.out.println("eating*****");
	}
}


public class Launch10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Beta b = new Gamma();
		b.show();
		b.eat();
		

	}

}
