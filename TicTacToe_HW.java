package ru.geekbrains.homework3;


import java.util.Random;
import java.util.Scanner;

public class TicTacToe_HW {

    private static char[][] field;
    private static final char DOT_PLAYER = 'X';
    private static final char DOT_AI = '0';
    private static final char DOT_EMPTY = '_';
    private static int fieldSizeX;
    private static int fieldSizeY;
    private static final Scanner SCANNER = new Scanner(System.in);
    private static final Random RANDOM = new Random();


    private static void initField(int a, int b) {
        fieldSizeY = a;
        fieldSizeX = b;
        field = new char[fieldSizeY][fieldSizeX];
        for (int y = 0; y < fieldSizeY; y++) {
            for (int x = 0; x < fieldSizeX; x++) {
                field[y][x] = DOT_EMPTY;

            }
        }
    }
    private static void printField() {
        for (int y = 0; y < fieldSizeY; y++) {
            for (int x = 0; x < fieldSizeX; x++) {
                System.out.print(field[y][x] + "|");
            }
            System.out.println();
        }
    }
    private static boolean isValidCell(int x, int y) {
        return x >= 0 && x < fieldSizeX && y >= 0 && y < fieldSizeY;
    }
    private static boolean isEmptyCell(int x, int y) {
        return field[y][x] == DOT_EMPTY;
    }
    private static void humanTurn() {
        int x;
        int y;
        do {
            System.out.println("Введите координаты хода X и Y через пробел");
            x = SCANNER.nextInt() - 1;
            y = SCANNER.nextInt() - 1;
        } while (!isValidCell(x, y) || !isEmptyCell(x, y));
        field[y][x] = DOT_PLAYER;
    }
    private static void aiTurn() {

        int x;
        int y;
        do {

            x = RANDOM.nextInt(fieldSizeX);
            y = RANDOM.nextInt(fieldSizeY);
        } while (!isEmptyCell(x, y));
        field[y][x] = DOT_AI;



    }
    private static boolean isDraw() {
        for (int y = 0; y < fieldSizeY; y++) {
            for (int x = 0; x < fieldSizeX; x++) {
                if (field[y][x] == DOT_EMPTY) return false;
            }
        }
        return true;
    }
    private static boolean checkWin(char c, int a) {

        for (int y = 0; y < fieldSizeY; y++) { //проверка горизонталей

            for (int x = 0, winLine = 0; x < fieldSizeX; x++) {

                if (field[y][field.length - 1 - x] == c) {
                    winLine++;
                }
                if (winLine == a) {
                    return true;
                }
            }

        }
        for (int x = 0; x < fieldSizeX; x++) { //проверка вертикалей
            for (int y = 0, winLine = 0; y < fieldSizeY; y++) {

                if (field[y][field.length - 1 - x] == c) {
                    winLine++;
                }
                if (winLine == a) {
                    return true;
                }
            }

        }

        for (int i = 0, winLine = 0; i < field.length; i++) {

            if (field[i][i] == c) {
                winLine++;
            }
            if (winLine == a) {
                return true;
            }
        }
        for (int i = 0, winLine = 0; i < field.length; i++) {

            if (field[i][field.length - 1 - i] == c) {
                winLine++;
            }
            if (winLine == a) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] agrs) {
        while (true) {
            initField(5, 5); //в этом месте я меняю игровое поле с 3х3 на 5х5
            printField();
            while (true) {
                humanTurn();
                printField();
                if (checkWin(DOT_PLAYER, 4)) { //а в этом месте я задаю методу checkwin условия, что победа - 4 символа
                    System.out.println("Выиграл игрок.");
                    break;
                }
                if (isDraw()) {
                    System.out.println("Ничья.");
                    break;
                }
                aiTurn();
                printField();
                if (checkWin(DOT_AI, 4)) {
                    System.out.println("Выиграл компьютер.");
                    break;
                }
                if (isDraw()) {
                    System.out.println("Ничья.");
                    break;
                }
            }
            System.out.println("Сыграем еще?");
            if (SCANNER.next().equals("no"))
                break;
        }

    }


}
