
  
public class GuessingGame {
    public static void main(String[] args) {
     
    
      
     Jar jar = new Jar();
    
      
     Prompter prompter = new Prompter();
     String itemInJar = prompter.promptForItem();
     int maxNumberInput = prompter.promptForNumber(itemInJar);
     int someNumberToGuess = jar.fill(maxNumberInput);
     int guessForNumberInJar = prompter.promptForGuess(someNumberToGuess, maxNumberInput);
     
    
  
     
    
    }
}
