package datatypes;

class Plane1{
	public void fly() {
		System.out.println("Plane is flying");		
	}
	public void takeoff() {
		System.out.println("plane is takingoff");
	}
}

class CargoPlane1 extends Plane1{
	public void fly() {
		System.out.println("CargoPlane1 is flying");		
	}
	public void takeoff() {
		System.out.println("CargoPlane1 is takingoff");
	}
}
 class PassengerPlane extends Plane1{
	 public void fly() {
			System.out.println("PassengerPlane is flying");		
		}
		public void takeoff() {
			System.out.println("PassengerPlane is takingoff");
		}
 }
 
 class Airport{
	 public void permit(Plane1 p) {
		 p.fly();
	     p.takeoff();
	 }
 }
 
 


public class Launch3 {
	
	public static void main(String[] args) {
		
		CargoPlane1 cp = new CargoPlane1();
		PassengerPlane pp = new PassengerPlane();
		
		Airport a = new Airport();
		
		a.permit(cp);
		a.permit(pp);
		
	}

}
