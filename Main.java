import java.util.Scanner;
/**
 * name an the animal described after answering a series of questions
 * @author Graham Ellacott
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // create a scanner to get input
    Scanner input = new Scanner(System.in);

    //ask if animal has feathers
    System.out.println("Does the animal have feathers?");
    String featherAnswer = input.nextLine(); //store answer in a variable

    if(featherAnswer.equals("yes")){ // if animal has feathers
      //ask if animal can swim
      System.out.println("Does the animal swim?");
      String canSwim = input.nextLine(); //store answer in variable

      if(canSwim.equals("yes")){ //if animal can swim
        System.out.println("This is a duck"); //it is a duck
      }else{ //if animal cannot swim
        System.out.println("This is a hen"); //it is a hen
      }
    }else{ //if animal does not have feathers
      //ask if animal has legs
      System.out.println("Does the animal have legs?");
      String hasLegs = input.nextLine(); //store answer in variable

      if(hasLegs.equals("yes")){ //if animal has legs
        System.out.println("This is a lizard"); //it is a lizard
      }else{ //if animal does not have legs
        System.out.println("This is a snake"); //it is a snake
      }
    }
    
  }
}
