package May_24_Sunday;

import java.util.Random;
import java.util.Scanner;

public class Number_guessing_game {
    public static void main(String[] shashwat){
        game();
    }

    static void game(){
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        int games_played = 0;

        int play_again;

        do{
            int random_no = rand.nextInt(100) +1;

            int guessed;
            int no_of_guess =0;

            do{
                System.out.print("Guess the Number: ");
                guessed = sc.nextInt();

                if(guessed < random_no){
                    System.out.println("Guess something higher");
                } else if(guessed > random_no){
                    System.out.println("Guess something smaller");
                } else{
                    System.out.println("That's the correct guess!");
                }
                no_of_guess++;
            } while(guessed != random_no);

            games_played++;

            System.out.println("\nYou took "+no_of_guess+" chances to make it right.");

            System.out.print("\nGo again? (Yes(1) or No(0)): ");
            play_again = sc.nextInt();

        } while(play_again == 1);

        System.out.println("Total games played: "+ games_played);
    }
}
