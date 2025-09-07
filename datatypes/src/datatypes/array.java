package datatypes;

public class array {
	
	 static int[] get() {
		 return new int[] {1,2,3,4,5};
	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = get();
		for (int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		

	}

}
