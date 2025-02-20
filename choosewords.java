package arraylst;
import java.util.Scanner;
public class choosewords {
	public class GuessTheWord {
	    public static void main(String[] args) {	        
	    	String word = "PUBG"; 
	        char[] guessedWord = new char[word.length()];
	        for (int i = 0; i < word.length(); i++) {
	            guessedWord[i] = '_';
	        }
	        int attempts = 10;
	        try (Scanner scanner = new Scanner(System.in)) {
				while (attempts > 0) {
				        System.out.println("Word: " + String.valueOf(guessedWord));
				        char guess = Character.toLowerCase(scanner.next().charAt(0)); // 转小写
				        boolean correct = false;
				        for (int i = 0; i < word.length(); i++) {
				            if (word.charAt(i) == guess) {
				                guessedWord[i] = guess;
				                correct = true;
				            }
				        }
				        if (correct) {
				            System.out.println("Right！");
				        } else {
				            System.out.println("Wrong: " + (--attempts));
				        }
				        if (String.valueOf(guessedWord).equals(word)) {
				            System.out.println("Correctly：" + word);
				            return;
				        }
				    }
			}
	        System.out.println("The correct word is：" + word);
	    }
	}}


