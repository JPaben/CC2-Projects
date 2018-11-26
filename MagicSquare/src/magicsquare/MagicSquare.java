package magicsquare;

import java.io.*;

public class MagicSquare {

    public static BufferedReader gg = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws Exception {
        Magic();

    }

    public static void Magic() {
        try {
            System.out.print("Input ODD Number: ");
            int odd = Integer.parseInt(gg.readLine());
            int sum = odd * (odd * odd + 1) / 2;
            if (odd % 2 == 0) {
                System.err.println("Invalid Input \n>Must input odd numbers only<\n");
                Magic();
            } else {
                int[][] MagicSquare = new int[odd][odd];

                int number = 1;
                int row = 0;
                int column = odd / 2;
                int curr_row;
                int curr_col;

                while (number <= odd * odd) {
                    MagicSquare[row][column] = number;
                    number++;
                    curr_row = row;
                    curr_col = column;
                    row -= 1;
                    column += 1;

                    if (row == -1) {
                        row = odd - 1;
                    }

                    if (column == odd) {
                        column = 0;
                    }
                    if (MagicSquare[row][column] != 0) {
                        row = curr_row + 1;
                        column = curr_col;
                        if (row == -1) {
                            row = odd - 1;
                        }
                    }
                }

                System.out.println("\nnote: " + odd + " x " + odd + " Table");

                System.out.print("     ");
                for (int i = 0; i < MagicSquare.length; i++) {
                    System.out.print("_____");
                }
                System.out.println();

                for (int i = 0; i < MagicSquare.length; i++) {
                    System.out.print("    |");
                    for (int j = 0; j < MagicSquare.length; j++) {
                        System.out.printf("%4d ", MagicSquare[i][j]);

                    }
                    System.out.println("| " + sum);
                }

                System.out.print("     ");
                for (int i = 0; i < MagicSquare.length; i++) {
                    System.out.print("_____");
                }
                System.out.println();

                System.out.print(sum + "   ");
                for (int i = 0; i < MagicSquare.length + 1; i++) {
                    System.out.printf("%4d ", sum);
                }

                System.out.println();
            }

            Confirm();
        } catch (Exception e) {
            System.err.println("Invalid Input \n>Must input odd numbers only<\n");
            Magic();
        }
    }

    public static void Confirm() {
        try {
            System.out.print("\n Do you want to try Again? [yes or no] \n>");
            String yn = gg.readLine();

            if (yn.equals("yes")) {
                System.out.println("\n");
                Magic();
            } else if (yn.equals("no")) {
                System.out.println("Thanks and Good BYE");
                System.exit((0));

            } else {
                System.err.println("Invalid Input");
                Confirm();
            }
        } catch (Exception e) {
            System.err.println("Invalid Input");
            Confirm();
        }
    }
}
