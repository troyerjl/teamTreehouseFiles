import java.util.Scanner;

public class Prompter {
//Setting up variables to start off with.  
String itemInJar;

//Adding a constructor here.  
public Prompter() {
 
}
  
public String promptForItem() {
       Scanner scanner = new Scanner(System.in);
       
       System.out.printf("Enter a type of item to be put in jar. ");
       String itemInJar = scanner.nextLine();
       return itemInJar;
}

//This block is to get the max number of items to put into the jar.   
      public int promptForNumber(String itemInJar) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.printf("Enter a maximum number of %s to put in jar. ", itemInJar);
        String maxNumberInputAsString = scanner.nextLine();
        int maxNumberInput = Integer.parseInt(maxNumberInputAsString);
        return maxNumberInput;
  
  }
  
//This is a series of getters for using variables in other parts of the program.
  
 

  
//This block is to iterate the guesses of the user through a check for the right number.  

public int promptForGuess (int someNumberToGuess, int maxNumberInput) {
       Scanner scanner = new Scanner(System.in);
       Jar jar = new Jar();
       int someNumber = someNumberToGuess;
       int guessForNumberInJar;
       int counter = 0;
  
       do {
        System.out.printf("Enter a number that is your guess as to how many are in the jar. Pick a number betwen one and %d. %n", maxNumberInput);
        String isRightGuessAsString = scanner.nextLine();
       
        guessForNumberInJar = Integer.parseInt(isRightGuessAsString);
        
        counter++; 
              
       
        } while (guessForNumberInJar != someNumber); 
        System.out.printf("You guessed the right number, which was %d, in %d attempts. %n", guessForNumberInJar, counter);
        return guessForNumberInJar;
       
}
  

}