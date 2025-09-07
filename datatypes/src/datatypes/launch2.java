package datatypes;

import java.io.IOException;
import java.util.*;

class Calculator{
	
	public int add(int num1, int num2) {
		int result = num1+num2;
		return result;
	}
}




public class launch2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
	
		
		Calculator calc = new Calculator();
		
		Scanner sc = new Scanner(System.in);
		int num1 =  sc.nextInt();
		int num2 = sc.nextInt() ;
		
		int result = calc.add(num1, num2);
		
		System.out.println(result);
		

	}

}
