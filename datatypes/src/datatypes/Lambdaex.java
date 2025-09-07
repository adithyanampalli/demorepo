package datatypes;

interface Computer{
	int add(int num1,int num2);
	
}

public class Lambdaex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Computer com = (int num1, int num2) ->  num1 + num2;
		
		System.out.println(com.add(10, 6));
		
				
				
		

	}

}
