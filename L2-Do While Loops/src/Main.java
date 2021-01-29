import java.util.Random;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        /*Random rand = new Random();
        Scanner read = new Scanner(System.in);
        int number = 1;

        do{
            System.out.println(number);
            number++;
        }while(number < 10);

//Create a do-while loop that counts backwards from 10.

        int number = 10;

        do{
            number = 10;
            System.out.println(number);
            number--;
        }while(number > 0);

//Create a do-while loop that outputs every third number from 1 to 30.

        int number = 1;

        do{
            System.out.println(number);
            number+= 3;

        }while(number <= 30);*/

//Create a do-while loop that assigns a random odd number from 1 to 20 to a variable.

        int number;

        do{

            number = rand.nextInt(19) + 1;


        }while(number % 2 == 0);

        System.out.println(number);

        String password = "chicken nugget";
        String userInput;

        do{

            System.out.println("Please Enter your password");
            userInput = read.nextLine();
        }while(!userInput.equals(password));

    }
}

