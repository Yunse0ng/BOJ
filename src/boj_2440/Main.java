package boj_2440;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();

        for (int i = a; i > 0; --i) {
            for (int j = i; j > 0; --j)
                System.out.print("*");
            System.out.println();
        }
    }
}
