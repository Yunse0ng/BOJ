package boj_2439;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();

        for (int i = 1; i <= a; i++) {
            for (int j = a; j >= 1; j--) {
                if (i >= j) System.out.print("*");
                else System.out.print(" ");
            }
        System.out.println();
        }
    }
}

