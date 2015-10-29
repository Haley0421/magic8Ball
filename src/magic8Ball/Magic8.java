 package magic8Ball;
 import java.util.Random;
import java.util.Scanner;
 
 public class Magic8 {
 
 	public static void main(String[] args) {
		Scanner keybrd = new Scanner(System.in);
 		String question = "What would you like to know?";
 		System.out.println(question);
 		String person = keybrd.nextLine();
 		
 		// Fill the array with at least five potential answers
		String[] answers= {"yes","no","try again later","not sure","Maybe","Most Likely","Probably Not"};
		
		// Choose one of the answers at random, then print it
		int random= (int) (Math.random()*6);
		System.out.print(answers[random]);

	}
	}