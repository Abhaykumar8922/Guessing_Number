import java.util.Random;
import java.util.Scanner;

public class main{
public static void main(String[] args) {
	
	
	//Number Guessing number
	
	Random random=new Random(); //generated number
	Scanner scanner=new Scanner(System.in);
	
	int guess;
	int attempts=0;
	int min=1;
	int max=100;
	int randomNumber=random.nextInt(min,max+1);
	System.out.println("Number Guessing Game");
	
	System.out.printf("Guess a number between %d-%d\n",min,max);
	
	do {
		
		System.out.println("Enter a guess: ");
		guess=scanner.nextInt();
		attempts++;
		if(guess<randomNumber) {
			System.out.println("Too Low , Please Try Again");
	
		}
		else if(guess>randomNumber) {
			System.out.println("Too High,Please Try Again");
		}
		else {
			System.out.println("Correct ! The number was  " + randomNumber);
		  System.out.println("Number of attempts: " + attempts);
			
		}
	}while(guess!=randomNumber);
	scanner.close();
}
}