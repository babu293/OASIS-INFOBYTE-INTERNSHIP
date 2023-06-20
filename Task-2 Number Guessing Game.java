import java.util.*;
class Game{
	public static void main(String[] args){
		Random rand = new Random();
		int number = rand.nextInt(101);
		Scanner inp = new Scanner(System.in);
		int inp2 = 0;
		int entries = 5;
		int score = 100;
		while (inp2 != number){
			System.out.println("Guess the number between 1 and 100 : ");
			inp2 = inp.nextInt();
			if (entries==1 && inp2 != number){
				System.out.println("There are no entries left");
				System.out.println("You have loss the game");
				System.out.println("Your score is 0");
				break;
			}
			
			else if (inp2 == number ){
				System.out.println("you have correctly guessed the number.");
				System.out.println("Your score is "+String.valueOf(score));
				break;
			}
			
			else if (inp2 > number){
				entries-=1;
				System.out.println("The generated number is less than the guessed number  "+
				"entries left : "+ String.valueOf(entries));
				score-=20;
				continue;
			}
			
			else if (inp2 < number){
				entries-=1;
				System.out.println("The generated number is greater than the guessed number  "+
				"entries left : "+ String.valueOf(entries));
				score-=20;
				continue;
			}
		}
	}
	
}
