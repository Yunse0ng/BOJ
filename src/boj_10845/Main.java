package boj_10845;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<>();

        int a = scanner.nextInt();

        for (int i = 0; i < a; i++) {
            String cmd = scanner.next();

            if (cmd.contains("push")) {
                arr.add(scanner.nextInt());
            }

            if (cmd.contains("pop")) {
                if (arr.isEmpty()) System.out.println(-1);
                else {
                    System.out.println(arr.getFirst());
                    arr.removeFirst();
                }
            }

            if (cmd.contains("size")) {
                System.out.println(arr.size());
            }

            if (cmd.contains("empty")) {
                if (arr.isEmpty()) System.out.println(1);
                else System.out.println(0);
            }

            if (cmd.contains("front")) {
                if (arr.isEmpty()) System.out.println(-1);
                else System.out.println(arr.getFirst());
            }

            if (cmd.contains("back")) {
                if (arr.isEmpty()) System.out.println(-1);
                else System.out.println(arr.getLast());
            }
        }
    }
}
