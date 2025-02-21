import java.util.Scanner;

import static java.lang.Double.parseDouble;
import static java.lang.Integer.parseInt;

public class Main {
    public static void main(String[] args) {



        AbdullahiFunction.promptInt();
        AbdullahiFunction.promptDouble();
        AbdullahiFunction.promptString();
    }
}

class AbdullahiFunction{

    static void promptInt(){
        Scanner input = new Scanner(System.in);
        boolean test = true;

        while (test) {
            try{
                System.out.println("Please provide me an integer");
                String firstTest = input.nextLine();
                int numtest = parseInt(firstTest);

                test = false;
            }
            catch(Exception e){
                System.out.println("Sorry please provide an integer");
            }
        }

    }

    static void promptDouble(){
        Scanner input = new Scanner(System.in);

        boolean test = true;

        while (test) {
            try{
                System.out.println("Please provide me an double.");

                double numTest = parseDouble(input.nextLine());
                System.out.println("You entered: " + numTest);
                test = false;
            }
            catch(Exception e){
                System.out.println("Sorry please provide an double.");
            }
        }

    }
    static void promptString() {
        Scanner input = new Scanner(System.in);
        boolean test = true;
       
        while (test) {
            System.out.println("Please provide me a string:");
            String firstTest = input.nextLine();

            if (firstTest.trim().isEmpty()) {
                System.out.println("Input cannot be empty. Try again.");
            }
            // Check if the input is numeric
            else if (firstTest.matches("-?\\d+(\\.\\d+)?")) {
                System.out.println("Sorry, numbers are not allowed. Please provide a valid string.");
            } else {
                System.out.println("You entered: " + firstTest);
                test = false;
            }
        }
    }
}