import java.util.Scanner;


public class Main {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        char[] pos = {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '};
        char turn = 'X';
        int choice;
        int totalTurns = 1;
        boolean isOn = true;

        System.out.println("---These are the Position Numbers---");
        System.out.println(" " + 7 +" | " + 8 + " | " + 9 + " ");
        System.out.println("---+---+---");
        System.out.println(" " + 6 +" | " + 5 + " | " + 4 + " ");
        System.out.println("---+---+---");
        System.out.println(" " + 1 +" | " + 2 + " | " + 3 + " ");
        System.out.println("\n");

        while (isOn) {
            do {
                System.out.print("Please select a position to place an X (1 - 9): ");
                choice = scanner.nextInt();
            } while (pos[choice - 1] == 'X' || pos[choice - 1] == 'O');

            if (choice <= 0 || choice > 9){
                System.out.println("Invalid Choice");
            }
            else {
                pos[choice - 1] = turn;
            }

            System.out.println(" " + pos[6] +" | " + pos[7] + " | " + pos[8] + " ");
            System.out.println("---+---+---");
            System.out.println(" " + pos[3] +" | " + pos[4] + " | " + pos[5] + " ");
            System.out.println("---+---+---");
            System.out.println(" " + pos[0] +" | " + pos[1] + " | " + pos[2] + " ");

            if (pos[0] == turn && pos[1] == turn && pos[2] == turn
                            || pos[3] == turn && pos[4] == turn && pos[5] == turn
                            || pos[6] == turn && pos[7] == turn && pos[8] == turn
                            || pos[0] == turn && pos[4] == turn && pos[8] == turn
                            || pos[2] == turn && pos[4] == turn && pos[6] == turn
                            || pos[6] == turn && pos[3] == turn && pos[0] == turn
                            || pos[7] == turn && pos[4] == turn && pos[1] == turn
                            || pos[8] == turn && pos[5] == turn && pos[2] == turn) {
                System.out.println("-------- "+turn +" is the Winner --------");
                isOn = false;
            }

            if (turn == 'X') {
                turn = 'O';
            } else {
                turn = 'X';
            }

            totalTurns++;
            if (totalTurns > 9) {
                System.out.println("------It's a DRAW------");
                isOn = false;
            }

        }

    }
}
