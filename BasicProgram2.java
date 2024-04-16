public class BasicProgram2 {
/**
* A program that demonstrates static methods
* @author E.Fabroa
*/

   public static void main(String[] args){

       int number1 = 10;
       int number2 = 5;
       int difference = diff(number1, number2);

       System.out.println("The difference is " + difference);
   }

   /**
    * Computes the difference between two numbers
    *
    * @param num1  The first number
    * @param num2  The second number
    * @return The difference between the numbers
    * @author E. Fabroa
    */
   private static int diff(int num1, int num2){
       return num1 - num2;
   } 
}