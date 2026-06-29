import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {
        boolean done = false;
        boolean doNotReplay = false;
        Scanner in = new Scanner(System.in);
        String moveA = "";
        String moveB = "";
        String replay = "";
        do {
            do {
                System.out.println("Player A, enter the first letter of your move (R, P, S or r, p, s): ");

                if (in.hasNext()) {
                    String moveAInput = in.next();

                    if (moveAInput.equalsIgnoreCase("r")) {
                        moveA = "Rock";
                        done = true;
                    } else if (moveAInput.equalsIgnoreCase("p")) {
                        moveA = "Paper";
                        done = true;
                    } else if (moveAInput.equalsIgnoreCase("s")) {
                        moveA = "Scissors";
                        done = true;
                    } else {
                        System.out.println("Player A entered " + moveAInput + " for their move");
                        System.out.println("Invalid input. Please try again.");
                    }

                    in.nextLine();
                } else {
                    String trash = in.nextLine();
                    System.out.println("Player A entered " + trash + " for their move");
                    System.out.println("Invalid input. Please try again.");
                }
            } while (!done);

            done = false;

            do {
                System.out.println("Player B, enter the first letter of your move (R, P, S or r, p, s): ");

                if (in.hasNext()) {
                    String moveBInput = in.next();

                    if (moveBInput.equalsIgnoreCase("r")) {
                        moveB = "Rock";
                        done = true;
                    } else if (moveBInput.equalsIgnoreCase("p")) {
                        moveB = "Paper";
                        done = true;
                    } else if (moveBInput.equalsIgnoreCase("s")) {
                        moveB = "Scissors";
                        done = true;
                    } else {
                        System.out.println("Player B entered " + moveBInput + " for their move");
                        System.out.println("Invalid input. Please try again.");
                    }

                    in.nextLine();
                } else {
                    String trash = in.nextLine();
                    System.out.println("Player B entered " + trash + " for their move");
                    System.out.println("Invalid input. Please try again.");
                }
            } while (!done);

            done = false;

            System.out.println("Player A's move: " + moveA);
            System.out.println("Player B's move: " + moveB);

            if (moveA.equals("Rock") && moveB.equals("Rock")) {
                System.out.println("Rock vs Rock it's a Tie!");
            } else if (moveA.equals("Paper") && moveB.equals("Rock")) {
                System.out.println("Paper covers Rock");
                System.out.println("Player A wins");
            } else if (moveA.equals("Scissors") && moveB.equals("Rock")) {
                System.out.println("Rock breaks Scissors");
                System.out.println("Player B wins");
            } else if (moveA.equals("Rock") && moveB.equals("Paper")) {
                System.out.println("Paper covers Rock");
                System.out.println("Player B wins");
            } else if (moveA.equals("Paper") && moveB.equals("Paper")) {
                System.out.println("Paper vs Paper it's a Tie!");
            } else if (moveA.equals("Scissors") && moveB.equals("Paper")) {
                System.out.println("Scissors cuts Paper");
                System.out.println("Player A wins");
            } else if (moveA.equals("Rock") && moveB.equals("Scissors")) {
                System.out.println("Rock breaks Scissors");
                System.out.println("Player A wins");
            } else if (moveA.equals("Paper") && moveB.equals("Scissors")) {
                System.out.println("Scissors cuts Paper");
                System.out.println("Player B wins");
            } else if (moveA.equals("Scissors") && moveB.equals("Scissors")) {
                System.out.println("Scissors vs Scissors it's a Tie!");
            }

            do {
                System.out.println("Would you like to play again (Y/n)? ");

                if (in.hasNext()) {
                    String replayInput = in.next();

                    if (replayInput.equalsIgnoreCase("y")) {
                        done = true;
                        doNotReplay = false;
                    } else if (replayInput.equalsIgnoreCase("n")) {
                        doNotReplay = true;
                        done = true;
                    } else {
                        System.out.println("You entered " + replayInput);
                        System.out.println("Invalid input. Please try again.");
                    }
                } else {
                    String trash = in.nextLine();
                    System.out.println("You entered " + trash);
                    System.out.println("Invalid input. Please try again.");
                }
            } while (!done);

            done = false;
        } while (!doNotReplay);

        System.out.println("Game over");
    }
}