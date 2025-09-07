package datatypes;
import java.util.*;

class guesser {
	int guessnum;
	int guessNum(){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("guesser kindly guess a number");
		guessnum = sc.nextInt();
		return guessnum;
		
	}
}
	
class player{
	int pguessnum;
	int guessNum(){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("player kindly guess a number");
		pguessnum = sc.nextInt();
		return pguessnum;
		
	}
	
}

class umpire{
	int numfromguesser;
	int numfromplayer1;
	int numfromplayer2;
	int numfromplayer3;
	
	
	public void collectNumFromGuesser(){
		guesser g = new guesser();
		numfromguesser = g.guessNum();
	}
	
	public void collectNumFromPlayer(){
		player p1 = new player();
		player p2 = new player();
		player p3 = new player();
		
		numfromplayer1 = p1.guessNum();
		numfromplayer2 = p2.guessNum();
		numfromplayer3 = p3.guessNum();		
		
	}
	public void compare(){
		if (numfromguesser == numfromplayer1 ) {
			System.out.println("player 1 won the game" );
		}
		else if(numfromguesser == numfromplayer2 ) {
			System.out.println("player 2 won the game" );
		}
		else if(numfromguesser == numfromplayer3 ) {
			System.out.println("player 3 won the game" );
		}
		else {
			System.out.println("try again" );
		}
	}
	
	
}


public class launchgame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		umpire u = new umpire();
		u.collectNumFromGuesser();
		u.collectNumFromPlayer();
		u.compare();
		
		

	}

}
