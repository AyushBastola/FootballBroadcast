import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.println("Give us an animal plural.");
            String animalplural = input.nextLine();

            System.out.println("Give us a plural noun.");
            String pluralnoun = input.nextLine();

            System.out.println("Give us a noun.");
            String noun1 = input.nextLine();

            System.out.println("Give us a celebrity.");
            String celebrity = input.nextLine();

            System.out.println("Give us a name of a body part.");
            String bodypart = input.nextLine();

            System.out.println("Give us a name of a number.");
            int number = input.nextInt();
            input.nextLine();

            System.out.println("Give us a celebrity.");
            String celebrity2 = input.nextLine();

            System.out.println("Give us another adjective.");
            String adjective = input.nextLine();

            System.out.println("Give us an celebrity.");
            String celebrity3 = input.nextLine();

            System.out.println("Give us yet another adjective .");
            String adjective2 = input.nextLine();

            System.out.println("Give us an noun.");
            String noun2 = input.nextLine();

            System.out.println("Give us a noun.");
            String noun3 = input.nextLine();

            System.out.println("Give us a noun.");
            String noun4 = input.nextLine();

            System.out.println("Give us a noun.");

            System.out.println("Give us a verb ending in ing .");
            String verb = input.nextLine();

            System.out.println("good afternoon ladies and gentlemen. this is your favorite sportscaster \nbringing you the big football game between  the columbia university \n" + animalplural  +
                    " and the west point " + pluralnoun + " the center \nhas just snapped the " + noun1 + " back to the columbia star halfback,\n " + celebrity + " who is running  around his/her own left " + noun2 + "\n tackled hard around the " + bodypart  +

                    " now its west\n point ball and " + number + " to go. they're coming out  of the huddle.\n The ball is snapped back to " + celebrity2 + ", who fades back and throws\n a long, " + adjective + " pass that is caught by " + celebrity3 + ", who\n is West Point's " + adjective2 + " quarterback. He/She's in the clear, and\n he/she races over the " + noun3 + " for a touchdown. No, no, wait! The\n referee is calling the play back to the thirty-five-" + noun4 + " line. He's\n going to penalize West Point for " + verb + ".");
        }

    }
