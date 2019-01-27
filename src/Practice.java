import java.util.Scanner;

public class Practice {

    public static void main(String[] args) {
        // declaring vars
        int number1, number2;
        int answer1, selection;
        double answer2;
        boolean done, invalidChoice;

        //giving values to some vars
        answer1 = -1;
        answer2 = 1.0;
        selection = 0;
        done = false;
        invalidChoice = false;

        // accpecting and asking user input
        Scanner keyboard = new Scanner(System.in);

        System.out.println("enter first number");
        number1 = keyboard.nextInt();

        System.out.println("enter second number");
        number2 = keyboard.nextInt();

        // user menu
        while(done != true){
            // showing option and asking choice input
            System.out.println("\nPlease select operation " +
            "type fpr " + number1 + "and " + number2 + "\n");

            System.out.println("1 - add these two number");
            System.out.println("2 - subtract second number " +
            "from first number");
            System.out.println("3 - multiply both numbers");
            System.out.println("4 - integer division" +
                    "(first number / second number)");
            System.out.println("5 - floating point division " +
                    "first number divide by second number");
            System.out.println("6 - Exit\n");

            //accepting user input for selction var
            selection = keyboard.nextInt();

            // if or else statements for menu user choice
            if(selection == 1){    // add
              answer1 = number1 + number2;
              invalidChoice = false;
            } else if(selection == 2){  // subtract
                answer1 = number1 - number2;
                invalidChoice = false;
            } else if(selection == 3){ // multiply
                answer1 = number1 * number2;
                invalidChoice = false;
            } else if(selection == 4){ // divide
                answer1 = number1 / number2;
                invalidChoice = false;
            } else if(selection == 5){ // floating point division
               answer2 = (double) number1 / number2;
               invalidChoice = false;
            } else if(selection == 6){
                done = true;
                invalidChoice = false;
            } else {
                invalidChoice = true;
                System.out.println("\nError " + selection +
                        "is not a valid selection" + "please try again");
            }

            if(selection == 5 && invalidChoice == false){
                System.out.println("\nAnswer is: " + answer2);
            } else if(selection != 6 && invalidChoice == false){
                System.out.println("\nAnswer is: " + answer1);
            } else {
                System.out.println("\nNo Calculation done");
            }

        } // end of while loop

        System.out.println("Program ended");

    } // end of Main

} // end of Practice class
