import java.util.Random;
import java.util.Scanner;

public class paper {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println(" 0 is for rock ");
        System.out.println("1 is for paper");
        System.out.println("2 is for scissor");

        int computer_choice;
        int computerwon = 0;
        int my_choice;
        int me = 0;
        int game = 1;

        while (game <= 5) {
            Random rand = new Random();
            computer_choice = rand.nextInt(2);
            my_choice = sc.nextInt();
            switch (my_choice) {

                case 0:
                    System.out.println("you choose rock");
                    break;
                case 1:
                    System.out.println("you choose paper");
                    break;
                case 2:
                    System.out.println("you choose scissor");

            }
            switch (computer_choice) {

                case 0:
                    System.out.println("computer choose rock");
                    break;
                case 1:
                    System.out.println("computer choose paper");
                    break;
                case 2:
                    System.out.println("computer choose scissor");
            }
            if (computer_choice == my_choice) {
                System.out.println("match tie");

            } else if ((computer_choice == 1 && my_choice == 0) || (computer_choice == 2 && my_choice == 1) ||(computer_choice==0 && my_choice==2)) {
                System.out.println("computer won ");

                computerwon++;

            }

             else if ((computer_choice == 1 && my_choice == 2) ||(my_choice==1 && computer_choice==01)||(my_choice==0 && computer_choice==2)) {
                System.out.println("i won!!");
                me++;
            }
            if (game == 5) {
                break;
            }
            game++;
        }
        System.out.println("-------------------------------");

        System.out.println("computer"+":" + computerwon);
        System.out.println("me" + ":" + me);
        System.out.println("-----------------------------------");
        if (computerwon > me) {
            System.out.println("commputer won the game");
        } else if (computerwon == me) {
            System.out.println("match tie");

        } else {
            System.out.println("i won the game and computer need more pratice");
        }
    }

}
