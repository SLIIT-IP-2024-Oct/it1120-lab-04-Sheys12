import java.util.Scanner;
   public class IT24104277Lab4Q3
   {
         public static void main(String[] args)
		 {
		            Scanner input = new Scanner(System.in);
				    System.out.print("Enter a number: ");
					int number = input.nextInt();
					String message = (number == 0)? "The number is zero" : (number>0)? "The number is Positive" : "The number is Negative";
					System.out.print(message);
		 }
  }		 