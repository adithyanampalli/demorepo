package datatypes;

class Warrior implements Runnable{
	String res1 = new String("Bhrasmastra");
	String res2 = new String("narayanastra");
	String res3 = new String("pashupatastra");
	
	public void run() {
		try {
			String s1 = Thread.currentThread().getName();
			if(s1.equals("Rama")){
				ramaAcqRes();
			}
			else {
				ravanaAcqRes();
			}
		}
		catch (Exception e) {
			System.out.println("Some error");
		}
		
	}
	
	public void ramaAcqRes() {
		try {
			Thread.sleep(400);
			synchronized(res1)
			{
				System.out.println("rama acquired " + res1);
				Thread.sleep(400);
				synchronized(res2)
				{
					System.out.println("rama acquired " + res2);
					Thread.sleep(400);
					synchronized(res3)
					{
						System.out.println("rama acquired " + res3);
						;
					}
				}
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void ravanaAcqRes() {
		try {
			Thread.sleep(400);
			synchronized(res1)
			{
				System.out.println("ravana acquired " + res1);
				Thread.sleep(400);
				synchronized(res2)
				{
					System.out.println("ravana acquired " + res2);
					Thread.sleep(400);
					synchronized(res3)
					{
						System.out.println("ravana acquired " + res3);
						;
					}
				}
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
		
	
}

public class LaunchDL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Warrior w = new Warrior();
		
		Thread t1 = new Thread(w);
		Thread t2 = new Thread(w);

		t1.setName("Rama");
		t2.setName("Ravana");
		
		t1.start();
		t2.start();
	}

}
