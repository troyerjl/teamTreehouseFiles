import java.util.Scanner;
import java.util.Random;

public class Jar { 
  int someNumberToGuess;
  int maxItemsAllowed;
  int numberToGuess;

  
//constructor for the jar class, method to get value for maximum input  
  public void Jar() {
     
       
      }
  
// Generating a random number for the user to guess.  
public int fill(int maxNumberInput) {
    Random random = new Random();
    Prompter prompter = new Prompter();
    int maxNumberInputForGenerator = maxNumberInput;
    int someNumberToGuess = random.nextInt(maxNumberInputForGenerator) + 1;
  
  
    try {
      
      throw new IllegalArgumentException("Number must be 1 or higher");
    } catch (IllegalArgumentException iae) {
     
    } 
  
   
    return someNumberToGuess;
  }

//Filling the jar with whatever was chosen.  

         
  
  
//Series of getters.
  

  

}
