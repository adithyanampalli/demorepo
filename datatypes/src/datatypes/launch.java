package datatypes;

public class launch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n =4;
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				if (i==0||j==3||j==0|| i==3) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println( );
		}

	}

}
