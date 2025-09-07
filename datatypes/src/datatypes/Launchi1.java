package datatypes;

class Plane{
	public Plane fly() {
		
		System.out.println("plane is flying");
		Plane p =  new Plane();
		return p;
	}
}

class CargoPlane extends Plane{
	public CargoPlane fly() {
		System.out.println("Cargo is ");
		CargoPlane cp = new CargoPlane();
		return cp;
		
	}
}





public class Launchi1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Plane cp = new CargoPlane();
		cp.fly();

		
	}

}
