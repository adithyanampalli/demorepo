package datatypes;
import java.util.*;

class Genre<T>{
	T obj;
	
	Genre(T	 obj){
		this.obj = obj;
	}
	public void show() {
		System.out.println("type of object is" + obj.getClass().getName());
	}
	
	public T getobj() {
		return obj;
	}
}

public class Gen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Genre<Integer> g1 = new Genre<Integer>(10);
		g1.show();
		System.out.println(g1.getobj());

	}
	
	

}
