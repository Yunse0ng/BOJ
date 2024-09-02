package boj_1110;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = a;
        int count = 0;

        do {
            int ten = b / 10;
            int units = b % 10;

            b = (units * 10) + ((ten + units) % 10);
            count++;
        } while (a != b);

        System.out.println(count);
    }
}
