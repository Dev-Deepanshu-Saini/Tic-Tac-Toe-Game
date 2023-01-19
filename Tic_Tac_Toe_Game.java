//This is made by "Deepanshu Saini"

import java.util.Scanner;

public class Tic_Tac_Toe_Game {
    public static void main(String[] args) {
        String[] board = new String[9];
        board[0] = " - ";
        board[1] = " - ";
        board[2] = " - ";
        board[3] = " - ";
        board[4] = " - ";
        board[5] = " - ";
        board[6] = " - ";
        board[7] = " - ";
        board[8] = " - ";
        String player = " X ";

        while (true) {
            showBoard(board);
            takeChance(board, player);

            if (player == " X ") {
                player = " O ";
            } else {
                player = " X ";
            }

            checkWin(board);

            if (checkDraw(board)) {
                showBoard(board);
                System.out.println("Match Draw");
                System.exit(0);
            }
        }
    }

    public static void showBoard(String[] board) {
        System.out.println(board[0] + board[1] + board[2]);
        System.out.println(board[3] + board[4] + board[5]);
        System.out.println(board[6] + board[7] + board[8]);
    }

    public static void takeChance(String[] board, String player) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please entre between 1 to 9");
        byte chance = scanner.nextByte();
        if (chance > 0 && chance < 10) {
            if (board[chance - 1] == " - ") {
                board[chance - 1] = player;
            } else {
                takeChance(board, player);
            }
        } else {
            takeChance(board, player);
        }
    }

    public static boolean checkDraw(String[] board) {
        for (String i : board) {
            if (i == " - ") {
                return false;
            }
        }
        return true;
    }

    public static void checkWin(String[] board) {
        String[] boxes = new String[2];
        boxes[0] = " X ";
        boxes[1] = " O ";

        for (String scan : boxes) {
            if (board[0] == scan && board[1] == scan && board[2] == scan) {
                showBoard(board);
                System.out.println(scan + " won");
                System.exit(0);
            } else if (board[3] == scan && board[4] == scan && board[5] == scan) {
                showBoard(board);
                System.out.println(scan + " won");
                System.exit(0);
            } else if (board[6] == scan && board[7] == scan && board[8] == scan) {
                showBoard(board);
                System.out.println(scan + " won");
                System.exit(0);
            } else if (board[0] == scan && board[3] == scan && board[6] == scan) {
                showBoard(board);
                System.out.println(scan + " won");
                System.exit(0);
            } else if (board[1] == scan && board[4] == scan && board[7] == scan) {
                showBoard(board);
                System.out.println(scan + " won");
                System.exit(0);
            } else if (board[2] == scan && board[5] == scan && board[8] == scan) {
                showBoard(board);
                System.out.println(scan + " won");
                System.exit(0);
            } else if (board[0] == scan && board[4] == scan && board[8] == scan) {
                showBoard(board);
                System.out.println(scan + " won");
                System.exit(0);
            } else if (board[2] == scan && board[4] == scan && board[6] == scan) {
                showBoard(board);
                System.out.println(scan + " won");
                System.exit(0);
            }
        }

    }
}