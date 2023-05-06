import java.util.Scanner;

    public class guess{
        public static void guessnumber()
        {
            Scanner sc = new Scanner(System.in);
            int number = 1 + (int)(100* Math.random());
            // Given X trials
             int X = 5;
             int i, guess;
     
            System.out.println("A number is chosen between 1 to 100.");
            System.out.println("Guess the number within 5 trials.");
     
            // Iterate over X Trials
            for (i = 0; i < X; i++) {
     
                System.out.println("Guess the number:");
                guess = sc.nextInt();
                
                if (number == guess) {
                    System.out.println( "Congratulations!   You guessed the number.");
                    break;
                }
                else if (number > guess && i != X - 1) {
                    System.out.println("The number is greater than " + guess);
                }
                else if (number < guess && i != X - 1) {
                    System.out.println("The number is less than " + guess);
                }
            }
             if (i == X) {
                System.out.println("You have exhausted X trials.");
                System.out.println("The number was " + number);
            }
        }

        public static void main(String[] args)
        {
            guessnumber();
        }
    }