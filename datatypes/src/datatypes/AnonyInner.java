package datatypes;


@FunctionalInterface
interface Alpha{
	int beta(String s);
	
}

public class AnonyInner {

	public static void main(String[] args) {
		Alpha a = new Alpha() {
			public int beta(String s ) {
				int res = s.length(); 
				return res;
			}
		};
		System.out.println(a.beta("Alien"));
	}

}
