package ru.geekbrains.homework6;

import java.io.*;
import java.util.Scanner;

public class main {

    private static String readFromFile(String filename) {
        String a = null;
        try {
            Scanner sc = new Scanner(new FileInputStream(filename));
            a = sc.nextLine();
            sc.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return a;

    }

    private static void writeToFile(String filename) {
        try {
            PrintStream ps = new PrintStream(new FileOutputStream(filename));
            ps.println(readFromFile("1.txt"));
            ps.println(readFromFile("2.txt"));
            ps.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static boolean findWord(String filename, String word) {
        try {
            Scanner sc = new Scanner(new FileInputStream(filename));
            while (sc.hasNextLine()) {
                if (word.equals(sc.next())) //у меня вот тут опять масло получается: если тру, вернуть тру, и чего-то я как не пытался, не могу додуматься как это сократить
                    return true;
            }
            sc.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return false;
    }

    private static String resultOfFind(String a, String b) {
        String s1 = "Слово " + b + " обнаружено в файле " + a;
        String s2 = "Слово " + b + " не найдено в файле " + a;
        if(findWord(a, b))
            return s1;

        return s2;

    }

    public static void main(String[] agrs) throws IOException {
        writeToFile("3.txt");

        
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите через строку: имя файла и слово для поиска");
        String file = reader.readLine();
        String desiredWord = reader.readLine();
        System.out.println(resultOfFind(file, desiredWord));

    }

}
